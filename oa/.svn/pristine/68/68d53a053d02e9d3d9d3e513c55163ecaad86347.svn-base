var globalData = {};
var turn = function(){
    alert("正在加载。。");
}

$(function () {
    layer.load();
    $('body').show();
    globalData.flowId = $.getQueryString("flowId");
    globalData.flowStep = $.getQueryString("flowStep") || '';
    globalData.prcsId = $.getQueryString("prcsId") || '';
    globalData.runId = $.getQueryString("runId") || '';
    globalData.tableName = $.getQueryString("tableName") || '';
    globalData.tabId =  $.getQueryString("tabId") || '';
    //alert(globalData.runId);
    var workformh5 = {
        init:function (cb) {
            var _this = this;
            workForm.init({
                    formhtmlurl:'../../workflow/work/workfastAdd',//URL
                    resdata:{
                        flowId:globalData.flowId,
                        runId:globalData.runId,
                        prcsId:globalData.prcsId,
                        flowStep:globalData.flowStep
                    },
                    flowStep:globalData.prcsId,//预览
                    target:'.cont_form',
                    preView:true,
                    ish5:true
                },
                function (data,option,target) {

                    globalData.flowRun = data.object.flowRun;
                    globalData.listFp = data.object.listFp;
                    globalData.flowRunPrcs = data.object.flowRunPrcs;
                    globalData.option = option;
                    globalData.flowTypeModel = data.object.flowTypeModel;
                    globalData.attachPriv = data.object.attachPriv;
                    globalData.allowBack = data.object.allowBack;
                    globalData.flowPrcs = data.object.flowRunPrcs.flowPrcs;
                    globalData.signlock = data.object.signlock;

                    if(globalData.signlock == 1){
                        $('.gapp_textarea').attr("disabled",true);
                    }
                    var runid = data.object.flowRun.runId;
                    if(globalData.allowBack != 0){
                        $('#backBtn').show();
                    }
                    $('#backBtn').click(function () {
                        if (/(iPhone|iPad|iPod|iOS)/i.test(navigator.userAgent)) {
                            //alert(navigator.userAgent);
                            rightTitle('转交','审批及转交','feedback');
                        } else if (/(Android)/i.test(navigator.userAgent)) {
                            //alert(navigator.userAgent);
                            Android.rightTitle('转交','xxxxx','feedback');
                        }
                        window.location.href='feedback?flowId='+globalData.flowId+'&flowStep='+globalData.flowStep+'&prcsId='+globalData.prcsId+'&runId='+globalData.flowRun.runId+'&allowback='+globalData.allowBack;
                    });
                    $.ajax({
                        type: "get",
                        url: "findworkUpload",
                        dataType: 'JSON',
                        data: {
                            runId:runid
                        },
                        success: function (obj) {
                            var data = obj.obj;
                            var img = '';
                            var names = '';
                            for(var i=0;i<obj.obj.length;i++){
                                var pic_name = obj.obj[i].attachName;
                                var index = pic_name .lastIndexOf("\.");
                                var pic_name = pic_name.substring(index + 1, pic_name .length);
                                var http = 'http://'+ window.location.host;
                                if(pic_name == "png"||pic_name == "jpeg"||pic_name == "bmp"||pic_name == "jpg"){
                                    img += '<img id="blah" src="/xs?'+ obj.obj[i].attUrl +'" onclick="anios($(this))" style="width:50px;height:50px;margin-right: 10px;margin-bottom: 10px;" url="'+ http + '/xs?'+ obj.obj[i].attUrl +'" name="'+ obj.obj[i].attachName +'">';
                                }else{
                                    names += '<p url="'+ http + '/download?'+ obj.obj[i].attUrl +'" name="'+ obj.obj[i].attachName +'" onclick="anios($(this))">'+ obj.obj[i].attachName +'</p>'
                                }

                            }
                            $('.photo_box').append(img);
                            $('.uploadbox').append(names);
                        }
                    });

                    $.ajax({
                        type: "get",
                        url: "findworkfeedback",
                        dataType: 'JSON',
                        data: {
                            prcsId:globalData.prcsId,
                            signlock: globalData.signlock,
                            flowPrcs:globalData.flowPrcs,
                            runId:runid
                        },
                        success: function (obj) {
                            var str = '';
                            for(var i=0;i<obj.obj.length;i++){
                                str +=  '<div style="text-align: left;margin: 0 12px;margin-top: 10px;">' +
                                    '<span style="display: block;margin-bottom: 5px;font-size: 13px;">'+obj.obj[i].users.userName+'：</span>' +
                                    '<span style="color: #919191;display: block;margin-bottom: 5px;">'+obj.obj[i].editTime+'</span>' +
                                    '<span style="display: block;font-size: 12px;">'+obj.obj[i].content+'</span>' +
                                    '</div>'
                            }
                            $('.hqbox').html(str);
                        }
                    });

                    $('#flowName').text(data.object.flowRun.runName);
                    $('#flowBeginUser').text(data.object.flowRun.userName);
                    $('#flowBeginTime').text(data.object.flowRun.beginTime);
                    $('#flowRunId').text('No.'+data.object.flowRun.runId);

                    _this.buildBody(target);
                    _this.buildEvent();
                    cb();
                });

        },
        turnH5Btn:function(){
            var _this = this;
            _this.saveFlowData(function(res){
                if(res.flag){
                    var content = $('.signBox .gapp_textarea').val();
                    if(content != ''){
                        $.ajax({
                            type: "get",
                            url: "../../workflow/work/workfeedback",
                            dataType: 'JSON',
                            data: {
                                prcsId:globalData.prcsId,
                                runId:globalData.flowRun.runId,
                                flowPrcs:globalData.flowPrcs,
                                content:content,
                                file:''
                            },
                            success: function(res){
                            }
                        })
                    }
                    window.location.href='turnh5?flowId='+globalData.flowId+'&flowStep='+globalData.flowStep+'&prcsId='+globalData.prcsId+'&runId='+globalData.flowRun.runId;
                    if (/(iPhone|iPad|iPod|iOS)/i.test(navigator.userAgent)) {
                        //alert(navigator.userAgent);
                        rightTitle('转交','123','turn');
                    } else if (/(Android)/i.test(navigator.userAgent)) {
                        //alert(navigator.userAgent);
                        Android.rightTitle('转交','123','turn');
                    }

                }

            });
        },
        buildEvent:function () {
            var _this = this;
            $('#lctbtn').click(function () {
                // /flowSetting/processDesignToolTwo?flowId=141&rilwId=1381
                if(/(iPhone|iPad|iPod|iOS)/i.test(navigator.userAgent)) {
                    lookFlowChart("/flowSetting/processDesignToolTwo?flowId="+ globalData.flowId +"&rilwId="+ globalData.runId);
                }else if(/(Android)/i.test(navigator.userAgent)){
                    Android.lookFlowChart("/flowSetting/processDesignToolTwo?flowId="+ globalData.flowId +"&rilwId="+ globalData.runId);
                }
            });
            $('#turnBtn').click(function () {
                _this.turnH5Btn();
            });

            $('#saveBtn').click(function () {

                _this.saveFlowData(function(res){
                    if(res.flag){
                        alert("保存成功")
                    }else{
                        alert("保存失败")
                    }

                });
            });
            $('#deleteBtn').click(function () {
                alert('删除成功！');
            });
        },
        saveFlowData:function (cb) {
            var flowfun = globalData.flowRun;
            var form_item=$('#content .form_item');
            var realData=[];
            var radioArr = {};
            var modifydata =[];
            var flag = false;
            for(var i=0;i<form_item.length;i++){
                var baseData={};
                var value="";
                var obj = form_item.eq(i);
                var datatype = obj.attr("data-type");
                var key=obj.attr("name");
                var ismust = obj.attr('ismust');
                if(datatype=="select"){
                    value= obj.val()==0?'':form_item.eq(i).val();
                }else if(datatype=="textarea" || datatype=="text"  ){
                    value=obj.val();
                }else if(datatype=="checkbox"){
                    value=obj.attr('title');
                }else if(datatype=="macros"){
                    if(obj.attr('type') == "text"){
                        value= obj.val();
                    }else{
                        value = obj.val() == 0?'':form_item.eq(i).val();
                    }
                }else if(datatype == "radio"){
                    var name = obj.attr('name');
                    if(!radioArr[obj.attr('name')]){
                        radioArr[obj.attr('name')] = true;
                        if($("input[name='"+name+"']:checked").length>0){
                            value= $("input[name='"+name+"']:checked").val();
                        }else{
                            value = "";
                        }
                    }else{
                        continue;
                    }
                }else if(datatype == "imgupload"){

                    $('img[name='+name+']').each(function(i,v){
                        var url = $(v).attr('src');
                        if(url!='/img/icon_uploadimg.png'){
                            value+= (url+',');
                        }
                    })

                }else{
                    value = obj.val();
                }

                if(ismust == 'true' && value == ""){
                    flag = true;
                    layer.msg('请填写'+obj.attr('title'), {icon: 1});
                    break;
                }
                if( value!=null){
                    baseData["key"]=key;
                    baseData["value"]=value;
                    realData.push(baseData);
                }
                if(value != ''){
                    modifydata.push(baseData);
                }
            }
            if(!flag){
                var fdata={
                    flowId:globalData.flowId,
                    formdata:JSON.stringify(realData),
                    runId:globalData.flowRun.runId,
                    runName:globalData.flowRun.runName,
                    beginTime:globalData.flowRun.beginTime,
                    beginUser:globalData.flowRun.beginUser,
                    formLength:globalData.option.formLength,
                    prcsId : globalData.prcsId,
                    flowPrcs : globalData.flowPrcs,
                    modifydata:JSON.stringify(modifydata),
                    fromDataReject:JSON.stringify(globalData.fromDataReject),
                    tableName:globalData.tableName,
                    tabId:globalData.tabId
                };
                $.ajax({
                    type: "post",
                    url: "../../workflow/work/nextwork",
                    dataType: 'JSON',
                    data: fdata,
                    success: function(res){
                        // alert(res.msg);
                        var data ={};
                        if(cb){
                            if(res.flag){
                                data.flag = true;
                            }else{
                                data.flag = false;
                            }
                            data.data = res.obj;
                            cb(data)
                        }
                    }
                });
            }
        },
        buildBody : function(data){
            var _this = (this);
            var target = data;
            var dataList = data.find('.form_item');
            var preObj = '';
            var tableObj = [];
            dataList.each(function(i,v) {
                var __this = $(this);
                var dataType = __this.attr('data-type');
                var title = __this.attr('title');
                var name = __this.attr('name');
                var isMust = __this.attr('isMust');
                var isMustText = '';
                if(isMust){
                    isMustText = '<span style="color:red;">&nbsp;*</span>';
                }

                var eleTrObj = $('<tr><td class="td1"><div>' + title + isMustText + '</div></td><td class="td2"></td></tr>');
                var e = {};
                var val = "";
                switch (dataType) {
                    case 'text':
                        // __this.addClass("gapp_input gapp_form");
                        // __this.attr("style",'');
                        val = __this.val();
                        __this.remove();
                        break;
                    case 'textarea':
                        // __this.addClass("gapp_textarea");
                        // __this.attr("style",'');
                        val = __this.val();
                        __this.remove();
                        break;
                    case 'select':
                        __this.addClass("gapp_select gapp_form");
                        __this.attr("style",'');
                        val = __this.val();
                        __this.remove();
                        break;
                    case 'radio':

                        break;
                    case 'checkbox':

                        break;
                    case 'macros':
                        // __this.addClass("gapp_input gapp_form");
                        // __this.attr("style",'');
                        val = __this.val();
                        __this.remove();
                        break;
                    case 'calendar':
                        // __this.addClass("gapp_input gapp_date");
                        // __this.attr("style",'padding-right: 0px;');
                        val = __this.val();
                        __this.remove();
                        break;
                    case 'imgupload':
                        data.find('img[name="'+name+'"]').each(function (i,v) {
                            if($(v).attr("src")!='/img/icon_uploadimg.png'){
                                eleTrObj.find('.td2').append(v);
                            }else{
                                __this.attr("onclick",'phoneimgupload(this);')
                            }
                        });
                        break;
                    case 'kgsign':
                        console.log(__this);
                        $(__this.find("img").get(0)).attr("style","cursor: pointer; margin: 0 auto;width:100%;height:100%;")
                        eleTrObj.find('.td2').append(__this);
                        // __this.css("height",__this.attr('gheight'))
                        // __this.find('button').hide();
                        // // $(__this.find("img").get(0)).attr("style","cursor: pointer; margin: 0 auto;width:100%;height:100%;")
                        // eleTrObj.find('.td2').append(__this);
                        break;
                    default:

                }
                eleTrObj.find('.td2').append(val);
                tableObj.push(eleTrObj);
                $('#content').append(tableObj);
                globalData.fromDataReject = _this.buildFormData();
            });
        },
        buildFormData : function(){
            var arr = {};
            $("#content").find('.form_item').each(function(i,v){
                var _this = $(this);
                arr[_this.attr('title')] = _this.attr('name');
            });
            return arr;
        },
        tool:{
            ajaxHtml:function (url,data,cb) {
                var that = this;
                $.ajax({
                    type: "get",
                    url: url,
                    async:false,
                    dataType: 'JSON',
                    data:  data,
                    success: function (res) {
                        if(cb){
                            cb(res);
                        }
                    },
                    error:function(e){
                    }
                });
            }
        }
    }
    workformh5.init(function(){
        turn = function(){
            workformh5.turnH5Btn();
        }
    });
});