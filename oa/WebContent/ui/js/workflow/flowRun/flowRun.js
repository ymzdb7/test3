/**
 * Created by 骆鹏 on 2017/7/26.
 */
var eventas;
var pageObj=$.tablePage('#pagediv','1260px',[
    {
        width:'85px',
        title:ggghhhh,
        name:'checkbox',
        selectFun:function (runId,obj) {
            return '<input type="checkbox" id="'+obj.runId+'" name="id" class="id" prcsId="'+obj.prcsId+'" userId="'+obj.userId+'" flowPrcs="'+obj.flowPrcs+'" prcsFlag="'+obj.prcsFlag+'"/>';
        }
    },
    {
        width:'70px',
        title:liushui,
        name:'runId',
    },
    {
        width:'110px',
        title:flowName,
        name:'flowName',
        selectFun:function (flowName,obj) {
            return '<a class="wenhao" style="cursor: pointer;" onclick="jumpOpenType('+obj.flowId+',type=0)">'+flowName+'</a>';
        }
    },
    {

        width:'255px',
        title:work,

        name:'runName',
        selectFun:function (runName,obj) {
            return '<a class="wenhao" style="cursor: pointer;" onclick="jumpOpenName('+obj.flowId+','+obj.step+','+obj.runId+','+obj.realPrcsId+')">'+runName+'</a>';
        }
    },
    {
        width:'100px',
        title:start1,
        name:'userName',
    },{
        width:'190px',
        title:stime,
        name:'beginTime',
        selectFun:function (beginTime,obj) {
            return beginTime.substring(0, beginTime.length-2);
        }
    },{
        width:'140px',
        title:file,
        name:'attachmentName',
    },
    {
        width:'70px',
        title:type1,
        name:'endTime',
        selectFun:function (endTime,obj) {
            if(obj.endTime == undefined){
                return handling
            }else {
                return ends
            }
        }
    },
    {

        width:'240px',
        title:option

    }
],function (me) {
    me.data.pageSize = 5;
    if($("#status").val()==5 || $("#status").val()==6){
        me.data.userId=$('[name="userId"]').attr("user_Id");
    }else{
        me.data.userId=$.cookie("userId");
    }
    me.data.flowId=$('[name="dispatchType"]').val();
    me.data.runId=$('[name="runId"]').val();
    me.data.runName=$('[name="runName"]').val();
    me.data.state=$('[name="status"]').val();
    me.data.workLevel=$('[name="status2"]').val();
    me.data.status=$('[name="status1"]').val();
    me.data.beginDate=$('[name="beginDate"]').val();
    me.data.endDate=$('[name="endDate"]').val();
    me.init('../../flowRun/queryFlowRun',
        [{name:workflow,fn:function(obj){
            return 1;
        }},{name:ending,fn:function(obj){
            if((obj.all=='1' || obj.manage=='1')&& obj.endTime==undefined){
                return 1;
            }else{
                return 0;
            }
        }},{name:cui,fn:function(obj){
            if(obj.all=='1' || obj.manage=='1' || obj.monitor=='1'){
                return 1;
            }else{
                return 0;
            }
        }},/*{name:edit1,fn:function(obj){
            if((obj.all=='1' || obj.manage=='1') && obj.prcsFlag=='4'){
                return 1;
            }else{
                return 0;
            }
        }},*/{name:del,fn:function(obj){
            if(obj.all=='1' || obj.manage=='1'){
                return 1;
            }else{
                return 0;
            }
        }},{name:handleRe,fn:function(obj){
            if((obj.all=='1' || obj.manage=='1') && (obj.prcsFlag==4 || obj.endTime!=undefined)){
                return 1;
            }else{
                return 0;
            }
        }}])
})

$(document).on('click','.editAndDelete0',function () {//流程图
    var obj=pageObj.arrs[$(this).attr('data-i')]
    eventas=$(this).parent().parent().find('.wenhao');
    // $('title').html('<fmt:message code="workflow.th.First" />'+obj.prcsId+'<fmt:message code="workflow.th.step" />:'+obj.flowProcess.prcsName+'</a>')
    window.open('/flowSetting/processDesignToolTwo?flowId='+ obj.flowId +'&rilwId='+obj.runId);
})

$(document).on('click','.editAndDelete1',function () {//结束
    var obj=pageObj.arrs[$(this).attr('data-i')]
    //询问框
    layer.confirm(com, {
        btn: [sure,cancel ] ,//按钮
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
                    $.layerMsg({content:shib, icon: 2});
                }

            }
        })
    }, function() {
        layer.closeAll();
    })
})

