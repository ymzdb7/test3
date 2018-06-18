/**
 * Created by 骆鹏 on 2017/7/27.
 */
$(function () {
    $.get('/document/sortFlow',{mainType:'DOCUMENTTYPE',detailType:'SENDNG'},function (json) {
        if(json.flag){
            var arr=json.datas;
            var str=''
            for(var i=0;i<arr.length;i++){
                str+='<dl>\
                        <dt>\
                            <img src="/img/sys/icon_organizationmanagement_03.png" alt=""> \
                            <span>'+arr[i].sortName+'</span>\
                        </dt>\
                        <dd>\
                            <ul>\
                            '+function () {
                                var arrys=arr[i].flows;
                                var strflows=''
                                for(var m=0;m<arrys.length;m++){
                                    strflows+='<li data-id="1" data-urlid="'+arrys[m].flowId+'" data-name="'+arrys[m].flowName+'">\
                                                <b></b>\
                                                <a  \
                                                href="javascript:void(0)"  >\
                                                '+arrys[m].flowName+'</a>\
                                               </li>'
                                }
                                return strflows;
                             }()+'\
                            </ul>\
                        </dd>\
                      </dl>'
            }

            if(arr.length==0){
                str='<div style="position: relative;height: 100%">' +
                        '<div style="position: absolute;width: 100px;height: 130px;' +
                    'top: 38%;margin-top: -50px;left: 50%;margin-left: -50px;">' +
                            '<img src="/img/common/dianjikong.png" alt="">' +
                            '<p style="text-align: center;font-size: 11pt;color: #000;margin-top: 10px;' +
                    'padding-left: 12px;">'+no_Data+'</p>' +
                        '</div>' +
                    '</div>'

            }
            $('.tableDl').html(str)
        }
    },'json')
    
    
    
    $('.tableDl').delegate('[data-id="1"]','click',function () {
        var urlid=$(this).attr('data-urlid');
        var runId=null;
        var runName=null;
        var flowName=$(this).attr("data-name");
        (function (fn) {
            $.post('/document/getRunName',{flowId:urlid,runId:'',prcsId:1,flowStep:1},function (json) {
                if(json.flag){
                    // runId=json.data;
                    runName=json.data;
                    if(fn!=undefined){
                        fn()
                    }
                }

            },'json')
        })(function () {
            layer.open({
                title:new1+flowName,
                content:'<div style="margin-top: 10px;">' +
                '<p>' +
                '<label style="display: inline-block;width: 150px;vertical-align: middle;height: 30px;line-height: 30px;text-align: right;">'+titleFawen+' :</label>' +
                '<input type="text" id="runName" value="'+runName+'" style="border-color: #ccc;width:270px;margin-left: 10px;vertical-align: middle" name="nametitle">' +
                '</p>' +
                '<p style="margin-top: 25px;">' +
                '<label style="display: inline-block;width: 150px;vertical-align: middle;height: 30px;line-height: 30px;text-align: right;">'+gongwenZhong+' :</label>' +
                '<select  style="border-color: #ccc;width:270px;margin-left: 10px;vertical-align: middle" name="dispatchType">' +
                '<option value="">'+fillGong+'</option>' +
                '</select>' +
                '</p>' +
                '</div>',
                btn:[sure,cancel],
                area:['600px','350px'],
                yes:function (index) {
                    $.post('/document/saveDoc',{title:$('[name="nametitle"]').val(),flowId:urlid,
                        documentType:0,dispatchType:$('[name="dispatchType"]').val(),
                        fflowId:urlid,frunId:'',fprcsId:1,fflowStep:1,frunName:$('[name="nametitle"]').val()
                    },function (json) {
                        if(json.flag){
                            $.layerMsg({content:save,icon:1},function () {
                                window.open('/workflow/work/workform?flowId='+json.object.flowId+'&flowStep=1&tableName=document&tabId='+json.object.id+'&runId='+json.object.runId+'&prcsId=1&isNomalType=false')
                            });

                        }else {
                            $.layerMsg({content:meet_th_SaveFailed,icon:2});
                        }
                    },'json')
                },
                success:function () {
                    var runNames=document.getElementById('runName');
                    runNames.focus();
                    $.get('/code/GetDropDownBox',{CodeNos:'GWTYPE'},function (json) {
                        var arrTwo=json.GWTYPE;
                        var str='<option value="">'+fillGong+'</option>'
                        for(var i=0;i<arrTwo.length;i++){
                            str+='<option value="'+arrTwo[i].codeNo+'">'+arrTwo[i].codeName+'</option>'
                        }
                        $('[name="dispatchType"]').html(str)
                    },'json')
                }
            })
        })


    })
})