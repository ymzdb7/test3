/**
 * Created by 骆鹏 on 2018/1/9.
 */
/**
 * Created by 骆鹏 on 2018/1/5.
 */
function GetDropDownBox(fn) {
    $.ajax({
        url: "/code/GetDropDownBox",
        type:'get',
        dataType:"JSON",
        data : {"CodeNos":"NOTIFY"},
        success:function(data){
            var str='<option value="">'+notice_type_alltype+'</option>';
            for (var proId in data){
                for(var i=0;i<data[proId].length;i++){
                    str += '<option value="'+data[proId][i].codeNo+'">'+data[proId][i].codeName+'</option>'

                }
            }
            $('[name="type"]').html(str)
            if(fn!=undefined){
                fn()
            }
        }

    })
}
$(function () {
    GetDropDownBox()
//表格初始化
    var pageObj=$.tablePage('#pagediv','1113px',[
        {
            width:'100px',
            title:notice_th_publisher,
            name:'s',
            selectFun:function (n,obj) {
                return obj.users.userName
            }
        },
        {
            width:'413px',
            title:notice_th_title,
            name:'subject',
            selectFun:function (name,obj,i) {
                if(obj.top=='1'){
                    return '<div style="width: 100%;text-align: left">' +
                        '<span style="    color: #fff;\
     background: #ef7559;\
     font-size: 12px;\
     padding: 2px 5px;\
     margin-right: 3px;\
     border-radius: 3px;">'+notice_th_top+'</span>'+
                        '<a href="/notice/detail?notifyId='+obj.notifyId+'" ' +
                        'target="_blank" class="windowOpen">'+name+'</a>' +
                        '</div>'
                }else {
                    return '<div style="width: 100%;text-align: left">' +
                        '<a href="/notice/detail?notifyId='+obj.notifyId+'" ' +
                        'target="_blank" class="windowOpen">'+name+'</a>' +
                        '</div>'
                }
            }
        },
        {
            width:'150px',
            title:notice_th_effectivedate,
            name:'begin'
        },
        {
            width:'350px',
            title:notice_th_releasescope,
            name:'deprange',
            selectFun:function (name,obj,i) {
                return '<span class="toTypeName" data-i="'+i+'" style="cursor: pointer">'+name+obj.rolerange+obj.userrange+'</span>'
            }
        },
        {
            width:'100px',
            title:notice_th_type,
            name:'typeName',
            selectFun:function (name,obj,i) {
               if(name==''){
                   return notice_type_alltype
               }else {
                   return name
               }
            }
        }
    ],function (me) {
        me.data.typeId=$('[name="type"]').val();
        me.data.read='0';
        me.data.sendTime=$('[name="sendTime"]').val();
        //1显示  // 2不显示  //不写fn这个属性就是全显示
        me.init("/notice/notifyManage",[{name:'s',fn:function (obj) {
            if(obj.typeName==''){
                return '<span style="color: #000;">'+notice_type_alltype+'</span>'
            }else {
                return '<span style="color: #000;">'+obj.typeName+'</span>'
            }
        }}],function (json) {
            if(!json.flag){
                $.layerMsg({
                    content:noUnread_announcements,
                    icon:1
                },function () {
                    $((parent.$('.head-top li'))[2]).trigger('click')
                })
            }
        })
    })





    $('.submit').click(function () {
        pageObj.data.read='0';
        pageObj.data.sendTime=$('[name="sendTime"]').val();
        pageObj.data.typeId=$('[name="type"]').val();
        pageObj.init()
    })

    $('#pagediv').on('mouseover','.toTypeName',function () {
        var obi=pageObj.arrs[$(this).attr('data-i')];

        layer.tips(userManagement_th_department +':'+obi.deprange+'<br/>' +
            journal_th_user +':'+obi.userrange+'<br/>' +
            userManagement_th_role +':'+obi.rolerange+'',this, {
            tips: [1, '#3595CC'],
            time: 1000
        });
    })



})