/**
 * Created by liruixu on 2017/6/13.
 */
//全局方法
function jump(me){
    console.log(me)
    parent.newjump($(me).attr('data-Url'))
}
function delete_priv(me,num) {
    console.log(me)
    $.layerConfirm({title:queding,content:qued,icon:0},function(){
        $.post('/userPriv/deletePriv',{'userPriv':num},function (json) {
            if(json.flag){
                $.layerMsg({content:delc,icon:1},function () {
                    location.reload()
                })
            }
        },'json')
    })

}

function filechang() {
// $.upload($('#fileload'),function (c) {
//     $.layerMsg({content:'导入成功',icon:1})
//     location.reload()
// })

    $('#fileload').ajaxSubmit({
        type: 'post',
        dataType: 'json',
        success: function (json) {
            var data=json.object;
            if (json.flag) {
                var str=importSuccess+data.insertCounts+"条数据，失败"+data.failCounts+"条数据。";
                if(data.reapNameCount!=0 || data.emptyCount!=0){
                    str+='失败原因：';
                    if(data.emptyCount!=0){
                        str+='角色名称和角色排序号不能为空;';
                    }
                    if(data.reapNameCount!=0){
                        str+='角色名称重复;';
                    }
                }
                console.log(str)
                $.layerMsg({content: str, icon: 1}, function () {
                    location.reload();
                });
            }else{
                $.layerMsg({content: data.msg, icon: 1}, function () {
                });
            }

        }
    })

}


$(function () {
   if($('[name="username"]').val()==0){
       $('#hiddenMain').hide();
       $('#loginAdmin').show();
       $('#north').hide()
   }else {
       $('#hiddenMain').show();
       $('#loginAdmin').hide();
       $('#north').show()
   }




    // function getChDept(target, deptId) {//侧边栏加载
    //     $.ajax({
    //         url: '../department/getChDeptfq',
    //         type: 'get',
    //         data: {
    //             deptId: deptId
    //         },
    //         dataType: 'json',
    //         success: function (data) {
    //             /* if() */
    //             if (deptId == 30) {
    //                 var str = '';
    //                 data.obj.forEach(function (v, i) {
    //                     if (v.deptName) {
    //                         str += '<li><span  deptid="' + v.deptId + '" class="childdept"><span></span><img src="../img/main_img/company_logo.png" alt=""><a href="#" class="dynatree-title" title="' + v.deptName + '">' + v.deptName + '</a></span><ul style="margin-left:10%;display:none;"></ul></li>';
    //                     } else {
    //                         str += '<li><span deptid="' + v.deptId + '" class="childdept"><span><img src="../img/main_img/man.png" alt=""></span><img src="img/main_img/man.png" alt=""><a href="#" class="dynatree-title" title="' + v.userName + '">' + v.userName + '</a></span><ul style="margin-left:10%;display:none;"></ul></li>';
    //                     }
    //                 });
    //                 target.html(str);
    //             } else if(deptId == 20){
    //                 var str = '';
    //                 data.obj.forEach(function (v, i) {
    //                     if (v.deptName) {
    //                         str += '<li><span deptid="' + v.deptId + '" class="childdept"><span class=""></span><a href="#" class="dynatree-title" title="' + v.deptName + '">' + v.deptName + '</a></span><ul style="margin-left:10%;display:block;" id="dpetWhole"></ul></li>';
    //                     }
    //                 });
    //                 target.html(str);
    //                 getChDept($("#dpetWhole"), 30);
    //                    alert(1);
                // }else{
                //     var str = '';
                //     data.obj.forEach(function (v, i) {
                //         if (v.deptName) {
                //             str += '<li><span deptid="' + v.deptId + '" class="childdept"><span class=""></span><a href="#" class="dynatree-title" title="' + v.deptName + '">' + v.deptName + '</a></span><ul style="margin-left:10%;display:none;"></ul></li>';
                //         }
                //     });
                //     target.html(str);
                // }

            // }
        // })
    // }
    // getChDept($('#deptOrg'),20); //根据地区，北京集团
    




    $('.dept_li ').click(function () {//左边栏展示隐藏
        if($(this).next('.pick').css('display')=='none') {
            $(this).next('.pick').show()
            $(this).removeClass('liUp')
            $(this).addClass('liDown')
        }else {
            $(this).next('.pick').hide()
            $(this).removeClass('liDown')
            $(this).addClass('liUp')
        }
    })
    
    var htmlloadDate={//界面初始化数据
        init:function () {
            var me=this;
            $.get('/getAllUserPriv',function (json) {
               me.htmlLoad(json);
            },'json')
        },
        htmlLoad:function (date) {
            var str='';
            var data=date.obj
            for(var i=0;i<data.length;i++){
                str+='<tr>' +
                        '<td nowrap="" align="center" width="60">'+data[i].privNo+'</td>' +
                        '<td nowrap="" align="center">'+data[i].privName+'</td>' +
                        // '<td nowrap="" align="center">'+data[i].privDeptId+'</td>' +
                        '<td nowrap="" align="center">'+data[i].showCount+' </td>' +
                        '<td nowrap="" align="center">&nbsp;&nbsp; <a href="javascript:void(0)" onclick="jump(this)" data-url="modifyThePermissions?'+data[i].userPriv+'"> '+permissions+'</a>&nbsp;&nbsp;'+
                        '<a href="javascript:void(0)" onclick="jump(this)" data-url="newRole?'+data[i].userPriv+'"> '+edit1+'</a>&nbsp;&nbsp;'+
                        '<a href="javascript:void(0)" onclick="jump(this)" data-url="cloning?'+data[i].userPriv+'">'+clone+'</a>&nbsp;&nbsp;'+
                        '<a href="javascript:void(0)" onclick="delete_priv(this,'+data[i].userPriv+')"> '+del+'</a>'+
                        '</td>' +
                     '</tr>'
            }/*<a href="javascript:viod(0)">查看详情</a>*/
            $('#table_style tbody').html(str)
        }
    }

    
    
    $('.import').click(function () {
        $.post('userPriv/checkSuperPass',{'password':$('[name="super_pass"]').val()},function (json) {
            if(json.flag) {
                $('#hiddenMain').show();
                $('#loginAdmin').hide();
                $('#north').show()
            }else {
                layer.alert(mima,{title:xinxiM,btn:sure})
            }
        },'json')
    })

    $(document).keyup(function (e) {
        if(e.keyCode==13){
            $('[type="button"]').trigger('click')
        }
    })

    
    
    
    
    
    
    
    
    
    
    
    htmlloadDate.init()
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
})