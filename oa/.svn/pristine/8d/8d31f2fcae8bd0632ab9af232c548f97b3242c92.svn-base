


function jumpOpenName(flowId,step,runId,realPrcsId) {
    window.open('/workflow/work/workformPreView?flowId='+flowId+'&flowStep='+step+'&runId='+runId+'&prcsId='+realPrcsId);
}
function jumpOpenType(flowId,type) {
    window.open('/flowSetting/processDesignToolsT?flowId='+flowId+'&type='+type);
}

function jumpOpenStep(flowId,runId,me) {
    eventas=$(me).parent().parent().find('.wenhaoTwo');
    window.open('/flowSetting/processDesignToolTwo?flowId='+flowId+'&rilwId='+runId);
}

$(document).on('click','.editAndDelete0',function () {//委托
    var dataObject=pageObj.arrs[$(this).attr('data-i')]
    layer.open({
        type:1,
        offset: '80px',
        area: ['800px', '400px'],
        // closeBtn: 0,
        title:[weituo, 'background-color:#f3f3f3;color:#333'],
        btn:[sure, cancel],
        content: '<div class="content" style="width:98%;margin:0 auto">' +
        '<table style="margin-top:20px;" class="weituo">' +
        '<thead><tr>' +
        '<th>'+liushui+'</th><th>'+work+'</th><th>'+currten+'</th><th>'+weituoBy+'</th>'+
        '</tr></thead>'+
        '<tbody><tr>' +
        '<td>'+dataObject.runId+'</td><td>'+dataObject.runName+'</td><td>'+dataObject.prcsName+'</td>' +
        '<td style="width: 250px;"><button id="weituo">'+weituo+'</button><input type="text" id="weituoUser" style="width:150px;height:28px;border-radius: 3px;" disabled="disabled"></td>'+
        '</tr></tbody>'+
        '</table>'+
        '<table style="margin-top:20px;">' +
        '<thead ><tr><th style="text-align: left;padding-left:10px;color:#333;border-bottom: 2px solid #4094bd;">'+leading+'</th></tr></thead>'+
        '<tbody><tr>' +
        '<td>' +
        '<div style="margin:10px;">' +
        '<div class="ling"><span class="sms-bg-static" data-type="no"></span>'+leadingCop+'</div>'+
        '<div class="phone" style="margin-left:50px;"><span class="sms-bg-static" data-type="no"></span>'+leadingGK+'</div>'+
        '</div>'+
        '<div class="tix_con" style="margin:10px 10px;text-align: left">'+leadContent+'：<input class="conText" type="text" value="'+workLeading+'：'+dataObject.runName+'"></div>'+
        '</td>'+
        '</tr></tbody>'+
        '</table>'+
        '</div>',
        yes:function(){
            var entrstUser=$("#weituoUser").attr("user_id");
            if(entrstUser!='' &&  entrstUser.indexOf(",")>=0){
                entrstUser=entrstUser.substring(0,entrstUser.length-1)
            }
            $.ajax({
                url: "../../workflow/work/entrustUser",
                type: "post",
                dataType: "json",
                data: {
                    id:dataObject.id,
                    runId:dataObject.runId,
                    prcsId:dataObject.prcsId,
                    flowPrcs:dataObject.flowPrcs,
                    prcsFlag:dataObject.prcsFlag,
                    entrstUser:entrstUser,
                    userId:dataObject.userId,
                    opFlag:dataObject.opFlag
                },
                success: function (data) {
                    if (data.flag) {
                        $.layerMsg({content: weiCh, icon: 1});
                        pageObj.init();
                        layer.closeAll();
                    } else {
                        if(data.msg=='error'){
                            $.layerMsg({content: weiSh, icon: 2});
                        }else{
                            $.layerMsg({content: data.msg, icon: 2});
                        }
                    }
                }
            })
        },
        btn2:function(){

        },
        success:function(){
            //    点击铃铛
            $('.sms-bg-static').click(function(){
                if($(this).attr('data-type')=='no'){
                    $(this).addClass('showLing');
                    $(this).attr('data-type','yes')
                }else{
                    $(this).removeClass('showLing');
                    $(this).attr('data-type','no')
                }
            })
            //    点击委托
            $('#weituo').click(function(){
                user_id='weituoUser';
                $.popWindow('../../common/selectUser?0');
            })
            var entrstUser=$("#weituoUser").attr("user_id");
            if(entrstUser==''){
                alert(pleaseFu+"["+dataObject.runId+"]"+weiMassage)
            }
        }
    })
})