$(document).on('click','.editAndDelete2',function () {//催办
    var obj=pageObj.arrs[$(this).attr('data-i')]
    layer.open({
        type:1,
        offset: '80px',
        area: ['800px', '300px'],
        // closeBtn: 0,
        title:[cui, 'background-color:#f3f3f3;color:#333'],
        btn:[sure,cancel],
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
            $("#urgeCon").text(tixing +":"+obj.runId+"，"+flowName +":"+obj.runName+deWork);
        }
    })
})

$(document).on('click','.editAndDelete3',function () {//删除
    var obj=pageObj.arrs[$(this).attr('data-i')];
    //询问框
    layer.confirm(qued, {
        btn: [sure,cancel] ,//按钮
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

$(document).on('click','.editAndDelete4',function () {//恢复执行
    var obj=pageObj.arrs[$(this).attr('data-i')]
    //询问框
    layer.confirm(sureHandle, {
        btn: [sure,cancel ] ,//按钮
    }, function(){
        $.ajax({
            type:'post',
            data:{
                runId:obj.runId,
                id:obj.id
            },
            url:'/workflow/work/resumeExe',
            dataType:'json',
            success:function(res){
                if (res.flag) {
                    $.layerMsg({content: returnC, icon: 1});
                    pageObj.init();
                } else {
                    $.layerMsg({content: returnS, icon: 2});
                }

            }
        })
    }, function() {
        layer.closeAll();
    })
})

//流程分类递归
function queryChild_flow(datas,str_li,level){
    console.log(datas)
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

function jumpOpenName(flowId,step,runId,realPrcsId) {
    window.open('/workflow/work/workformPreView?flowId='+flowId+'&flowStep='+step+'&runId='+runId+'&prcsId='+realPrcsId);
}
function jumpOpenType(flowId,type) {
    window.open('/flowSetting/processDesignToolsT?flowId='+flowId+'&type='+type);
}

$(".queryBtn").click(function () {
    if($("#status").val()==5 || $("#status").val()==6){
        pageObj.data.userId=$('[name="userId"]').attr("user_Id");
    }else{
        pageObj.data.userId=$.cookie("userId");
    }
    pageObj.data.flowId=$('[name="dispatchType"]').val();
    pageObj.data.runId=$('[name="runId"]').val();
    pageObj.data.runName=$('[name="runName"]').val();
    pageObj.data.state=$('[name="status"]').val();
    pageObj.data.workLevel=$('[name="status2"]').val();
    pageObj.data.status=$('[name="status1"]').val();
    pageObj.data.beginDate=$('[name="beginDate"]').val();
    pageObj.data.endDate=$('[name="endDate"]').val();
    pageObj.init();

})

$("#export").click(function () {//导出
    var userId='';
    if($("#status").val()==5 || $("#status").val()==6){
        userId=$('[name="userId"]').attr("user_Id");
    }else{
        userId=$.cookie("userId");
    }
    window.location.href='../../flowRun/queryFlowRun?output=1&userId='+userId+
        '&flowId='+$('[name="dispatchType"]').val()+'&runId='+$('[name="runId"]').val()+'&runName='+$('[name="runName"]').val()+
        '&state='+$('[name="status"]').val()+'&workLevel='+$('[name="status2"]').val()+'&status='+$('[name="status1"]').val()
        +'&beginDate='+$('[name="beginDate"]').val()+'&endDate='+$('[name="endDate"]').val();

})

$("#end").click(function () {
    var runIds = "";
    var prcsIds="";
    var userIds="";
    var flowPrcss="";
    var prcsFlags="";
    $('input:checkbox[name=id]:checked').each(function(i){
        if(0==i){
            runIds = $(this).attr("id");
            prcsIds = $(this).attr("prcsid");
            userIds = $(this).attr("userid");
            flowPrcss = $(this).attr("flowprcs");
            prcsFlags = $(this).attr("prcsflag");
        }else{
            runIds += (","+$(this).attr("id"));
            prcsIds += (","+$(this).attr("prcsid"));
            userIds +=(","+ $(this).attr("userid"));
            flowPrcss += (","+$(this).attr("flowprcs"));
            prcsFlags += (","+$(this).attr("prcsflag"));
        }
    });
    if(runIds==''){
        $.layerMsg({content: xuanzeEnd, icon: 2});
    }
    layer.confirm(com, {title:xinxiM,
        btn: [sure,cancel ] ,//按钮
    }, function(){
        $.ajax({
            type:'post',
            data:{
                runId:runIds,
                flag:2,
                prcsId:prcsIds,
                userId:userIds,
                flowPrcs:flowPrcss,
                prcsFlag:prcsFlags
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