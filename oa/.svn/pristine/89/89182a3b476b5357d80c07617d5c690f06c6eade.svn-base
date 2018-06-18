/**
 * Created by liruixu on 2017/6/16.
 */
var user_id='';

$(function () {
    var urlbool={
        urlstr:null,
        init:function () {
            var me=this;
            $.get('/getAllUserPriv',function (json) {
                me.ajaxdata(json);
            },'json')
        },
        ajaxdata:function (date) {
           if(date.flag){
               var str=''
                for(var i=0;i<date.obj.length;i++){
                    str+='<label><input type="checkbox" name="chesk" value="'+date.obj[i].userPriv+'">'+date.obj[i].privName+'</label>&nbsp;'
                }
                $('.tadata').html(str)
           }
        }
    }
    urlbool.init()
    
    $('.orgAdd').click(function () {
        user_id = $(this).prev().prop('id');
        $.popWindow("/common/selectUser");
    })
    $('.orgClear').click(function () {
        $('#BigStatic').val('')
        $('#BigStatic').attr('user_id','')
    })
    $('.import').click(function () {
        var obj={};
        obj.sign=$('[name="OPERATION"]:checked').val();
        obj.funcIds=''
        $('[name="chesk"]:checked').each(function (i,n) {
            obj.funcIds+=$(this).val()+','
        })
        obj.userId=$('textarea').attr('user_id')
        $.post('/userPriv/updateUserFunByUID',obj,function (json) {
            if(json.flag){
                $.layerMsg({content:menuSSetting_th_editSuccess ,icon:1},function () {
                    parent.newjump('roleAuthorization')
                })
            }
        },'json')
    })
})