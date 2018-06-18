/**
 * Created by 骆鹏 on 2017/9/1.
 */


var numparameter=$.GetRequest()

function ajaxData(num) {
    $.get('/document/getRuleById',{id:num},function (json) {
        if(json.flag){
            var str='';
            var objTitle=json.object.ruleTitles;
            for(var i=0;i<objTitle.length;i++){
                str+='<th class="th" align="center">'+objTitle[i]+'</th>'
            }
            str+='<th class="th" align="center">'+option+'</th>'
            $('.mainBottom table thead tr').html(str)


            var strDataMain='';
            var objDataMain=json.object.ruleExps;
            for(var m=0;m<objDataMain.length;m++){
                strDataMain+='<td>'+objDataMain[m]+'</td>'
            }
            strDataMain+='<td>' +
                '<a href="javascript:void(0)" class="addNum" ' +
                'style="margin-right: 10px"  data-id="'+json.object.id+'">'+addNub+'</a>' +
                '<a href="javascript:void(0)" data-id="'+json.object.id+'" class="newNum">'+setInit+'</a>' +
                '</td>';
            $('.mainBottom table tbody tr').html(strDataMain)

        }
    },'json')
}

$(function () {
    ajaxData(numparameter.id)


    $('.returnOne').click(function () {
        parent.iframesHref('/workflow/work/automaticNumberingOne')
    })
    $('.mainBottom').delegate('.addNum','click',function () {
        var me=this;
        $.layerConfirm({title:sureAdd,content:ifAdd,icon:1},function(){
            $.get('/document/updateCount',{id:$(me).attr('data-id')},function (json) {
                if(json.flag){
                    ajaxData(numparameter.id)
                }
            },'json')
        })

    })

    $('.mainBottom').delegate('.newNum','click',function () {
        var me=this;
        $.layerConfirm({title:setNum,content:'<p><span>'+initIs+'：</span>' +
            '<input type="text" name="num" style="border: 1px solid #ddd;padding-left: 10px;border-radius: 4px;line-height: 26px;"></p>',icon:1},
            function(){
            if($('[name="num"]').val()==''){
               alert(initIsKong)
                return
            }
            $.get('/document/updateRule',{id:$(me).attr('data-id'),counter:$('[name="num"]').val()},function (json) {
                if(json.flag){
                    ajaxData(numparameter.id)
                }
            },'json')
        })

    })
})