$(document).on('click','.editAndDelete1',function () {//催办
    var obj=pageObj.arrs[$(this).attr('data-i')]
    layer.open({
        type:1,
        offset: '80px',
        area: ['800px', '300px'],
        // closeBtn: 0,
        title:[cui, 'background-color:#f3f3f3;color:#333'],
        btn:[sure, cancel],
        content: '<div class="content" style="width:98%;margin:0 auto">' +
        '<div class="heade" style="margin-top:20px;font-size:16px;border-radius: 4px">'+inputContent+'：</div>'+
        '<textarea name="" id="urgeCon" style="width:100%;height:85px;border-radius: 4px; margin-top: 20px;"></textarea>'+
        '</div>',
        yes:function(){
            $.ajax({
                type:'post',
                data:{
                    id:obj.id,
                    userId:obj.userId,
                    flowPrcs:obj.flowPrcs,
                    runId:obj.runId,
                    runName:obj.runName,
                    flowId:obj.flowId,
                    prcsId:obj.prcsId,
                    smsContent:$("#urgeCon").text(),
                },
                url:'/workflow/work/reminders',
                dataType:'json',
                success:function(res){
                    if (res.flag) {
                        $.layerMsg({content: cuibanC, icon: 1});
                        pageObj.init();
                        layer.closeAll();
                    } else {
                        $.layerMsg({content: cuibanS, icon: 2});
                    }

                }
            })
        },
        btn2:function(){

        },
        success:function(){
            $("#urgeCon").text(tixing+":"+obj.runId+"，"+flowName+":"+obj.runName+deWork);
        }
    })
})

$(document).on('click','.editAndDelete2',function () {//结束
    var obj=pageObj.arrs[$(this).attr('data-i')]
    //询问框
    layer.confirm(com, {title:xinxiM,
        btn: [sure, cancel] ,//按钮
    }, function(){
        $.ajax({
            type:'post',
            data:{
                runId:obj.runId,
                flag:2,
                prcsId:obj.prcsId,
                userId:obj.userId,
                flowPrcs:obj.flowPrcs,
                prcsFlag:obj.prcsFlag
            },
            url:'/workflow/work/updateState',
            dataType:'json',
            success:function(res){
                if (res.flag) {
                    $.layerMsg({content: chegon, icon: 1});
                    pageObj.init();
                } else {
                    $.layerMsg({content: shib, icon: 2});
                }

            }
        })
    }, function() {
        layer.closeAll();
    })
})

$(document).on('click','.editAndDelete3',function () {//删除
    var obj=pageObj.arrs[$(this).attr('data-i')];
    //询问框
    layer.confirm(qued,{title:xinxiM,
        btn: [sure, cancel] ,//按钮
    }, function(){
        $.ajax({
            type:'post',
            data:{
                runId:obj.runId,
                flag:1
            },
            url:'/workflow/work/updateState',
            dataType:'json',
            success:function(res){
                if (res.flag) {
                    $.layerMsg({content: delc, icon: 1});
                    pageObj.init();
                } else {
                    $.layerMsg({content: delf, icon: 2});
                }

            }
        })
    }, function(){
        layer.closeAll();
    });
})

