/**********************与移动端交流时间控件调用*****************************************/
var timename = '';
function timeclick(e){
    timename = e.attr('name');
    if(e.attr('dates_format').indexOf('hh:mm:ss') == -1){
        var cs = '0';
    }else{
        var cs = '1';
    }
    console.log(cs)
    if (/(iPhone|iPad|iPod|iOS)/i.test(navigator.userAgent)) {
        setSelectTime(cs);
    } else if (/(Android)/i.test(navigator.userAgent)) {
        Android.setSelectTime(cs);
    }
}
function timeclickjs(time){
    $('input[name='+ timename +']').val(time);
}
var globalData = {};
var turn = function(){
    //alert("正在加载。。");
}
function covertToFormData(formdata){
    var data = {};
    if(formdata instanceof Array){
        formdata.forEach(function(v,i){
            data[v.key] =  v.value;
        });
    }
    return data;
}
function covertToPrcsOutSet(data){
    data = data.replace(/or/g,'||')
    data = data.replace(/and/g,'&&')
    return data;
}
function myTrim(x) {
    return x.replace(/^\s+|\s+$/gm,'');
}
function checkTileValue(item_title,rule,item_value){
    var checkpass = 0;
    var item_title = parseInt(item_title) || item_title;
    var item_value = parseInt(item_value) || item_value;
    switch (rule) {
        case '=':
            if (item_title == item_value) {
                checkpass = 1;
            }
            break;
        case '!=':
            if (item_title != item_value) {
                checkpass = 1;
            }
            break;
        case '>':
            if (item_title > item_value) {
                checkpass = 1;
            }
            break;
        case '<':
            if (item_title < item_value) {
                checkpass = 1;
            }
            break;
        case '<=':
            if (item_title <= item_value) {
                checkpass = 1;
            }
            break;
        case '>=':
            if (item_title >= item_value) {
                checkpass = 1;
            }
            break;
        case 'include':
            if (item_value.indexOf(item_title) > -1) {
                checkpass = 1;
            }
            break;
        case 'exclude':
            if (item_title.indexOf(item_value) == -1) {
                checkpass = 1;
            }
            break;
    }
    return checkpass;
}
function checkPrcOut(formdata,fromDataReject,cb){
    var msg = globalData.conditionDesc.split('\n')[1];
    var res = {
        flag:true,
        msg:""
    };
    if(msg){
        res.msg = msg;
    }else{
        res.msg =  '<fmt:message code="main.th.NonConformity" />'
    }
    var prcsOut = globalData.prcsOut;
    var prcsOutSet = globalData.prcsOutSet;
    if(prcsOutSet != ""){
        var prcsOutArr = prcsOut.split('\n');
        formdata = covertToFormData(formdata);
        prcsOutArr.forEach(function(v,i){
            var check_pass = 0;
            var titleValue = '';
            var arr_rule = v.split("'");
            var item_title = myTrim(arr_rule[1]);
            var item_con = myTrim(arr_rule[2]);
            var item_value = myTrim(arr_rule[3]);
            titleValue = formdata[fromDataReject[item_title]];
            check_pass = checkTileValue(titleValue,item_con,item_value);
            var setitem =  '['+(i+1)+']'
            prcsOutSet = prcsOutSet.replace(setitem,check_pass);
        });
        prcsOutSet = covertToPrcsOutSet(prcsOutSet.toLowerCase());
        var result = eval(prcsOutSet);

        if(result == 0){
            res.flag = false;
        }
    }
    if(cb){
        cb(res);
    }
};
$(function () {
    layer.load();
    $('body').show();
    var history = document.referrer;
    globalData.flowId = $.getQueryString("flowId");
    globalData.flowStep = $.getQueryString("flowStep") || '';
    globalData.prcsId = $.getQueryString("prcsId") || '';
    globalData.runId = $.getQueryString("runId") || '';
    globalData.tableName = $.getQueryString("tableName") || '';
    globalData.tabId =  $.getQueryString("tabId") || '';

    var workformh5 = {
        /************移动端工作流的初始化方法************************/
        init:function (cb) {
            var _this = this;
            workForm.init({
                    formhtmlurl:'../../workflow/work/workfastAdd',//URL
                    resdata:{
                        flowId:globalData.flowId,
                        runId:globalData.runId,
                        prcsId:globalData.prcsId,
                        flowStep:globalData.flowStep,
                    },
                    flowStep:globalData.prcsId,//预览
                    ish5:true,
                    target:'.cont_form'
                }, function (data,option,target) {
                    var obj = data.object;
                    globalData.flowRun = data.object.flowRun;
                    globalData.listFp = data.object.listFp;
                    globalData.flowRunPrcs = data.object.flowRunPrcs;
                    globalData.option = option;
                    globalData.flowTypeModel = data.object.flowTypeModel;
                    globalData.attachPriv = data.object.attachPriv;
                    globalData.allowBack = data.object.allowBack;
                    globalData.flowPrcs = data.object.flowRunPrcs.flowPrcs;
                    globalData.signlock = data.object.signlock;
                    globalData.conditionDesc = obj.conditionDesc;
                    globalData.prcsOut = obj.prcsOut;
                    globalData.prcsType = obj.flowProcesses.prcsType;
                    globalData.prcsOutSet = obj.prcsOutSet;

                    if(globalData.signlock == 1){
                        $('.gapp_textarea').attr("disabled",true);
                    }
                    var runid = data.object.flowRun.runId;
                /************回退按钮显示方法************************/
                    if(globalData.allowBack != 0){
                       $('#backBtn').show();
                    }
                /************删除按钮隐藏方法************************/
                    if(globalData.prcsId !=1){
                        $('#deleteBtn').hide();
                    }
                /************调用移动端回退的方法************************/
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
                /************和后台获取附件信息的方法************************/
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
                /************和后台获取会签信息的方法************************/
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
                                str +=  '<div style="text-align: left;margin: 0px auto;margin-top: 15px;width: 90%;">' +
                                            '<span style="display: block;margin-bottom: 5px;font-size: 13px;">'+obj.obj[i].users.userName+'：</span>' +
                                            '<span style="color: #919191;display: block;margin-bottom: 5px;font-size: 12px;">'+obj.obj[i].editTime+'</span>' +
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
                    $('#deleteBtn').attr('tid',globalData.flowRunPrcs.id);
                    // if (/(iPhone|iPad|iPod|iOS)/i.test(navigator.userAgent)) {
                    //     getRunIdStr(runid);
                    // } else if (/(Android)/i.test(navigator.userAgent)) {
                    //     Android.getRunIdStr(runid);
                    // }
                    _this.buildBody(target);
                    _this.buildEvent();
                    cb();
                });

        },
        /************调用工作流转交按钮的方法************************/
        turnH5Btn:function(){
            var _this = this;
            _this.saveFlowData(function(res){
                if(res.flag){
                    var content = $('.signBox .gapp_textarea').val();
                    if(content == ""){
                        window.location.href='turnh5?flowId='+globalData.flowId+'&flowStep='+globalData.flowStep+'&prcsId='+globalData.prcsId+'&runId='+globalData.flowRun.runId+'&tableName='+globalData.tableName+'&tabId='+globalData.tabId;
                    }else{
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
                    window.location.href='turnh5?flowId='+globalData.flowId+'&flowStep='+globalData.flowStep+'&prcsId='+globalData.prcsId+'&runId='+globalData.flowRun.runId+'&tableName='+globalData.tableName+'&tabId='+globalData.tabId;
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
            $('#turnBtn').click(function () {
                _this.turnH5Btn();
            });
            $('#lctbtn').click(function () {
                // /flowSetting/processDesignToolTwo?flowId=141&rilwId=1381
                if(/(iPhone|iPad|iPod|iOS)/i.test(navigator.userAgent)) {
                    lookFlowChart("/flowSetting/processDesignToolTwo?flowId="+ globalData.flowId +"&rilwId="+ globalData.runId);
                }else if(/(Android)/i.test(navigator.userAgent)){
                    Android.lookFlowChart("/flowSetting/processDesignToolTwo?flowId="+ globalData.flowId +"&rilwId="+ globalData.runId);
                }
            });
            /************工作流 保存 按钮 点击方法************************/
            $('#saveBtn').click(function () {
                _this.saveFlowData(function(res){
                    if(res.flag){
                        alert("保存成功");
                    /************调用移动端返回工作流列表方法************************/
                        if (/(iPhone|iPad|iPod|iOS)/i.test(navigator.userAgent)) {
                            finishWork();
                        } else if (/(Android)/i.test(navigator.userAgent)) {
                            Android.finishWebActivity();
                        }
                    }else{
                        alert("保存失败");
                    }
                });
            });
            /************工作流 删除 按钮 点击方法************************/
            $('#deleteBtn').click(function () {
                var tid=$(this).attr('tid');
                //删除判断
                layer.confirm('确认删除吗？', {
                    btn: ['确定','返回'] //按钮
                }, function(){
                    //确定删除，调接口
                    $.ajax({
                        url: '/workflow/work/deleteRunPrcs',
                        type: 'get',
                        dataType: 'json',
                        data:{
                            id:tid
                        },
                        success: function (obj) {
                            //第三方扩展皮肤
                            layer.msg('删除成功！', { icon:6});
                        /************调用移动端返回工作流列表方法************************/
                            if (/(iPhone|iPad|iPod|iOS)/i.test(navigator.userAgent)) {
                                finishWork();
                            } else if (/(Android)/i.test(navigator.userAgent)) {
                                Android.finishWebActivity();
                            }
                        }
                    })
                }, function(){
                    layer.closeAll();
                });
            });
        },
        /************工作流 保存数据库的方法************************/
        saveFlowData:function (cb){
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
                    var name = obj.attr('name');
                    $('img[name='+name+']').each(function(i,v){
                        var url = $(v).attr('src');
                        if(url!='/img/icon_uploadimg.png'){
                            value+= (url+',');
                        }
                    })
                }else if(datatype == "fileupload"){
                    value= obj.attr('atturl');
                }else if(datatype == "kgsign"){
                    value = (obj.attr('signatureId') || '');
                }else{
                    value = obj.val();
                }

                if(ismust == 'true' && value == ""){
                    flag = true;
                    alert('请填写'+obj.attr('title'));
                    //layer.msg('请填写'+obj.attr('title'), {icon: 1});
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
                var list = Signature.list;
                var signatureCreator = Signature.create();
                var kgsignList=$('#content .kgsign');
                kgsignList.each(function(){
                    // var value = $(this).attr('value');
                    // if(value){//已经存在签章
                    //
                    // }else{
                        //新增签章
                        var key = $(this).attr('signatureid');
                        if(list[key]){
                            signatureCreator.saveSignature(flowfun.runId, key, list[key].getSignatureData());
                        }
                    // }
                });
                checkPrcOut(JSON.parse(fdata.formdata),JSON.parse(fdata.fromDataReject),function(res){
                    if(res.flag){
                        $.ajax({
                            type: "post",
                            url: "../../workflow/work/nextwork",
                            dataType: 'JSON',
                            data: fdata,
                            success: function(res){
                                var data ={};
                                if(cb){
                                    if(res.flag){
                                        data.flag = true;
                                    }else{
                                        data.flag = false;
                                    }
                                    data.data = res.obj;
                                    cb(data);
                                }
                            }
                        });
                    }else{
                        $.layerMsg({content:res.msg,icon:0},function(){

                        });
                    }
                });

            }
        },
        /************工作流数据录入、判断方法************************/
        buildBody : function(data){
            var _this = (this);
            var target = data;
            var dataList = data.find('.form_item');
            var preObj = '';
            var tableObj = [];
            var idnum = 0;
            var checkidnum=0;
            dataList.each(function(i,v) {
                var __this = $(this);
                var dataType = __this.attr('data-type');
                var title = __this.attr('title');
                var name = __this.attr('name');
                var isMust = __this.attr('isMust');
                var isMustText = '';
                if(isMust){
                    isMustText = '<span style="color:red;font-size: 10px;margin-left: 2px">*</span>';
                }

                var eleTrObj = $('<tr><td class="td1"><div>' + title + isMustText + '</div></td><td class="td2"></td></tr>');
                var e = {};
                switch (dataType) {
                    case 'text':
                        __this.addClass("gapp_input gapp_form");
                        __this.attr("style",'');
                        eleTrObj.find('.td2').append(__this);
                        break;
                    case 'textarea':
                        __this.addClass("gapp_textarea");
                        __this.attr("style",'');
                        eleTrObj.find('.td2').append(__this);
                        eleTrObj.find('.td1').find('div').addClass('textareaclass');
                        break;
                    case 'select':
                        __this.addClass("gapp_select gapp_form");
                        __this.attr("style",'');
                        if(__this.attr('disabled')=='disabled'){
                            __this.css('background','url("/img/workflow/work/workformh5/select.png") no-repeat 95% 12px')
                        }
                        eleTrObj.find('.td2').append(__this);
                        break;
                    case 'radio':
                        var bool=true;
                        for(var i=0;i<tableObj.length;i++){
                            if($(tableObj[i]).find('[name="'+__this.attr('name')+'"]').length!=0){
                                bool=false;
                            }
                        }
                        if(bool) {
                            var radioObj = $('<span style="position: relative;width: 22px;height: 22px;display: inherit"></span>');
                            var id = __this.attr('name');
                            __this.attr('id', id + '_' + idnum);
                            $(__this).css({
                                'position': 'absolute',
                                'top': '0',
                                'left': '2px'
                            })
                            radioObj.append(__this)
                            var lable = '<label style="left: 0;top: 0;" class="bgweijinyong" for="' + id + '_' + idnum + '"></label>';
                            if(__this.attr('disabled')=='disabled') {
                               lable = '<label style="left: 0;top: 0;" class="bgyijingyong" for="' + id + '_' + idnum + '"></label>';
                            }
                            radioObj.append(lable);
                            eleTrObj.find('.td2').append(radioObj);
                            eleTrObj.find('.td2')
                                .append('<span  style="line-height: 22px;display: inherit;padding-left: 5px;' +
                                    'padding-right: 15px;">' + __this.val() + '</span>')
                            idnum++;
                        }else {
                            eleTrObj=$('');
                            for(var i=0;i<tableObj.length;i++){
                                if($(tableObj[i]).find('[name="'+__this.attr('name')+'"]').length!=0){
                                    var tableObjParent=$(tableObj[i]).find('[name="'+__this.attr('name')+'"]').parent().parent();
                                    var radioObj = $('<span style="position: relative;width: 22px;height: 22px;display: inherit"></span>');
                                    var id = __this.attr('name');
                                    __this.attr('id', id + '_' + idnum);
                                    $(__this).css({
                                        'position': 'absolute',
                                        'top': '0',
                                        'left': '2px'
                                    })
                                    radioObj.append(__this)
                                    var lable = '<label style="left: 0;top: 0;" class="bgweijinyong" for="' + id + '_' + idnum + '"></label>';
                                    if(__this.attr('disabled')=='disabled') {
                                        lable = '<label style="left: 0;top: 0;" class="bgyijingyong" for="' + id + '_' + idnum + '"></label>';
                                    }
                                    radioObj.append(lable);

                                    tableObjParent.append(radioObj);
                                    tableObjParent
                                        .append('<span  style="line-height: 22px;display: inherit;padding-left: 5px;' +
                                            'padding-right: 15px;">' + __this.val() + '</span>')
                                }
                            }
                            idnum++;
                        }

                        break;
                    case 'checkbox':
                        var id = __this.attr('name');
                        __this.attr('id',id+'_'+checkidnum);
                        eleTrObj.find('.td2').append(__this);
                        var lable = '<label class="bgweijinyong" style="border-radius: 0px" for="'+ id+'_'+checkidnum +'"></label>';
                        if(__this.attr('disabled')=='disabled'){
                            lable = '<label class="bgyijingyong" style="border-radius: 0px" for="'+ id+'_'+checkidnum +'"></label>';
                        }
                        eleTrObj.find('.td2').append(lable);
                        checkidnum++;
                        break;
                    case 'qrcode':
                        __this.css("float","none");
                        eleTrObj.find('.td2').append(__this);
                        break;
                    case 'kgsign':
                        console.log(__this);
                        $(__this.find("img").get(0)).attr("style","cursor: pointer; margin: 0 auto;width:100%;height:100%;")
                        eleTrObj.find('.td2').append(__this);
                        break;
                    case 'macros':
                        __this.addClass("gapp_input gapp_form");
                        __this.attr("style",'');
                        eleTrObj.find('.td2').append(__this);
                        break;
                    case 'calendar':
                        __this.addClass("gapp_input gapp_date").removeClass('laydate-icon');
                        __this.attr("style",'padding-right: 0px;');
                        __this.attr("dates_format",__this.attr("date_format"));
                        __this.attr("onclick","timeclick($(this))");
                        __this.removeAttr("date_format");
                        eleTrObj.find('.td2').append(__this);
                        break;
                    case 'imgupload':
                        data.find('img[name="'+name+'"]').each(function (i,v) {
                            if($(v).attr("src")!='/img/icon_uploadimg.png'){
                                $(v).attr('url',$(v).attr('src'));
                                $(v).attr('names',$(v).attr('url').split('&ATTACHMENT_NAME=')[1].split('&')[0]);
                                $(v).attr('onclick','anios1($(this))');
                                if($(v).attr('disabled')!='disabled'){
                                    eleTrObj.find('.td2').append(v);
                                }

                            }else{
                                if($(v).attr('disabled')!='disabled'){
                                    $(v).attr("onclick","phoneimgupload(this)");
                                    eleTrObj.find('.td2').append(v);
                                }else {
                                    eleTrObj.find('.td2').append('无');
                                }
                            }
                        });
                        break;
                    case 'fileupload':
                        if($(v).attr("src")!='/img/fileupload.png'){
                            $(v).attr('url',$(v).attr('atturl'));
                            $(v).attr('names',$(v).attr('atturl').split('&ATTACHMENT_NAME=')[1].split('&')[0]);
                            $(v).attr('onclick','anios1($(this))');
                            if($(v).attr('disabled')!='disabled') {
                                eleTrObj.find('.td2').html(v);
                            }
                        }else{
                            if($(v).attr('disabled')!='disabled') {
                                eleTrObj.find('.td2').append(v);
                            }else {
                                eleTrObj.find('.td2').append('无');
                            }
                        }
                        break;
                    case 'list':
                        __this.addClass("gapp_textarea");
                        __this.attr("style",'');
                        eleTrObj.find('.td2').append(__this);
                        eleTrObj.find('.td1').find('div').addClass('textareaclass');
                        break;
                    case 'sign':
                        __this.addClass("gapp_textarea");
                        __this.attr("style",'');
                        eleTrObj.find('.td2').append(__this);
                        eleTrObj.find('.td1').find('div').addClass('textareaclass');
                        break;
                    case 'readcomments':
                        __this.addClass("gapp_textarea");
                        __this.attr("style",'');
                        eleTrObj.find('.td2').append(__this);
                        eleTrObj.find('.td1').find('div').addClass('textareaclass');
                        break;
                    case 'listing':
                        __this.addClass("gapp_textarea");
                        __this.attr("style",'');
                        eleTrObj.find('.td2').append('<textarea  class="form_item gapp_textarea grey" gwidth="200" gheight="50" style="background-color: rgb(228, 228, 228); color: rgb(0, 0, 0);" disabled="disabled"></textarea>');
                        eleTrObj.find('.td1').find('div').addClass('textareaclass');
                        break;
                    case 'userselect':
                        __this.addClass("gapp_textarea");
                        __this.attr("style",'');
                        var uservalue =  __this.attr('username') || '';
                        eleTrObj.find('.td2').append('<input class="form_item gapp_input gapp_form grey" disabled="disabled" value="'+ uservalue +'">');
                        eleTrObj.find('.td1').find('div').addClass('textareaclass');
                        break;
                    case 'deptselect':
                        __this.addClass("gapp_textarea");
                        __this.attr("style",'');

                        var deptnamevalue =  __this.attr('deptname') || '';
                        eleTrObj.find('.td2').append('<input class="form_item gapp_input gapp_form grey" disabled="disabled" value="'+ deptnamevalue +'">');
                        eleTrObj.find('.td1').find('div').addClass('textareaclass');
                    default:

                }
                if(__this.attr('hidden') == 'hidden'){
                    $(this).parent().append('*********');
                }
                var dis = __this.attr('disabled');
                if(dis == 'disabled'){
                    __this.css({
                        'background-color':'#e4e4e4',
                        'color':'#000'
                    })
                    __this.addClass('grey').parents('tr').find('.td1').addClass('grey1');
                    // __this.attr('disabled',false)
                    //
                    // if(__this.val() == ''){
                    //     __this.parent().siblings().find('div').css('color','#999')
                    // }
                    var _this = $(this);
                    if(__this.attr('data-type') == "calendar"){
                        if(_this.attr('class').indexOf('grey') != -1){
                            _this.removeAttr('onclick');
                        }
                    }
                }else {
                    __this.css('color','#111')
                }
                tableObj.push(eleTrObj);

            });
            $('#content').append(tableObj);
            $('#content').find('.qrcode').each(function () {
                var _this = $(this);
                var msg = {"mark":"SID_MEETING","url":_this.attr('textstr')};
                var id = _this.attr('id')
                var qrcode = new QRCode(id, {
                    text: JSON.stringify(msg),
                    width: _this.attr('orgwidth'),
                    height: _this.attr('orgheight'),
                    colorDark : '#000000',
                    colorLight : '#ffffff',
                    correctLevel : QRCode.CorrectLevel.H
                });
            });
            var signatureCreator = Signature.create();
            signatureCreator.getSaveSignatures( globalData.flowRun.runId, function(signs){
                var signdata = new Array();
                var jsonList = eval("("+signs+")");
                for(var i=0;i<jsonList.length;i++){
                    var map = {};
                    map.signatureid = jsonList[i]["signatureId"];
                    map.signatureData = jsonList[i]["signature"];
                    signdata.push(map);
                }
                console.log(signdata);
                Signature.loadSignatures(signdata);
            });
            globalData.fromDataReject = _this.buildFormData();

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
    /************调用工作流初始化方法************************/
    workformh5.init(function(){
        turn = function(){
            workformh5.turnH5Btn();
        }
    });
});