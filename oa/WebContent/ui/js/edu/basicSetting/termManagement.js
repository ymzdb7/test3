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
    init(dataId,$('#trList'))
//    新建
    $('.divBtn').click(function () {
        layer.open({
            type: 1,
            title:['新建', 'background-color:#2b7fe0;color:#fff;font-size:13pt;'],
            area: ['600px', '500px'],
            shadeClose: true, //点击遮罩关闭
            btn: ['保存','关闭'],
            content: '<div class="newLayer">' +
            '<table border="0" cellspacing="0" cellpadding="0" style="border-collapse: collapse">' +
            '<tr><td>名称：</td><td><input type="text" name="termName" value=""></td></tr>' +
            '<tr><td>编号：</td><td><input type="text" name="termCode" value=""></td></tr>' +
            '<tr><td>学年：</td><td><select name="termYear" id="termYear"></select></td></tr>' +
            '<tr><td>默认学期：</td><td><select name="defaultTerm" id="defaultTerm"><option value="0">是</option><option value="1">否</option></select></td></tr>' +
            '<tr><td>第几学期：</td><td><input type="text" name="whichTerm" value=""></td></tr>' +
            '<tr><td>开始日期：</td><td><input type="text" name="startTime" id="start" onclick="laydate(start)" value=""></td></tr>' +
            '<tr><td>结束日期：</td><td><input type="text" name="endTime" id="end" onclick="laydate(end)" value=""></td></tr>' +
            '<tr><td>上课天数：</td><td><input type="text" name="classDay" value=""></td></tr>' +
            '<tr><td>激活：</td><td><select name="activate" id="activate"><option value="0">激活</option><option value="1">不激活</option></select></td></tr>' +
            '<tr><td>显示位置：</td><td><input type="text" name="position" value=""></td></tr>' +
            '<tr><td>备注：</td><td><input type="text" name="remark" value=""></td></tr>' +
            '</table>' +
            '</div>',
            success:function(){

            },
            yes:function(index){
                var data={
                    termName:$('input[name="termName"]').val(),
                    termCode:$('input[name="termCode"]').val(),
                    termYear:$('#termYear option:selected').val(),
                    defaultTerm:$('#defaultTerm option:selected').val(),
                    whichTerm:$('input[name="whichTerm"]').val(),
                    startTime:$('input[name="startTime"]').val(),
                    endTime:$('input[name="endTime"]').val(),
                    classDay:$('input[name="classDay"]').val(),
                    activate:$('#activate option:selected').val(),
                    position:$('input[name="position"]').val(),
                    remark:$('input[name="remark"]').val(),
                }
                newSupervision(data,dataId,$('#trList'));
                layer.close(index);
            }
        });
        //    获取学年
        $.get('/eduYear/selectAll',function (json) {
            if(json.flag){
                var str='<option value="">请选择</option>';
                for(var i=0;i<json.obj.length;i++){
                    str+='<option value="'+json.obj[i].yearId+'">'+json.obj[i].yearName+'</option>'
                }
                $('#termYear').html(str);
                // $('#termYear1').html(str);
            }
        })
    })