$(document).on('click','.editAndDelete5',function () {//退回
    var obj=pageObj.arrs[$(this).attr('data-i')];
     var str='';
    if(obj.allowBack=='1' || obj.allowBack=='2') {
        $.ajax({
            url: '/workflow/work/getflowprcsdata',
            type: 'get',
            data: {
                prcsId:obj.prcsId,
                runId:obj.runId,
                allowBack:obj.allowBack
            },
            dataType: 'json',
            success: function (res) {
                var data=res.obj
               if(res.flag){
                   for(var i=0;i<data.length;i++){
                          res.obj.forEach(function(v,i){
                           str += '<li><input type="radio" name="feedbackstep" class="" flowPrcs="'+v.flowProcess.prcsId+'"><span class="feedbacktitle">'+di+''+v.prcsId+''+bu+''+v.flowProcess.prcsName+'</span><div class="feedbackcontent">'+host+'：'+v.userName+'&nbsp;&nbsp;&nbsp;'+handTime+'：'+v.prcsTime+'</div></li>';
                       });
                   }
               }
                layer.open({
                    type: 1,
                    offset: '80px',
                    area: ['800px', '520px'],
                    title: [obj.runName, 'background-color:#f3f3f3;color:#333'],
                    btn: [sure, cancel],
                    content: '<div class="modal-body" style="max-height: 274px;">' +
                    '<div class="work-prcs-title" id="op_user_show_info" style="margin-bottom: 10px;font-weight: normal;border-radius: 4px;-webkit-border-radius: 4px;">' +
                    ''+inpputBU+'：' +
                    '</div><div class="work-prcs-block">' +
                    '<div class="work-prcs-content clearfix" style="border: 1px solid #f3f3f3;"><div class=" workflow-procs-nodes-result-wrap">' +
                    '<ul id="work-next-prcs-block" class="workflow-procs-nodes-result" style="top: 0px; margin-left: 30px;word-spacing: 0px;">' +str+
                    '</ul></div></div></div><div class="work-msg-block">' +
                    '<div class="work-msg-title"><a id="msg-control" href="#"><img style="vertical-align: text-top; margin-top: 5px;" src="../../img/workflow/work/add_work/form_down.png"></a> '+inputCui+'：</div>' +
                    '<div class="work-msg-content" style="display: block;"><div class="clearfix"><textarea id="feedback" class="backinfo"></textarea>' +
                    '</div></div></div></div>',
                    yes: function () {
                        var feedback = $('#feedback').val();
                        var backflowPrcs = $("input[name='feedbackstep']:checked").attr('flowPrcs');
                        if(backflowPrcs == '' || backflowPrcs==null){
                            $.layerMsg({content:inpputBU,icon:3},function(){
                            });
                            return false;
                        }
                        if(feedback == ''){
                            $.layerMsg({content:inputCui,icon:3},function(){
                            });
                            return false;
                        }
                        $.ajax({
                            type: "get",
                            url: "/workflow/work/insertprcsdata",
                            dataType: 'JSON',
                            data: {
                                flowPrcs :backflowPrcs,
                                prcsId : "",
                                flowStep: obj.prcsId,
                                runId : obj.runId,
                                feedback : $('#feedback').val()
                            },
                            success: function (res) {
                                if(res.flag){
                                    $.layerMsg({content:returnCc,icon:1},function(){
                                        layer.closeAll();
                                        pageObj.init();
                                    });
                                }else{
                                    $.layerMsg({content:returnSb,icon:2},function(){
//                                                            layer.closeAll();
                                    });
                                }
                            }
                        });
                    },
                    btn2: function () {

                    },
                    success: function () {

                    }
                })
            }
        })
    }
})

//流程分类递归
function queryChild_flow(datas,str_li,level){
    for(var i=0;i<datas.length;i++){

        var className="levelleft"+level;
        if(datas[i].sortName=='未定义'){
            str_li+='<option value="'+datas[i].sortNo+'">'+datas[i].sortName+'</option>'
        }else{
            str_li+='<option value="'+datas[i].sortNo+'">'+datas[i].sortName+'</option>'
        }

        /*   console.log(datas[i].childs); */
        if(datas[i].childs!=null){
            str_li = queryChild_flow(datas[i].childs,str_li,level+1);
        }
    }
    return str_li;
}
$(function(){
    // pageObj.init();
    $("#addUser").on("click",function(){
        user_id='user';
        $.popWindow("../../common/selectUser?0");
    });
    $("#clearUser").on("click",function(){
        $("#user").val("");
        $("#user").attr('user_id','');
    })
//    点击查询
    $('#query').click(function(){
        pageObj.data.flowId=$('[name="flowId"]').val();
        pageObj.data.runId=$('[name="runId"]').val();
        pageObj.data.runName=$('[name="runName"]').val();
        pageObj.data.workLevel=$('[name="workLevel"]').val();
        pageObj.data.userId=$('[name="userId"]').attr("user_Id");
        pageObj.data.status=$('[name="status"]').val();
        pageObj.init();
    })

    $("#outport").click(function () {
        window.location.href='../../workflow/work/monitoring?output=1&flowId='+$('[name="flowId"]').val()
            +'&runId='+$('[name="runId"]').val()+'&runName='+$('[name="runName"]').val()
            +'&workLevel='+$('[name="workLevel"]').val()+'&status='+$('[name="status"]').val()
            +'&userId='+$('[name="userId"]').attr("user_Id");
    })

})