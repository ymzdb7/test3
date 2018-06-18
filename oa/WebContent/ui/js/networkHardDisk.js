/**
 * Created by 骆鹏 on 2017/7/4.
 */
var objNode=null;//存储点击节点node数据
var copynum;//kaopi和剪切
var copyArr=[];//剪切和复制时发送的数据
var urlnum=window.location.href.split('?')[1];//获取参数



function reloadTree(){//树形结构加载
    $("#fileTransfor").empty();
    $.ajax({
        Type: "GET",
        url: "/netdisk/getNetDiskMenu",
        dataType:'json',
        success: function (data) {
            if (data.flag) {
                $("#fileTransfor").append("<ul id=\"fileTree\" class=\"easyui-tree\"data-options=\"method:'get',animate:true\" ></ul>");
                $("#fileTree").tree({
                    data: data.datas,
                    onClick: function (node) {
                        objNode=node;

                        $('.neww label').html('<span><b>&gt;</b>'+objNode.text+'</span>')
                        elemLoad(objNode,$('#sortActive .sortActive').attr('data-num'),$('#typeActive .typeActive').attr('data-id'))
                    },
                    onLoadSuccess:function () {
                        if(urlnum==0) {
                            $($('.tree-node').get(0)).click()
                        }else {
                            $('.tree-node').each(function () {
                                if($(this).attr('node-id')==urlnum){
                                    $(this).click();
                                    return false;
                                }
                            })
                        }
                    }
                });

            }
        }
    });
}


function filechanges(e) {//文件上传
    if(objNode==null){
        $.layerMsg({content:fileTrue,icon:2})
        return;
    }
    var timestamp = Date.parse(new Date());
    $('#uploadimgform').attr('action','/netdisk/uploadFile?timestamp='+timestamp);
    $('[name="path"]').val(objNode.attributes.url);
    $('#uploadimgform').ajaxSubmit({
        type: 'post',
        dataType: 'html',
        success: function (jsons) {
            var json=JSON.parse(jsons);
            if (json.flag) {
                $('#uploadimgform [type=file]').each(function (i,n) {
                    var file=$(this);
                    var ie = (navigator.appVersion.indexOf("MSIE")!=-1);
                    if( ie ){
                        var file2= file.cloneNode(false);
                        file2.onchange= file.onchange;
                        file.parentNode.replaceChild(file2,file);
                    }else{
                        $(file).val("");
                    }
                })




                $.layerMsg({content:uplaodOk,icon:1},function () {
                    elemLoad(objNode, $('#sortActive .sortActive').attr('data-num'), $('#typeActive .typeActive').attr('data-id'))
                })
            } else {
                $.layerMsg({content:uplaodNo,icon:2})
            }

        }
    })
}

function elemLoad(node,ordertype,orderby,fn){//搜索当前文件夹下文档(和排序同一个方法)

    if(node==null){
        $.layerMsg({content:fileTrue,icon:2})
        return;
    }
    var obj={
        path:node.attributes.url,
        orderType:ordertype||0,//排序方式
        orderBy:orderby||0//按什么排序
    }
    $.post('/netdisk/selectNetdiskBySearch',obj,function (json) {
        if(json.flag){
            $('#mainContent').show();
            $('#noFile').hide();
            var strData='';
            for(var i=0;i<json.datas.length;i++){
                strData+='<tr class="contentTr" style="margin-right: 33px;">' +
                            '<td align="center"><input type="checkbox" style="margin-right: 31px;"></td>' +
                            '<td align="center" style="text-align: center"><div style="display: inline-block"><img style="width: 16px;" src="/img/file/cabinet@.png" alt="">'+json.datas[i].neName+'</div></td>' +
                            '<td align="center">'+json.datas[i].type+'</td>' +
                            '<td align="center">'+json.datas[i].size+'</td>' +
                            '<td align="center">'+json.datas[i].time+'</td>' +
                          '</tr>'
            }
            $('#file_Tachr').html(strData);
            if(fn!=undefined){
                fn();
            }

            if(json.datas.length==0){
               strData='<tr align="center"> <td colspan="5" >\
                    <div class="bgImg" style="width: 360px;height: 150px;margin: 20px 0px;background-color:#357ece;box-shadow: 3px 3px 3px #2F5C8F;\
                    border-radius: 10px;">\
                   <div class="IMG" style="padding-top: 24px;">\
                    <img src="../img/sys/icon64_info.png">\
                    </div>\
                    <div class="TXT" style="color: #fff;font-size: 14pt;">'+noFile+'</div>\
                    </div></td></tr>';

                $('#file_Tachr').html(strData);
            }
        }
        else {
            $('#mainContent').hide()
            $("div#TXT").html(json.msg)
            $('#noFile').show()
        }
    },'json')
}

