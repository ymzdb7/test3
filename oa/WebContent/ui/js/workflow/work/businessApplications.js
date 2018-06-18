/**
 * Created by 骆鹏 on 2017/7/12.
 */

function replaceReg(strs){
    var str=strs;
    var strsto=str.replace(/attend_leave/,qingjia).replace(/attend_evection/g,chucai).replace(/attend_out/g,waichu).replace(/document/g,gongjiao)
    return strsto;
}

var attendLeave;


function deletes(id,me) {
    $.layerConfirm({title:queding,content:qued,icon:0},function(){
        $.post('/flowhook/deleteHook',{'hid':id},function (json) {
            if(json.flag){
                $.layerMsg({content:delc,icon:1},function(){
                    $(me).parent().parent().remove()
                });
            }
        },'json')
    })

}


function getData(){
    $.get('/flowhook/getHookAll',function (json) {
        if(json.flag){
            var arr=json.obj;
            var str=''
            for(var i=0;i<arr.length;i++){
                str+='<tr><td>'+arr[i].orderId+'</td>\
                    <td>'+replaceReg(arr[i].hmodule)+'<input type="hidden" value="'+arr[i].hmodule+'"></td>\
                    <td>'+arr[i].hname+'</td>\
                    <td>'+function () {
                        if(arr[i].dataDirection==1){
                            return kdds
                        }else {
                            return kld
                        }
                    }()+'<input type="hidden" value="'+arr[i].dataDirection+'"></td>\
                    <td>'+arr[i].flowName+'<input type="hidden" value="'+arr[i].flowId+'"></td>\
                    <td title="'+arr[i].map+'">'+arr[i].map+'</td>\
                    <td>'+arr[i].hdesc+'</td>\
                        <td>\
                            <a href="javascript:void (0)" class="newsBtntwo" data-num="1">'+edit1+'</a>\
                            <a href="javascript:void (0)" onclick="deletes('+arr[i].hid+',this)">'+del+'</a>\
                    </td></tr>'
            }
            $('table tbody').html(str)
        }
    },'json')
}
$(function () {
    layui.use(['layer', 'form'], function() {
        layer = layui.layer
            , form = layui.form();
        $(document).delegate('.newsBtntwo','click',function () {
            var stris='';
            var obj={};
            if($(this).attr('data-num')==0){
                stris=xinjian
                obj.orderId=''
                obj.hname=''
                obj.hmodule=''
                obj.flowId=''
                obj.dataDirection=''
                obj.hdesc=''
                obj.url='/flowhook/saveHook'
                obj.str=new1
            }else {
                stris=edit2
                obj.orderId=$(this).parent().parent().find('td').eq(0).text()
                obj.hname=$(this).parent().parent().find('td').eq(2).text()
                obj.hmodule=$(this).parent().parent().find('td').eq(1).find('input').val()
                obj.flowId=$(this).parent().parent().find('td').eq(4).find('input').val()
                obj.dataDirection=$(this).parent().parent().find('td').eq(3).find('input').val()
                obj.map=$(this).parent().parent().find('td').eq(5).text()
                obj.hdesc=$(this).parent().parent().find('td').eq(6).text()
                obj.url='/flowhook/updateHook'
                obj.str=edit1
            }

            layer.open({
                title: stris,
                area: ['800px', '500px'],
                type:1,
                content: '<form id="saveRule" action="'+obj.url+'" class="layui-form"><div class="inputlayout">' +
                '<ul>' +
                '<li class="clearfix">' +
                '<label>'+xuhao+' ：</label><input type="text" name="orderId" value="'+obj.orderId+'">' +
                '</li>' +
                '<li class="clearfix">' +
                '<label>'+mingcheng+' ：</label><input type="text" name="hname" value="'+obj.hname+'">' +
                '</li>' +
                '<li class="clearfix">' +
                '<label>'+yewu+' ：</label>' +
                ' <select name="hmodule"  data-value="'+obj.hmodule+'"  lay-verify="" lay-filter="automaticCandidateTwo">'+
                '<option value="">'+ds+'</option>'+
                '<option value="attend_leave">'+qingjia+'</option>'+
                '<option value="attend_evection">'+chucai+'</option>'+
                '<option value="attend_out">'+waichu+'</option>'+
                '<option value="document">'+gongjiao+'</option>'+
                '</select>   ' +
                '</li>' +
                '<li class="clearfix">' +
                '<label>'+liucheng+' ：</label>' +
                ' <select name="flowId" data-value="'+obj.flowId+'"  lay-verify=""  lay-filter="process" >'+
                '<option value="">'+ds+'</option>'+
                '</select>   ' +
                '</li>' +
                '<li class="clearfix">' +
                '<label>'+dataF+' ：</label>' +
                ' <select name="dataDirection"   data-value="'+obj.dataDirection+'" lay-verify="" lay-filter="orientation" >'+
                '<option value="1">'+kdds+'</option>'+
                '<option value="2">'+kld+'</option>'+
                '</select>   ' +
                '</li>' +
                '<li class="clearfix" style="position: relative;padding-bottom: 50px">' +
                '<label>'+dataY+' ：</label>' +
                '<ul class="business allacti"  ></ul>' +
                '<ul class="processS allacti" ></ul>' +
                '<button class="btnSave" type="button" style="position: absolute;left: 50%;margin-left: -80px;bottom: 7px;color:#fff;' +
                'background-color: #ccc;padding: 5px 10px;border-radius: 20px;cursor: pointer">'+palse+'</button>' +
                '</li>' +
                '<li class="clearfix">' +
                '<label>'+guanxi+' ：</label>' +
                '<ol>' +
                '</ol>' +
                '</li>' +
                '<li class="clearfix">' +
                '<label>'+mao+' ：</label><textarea name="hdesc" value="'+obj.hdesc+'">'+obj.hdesc+'</textarea>' +
                '</li>' +
                '</ul>' +
                '</div><input type="hidden" name="map"></form>',
                btn: [obj.str, retu],
                yes: function (index) {
                    var arrayObj=$('[name="maps"]');
                    var str=''
                    for(var i=0;i<arrayObj.length;i++){
                        str+=$(arrayObj[i]).val()+','
                    }
                    $('[name="map"]').val(str);

                    $('#saveRule').ajaxSubmit({
                        type:'post',
                        dataType:'json',
                        success:function (json) {
                            if(json.flag){
                                $.layerMsg({content:save,icon:1},function () {
                                    getData();
                                    layer.close(index)
                                })
                            }else {
                                $.layerMsg({content:json.msg,icon:2})
                            }
                        }
                    })
                },
                success:function () {
                    form.render()
                    var hmoduletwo=$('[name="hmodule"]').attr('data-value');//业务模块回显
                    var business;//业务
                    var str='';
                    var processData;//流程
                    $.get('/flowSort/getFlowTypes',function (json) {
                        if(json.flag){
                            var arrobj=json.obj;
                            for(var i=0;i<arrobj.length;i++){
                                str+='<optgroup label="'+arrobj[i].sortName+'">' +
                                    ''+function () {
                                        var stroption='';
                                        for(var m=0;m<arrobj[i].flowTypeModels.length;m++){
                                            stroption+='<option value="'+arrobj[i].flowTypeModels[m].flowId+'">' +
                                                ''+arrobj[i].flowTypeModels[m].flowName+'</option>'
                                        }
                                        return stroption;
                                    }()+'</optgroup>'
                            }
                            $('[name="flowId"]').append(str)
                            form.render()
                            $('[name="flowId"]').next().find('dd').each(function (i,n) {
                                if($(this).attr('lay-value')==$('[name="flowId"]').attr('data-value')){
                                    $(this).click();
                                    return false;
                                }
                            });
                        }
                    },'json')
                    $('[name="dataDirection"]').next().find('dd').each(function (i,n) {
                        if($(this).attr('lay-value')==$('[name="dataDirection"]').attr('data-value')){
                            $(this).click();
                            return false;
                        }
                    })

                    if(obj.map!=undefined) {
                        var arraythr = obj.map.split(',');
                        var strthree = '';
                        for (var q = 0; q < arraythr.length; q++) {
                            if (q != arraythr.length - 1) {
                                strthree += '<li><span>' + arraythr[q] + '(' + $('[name="dataDirection"]').next().find('input').val() + ')</span><input type="hidden" name="maps" value="' + arraythr[q] + '"><b>x</b></li>'
                            } else if (arraythr.length == 1) {
                                strthree += '<li><span>' + arraythr[q] + '(' + $('[name="dataDirection"]').next().find('input').val() + ')</span><input type="hidden" name="maps" value="' + arraythr[q] + '"><b>x</b></li>'
                            }
                        }
                        $('.inputlayout ol').html(strthree)
                    }


                    form.on('select(process)',function (data) {//流程
                        $.post('/flowhook/queryFormId',{'folwId':data.value},function (json) {
                            if(json.flag){
                                workForm.init({
                                        formhtmlurl: '../../form/formType',
                                        resdata: {
                                            fromId: json.object.formId
                                        },
                                        flag: 3
                                    },
                                    function (datas) {
                                        processData = datas;
                                        var liStrs='';//流程
                                        for(var m=0;m<processData.length;m++){
                                            liStrs+='<li>'+processData[m].title+'<input type="hidden" value="'+processData[m].name+'"></li>'
                                        }
                                        if($('[name="dataDirection"]').val()==1){
                                            $('.processS').html(liStrs)
                                        }else if($('[name="dataDirection"]').val()==2){
                                            $('.business').html(liStrs)
                                        }
                                    });
                            }
                        },'json')
                    })

                    form.on('select(orientation)',function (data) {//数据方向
                        if(business==undefined||processData==undefined){
                            return
                        }

                        $('.inputlayout ol').html('')
                        var liStr='';//业务
                        for(var i=0;i<business.length;i++){
                            liStr+='<li>'+business[i].columnComment+'<input type="hidden" value="'+business[i].columnName+'"></li>'
                        }
                        var liStrs='';//流程
                        for(var m=0;m<processData.length;m++){
                            liStrs+='<li>'+processData[m].title+'<input type="hidden" value="'+processData[m].name+'"></li>'
                        }
                        if(data.value==1){
                            $('.business').html(liStr)
                            $('.processS').html(liStrs)
                        }else if(data.value==2) {
                            $('.business').html(liStrs)
                            $('.processS').html(liStr)
                        }
                    })

                    form.on('select(automaticCandidateTwo)',function (data) {//业务
                        $.post('/attendLeave/queryAllAttendLeaveFields',{'tableName':data.value},function (json) {
                            if(json.flag){
                                business=json.obj;
                                var liStr='';//业务
                                for(var i=0;i<business.length;i++){
                                    liStr+='<li>'+business[i].columnComment+'<input type="hidden" value="'+business[i].columnName+'"></li>'
                                }
                                if($('[name="dataDirection"]').val()==1){
                                    $('.business').html(liStr)
                                }else if($('[name="dataDirection"]').val()==2){
                                    $('.processS').html(liStr)
                                }


                            }
                        },'json')
                    })

                    $('[name="hmodule"]').next().find('dd').each(function (i,n) {
                        if($(this).attr('lay-value')==hmoduletwo){
                            $(this).click();
                            return false;
                        }
                    })

                    $(document).delegate('.allacti>li','click',function () {
                        $(this).parent().find('li').removeClass('active')
                        $(this).addClass('active')
                    })

                    $('.btnSave').click(function () {

                        var textBusiness=$('.business .active').text()
                        var inVBusiness=$('.business .active').find('input').val()
                        var textprocessS=$('.processS .active').text()
                        var inprocessS=$('.processS .active').find('input').val()
                        if(textBusiness==''||textprocessS==''){
                            alert(qingFrist)
                            return false
                        }
                        var arrAus=$('.inputlayout ol li');
                        var trueNum=null;
                        for(var i=0;i<arrAus.length;i++){
                            if($(arrAus[i]).find('input').val()==(inVBusiness+'=>'+textprocessS)||$(arrAus[i]).find('input').val()==(textprocessS+'=>'+inVBusiness)){
                                alert(hhh)
                                trueNum=1;
                                return false
                            }
                        }
                        if(trueNum==1){
                            return
                        }
                        var str='';
                        if($('[name="dataDirection"]').val()==1) {
                            str = '<li><span>' + $('.business .active').text() + '-' + $('.processS .active').text() + '('+$('[name="dataDirection"]').next().find('input').val()+')</span><input type="hidden" name="maps" value="' + ($('.business .active').find('input').val()+'=>'+$('.processS .active').text()) + '"><b>x</b></li>'
                        }else if($('[name="dataDirection"]').val()==2){
                            str = '<li><span>' + $('.business .active').text() + '-' + $('.processS .active').text() + '('+$('[name="dataDirection"]').next().find('input').val()+')</span><input type="hidden" name="maps" value="' + ($('.business .active').text()+'=>'+$('.processS .active').find('input').val()) + '"><b>x</b></li>'
                        }
                        $(this).parent().next().find('ol').append(str)
                    })

                    $(document).delegate('.inputlayout ol li b','click',function () {
                        $(this).parent().remove()
                    })

                }
            })
        })



        getData()



        $('.news span').click(function () {
            $(this).parent().siblings().removeClass('active')
            $(this).parent().addClass('active')
            if($(this).attr('data-num')==2){
                $.layerMsg({content:process})
            }
        })
    })
})