//    编辑
    $('#trList').on('click','.dataEdit',function () {
        var id=$(this).parents('tr').attr('data-id');
        layer.open({
            type: 1,
            title:['修改', 'background-color:#2b7fe0;color:#fff;font-size:13pt;'],
            area: ['600px', '500px'],
            shadeClose: true, //点击遮罩关闭
            btn: ['保存','关闭'],
            content: '<div class="newLayer">' +
            '<table border="0" cellspacing="0" cellpadding="0" style="border-collapse: collapse">' +
            '<tr><td>名称：</td><td><input type="text" name="termName" value=""></td></tr>' +
            '<tr><td>编号：</td><td><input type="text" name="termCode" value=""></td></tr>' +
            '<tr><td>学年：</td><td><select name="termYear" id="termYear"></select></td></tr>' +
            '<tr><td>默认学期：</td><td><select name="defaultTerm" id="defaultTerm"><option value="0">是</option><option value="1">否</option></select></td></tr>' +
            '<tr><td>第几学期：</td><td><input type="text" name="whichTerm" value=""></td></tr>' +
            '<tr><td>开始日期：</td><td><input type="text" name="startTime" id="start" onclick="laydate(start)" value=""></td></tr>' +
            '<tr><td>结束日期：</td><td><input type="text" name="endTime" id="end" onclick="laydate(end)" value=""></td></tr>' +
            '<tr><td>上课天数：</td><td><input type="text" name="classDay" value=""></td></tr>' +
            '<tr><td>激活：</td><td><select name="activate" id="activate"><option value="0">激活</option><option value="1">不激活</option></select></td></tr>' +
            '<tr><td>显示位置：</td><td><input type="text" name="position" value=""></td></tr>' +
            '<tr><td>备注：</td><td><input type="text" name="remark" value=""></td></tr>' +
            '</table>' +
            '</div>',
            success:function(){
                //    获取学年
                $.get('/eduYear/selectAll',function (json) {
                    if(json.flag){
                        var str='<option value="">请选择</option>';
                        for(var i=0;i<json.obj.length;i++){
                            str+='<option value="'+json.obj[i].yearId+'">'+json.obj[i].yearName+'</option>'
                        }
                        $('#termYear').html(str);
                        // $('#termYear1').html(str);
                    }
                })
                $.ajax({
                    type:'get',
                    url:'/eduTerm/selectEduTerm',
                    dataType:'json',
                    data:{termId:id},
                    success:function (res) {
                        var data=res.object;
                        $('input[name="termName"]').val(data.termName);
                        $('input[name="termCode"]').val(data.termCode);
                        $('#termYear').val(data.termYear);
                        // $('input[name="termYear"]').val(data.yearText);
                        $('#defaultTerm').val(data.defaultTerm);
                        $('input[name="whichTerm"]').val(data.whichTerm);
                        $('input[name="startTime"]').val(data.startTime);
                        $('input[name="endTime"]').val(data.endTime);
                        $('input[name="classDay"]').val(data.classDay);
                        $('#activate').val(data.activate);
                        $('input[name="position"]').val(data.position);
                        $('input[name="remark"]').val(data.remark);
                    }
                })
            },
            yes:function(index){
                var data={
                    termId:id,
                    termName:$('input[name="termName"]').val(),
                    termCode:$('input[name="termCode"]').val(),
                    termYear:$('#termYear option:selected').val(),
                    // termYear:$('input[name="termYear"]').val(),
                    defaultTerm:$('#defaultTerm option:selected').val(),
                    whichTerm:$('input[name="whichTerm"]').val(),
                    startTime:$('input[name="startTime"]').val(),
                    endTime:$('input[name="endTime"]').val(),
                    classDay:$('input[name="classDay"]').val(),
                    activate:$('#activate option:selected').val(),
                    position:$('input[name="position"]').val(),
                    remark:$('input[name="remark"]').val(),
                }
                updateSupervision(data,dataId,$('#trList'));
                layer.close(index);
            }
        });

    })
    $('#trList').on('click','.dataDetele',function () {
        var id=$(this).parents('tr').attr('data-id');
        layer.confirm(' 确定要删除吗?', {
            btn: [' 确定', ' 取消'], //按钮
            title: " 删除"
        },function(){
            $.ajax({
                url:'/eduTerm/deleteEduTerm',
                type:'post',
                data:{termId:id},
                dataType:'json',
                success:function(res){
                    if(res.flag){
                        $.layerMsg({content:'删除成功！',icon:1});
                        init(dataId,$('#trList'))
                    }else{
                        $.layerMsg({content:'删除失败！',icon:2});
                    }
                }
            })
        },function(){
            layer.close();
        })
    })
})

//新建
function newSupervision(data,dataId,element){
    $.ajax({
        type:'post',
        url:'/eduTerm/addEduTerm',
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
//修改
function updateSupervision(data,dataId,element){
    $.ajax({
        type:'post',
        url:'/eduTerm/updateEduTerm',
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

function init(dataId,element) {
    var ajaxPage={
        data:dataId,
        page:function () {
            element.find('tr').remove();
            var me=this;
            $.ajax({
                type:'get',
                url:'/eduTerm/selectAll',
                dataType:'json',
                data:me.data,
                success:function(res) {
                    var datas=res.obj;
                    var str='';
                    for(var i=0;i<datas.length;i++){
                        str+='<tr data-id="'+datas[i].termId+'">' +
                            '<td>'+(i+1)+'</td>' +
                            '<td>'+datas[i].termName+'</td>' +
                            '<td>'+datas[i].termCode+'</td>' +
                            '<td>'+datas[i].yearText+'</td>' +
                            '<td>'+function () {
                                if(datas[i].defaultTerm == '0'){
                                    return '是';
                                }else{
                                    return '否';
                                }
                            }()+'</td>' +
                            '<td>'+datas[i].whichTerm+'</td>' +
                            '<td>'+datas[i].startTime+'</td>' +
                            '<td>'+datas[i].endTime+'</td>' +
                            '<td>'+datas[i].classDay+'</td>' +
                            '<td>'+function () {
                                if(datas[i].activate == '0'){
                                    return '激活';
                                }else if(datas[i].activate == '1'){
                                    return '不激活';
                                }else {
                                    return '';
                                }
                            }()+'</td>' +
                            '<td>'+datas[i].position+'</td>' +
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

//时间控件调用
var start = {
    format: 'YYYY-MM-DD',
    /* min: laydate.now(), //设定最小日期为当前日期*/
    /* max: '2099-06-16 23:59:59', //最大日期*/
    // istime: true,
    istoday: false,
    choose: function(datas){
        end.min = datas; //开始日选好后，重置结束日的最小日期
        end.start = datas //将结束日的初始值设定为开始日
    }
};
var end = {
    format: 'YYYY-MM-DD',
    /*min: laydate.now(),*/
    /*max: '2099-06-16 23:59:59',*/
    // istime: true,
    istoday: false,
    choose: function(datas){
        start.max = datas; //结束日选好后，重置开始日的最大日期
    }
};