$(function () {
    reloadTree();
   $('#contentAdd').click(function () {//新建文件夹
       if(objNode==null){
           $.layerMsg({content:fileTrue,icon:2})
           return;
       }
       layer.open({
           title:childFile,
           content:'  \
           <div style="line-height: 33px;margin: 10px 0px;background: #ebeef5;padding-left: 10px;">\
                <span>'+network+'</span>\
                <label class="gttext">\
                </label>\
           </div>\
           <p style="line-height: 65px;height: 65px;">\
                  <label>'+fileName+'：</label>\
                  <input type="text" name="newzi" style="border: 1px solid #ddd;width: 250px;border-radius: 6px;height: 30px;padding-left: 10px;">\
           </p>',
           area:['500px','270px'],
           btn:[menusetsure,quxiao],
           yes:function (index) {
                $.post('/netdisk/mkDirectory',{path:objNode.attributes.url,directoryName:$('[name="newzi"]').val()},function (json) {
                    if(json.flag){
                        $.layerMsg({content:Newsuccessfully,icon:1},function () {
                            reloadTree();
                        })
                    }else {
                        $.layerMsg({content:quanxian,icon:2})
                    }
                },'json')
           },success:function () {
                   $('.gttext').html('<span><b>&gt;</b>' + objNode.text + '</span>')
           }
       })
   })






    $('.doTitle').click(function(event){//文件夹操作
        if($(this).next().css('display')=='none'){
            $(this).next().show()
        }else {
            $(this).next().hide()
        }
        event.stopPropagation();
    })




    $('#classA ul li').click(function () {//文件夹里面按钮
        if(objNode==null){
            $.layerMsg({content:fileTrue,icon:2})
            return;
        }
        $(this).parent().parent().hide()
        if($(this).attr('data-id')==1){
            layer.open({
                title:reset,
                content:'<p style="line-height: 65px;height: 65px;">\
                    <label>'+origin+'：</label>\
                     <input type="text" name="jiuname" readonly="" style="border: 1px solid #ddd;background:#eee;width: 250px;border-radius: 6px;height: 30px;padding-left: 10px;">\
                  </p>\
                  <p style="line-height: 65px;height: 65px;">\
                    <label>'+newfile+'：</label>\
                     <input type="text" name="newsName" style="border: 1px solid #ddd;width: 250px;border-radius: 6px;height: 30px;padding-left: 10px;">\
                  </p>',
                area:['500px','270px'],
                btn:[menusetsure,quxiao],
                yes:function (index) {
                    $.post('/netdisk/changeName',
                        {path:objNode.attributes.url,newsName:$('[name="newsName"]').val()},
                        function (json) {
                        if(json.flag){
                            $.layerMsg({content:menuSSetting_th_editSuccess,icon:1},function () {
                                reloadTree();
                            })
                        }else {
                            $.layerMsg({content:editFail,icon:2})
                        }
                    },'json')
                },
                success:function () {
                    $('[name="jiuname"]').val(objNode.text)
                }
            })
        }else{
            $.layerConfirm({title:sureDele,
                content:dkn,
                icon:0},function(){
                    $.post('/netdisk/deleteFolder',{path:objNode.attributes.url},function (json) {
                        if(json.flag){
                            $.layerMsg({content:delsucess,icon:1},function () {
                                reloadTree()
                                $('#file_Tachr').html('')
                            })
                        }else {
                            $.layerMsg({content:delNo,icon:2})
                        }
                    },'json')
            })
        }
    })




    $('#SEARCH').click(function () {
        $.layerMsg({content:kaifazhong,icon:6})
        return
        layer.open({
            title:sousuo,
            content:'<p style="line-height: 65px;height: 65px;">\
                    <label style="display: inline-block;width: 130px;text-align: right">'+file1+'：</label>\
                     <input type="text" readonly="" style="border: 1px solid #ddd;background:#eee;width: 250px;border-radius: 6px;height: 30px;padding-left: 10px;">\
                  </p>\
                  <p style="line-height: 65px;height: 65px;">\
                    <label style="display: inline-block;width: 130px;text-align: right">'+file2+'：</label>\
                     <input type="text" style="border: 1px solid #ddd;width: 250px;border-radius: 6px;height: 30px;padding-left: 10px;">\
                  </p>\
                  <p style="color: red;font-size: 12px;padding-left: 138px;">'+file3+'</p>',
            area:['500px','300px'],
            btn:[menusetsure,quxiao],
            yes:function (index) {

            }
        })
    })
    

    
    $('#checkedAll').click(function () {
        if($(this).is(':checked')){
            $('#file_Tachr input[type="checkbox"]').each(function (i,n) {
                $(this).prop('checked',true)
                $(this).parent().parent().addClass('bgcolor')
            })
        }else {
            $('#file_Tachr input[type="checkbox"]').each(function (i,n) {
                $(this).prop('checked',false)
                $(this).parent().parent().removeClass('bgcolor')
            })
        }
    })

    $('#file_Tachr').delegate('input[type="checkbox"]','click',function () {
        if($('#file_Tachr input[type="checkbox"]').length==$('#file_Tachr input[type="checkbox"]:checked').length){
            $('#checkedAll').prop('checked',true);
        }else {
            $('#checkedAll').prop('checked',false);
        }
        if($(this).is(':checked')){
            $(this).parent().parent().addClass('bgcolor')
        }else {
            $(this).parent().parent().removeClass('bgcolor')
        }
    })


    $('#sortActive li').click(function () {
        $(this).siblings().removeClass('sortActive')
        $(this).addClass('sortActive')
        elemLoad(objNode,$('#sortActive .sortActive').attr('data-num'),$('#typeActive .typeActive').attr('data-id'))
        $(this).parent().parent().hide()

    })
    $('#typeActive li').click(function () {
        $(this).siblings().removeClass('typeActive')
        $(this).addClass('typeActive')
        elemLoad(objNode,$('#sortActive .sortActive').attr('data-num'),$('#typeActive .typeActive').attr('data-id'))
        $(this).parent().parent().hide()

    })
    $(document).click(function () {
        $('.hideDiv').hide();
    })
    $('.dowmloadOne').click(function () {//下载

        if(objNode==null){
            $.layerMsg({content:fileTrue,icon:2})
            return;
        }
        if($('#file_Tachr input[type="checkbox"]:checked').length==0){
            $.layerMsg({content:chooseFile,icon:2})
            return;
        }
        if($('#file_Tachr input[type="checkbox"]:checked').length==1) {
            window.open('/netdisk/download?path=' + objNode.attributes.url + '&fileName=' + $('#file_Tachr input[type="checkbox"]:checked').parent().parent().find('td').eq(1).text())
        }else {
            var strarr=[];
            $('#file_Tachr input[type="checkbox"]:checked').each(function (i,n) {
                strarr.push(objNode.attributes.url+'\\'+$(this).parent().parent().find('td').eq(1).text())
            })
            window.open('/netdisk/downLoadZipFile?path[]=' +strarr);
        }
    })

    $('.copyfile').click(function () {
        if($('#file_Tachr input[type="checkbox"]:checked').length==0){
            $.layerMsg({content:fileTrue,icon:2})
            return;
        }
        copyArr.splice(0,copyArr.length)
        copynum=$(this).attr('data-numcopy');
        $('#file_Tachr input[type="checkbox"]:checked').each(function () {
            copyArr.push(objNode.attributes.url+'\\'+$(this).parent().parent().find('td').eq(1).text())
        })
    })
    
    
    $('.SIX').click(function () {//粘贴
        if(objNode==null){
            $.layerMsg({content:fileTrue,icon:2})
            return;
        }
        $.post('/netdisk/writeFile',{toPath:objNode.attributes.url,resourcesPath:copyArr,pasteType:copynum},function (json) {
            if(json.flag){
                $.layerMsg({content:PasteSuccessfully,icon:1},function () {
                    elemLoad(objNode,$('#sortActive .sortActive').attr('data-num'),$('#typeActive .typeActive').attr('data-id'))
                })
            }else {
                $.layerMsg({content:PasteFailed,icon:2})
            }
        },'json')
    })



    $('.FOURs').click(function () {
        if(objNode==null){
            $.layerMsg({content:fileTrue,icon:2})
            return;
        }
        if($('#file_Tachr input[type="checkbox"]:checked').length==0){
            $.layerMsg({content:fileTrue,icon:2})
            return;
        }
        $.layerConfirm({title:sureDeleteFlie,
            content:sureDelete,
            icon:0},function(){
                var arraytwo=[];
                $('#file_Tachr input[type="checkbox"]:checked').each(function () {
                    var urlArr=objNode.attributes.url+'/'+$(this).parent().parent().find('td').eq(1).text()
                    arraytwo.push(urlArr)
                })
                $.post('/netdisk/deleteFile',{path:arraytwo},function (json) {
                    if(json.flag){
                        $.layerMsg({content:delsucess,icon:1},function () {
                            elemLoad(objNode,$('#sortActive .sortActive').attr('data-num'),$('#typeActive .typeActive').attr('data-id'))
                        })
                    }else {
                        $.layerMsg({content:delNo,icon:2})
                    }
                },'json')

        })

    })
})