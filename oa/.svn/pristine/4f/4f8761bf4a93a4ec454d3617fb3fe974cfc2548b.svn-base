/**
 * Created by ASUS on 2017/5/24.
 */
Array.prototype.removeDuplicate= function(){//去重
    var res = [];
    var json = {};
    for(var i = 0; i < this.length; i++){
        if(!json[this[i]]){
            res.push(this[i]);
            json[this[i]] = 1;
        }
    }
    return res;
};
Array.prototype.indexOf = function(val) {//查找
    for (var i = 0; i < this.length; i++) {
        if (this[i] == val) return i;
    }
    return -1;
};
Array.prototype.remove = function(val) {//删除
    var index = this.indexOf(val);
    if (index > -1) {
        this.splice(index, 1);
    }
};





var user_id='';
var dept_id='';
var priv_id='';
var form,layer
var flowDesign;
var formTwo;
var boolean=false;
var dataToAll;//全部数据
var theTrigger=[];//触发器
var jsondata = {
    "title": "",
    "nodes": {},
    "lines": {},
    "areas": {},
    "initNum": 0
}
var alertData;//条件设置字段
var flowidurl=window.location.href;
var flowstr=flowidurl.substring(flowidurl.indexOf('=')+1)
var numId={};
var conditionsDate;//条件数据
var canwritefieldtwo;//可写字段
var forimId;
var numIds={};
var newLineload;//新建线开始数据
var newLineloadTwo;//新建线开始数据
var newLineend=[];//新建线结束数据
var prcsIdTwo;
var designdata=[];
var newlinebool=false;
var theTriggers;//逻辑接口数据
var theTriggerchufatwo;//逻辑接口数据
var trueFile;//是否允许上传附件
var newnodebool=false;
var oidPrcsId=null;//判断prcsid是否重复
var prevAndNextTitle=[
    '选择工具按钮，用于选中节点按钮。',
    '节点连线按钮，可以进行各个节点之间的连接。',
    '流程开始节点按钮，选中后可以新建圆形的开始节点。',
    '流程步骤节点按钮，选中后可以新建进行中的节点。',
    '流程结束节点按钮，选中后可以新建结束类型的节点。',
    '每个节点信息修改后，请点击保存按钮进行保存。'
]





function selectOption(data) {//bottomstepstwoss部分select全部回显
    if(data==''){
        return
    }
    $('#bottomstepstwoss select option').each(function (i,n) {
        if($(this).val()==data){
            $(this).attr('selected')
        }
    })
}

$.get('/flow/selectAllFlow',{'flowId':flowstr},function (json) {//流程属性查询，是否允许上传附件
    if(json.flag){
        trueFile=json.object.flowDoc
    }

},'json')

function theTriggersTwo(fn) {//触发器业务逻辑接口查询
    $.get('/flowhook/getHookAll',function (json) {
        theTriggers=json.obj;
        if(fn!=undefined){
            fn();
        }
    },'json')
}
function theTriggerchufa(fn) {//触发器查询
    $.get('/tigger/showPlugin',function (json) {
        theTriggerchufatwo=json.obj;
        if(fn!=undefined){
            fn();
        }
    },'json')
}


function saveOrUpdate(fn) {//新建节点
    $.post('/flowProcess/insert',numId,function (json) {
        if (json.flag) {
            prcsIdTwo=json.object.id

            var objDates={};
            objDates.prcsName=numId.prcsName;
            objDates.prcsId=numId.prcsId;
            objDates.data={
                prcsId:numId.prcsId
            };

            $('#node_'+objDates.prcsId).attr('data-num',prcsIdTwo)

            designdata.push(objDates)
            if(fn!=undefined){
                fn()
            }

        }else{
            alert("新建流程节点失败");
        }
    },'json')
}

function savemobile() {//移动节点
    numIds.id=$("#ele_designerId").val();

    $.post('/flowProcess/updateTopAndLeft',numIds,function (json) {
        if (json.flag) {
            // console.log('成功')
        }else{
            alert("新建流程节点失败");
        }
    },'json')
}
function theNewLine(numdesignerId,numdesignerObj) {//新建连线
    var lineStrData;
    if(newLineend.length==1){
        lineStrData=newLineend.join(',')+',';
    }else {
        lineStrData = newLineend.join(',')+',';
    }
    $.post('/flowProcess/updateTopAndLeft',{'id':numdesignerId,'prcsTo':lineStrData},function (json) {
        if (json.flag) {

            numdesignerObj.data.prcsTo=(numdesignerObj.data.prcsTo+=lineStrData).split(',').removeDuplicate().join(',');

            $('[name="prcsTo"]').val(numdesignerObj.data.prcsTo);

            var prcsTosloo = $('[name="prcsTo"]').val().split(',');

            var prcsToStrtwo = '';
            for (var mx = 0; mx < prcsTosloo.length; mx++) {
                for (var ix = 0; ix < designdata.length; ix++) {
                    if (prcsTosloo[mx] == designdata[ix].prcsId) {
                        prcsToStrtwo += '<li>' + designdata[ix].prcsName + ',</li>'
                    }
                }
            }
            $('#candidatesPoneli').html(prcsToStrtwo)

        }else{
            alert("新建流程节点失败");
        }
    },'json')
}

function inputTheEcho(names,dataNames,fn) {  //input回显
    $('[name="'+names+'"]').val(dataNames)
}
function seleTheEcho(names,dataNames) {  //下拉框回显
    if(dataNames==undefined)return
    $('[name="'+names+'"]').next().find('dd').each(function (i,n) {
        if($(this).attr('lay-value')==dataNames){
            $(this).parent().prev().find('input').val($(this).text())
            $(this).parent().parent().prev().val(dataNames)
        }
    })
}

function radioTheEcho(names,dataNames) {
    $('[name="'+names+'"]').each(function (i,n) {

        if($(this).val()==dataNames){
            $(this).prop('checked',true);
            $(this).next().click();
        }
    })
}
function ulTheEcho(names,dataNames) {

    if(dataNames==undefined||dataNames=='')return
    var ularr=dataNames.split(',');
    if(ularr[ularr.length-1]==''){
        var ularrnums=ularr.length-1
        ularr.splice(ularrnums,1)
    }
    var ulStr='';
        for (var is = 0; is < ularr.length; is++) {
            if(ularr[is]=='[A@]'){
                ulStr += '<li>(' + (is + 1) + ')流程公共附件</li>'
            }else if(ularr[is]=='[B@]'){
                ulStr += '<li>(' + (is + 1) + ')工作名称/文号</li>'
            }else {
                ulStr += '<li>(' + (is + 1) + ')'+ularr[is]+'</li>'
            }
        }
        $('#' + names).html(ulStr)
}

function checkboxTheEcho(names,dataNames) {
    if(dataNames==undefined||dataNames=='')return;
    var arrcheck=dataNames.split(',');
    $('[name="'+names+'"]').each(function (i,n) {
        for (var g=0;g<arrcheck.length;g++){
            if($(this).val()==arrcheck[g]){
                $(this).prop('checked',true);
                $(this).next().addClass('layui-form-checked');
            }
        }
    })
}

function clearinput() {
    $('#propertyForm input').each(function (i,n) {
        $(this).val('')
    })
    $('input[type=radio]').each(function (i,n) {
        $(this).prop('checked',false);
    })
    $('input[type=checkbox]').each(function (i,n) {
        $(this).prop('checked',false);
    })
    $('textarea').each(function (i,n) {
        $(this).val()
    })
    $('#candidatesPoneli').html('')
    formTwo.render();
}
function ajaxSvg() {
    $.ajax({
        type: 'get',
        url: '/flowProcess/flowview',
        dataType: 'json',
        data: {"flowId":flowstr},
        success: function (json) {
            // debugger;
//                    获取数据并添加到流程设计器的插件中
            if (json.flag) {
                jsondata={
                    "title": "",
                    "nodes": {},
                    "lines": {},
                    "areas": {},
                    "initNum": 0
                }
                if(json.object==undefined){
                    designdata=[];
                    var connections=[];
                }else {
                    designdata = json.object.designdata;
                    var connections = json.object.connections;
                    jsondata.title = json.object.designdata[0].flowTypeModel.flowName;
                    jsondata.initNum = designdata.length;
                }


                 

                designdata.forEach(function (v, i) {

                    jsondata.nodes['node_' + v.prcsId] = {
                        designerId:v.id,
                        name: v.prcsName,
                        left: v.setLeft,
                        type: v.setType,
                        top: v.setTop,
                        data:{

                            prcsId:v.prcsId,
                            prcsType:v.prcsType,
                            prcsName:v.prcsName,
                            //下一步骤
                            prcsUser:v.prcsUser,
                            prcsDept:v.prcsDept,
                            prcsPriv:v.prcsPriv,
                            signType:v.signType,
                            countersign:v.countersign,
                            userFilter:v.userFilter,
                            autoType:v.autoType,
                            topDefault:v.topDefault,//流转设置
                            userLock:v.userLock,
                            feedback:v.feedback,
                            signlook:v.signlook,
                            turnPriv:v.turnPriv,
                            allowBack:v.allowBack,
                            syncDeal:v.syncDeal,
                            gatherNode:v.gatherNode,
                            viewPriv:v.viewPriv,
                            prcsTo:v.prcsTo,
                            canWriteField:{
                                controlMode:v.controlMode,
                                fileuploadPriv:v.fileuploadPriv,
                                imguploadPriv:v.imguploadPriv,
                                attachPriv:v.attachPriv,
                                attachEditPriv:v.attachEditPriv,
                                attachEditPrivOnline:v.attachEditPrivOnline,
                                attachMacroMark:v.attachMacroMark,
                                prcsItem:v.prcsItem,
                                documentEditPriv:v.documentEditPriv,
                                documentEditPrivDetail:v.documentEditPrivDetail,
                                fileuploadPriv:v.fileuploadPriv,
                                imguploadPriv:v.imguploadPriv
                            },//可写字段
                            hiddenItem:v.hiddenItem,
                            requiredItem:v.requiredItem,
                            conditionsSet:{
                                conditionDesc:v.conditionDesc,//不符合条件公式时，给用户的文字描述
                                typeJudgments:v.typeJudgments,
                                prcsInSet:v.prcsInSet,
                                conditionDesc:v.conditionDesc,
                                prcsOutSet:v.prcsOutSet,
                                prcsIn:v.prcsIn,
                                prcsOut:v.prcsOut
                            },
                            flowTiggerModel:v.flowTiggerModel,
                            timeOut:v.timeOut,
                            timeOutModify:v.timeOutModify,
                            timeOutType:v.timeOutType,
                            workingdaysType:v.workingdaysType,
                            timeOutAttend:v.timeOutAttend,
                            userFilter:v.userFilter,
                            userFilterPrcsDept:v.userFilterPrcsDept,
                            userFilterPrcsDeptOther:v.userFilterPrcsDeptOther,
                            userFilterPrcsPriv:v.userFilterPrcsPriv,
                            userFilterPrcsPrivOther:v.userFilterPrcsPrivOther,
                            autoType:v.autoType,
                            autoBaseUser:v.autoBaseUser,
                            autoDept:v.autoDept,
                            autoUserOp:v.autoUserOp,
                            autoUser:v.autoUser,
                            prcsPrivName:v. prcsPrivName,
                            prcsUserName:v.prcsUserName,
                            prcsDeptName:v.prcsDeptName,
                            formIds:v.flowTypeModel.formId
                            //触发器
                            //提醒设置
                            //呈批单设置
                        }
                    }
                });
                connections.forEach(function (v, i) {
                    jsondata.lines['line_' + i] = {
                        type: "sl",
                        from: "node_" + v.from,
                        to: "node_" + v.to,
                        name: designdata[v.from],
                        "M": 41.5,
                        alt: true
                    }
                });
            }
            flowDesign.onItemDel = function (id, type) {
                if (confirm("确定要删除本步骤吗?")) {
                    // this.blurItem();
                            return true;
                } else {
                    return false;
                }
            };



            flowDesign.loadData(jsondata);
            flowDesign.onItemRename=function (id,name,type) {
                layer.alert('请通过侧边栏修改节点名字')
                return false;
            }
            flowDesign.onItemFocus = function (id, model) {
                    var obj;
                    $("#ele_model").val(model);
                    $("#ele_id").val(id);

                    if (model == "line") {
                        obj = this.$lineData[id];
                        $("#ele_type").val(obj.M);
                        $("#ele_left").val("");
                        $("#ele_top").val("");
                        $("#ele_width").val("");
                        $("#ele_height").val("");
                        $("#ele_designerId").val("");
                        $("#ele_from").val(obj.from);
                        $("#ele_to").val(obj.to);
                        $("#ele_flow").val("");


                    } else if (model == "node") {

                        if (parseInt($('#propertyForm').css('right')) < 0) {
                            $('#propertyForm').css('right', '0px')
                            $('.btnstorage').css('right', '0px')
                        } else {
                            $('#propertyForm').css('right', -$('#propertyForm').width())
                            $('.btnstorage').css('right', -$('.btnstorage').width())
                            setTimeout(function () {
                                $('#propertyForm').css('right', '0px')
                                $('.btnstorage').css('right', '0px')
                            }, 250)
                        }

                        // $('.showAndHide').show();





                        obj = this.$nodeData[id];
                        var nodeArr=this.$nodeDom;
                        for(var DomNodei in nodeArr){
                            $(nodeArr[DomNodei]).removeClass('active')
                        }
                        $(this.$nodeDom[id]).addClass('active')
                        $("#ele_type").val(obj.type);
                        $("#ele_designerId").val(obj.designerId);
                        $("#ele_left").val(obj.left);
                        $("#ele_top").val(obj.top);
                        $("#ele_width").val(obj.width);
                        $("#ele_height").val(obj.height);
                        // $("#ele_from").val("");
                        // $("#ele_to").val("");
                        $("#ele_flow").val('${formId}');
                        var objtwo = obj.data;
                        $('#requiredItem').html('')

                        dataToAll = designdata;//所有数据
                        var stringdata = '<option value="0">请选择</option>';
                        for (var il = 0; il < dataToAll.length; il++) {
                            stringdata += '<option value="' + dataToAll[il].prcsId + '">' + dataToAll[il].prcsName + '</option>'
                        }
                        $('[name="autoBaseUser"]').html(stringdata)
                        $('[name="AUTO_PRCS_USER"]').html(stringdata)
                        formTwo.render();

                        if(obj.data==undefined){
                            clearinput();
                            $("#ele_designerId").val($('#node_'+id.replace('node_','')).attr('data-num'));
                            $('[name="prcsId"]').val(id.replace('node_',''))
                            $('[name="prcsName"]').val(id.replace('node_','步骤'))
                            $('#query_userId').val('')
                            $('#department').val('')
                            $('#theScopeOf').val('')
                            $('[name="prcsUser"]').val('')
                            $('[name="prcsDept"]').val('')
                            $('[name="prcsPriv"]').val('')
                            oidPrcsId=id.replace('node_','');

                            return true;
                        }

                        seleTheEcho('userFilter', objtwo.userFilter)
                        if ($('[name="userFilter"]').val() == 6) {
                            $('.departmentAgent').show();
                        } else if ($('[name="userFilter"]').val() == 9) {
                            $('.auxiliaryDepartmentAgent').show()
                        } else if ($('[name="userFilter"]').val() == 7) {
                            $('.theSpecifiedRole').show()
                        } else if ($('[name="userFilter"]').val() == 11) {
                            $('.assignRole').show()
                        }
                        seleTheEcho('autoType', objtwo.autoType)
                        if ($('[name="autoType"]').val() == 2 || $('[name="autoType"]').val() == 9 || $('[name="autoType"]').val() == 4
                            || $('[name="autoType"]').val() == 6 || $('[name="autoType"]').val() == 5 ||
                            $('[name="autoType"]').val() == 10 || $('[name="autoType"]').val() == 11) {
                            $('.autoBaseUser').show();
                        } else if ($('[name="autoType"]').val() == 12 || $('[name="autoType"]').val() == 13 ||
                            $('[name="autoType"]').val() == 14 || $('[name="autoType"]').val() == 15) {
                            $('.optionalDepartmentAgent').show()
                        } else if ($('[name="autoType"]').val() == 3) {
                            $('.specifyTheHost').show()
                        } else if ($('[name="autoType"]').val() == 7) {
                            $('.oneTheHost').show()
                        } else if ($('[name="autoType"]').val() == 8) {
                            $('.stepsTwos').show()
                        }

                        inputTheEcho('prcsId', objtwo.prcsId)
                        oidPrcsId=objtwo.prcsId;

                        inputTheEcho('prcsDeptName', objtwo.prcsDeptName)
                        inputTheEcho('prcsUserName', objtwo.prcsUserName)
                        inputTheEcho('prcsPrivName', objtwo.prcsPrivName)


                        seleTheEcho('prcsType', objtwo.prcsType)
                        inputTheEcho('prcsName', objtwo.prcsName)
                        inputTheEcho('prcsTo', objtwo.prcsTo)

                        inputTheEcho('prcsUser', objtwo.prcsUser)
                        inputTheEcho('prcsDept', objtwo.prcsDept)
                        inputTheEcho('prcsPriv', objtwo.prcsPriv)
                        inputTheEcho('hiddenItem', objtwo.hiddenItem)
                        inputTheEcho('requiredItem', objtwo.requiredItem)
                        ulTheEcho('hiddenItem', objtwo.hiddenItem)
                        ulTheEcho('requiredItem', objtwo.requiredItem)
                        radioTheEcho('signType', objtwo.signType)
                        radioTheEcho('countersign', objtwo.countersign)
                        if(objtwo.timeOut!=undefined){
                            $('[name="timeOut"]').val(objtwo.timeOut.split(',')[0])
                            $('.btnTime').attr('data-type',objtwo.timeOut.split(',')[1])
                            if(objtwo.timeOut.split(',')[1]=='hour'){
                                $('.btnTime').text('小时')
                            }else if(objtwo.timeOut.split(',')[1]=='day'){
                                $('.btnTime').text('天')
                            }
                        }
                        radioTheEcho('timeOutModify', objtwo.timeOutModify)
                        radioTheEcho('timeOutType', objtwo.timeOutType)
                        radioTheEcho('workingdaysType', objtwo.workingdaysType)
                        radioTheEcho('timeOutAttend', objtwo.timeOutAttend)
                        radioTheEcho('topDefault', objtwo.topDefault)
                        radioTheEcho('userLock', objtwo.userLock)
                        radioTheEcho('feedback', objtwo.feedback)
                        radioTheEcho('signlook', objtwo.signlook)
                        radioTheEcho('turnPriv', objtwo.turnPriv)
                        radioTheEcho('allowBack', objtwo.allowBack)
                        radioTheEcho('syncDeal', objtwo.syncDeal)
                        radioTheEcho('gatherNode', objtwo.gatherNode)
                        radioTheEcho('viewPriv', objtwo.viewPriv)
                        seleTheEcho('autoBaseUser', objtwo.autoBaseUser)
                        inputTheEcho('autoUserOp', objtwo.autoUserOp)
                        inputTheEcho('autoUser', objtwo.autoUser)
                        inputTheEcho('autoDept', objtwo.autoDept)
                        inputTheEcho('userFilterPrcsDept', objtwo.userFilterPrcsDept)
                        inputTheEcho('userFilterPrcsDeptOther', objtwo.userFilterPrcsDeptOther)
                        inputTheEcho('userFilterPrcsPriv', objtwo.userFilterPrcsPriv)
                        inputTheEcho('userFilterPrcsPrivOther', objtwo.userFilterPrcsPrivOther);
                        theTrigger = objtwo.flowTiggerModel;
                        forimId = objtwo.formIds;
                        conditionsDate = objtwo.conditionsSet;
                        canwritefieldtwo = objtwo.canWriteField;


                        var canwritefieldobj={};
                        canwritefieldobj.prcsItem=canwritefieldtwo.prcsItem;
                        canwritefieldobj.attachPriv=canwritefieldtwo.attachPriv;
                        canwritefieldobj.attachEditPriv=canwritefieldtwo.attachEditPriv;
                        canwritefieldobj.attachEditPrivOnline=canwritefieldtwo.attachEditPrivOnline;
                        canwritefieldobj.attachMacroMark=canwritefieldtwo.attachMacroMark;
                        canwritefieldobj.documentEditPriv=canwritefieldtwo.documentEditPriv;
                        canwritefieldobj.documentEditPrivDetail=canwritefieldtwo.documentEditPrivDetail
                       $('[name="prcsItemTwo"]').val(JSON.stringify(canwritefieldobj))
                        $('[name="imguploadPriv"]').val(objtwo.canWriteField.imguploadPriv)
                        $('[name="fileuploadPriv"]').val(objtwo.canWriteField.fileuploadPriv)



                        var conditionsDateObj={};
                        conditionsDateObj.intoTheCondition={};
                        conditionsDateObj.intoTheCondition.list=conditionsDate.prcsIn;
                        conditionsDateObj.intoTheCondition.prcsInSet=conditionsDate.prcsInSet;
                        conditionsDateObj.intoTheCondition.conditionDesc=(function () {
                            if(conditionsDate.conditionDesc==undefined||conditionsDate.conditionDesc=='') {
                                return ''
                            }else {
                                if (conditionsDate.conditionDesc.split('\n')[0] == undefined
                                    || conditionsDate.conditionDesc.split('\n')[0] == '') {
                                    return ''
                                } else {
                                    return conditionsDate.conditionDesc.split('\n')[0]
                                }
                            }
                        })()
                        conditionsDateObj.transferConditions={}
                        conditionsDateObj.transferConditions.list=conditionsDate.prcsOut;
                        conditionsDateObj.transferConditions.prcsOutSet=conditionsDate.prcsOutSet;
                        conditionsDateObj.transferConditions.conditionDesc=(function () {
                            if(conditionsDate.conditionDesc==undefined||conditionsDate.conditionDesc=='') {
                                return ''
                            }else {
                                if(conditionsDate.conditionDesc.split('\n')[1]==undefined
                                    ||conditionsDate.conditionDesc.split('\n')[1]==''){
                                    return ''
                                }else {
                                    return conditionsDate.conditionDesc.split('\n')[1]
                                }
                            }
                        })()
                        conditionsDateObj.transferConditionTwo=conditionsDate.conditionDesc;
                        $('[name="settlementOfCondition"]').val(JSON.stringify(conditionsDateObj))






                        workForm.init({
                                formhtmlurl: '../../form/formType',
                                resdata: {
                                    fromId: forimId
                                },
                                flag: 3
                            },
                            function (data) {
                                alertData = data;
                            });

                        //下一步骤


                        if ($('[name="prcsTo"]').val() == '') {
                            for (var inde = 0; inde < designdata.length; inde++) {
                                if (inde < designdata.length - 1) {
                                    if (designdata[inde].prcsName == $('[name="prcsName"]').val()) {
                                        $('#candidatesPoneli').html('<li>' + designdata[inde + 1].prcsName + '</li>')
                                    }
                                } else {
                                    if (designdata[inde].prcsName == $('[name="prcsName"]').val()) {
                                        $('#candidatesPoneli').html('')
                                    }
                                }
                            }
                            $('[name="prcsTo"]').val()
                        } else {
                            var prcsTos = $('[name="prcsTo"]').val().split(',');

                            var prcsToStr = ''
                            for (var mx = 0; mx < prcsTos.length; mx++) {
                                for (var ix = 0; ix < designdata.length; ix++) {
                                    if (prcsTos[mx] == designdata[ix].prcsId) {
                                        prcsToStr += '<li>' + designdata[ix].prcsName + ',</li>'
                                    }
                                }
                                if(mx!=prcsTos.length-1) {
                                    if (prcsTos[mx] == 0) {
                                        prcsToStr += '<li>结束,</li>'
                                    }
                                }
                            }

                        }
                        $('#candidatesPoneli').html(prcsToStr)

                    // }
                    }
                $("#ele_name").val(obj.name);


                    return true;

                }


        }
    });
}
$(function () {
    // var fromIdtwo = 17;
    $('.fixedtitle .textP').text(prevAndNextTitle[0])
    
    $('.prevAndNext .prev').click(function () {
        var num=$(this).parent().prev().attr('data-num');
        if(num==0){
            $('.fixedtitle .textP').text(prevAndNextTitle[prevAndNextTitle.length-1])
            $('.fixedtitle .textP').attr('data-num',prevAndNextTitle.length-1)
        }else {
            $('.fixedtitle .textP').text(prevAndNextTitle[num-1])
            $('.fixedtitle .textP').attr('data-num',num-1)
        }
    })
    $('.prevAndNext .next').click(function () {
        var num=$(this).parent().prev().attr('data-num');
        if(num==(prevAndNextTitle.length-1)){
            $('.fixedtitle .textP').text(prevAndNextTitle[0])
            $('.fixedtitle .textP').attr('data-num',0)
        }else {
            $('.fixedtitle .textP').text(prevAndNextTitle[parseInt(num)+1])
            $('.fixedtitle .textP').attr('data-num',parseInt(num)+1)
        }
    })






    $('.emptyTwo').click(function () {
        $(this).parent().parent().find('textarea').val('')
        $(this).parent().parent().find('textarea').attr('user_id','')
        $(this).parent().parent().find('textarea').attr('deptid','')
        $(this).parent().parent().find('textarea').attr('privid','')
        $(this).parent().parent().find('input[type="hidden"]').val('')
    })




    $('.savetwo').click(function () {
        var prcsIdOnlyOne=$('[name="prcsId"]').val();
        if(oidPrcsId!=null) {
            if (oidPrcsId != prcsIdOnlyOne) {
                var prcsIdNum = true;
                for (var i = 0; i < designdata.length; i++) {
                    if (designdata[i].prcsId == prcsIdOnlyOne) {
                        prcsIdNum = false;
                    }
                }
                if (!prcsIdNum) {
                    $.layerMsg({content: '序号不能重复！', icon: 2});
                    return;
                }
            }
        }





        if($('[name="timeOut"]').val()!=''){
            var timeOutVal=$('[name="timeOut"]').val()+','+$('.btnTime').attr('data-type');
            $('[name="timeOut"]').val(timeOutVal);
        }

            $('.theControlData').each(function () {
                if($(this).attr('user_id')!=undefined) {
                    $(this).next().val($(this).attr('user_id'))
                    return true;
                }
                 if($(this).attr('userpriv')!=undefined){
                    $(this).next().val($(this).attr('userpriv'))
                    return true
                }
                if($(this).attr('deptid')!=undefined){
                    $(this).next().val($(this).attr('deptid'))
                }
            })
            if($(this).attr('data-type')) {
                $(this).attr('data-type',false)
                $('#datasave').ajaxSubmit({
                    type: 'post',
                    dataType: 'json',
                    success: function (json) {
                        if (json.flag) {
                            $.layerMsg({content: '保存成功！', icon: 1}, function () {
                                location.reload();
                            });
                        } else {
                            $(this).attr('data-type',true)
                            alert('异常')
                        }

                    }
                })
            }
    })

    $(document).delegate('#checkAll span .layui-form-checkbox','click',function () {
        if($(this).prev().is(':checked')){
            $('.bottomstepstwo input[type=checkbox]').each(function (i,n) {
                $(this).prop('checked',true)
                $(this).next().addClass('layui-form-checked')
            })
        }
        else {
            $('.bottomstepstwo input[type=checkbox]').each(function (i,n) {
                $(this).removeProp('checked')
                $(this).next().removeClass('layui-form-checked')
            })
        }
    })
    $(document).delegate('.theEditor','click',function () {
        $(this).parent().parent().find('span').hide();
        $(this).parent().parent().find('input').show();
        $(this).parent().parent().find('input').val($(this).parent().parent().find('input[type=hidden]').val());
    })

    $(document).delegate('#bottomstepstwoss table tbody input[type=text]','blur',function () {
       $(this).next().val($(this).val());
       $(this).hide();
       $(this).prev().text($(this).val())
        $(this).prev().show();
    })
    $(document).delegate('.deletes','click',function () {
        $(this).parent().parent().remove();
    })
    //
    $(document).delegate('#draw_flowDesignTable','click',function () {
       $('#propertyForm').css('right',-($('#propertyForm').width()))
       $('.btnstorage').css('right',-($('.btnstorage').width()))
    })




        var $width=$('body').width();
        var $height=parseInt(document.documentElement.clientHeight||document.body.offsetHeight);

        var property = {
            width: $width,
            height: $height,
            toolBtns: ["chat", "end round"],
//                "start round", "end round", "task round", "node","state", "plug", "join", "fork", "complex mix"
            haveHead: true,
            headBtns: [

            ],//如果haveHead=true，则定义HEAD区的按钮
            haveTool: true,
            haveGroup: true,
            useOperStack: true
        };
        var remark = {
            cursor: "选择节点",
            direct: "结点连线",
            start: "开始节点",
            end: "结束结点",
            task: "任务结点",
            node: "自动结点",
            chat: "进行中结点",
            state: "状态结点",
            plug: "附加插件",
            fork: "分支结点",
            join: "联合结点",
            "complex mix": "复合结点",
            "end round":"结束节点",
            group: "组织划分框编辑开关"
        };
        flowDesign = $.createGooFlow($("#flowDesignTable"), property);
        flowDesign.setNodeRemarks(remark);




    $('#propertyForm').height($('body').height()-65);
    $('#propertyForm').css('max-height',$('body').height()+2000)
    $('#propertyForm').css('right',-$('#propertyForm').width())
    // $('#propertyForm').css('box-shadow','none')
    $('.btnstorage').css('right',-$('.btnstorage').width())
    // $('.btnstorage').css('right',-$('.btnstorage').width())



    $('.closebtns').click(function () {
        $('#propertyForm').css('right',-$('#propertyForm').width())
        $('.btnstorage').css('right',-$('.btnstorage').width())
        // $('.showAndHide').hide();
    })
    $('.setUpThe').click(function (event) {
        var me=this;
        $(this).next('.candidatesUl').siblings('.candidatesUl').stop().slideUp(350);
        $(this).next('.candidatesUl').slideToggle(350);
        if($(this).hasClass('active')){
            $(this).removeClass('active')
        }else {
            $(this).addClass('active');
        }
        $(me).siblings().removeClass('active');
        event.stopPropagation();
    })

    $('.dropDownDiv .candidatesPTwo').on('click',function (event) {
        $(this).next().stop().slideToggle(350)
        event.stopPropagation();
    })
    $('.dropDownDiv .dropDown li').on('click',function (event) {
        $(this).parent().stop().slideUp(350);
        $(this).parent().parent().find('input[type=text]').val($(this).find('span').text())
        $(this).parent().parent().find('input[type=hidden]').val($(this).find('input').val())
        event.stopPropagation();
    })
    $('.theCandidates').on('click',function () {

        var num=$(this).attr('data-num')
        if(num==1) {
            user_id = $(this).parent().siblings('textarea').prop('id');
            $.popWindow("../common/selectUser");
        }else if(num==2){
            dept_id=$(this).parent().siblings('textarea').prop('id');

            $.popWindow("../common/selectDept");
        }else if(num==3){
            priv_id=$(this).parent().siblings('textarea').prop('id');
            $.popWindow("../common/selectPriv");
        }
    })

    $('.xuanzezhuban').click(function () {
        user_id='xuanzezhuban';
        $.popWindow("../common/selectUser?0");
    })

    $('.qingchuzhuban').click(function () {
        $('#xuanzezhuban').attr('username','')
        $('#xuanzezhuban').attr('dataid','')
        $('#xuanzezhuban').attr('user_id','')
        $('#xuanzezhuban').attr('userprivname','')
    })


    layui.use(['layer', 'form'], function(){
        layer = layui.layer
            ,form = layui.form();
        formTwo=form;
        theTriggersTwo()
        theTriggerchufa()
        ajaxSvg();
        form.on('select(candidatesfilters)', function(data){
            // console.log(data.elem); //得到select原始DOM对象
            // console.log(data.value); //得到被选中的值
            // console.log(data.othis); //得到美化后的DOM对象
            if(data.value==6){
                $(data.elem).parent().siblings('div').hide();
                $('.departmentAgent').show()
            }else if(data.value==9){
                $(data.elem).parent().siblings('div').hide();
                $('.auxiliaryDepartmentAgent').show()
            }else if(data.value==7){
                $(data.elem).parent().siblings('div').hide();
                $('.theSpecifiedRole').show()
            }else if(data.value==11){
                $(data.elem).parent().siblings('div').hide();
                $('.assignRole').show()
            }else {
                $(data.elem).parent().siblings('div').hide();
            }

        });
        
        
        form.on('radio(feedbackS)',function (data) {

            if(data.value==1){

                $(data.elem).parent().parent().parent().next().hide();
                var arr=$(data.elem).parent().parent().parent().next().find('input')
                for(var i=0;i<arr.length;i++){
                    $(arr[i]).attr('checked',false)
                }
                form.render()

            }else {
                $(data.elem).parent().parent().parent().next().show();
                form.render()
            }
            
        })
        form.on('select(automaticCandidateTwo)', function(data){
            // console.log(data.elem); //得到select原始DOM对象
            // console.log(data.value); //得到被选中的值
            // console.log(data.othis); //得到美化后的DOM对象
            if(data.value==2||data.value==9||data.value==4||data.value==6||data.value==5||data.value==10||data.value==11){
                $(data.elem).parent().siblings('div').hide();
                $('.autoBaseUser').show();
            }else if(data.value==12||data.value==13||data.value==14||data.value==15){
                $(data.elem).parent().siblings('div').hide();
                $('.optionalDepartmentAgent').show()
            }else if(data.value==3){
                $(data.elem).parent().siblings('div').hide();
                $('.specifyTheHost').show()
            }else if(data.value==7){
                $(data.elem).parent().siblings('div').hide();
                $('.oneTheHost').show()
            }else if(data.value==8){
                $(data.elem).parent().siblings('div').hide();
                $('.stepsTwos').show()
            }else {
                $(data.elem).parent().siblings('div').hide();
            }
        });



        $('.bottomsteps').click(function () {
            var str='';
            var laystr=''
            if($(this).attr('data-field')==0) {

                    for (var i = 0; i < dataToAll.length; i++) {
                        str += '<input type="checkbox" title="' + dataToAll[i].prcsName + '" value="' + dataToAll[i].prcsId + '">'
                    }



                laystr='<div class="bottomstepstwo layui-form" style="margin: 10px ;"><div class="divAllData">'+str+ '<input type="checkbox" title="结束" value="0"></div><div style="margin-top: 15px;" id="checkAll"><span><input type="checkbox" class="checkedAll" title="全选"></span> </div>'+
                    '</div>'
            }else if($(this).attr('data-field')==1){

                if(alertData==undefined){
                    $.layerMsg({content:'正在保存表单，即将刷新！',icon:2},function(){
                        location.reload()
                    });

                }

                if($(this).siblings('input[type=hidden]').val()!=''){
                    var hiddenItemArr=$(this).siblings('input[type=hidden]').val().split(',');
                    for(var i=0;i<alertData.length;i++) {
                        for (var n = 0; n < hiddenItemArr.length; n++) {
                            if (alertData[i].title == hiddenItemArr[n]) {
                                var strTwo = '<input type="checkbox" checked title="' + alertData[i].title + '" value="' + alertData[i].title + '">'
                                break;
                            } else {
                                var strTwo = '<input type="checkbox" title="' + alertData[i].title + '" value="' + alertData[i].title + '">'
                            }
                        }
                            str+=strTwo;
                    }
                }else {
                    for(var i=0;i<alertData.length;i++) {
                        str += '<input type="checkbox" title="' + alertData[i].title + '" value="' + alertData[i].title + '">'

                    }
                }




                laystr='<div class="bottomstepstwo layui-form" style="margin: 10px ;"><div class="divAllData">'+str+ '</div><div style="margin-top: 15px;" id="checkAll"><span><input type="checkbox" class="checkedAll" title="全选"></span> </div>'+
                    '</div>'
            }
            var me=this;

        layer.open({
            type:1,
            title:$(me).parent().parent().prev().text(),
            content: laystr,
            area:['400px','300px'],
            btn:['确定','关闭'],
            yes:function (index) {
                var str='';
                var strTwo='';
                var obj=$('.bottomstepstwo .divAllData input[type=checkbox]:checked');
                obj.each(function (i,n) {
                    if(i<obj.length-1){
                        str+=$(this).val()+','
                    }else {
                        str+=$(this).val()+',';
                    }
                    strTwo+='<li>('+(i+1)+')'+$(this).next().find('span').text()+'</li>'
                })

                $(me).nextAll('input').val(str);
                $(me).parent().prev().html(strTwo)
                layer.close(index)
            },
            success:function () {
                if($(me).attr('data-field')==0) {
                    var arrayprcsTo=$('[name="prcsTo"]').val().split(',')
                    $('.divAllData [type="checkbox"]').each(function(i,n){
                        for(var m=0;m<arrayprcsTo.length;m++){
                            if($(this).val()==arrayprcsTo[m]){
                                $(this).prop('checked',true)
                            }
                        }
                    })
                }else if($(me).attr('data-field')==1){
                    var hiddenItemhide=$(me).next().val().split(',');
                    $('.divAllData [type="checkbox"]').each(function(i,n){
                        for(var m=0;m<hiddenItemhide.length;m++){
                            if($(this).val()==hiddenItemhide[m]){
                                $(this).prop('checked',true)
                            }
                        }
                    })

                }




                form.render();
            }
        })
    })

        $('.deleteTwo').click(function () {
            $(this).parent().siblings('textarea').attr('dataid','')
            $(this).parent().siblings('textarea').attr('user_id','')
            $(this).parent().siblings('textarea').attr('deptid','')
            $(this).parent().siblings('textarea').attr('deptno','')
            $(this).parent().siblings('textarea').attr('privid','')
            $(this).parent().siblings('textarea').attr('userpriv','')
            $(this).parent().siblings('textarea').val('')
            $(this).parent().siblings('input').val('')
        })



        $('#conditions').click(function () {//条件生成器


            var arrprcsIn=conditionsDate.prcsIn.split('\n')
             // var arrprcsIn=conditionsDate.prcsIn.split('\r')
            var intoTheConditionPrcsIn='';
            // console.log(strprcsIn)
            for(var m=0;m<arrprcsIn.length;m++){
                if(arrprcsIn[m]!='') {
                    intoTheConditionPrcsIn += '<tr><td width="20%">' + (m + 1) + '</td>' +
                        '<td width="60%"><span>' + arrprcsIn[m] + '</span><input type="text" name="ConditionsInput" style="display: none">' +
                        '<input type="hidden" value="' + arrprcsIn[m] + '"></td>' +
                        '<td><a href="javascript:;" class="theEditor" style="margin-right: 10px;color: #2f8ae3">编辑</a>' +
                        '<a href="javascipt:;" class="deletes" style="color: #2f8ae3">删除</a></td></tr>'
                }

            }

            var arrprcsOut=conditionsDate.prcsOut.split('\n');

            // var arrprcsOut=conditionsDate.prcsOut.split('\r');
            // console.log(strprcsOut)
            // console.log(arrprcsOut)
            var transferConditionsprcsOut='';
            for(var q=0;q<arrprcsOut.length;q++){
                if(arrprcsOut[q]!=''){
                    transferConditionsprcsOut+= '<tr><td width="20%">' + (q + 1) + '</td>' +
                        '<td width="60%"><span>' + arrprcsOut[q] + '</span><input type="text" name="ConditionsInput" style="display: none">' +
                        '<input type="hidden" value="' + arrprcsOut[q] + '"></td>' +
                        '<td><a href="javascript:;" class="theEditor" style="margin-right: 10px;color: #2f8ae3">编辑</a>' +
                        '<a href="javascipt:;" class="deletes" style="color: #2f8ae3">删除</a></td></tr>'
                }
            }
            var str='<option value="">请选择</option>'
            if(alertData==undefined){
                $.layerMsg({content:'正在保存表单，即将刷新！',icon:2},function(){
                    location.reload()
                });

            }
           for(var i=0;i<alertData.length;i++){
               str+='<option value="'+alertData[i].name+'">'+alertData[i].title+'</option>'
           }
           var arr=[{'name':'等于','val':'='},{'name':'不等于','val':'!='},{'name':'大于','val':'>'},{'name':'小于','val':'<'}
           ,{'name':'小于等于','val':'<='},{'name':'大于等于','val':'>='},{'name':'包含','val':'include'},{'name':'不包含','val':'exclude'}]
            var strone='';
            for(var i=0;i<arr.length;i++){
                strone+='<option value="'+arr[i].val+'">'+arr[i].name+'</option>'
            }
            layer.open({
                type:1,
                title:'条件生成器',
                content:'<div class="bottomstepstwoss layui-form" id="bottomstepstwoss">\
            <ul class="candidatesUl" style="display: block;border: none;background:#fff">\
                <li>\
                   <p class="candidatesPone">字段</p> \
                    <div class="dropDownDiv">\
                        <p class="candidatesPTwo">\
                        <input type="hidden">\
                            <select name="fieldsele" lay-verify="">'+str+'</select>\
                        </p>\
                    </div>\
                </li>\
                 <li>\
                   <p class="candidatesPone">条件</p> \
                    <div class="dropDownDiv" style="z-index:99998">\
                        <p class="candidatesPTwo">\
                           <select name="conditionss" lay-filter="conditionstwo" lay-verify="">'+strone+'</select>\
                        </p>\
                    </div>\
                </li>\
                <li>\
                   <p class="candidatesPone" id="typepanduan"><input type="checkbox" lay-filter="typeJudgment" title="类型判断"/></p> \
                        <p class="candidatesPTwo" id="typevalue">\
                            <select name="typeJudgments"  lay-verify="" style="display:none">\
                            <option value="数值">数值</option><option value="日期">日期</option><option value="时间+日期">时间+日期</option></select>\
                            <input type="text" name="typeJudgments" class="typeJudgmentTwo" style="    vertical-align: top;"><span style="text-align: center;font-size: 14px;margin-left: 50px;margin-top: 5px;display: inline-block;">值</span>\
                        </p>\
                </li>\
                <li class="btnzhuanru">\
                    <a href="javascript:;" class="intoTheConditionBtn" style="margin: 0 20px 0 -52px;" data-add="0">添加转入条件</a>\
                    <a href="javascript:;" class="intoTheConditionBtn" data-add="1">添加转出条件</a>\
                </li>\
                <li>\
                   <p class="candidatesPone">转入条件列表</p> \
                   <div class="candidatesPTwo" id="intoTheCondition" style="border: none;margin-bottom: 20px;">\
                           <table>\
                                <thead>\
                                    <tr>\
                                        <th width="20%">编号</th>\
                                        <th width="60%">条件描述</th>\
                                        <th width="20%">操作</th>\
                                    </tr>\
                                </thead>\
                                <tbody>'+intoTheConditionPrcsIn+'</tbody>\
                           </table>\
                   </div>\
                   <p class="candidatesPone">转入条件公式(条件与逻辑运算符之间需空格，如[1] AND [2])</p> \
                    <p class="candidatesPTwo">\
                            <input type="text" name="prcsInSet" value="'+conditionsDate.prcsInSet+'">\
                     </p>\
                      <p class="candidatesPone">不符合条件公式时，给用户的文字描述：</p> \
                    <p class="candidatesPTwo">\
                            <input type="text" name="conditionDesc" value="'+
                function(){

                    if(conditionsDate.conditionDesc==undefined||conditionsDate.conditionDesc==''){
                        return ''
                    }else {
                        if(conditionsDate.conditionDesc.split('\n')[0]==undefined
                        ||conditionsDate.conditionDesc.split('\n')[0]==''){
                            return ''
                        }else {
                            return conditionsDate.conditionDesc.split('\n')[0]
                        }
                    }}()+'">\
                            <p style="color: red;font-size: 12px;margin-top: 5px;">合理设定转入条件，可形成流程的条件分支，但数据满足转入条件，才可转入本步骤</p>\
                     </p>\
                </li>\
                <li style="margin-top: 20px;">\
                     <p class="candidatesPone">转出条件列表</p> \
                     <div class="candidatesPTwo" id="transferConditions" style="border: none;margin-bottom: 20px;">\
                         <table>\
                          <thead>\
                                    <tr>\
                                        <th width="20%">编号</th>\
                                         <th width="60%">条件描述</th>\
                                        <th width="20%">操作</th>\
                                    </tr>\
                                </thead>\
                                <tbody>'+transferConditionsprcsOut+'</tbody>\
                         </table>\
                     </div>\
                      <p class="candidatesPone">转出条件公式(条件与逻辑运算符之间需空格，如[1] AND [2])</p> \
                    <p class="candidatesPTwo">\
                            <input type="text" name="prcsOutSet" value="'+conditionsDate.prcsOutSet+'">\
                     </p>\
                      <p class="candidatesPone">不符合条件公式时，给用户的文字描述：</p> \
                    <p class="candidatesPTwo">\
                            <input type="text" name="conditionDesctwo" value="'+function(){

                    if(conditionsDate.conditionDesc==undefined||conditionsDate.conditionDesc=='') {
                        return ''
                    }else {
                        if(conditionsDate.conditionDesc.split('\n')[1]==undefined
                        ||conditionsDate.conditionDesc.split('\n')[1]==''){
                            return ''
                        }else {
                            return conditionsDate.conditionDesc.split('\n')[1]
                        }
                    }
                }()+'">\
                     </p>\
                </li>\
            </ul>\
            </div>',
                area:['800px','600px'],
                btn:['确定','关闭'],
                yes:function (index) {
                    // $('#bottomstepstwoss').find('#intoTheCondition').find('input[type=text]').each(function () {
                    //     $(this).blur();
                    // })
                    // $('#bottomstepstwoss').find('#transferConditions').find('input[type=text]').each(function () {
                    //     $(this).blur();
                    // })

                    var obj={};
                    obj.intoTheCondition={}
                    obj.intoTheCondition.list=''

                    $('#intoTheCondition').find('[type=hidden]').each(function (i,n) {

                        obj.intoTheCondition.list+=$(this).val()+'\n';
                    })
                    obj.intoTheCondition.prcsInSet=$('#bottomstepstwoss').find('[name="prcsInSet"]').val()
                    obj.intoTheCondition.conditionDesc=$('#bottomstepstwoss').find('[name="conditionDesc"]').val()

                    obj.transferConditions={};
                    obj.transferConditions.list='';
                    $('#transferConditions').find('[type=hidden]').each(function (i,n) {
                        // console.log($(this).val())
                        obj.transferConditions.list+=$(this).val()+'\n';
                    })
                    obj.transferConditions.prcsOutSet=$('#bottomstepstwoss').find('[name="prcsOutSet"]').val()
                    obj.transferConditionTwo=$('#bottomstepstwoss').find('[name="conditionDesc"]').val()
                    obj.transferConditions.conditionDesc=$('#bottomstepstwoss').find('[name="conditionDesctwo"]').val()

                   var strobj=JSON.stringify(obj);

                    $('[name="settlementOfCondition"]').val(strobj);
                    $('.setUpThe').removeClass('active')
                    layer.close(index)
                },
                btn2:function () {
                    $('.setUpThe').removeClass('active')
                },
                success:function () {
                    form.render();
                    $('#typevalue').find('select').next().hide();
                    $('.intoTheConditionBtn').click(function () {
                        var strval;
                          if($('#typevalue div').css('display')=='none'){
                              strval=$('input[name="typeJudgments"]').val()
                          }else{
                              strval=$('select[name="typeJudgments"]').val()
                          }
                        var strIng='';
                        var num;
                        var strconditions="'"+$('[name="fieldsele"]').next().find('input').val()+"'" +
                            ""+$('[name="conditionss"]').val()+"'"+strval+"'";
                            if($(this).attr('data-add')=='0'){
                                strIng='<tr><td width="20%">'+($('#intoTheCondition table tbody tr').length+1)+'</td>' +
                                    '<td width="60%"><span>'+strconditions+'</span><input type="text" value="'+strconditions+'" name="ConditionsInput" style="display: none">' +
                                    '<input type="hidden" value="'+strconditions+'"></td>' +
                                    '<td><a href="javascript:;" class="theEditor" style="margin-right: 10px;color: #2f8ae3">编辑</a>' +
                                    '<a href="javascipt:;" class="deletes" style="color: #2f8ae3">删除</a></td></tr>'
                                $('#intoTheCondition table tbody input[type=hidden]').each(function (i,n) {
                                    if($(this).val()==strconditions){
                                        alert('已有，请不要重复添加');
                                        num=1;
                                        return false;
                                    }
                                })
                                if(num==1){
                                    return;
                                }
                                $('#intoTheCondition table tbody').append(strIng)
                            }else if($(this).attr('data-add')=='1'){
                                strIng='<tr><td width="20%">'+($('#transferConditions table tbody tr').length+1)+'</td>' +
                                    '<td width="60%"><span>'+strconditions+'</span><input type="text" name="ConditionsInput" value="'+strconditions+'" style="display: none">' +
                                    '<input type="hidden" value="'+strconditions+'"></td>' +
                                    '<td><a href="javascript:;" class="theEditor" style="margin-right: 10px;color: #2f8ae3">编辑</a>' +
                                    '<a href="javascipt:;" class="deletes" style="color: #2f8ae3">删除</a></td></tr>'
                                $('#transferConditions table tbody input[type=hidden]').each(function (i,n) {
                                    if($(this).val()==strconditions){
                                        alert('已有，请不要重复添加');
                                        num=1;
                                        return false;
                                    }
                                })
                                if(num==1){
                                    return;
                                }
                                $('#transferConditions table tbody').append(strIng)
                            }

                    })

                }
            })


            //条件生成器里下拉
            form.on('select(conditionstwo)', function(data){
                // console.log(data.elem); //得到select原始DOM对象
                // console.log(data.value); //得到被选中的值
                // console.log(data.othis); //得到美化后的DOM对象
                if(data.value=='='||data.value=='!='){
                    $('#typepanduan').find('div').show();

                }else {
                    $('#typepanduan').find('div').hide();
                }
            });
            form.on('checkbox(typeJudgment)', function(data){
                // console.log(data.elem.checked); //是否被选中，true或者false
                if(data.elem.checked){
                    $('#typevalue').find('select').next().show();
                    $('.typeJudgmentTwo').hide();
                    $('.typeJudgmentTwo').next().hide();
                }else {
                    $('#typevalue').find('select').next().hide();
                    $('.typeJudgmentTwo').show();
                    $('.typeJudgmentTwo').next().show();
                }
            });

        })

        var newtheTrigger={//新增触发器公功能
            obj:{},
            init:function () {
                var me=this;
                $(document).delegate('.dataCid','click',function () {
                    me.openAlert(this);
                })
            },
            openAlert:function (me) {
                var strUrls,strtitle,obj={};
                if($(me).attr('data-Cid')==0) {
                    strUrls ='/tigger/saveTigger';
                    strtitle='新建触发器';
                    obj.pluginTypes='';
                    obj.sortIds='';
                    obj.namelllss='';
                    obj.pluginWays='';
                    obj.descriptions='';
                    obj.startThe='';
                    obj.id=''
                }else {
                    strUrls='/tigger/updateTigger';
                    strtitle='编辑触发器';



                    obj.pluginTypes=$(me).parent().parent().find('[name="pluginTypes"]').val();
                    obj.plugin=$(me).parent().parent().find('td').eq(3).find('input').val()
                    obj.sortIds=$(me).parent().parent().find('[name="sortIds"]').val();
                    obj.namelllss=$(me).parent().parent().find('[name="namelllss"]').val();
                    obj.pluginWays=$(me).parent().parent().find('[name="pluginWays"]').val();
                    obj.descriptions=$(me).parent().parent().find('[name="descriptions"]').val();
                    obj.startThe=function(){if($(me).parent().parent().find('[name="startThe"]').is(':checked')){return 1}else {return 0}}()
                    obj.id=$(me).parent().parent().find('[name="theIncrease"]').val();
                    obj.businessLogicId=$(me).siblings('[name="businessLogicId"]').val()
                    obj.isGlobal=$(me).siblings('[name="isGlobals"]').val()
                }
                layer.open({
                    type:1,
                    title:strtitle,
                    content:'<div id="bottomstepstwoss" class="bottomstepstwoss layui-form" style="height: 380px;">\
                    <ul class="candidatesUl" style="display: block;border: none;background:#fff">\
                        <li>\
                        <input type=hidden id="theIncrease" value="'+obj.id+'">\
                            <p class="candidatesPone"><b style="color:red;margin-right: 8px;vertical-align: middle">*</b>触发节点</p> \
                            <div class="dropDownDiv" style="z-index:100010">\
                                <p class="candidatesPTwo">\
                                  <select name="pluginType" lay-verify="" value="'+ obj.pluginTypes+'">\
                                    <option value="CREATE">新建操作</option>\
                                    <option value="RECEIVE">接收操作</option>\
                                    <option value="SAVE">保存操作</option>\
                                    <option value="TURN">转交操作</option>\
                                    <option value="INTRUST">委托操作</option>\
                                    <option value="BACK">退回操作</option>\
                                </select>\
                                </p>\
                             </div>\
                        </li>\
                        <li>\
                            <p class="candidatesPone"><b style="color:red;margin-right: 8px;vertical-align: middle">*</b>排序号</p> \
                            <div class="dropDownDiv" style="z-index:99998">\
                                <p class="candidatesPTwo">\
                                   <input type="text" name="sortId" value="'+obj.sortIds+'">\
                                </p>\
                             </div>\
                        </li>\
                        <li>\
                            <p class="candidatesPone"><b style="color:red;margin-right: 8px;vertical-align: middle">*</b>名称</p> \
                            <div class="dropDownDiv" style="z-index:99997">\
                                <p class="candidatesPTwo">\
                                 <input type="text" name="nameTwo" value="'+obj.namelllss+'">\
                                </p>\
                             </div>\
                        </li>\
                          <li>\
                            <p class="candidatesPone">执行插件</p> \
                            <div class="dropDownDiv" style="z-index:100000" id="pluginWaythree">\
                                <p class="candidatesPTwo">\
                                  <select name="plugin"  lay-verify="" value="'+obj.plugin+'">\
                                        <option value="">请选择</option>\
                                    </select>\
                                </p>\
                             </div>\
                        </li>\
                        <li>\
                            <p class="candidatesPone">执行方式</p> \
                            <div class="dropDownDiv" >\
                                <p class="candidatesPTwo">\
                                    <select name="pluginWay" value="'+obj.pluginWays+'" lay-verify="">\
                                        <option value="BEFORE_FRONTEND">前台,执行操作前</option>\
                                        <option value="AFTER_FRONTEND">前台,执行操作后</option>\
                                        <option value="BEFORE_BACKEND">后台,执行操作前</option>\
                                        <option value="AFTER_BACKEND">后台,执行操作后</option>\
                                    </select>\
                                </p>\
                             </div>\
                        </li>\
                        <li>\
                            <p class="candidatesPone">业务接口</p> \
                            <div class="dropDownDiv" id="candidatesPoneTwo" style="z-index:99996">\
                                <p class="candidatesPTwo">\
                                    <select name="businessLogicId" value="'+obj.businessLogicId+'" lay-verify="">\
                                        <option value="BEFORE_FRONTEND">请选择</option>\
                                    </select>\
                                </p>\
                             </div>\
                        </li>\
                        <li>\
                            <p class="candidatesPone">触发器描述</p> \
                                <p class="candidatesPTwo" style="border:none;overflow:hidden">\
                                   <textarea name="description" value="'+obj.descriptions+'">'+obj.descriptions+'</textarea><span style="display:inline-block;margin: 19px 0px 0px 10px;text-align:center;color:#3994f7;border-radius:4px;font-size:14px">清空</span>\
                                </p>\
                        </li>\
                        <li>\
                            <p class="candidatesPone">是否启用</p> \
                            <div class="dropDownDiv" style="z-index:99995">\
                                <p class="candidatesPTwo" style="border:none">\
                                    <label style="font-size:14px"><input type="radio" name="actived" checked value="1" title="启用"></label>\
                                    <label style="font-size:14px"><input type="radio" name="actived"  value="0" title="禁用"></label>\
                                </p>\
                             </div>\
                        </li>\
                        <li>\
                            <p class="candidatesPone">是否是全局触发器</p> \
                            <div class="dropDownDiv" style="z-index:99995">\
                                <p class="candidatesPTwo" style="border:none">\
                                    <label style="font-size:14px"><input type="radio" name="isGlobal" value="1" title="是"></label>\
                                    <label style="font-size:14px"><input type="radio" name="isGlobal" checked  value="0" title="否"></label>\
                                </p>\
                             </div>\
                        </li>\
                    </ul>\
                </div>',
                    area:['600px','500px'],
                    btn:['确定','关闭'],
                    yes:function (index) {
                        if($(me).attr('data-Cid')==0) {
                            $.post(strUrls,{'pluginType':$('[name="pluginType"]').val(),'sortId':$('[name="sortId"]').val(),
                            'name':$('[name="nameTwo"]').val(),'plugin':$('[name="plugin"]').val(),'pluginWay':$('[name="pluginWay"]').val(),'description':$('[name="description"]').val(),
                                'actived':$('[name="actived"]:checked').val(),'flowId':flowstr,'flowPrcs':$('[name="prcsId"]').val(),
                                'businessLogicId':$('[name="businessLogicId"]').val(),'isGlobal':$('[name="isGlobal"]:checked').val()
                            },function (json) {
                                var num=true;
                                if($('[name="actived"]:checked').val()==0){
                                    num=false;
                                }else {
                                    num=true;
                                }

                                var stringTwo='<tr>' +
                                    '<td>'+$('[name="pluginType"]').next().find('input').val()+'<input type="hidden" value="'+$('[name="pluginType"]').val()+'" name="pluginTypes"></td>' +
                                    '<td>'+$('[name="sortId"]').val()+'<input type="hidden" value="'+$('[name="sortId"]').val()+'" name="sortIds"></td>' +
                                    '<td>'+$('[name="nameTwo"]').val()+'<input type="hidden" value="'+$('[name="nameTwo"]').val()+'" name="namelllss"></td>' +
                                    '<td>'+$('[name="plugin"]').next().find('input').val()+'<input type="hidden" value="'+$('[name="plugin"]').val()+'"></td>' +
                                    '<td>'+$('[name="pluginWay"]').next().find('input').val()+'<input type="hidden" value="'+$('[name="pluginWay"]').val()+'" name="pluginWays"></td>' +
                                    '<td>'+$('[name="description"]').val()+'<input type="hidden" value="'+$('[name="description"]').val()+'" name="descriptions"></td>' +
                                    '<td>' +
                                    '<input type="hidden" name="isGlobals" value="'+$('[name="isGlobal"]:checked').val()+'">' +
                                    '<input type="hidden" name="businessLogicId" value="'+$('[name="businessLogicId"]').val()+'">' +
                                    '<input type="hidden" name="theIncrease" value="'+function(){
                                            if($('[name="isGlobal"]:checked').val()==1){
                                                return json.obj[0].id
                                            }else {
                                                return json.object.id
                                            }
                                    }()+'"><a href="javascript:void(0)" class="dataCid" style="cursor:pointer;margin-right: 5px;color: #2b7fe0" data-Cid="1">编辑</a>' +
                                    '<a href="javascript:void(0)" style="color:#2b7fe0;margin-right: 5px;" data-dele="1">删除</a><label style="font-size: 12px">' +
                                    '<input name="startThe" type="checkbox" '+function () {
                                       if(num) {
                                           return 'checked';
                                       }
                                    }()+'>启用</label></td>' +
                                    '</tr>'
                                $('#thetriggersTwo').append(stringTwo);
                                layer.close(index)
                            },'json' )
                        }else {
                            $.post(strUrls,{'pluginType':$('[name="pluginType"]').val(),'sortId':$('[name="sortId"]').val(),
                                'name':$('[name="nameTwo"]').val(),'plugin':$('[name="plugin"]').val(),'pluginWay':$('[name="pluginWay"]').val(),'description':$('[name="description"]').val(),
                                'actived':$('[name="actived"]:checked').val(),'flowId':flowstr,'flowPrcs':$('[name="prcsId"]').val(),'id'  :$('#theIncrease').val(),
                                'businessLogicId':$('[name="businessLogicId"]').val(),'isGlobal':$('[name="isGlobal"]:checked').val()
                            },function (json) {
                                $(me).parent().parent().remove();
                                var num;
                                if($('[name="actived"]:checked').val()==0){
                                    num=false;
                                }else {
                                    num=true;
                                }
                                var stringTwo='<tr>' +
                                    '<td>'+$('[name="pluginType"]').next().find('input').val()+'<input type="hidden" value="'+$('[name="pluginType"]').val()+'" name="pluginTypes"></td>' +
                                    '<td>'+$('[name="sortId"]').val()+'<input type="hidden" value="'+$('[name="sortId"]').val()+'" name="sortIds"></td>' +
                                    '<td>'+$('[name="nameTwo"]').val()+'<input type="hidden" value="'+$('[name="nameTwo"]').val()+'" name="namelllss"></td>' +
                                    '<td>'+$('[name="plugin"]').next().find('input').val()+'<input type="hidden" value="'+$('[name="plugin"]').val()+'"></td>' +
                                    '<td>'+$('[name="pluginWay"]').next().find('input').val()+'<input type="hidden" value="'+$('[name="pluginWay"]').val()+'" name="pluginWays"></td>' +
                                    '<td>'+$('[name="description"]').val()+'<input type="hidden" value="'+$('[name="description"]').val()+'" name="descriptions"></td>' +
                                    '<td>' +
                                    '<input type="hidden" name="isGlobals" value="'+$('[name="isGlobal"]:checked').val()+'">' +
                                    '<input type="hidden" name="businessLogicId" value="'+$('[name="businessLogicId"]').val()+'">' +
                                    '<input type="hidden" name="theIncrease" value="'+$('#theIncrease').val()+'"><a href="javascript:void(0)" class="dataCid" style="cursor:pointer;margin-right: 5px;color: #2b7fe0" data-Cid="1">编辑</a>' +
                                    '<a href="javascript:void(0)" style="color:#2b7fe0;margin-right: 5px;" data-dele="1">删除</a><label style="font-size: 12px">' +
                                    '<input name="startThe" type="checkbox" '+function () {
                                        if(num) {
                                            return 'checked';
                                        }
                                    }()+'>启用</label></td>' +
                                    '</tr>'
                                $('#thetriggersTwo').append(stringTwo);
                                layer.close(index)
                            })
                        }
                    },
                    btn2:function (index) {
                        layer.close(index)
                    },
                    success:function () {
                        $('[name="actived"]').each(function (i,n) {
                            if($(this).val()==obj.startThe){
                                $(this).prop('checked',true);
                                return false;
                            }
                        })


                        $('[name="isGlobal"]').each(function (i,n) {
                            if($(this).val()==obj.isGlobal){
                                $(this).prop('checked',true);
                                return false;
                            }
                        })





                            var stringthree='<option value="">请选择</option>'
                            for(var b=0;b<theTriggers.length;b++){
                                if(theTriggers[b].hid==obj.businessLogicId) {

                                    stringthree += '<option value="' + theTriggers[b].hid + '" selected>' + theTriggers[b].hname + '</option>'
                                }else {
                                    stringthree += '<option value="' + theTriggers[b].hid + '">' + theTriggers[b].hname + '</option>'
                                }
                            }
                            $('#candidatesPoneTwo').find('[name="businessLogicId"]').html(stringthree)





                        var stringchufa='<option value="">请选择</option>'
                        for(var i=0;i<theTriggerchufatwo.length;i++){
                                if(theTriggerchufatwo[i].flowPluginId==obj.plugin){
                                    stringchufa+='<option value="'+theTriggerchufatwo[i].flowPluginId+'" selected>'+theTriggerchufatwo[i].flowPluginName+'</option>'
                                }else {

                                    stringchufa += '<option value="' + theTriggerchufatwo[i].flowPluginId + '">' + theTriggerchufatwo[i].flowPluginName + '</option>'
                                }
                        }
                        $('#pluginWaythree').find('[name="plugin"]').html(stringchufa)

                        $('[name="pluginType"] option').each(function (i,n) {
                            if($(this).val()==obj.pluginTypes){
                                $(this).attr('selected',true)
                            }
                        })

                        $('[name="pluginWay"] option').each(function (i,n) {
                            if($(this).val()==obj.pluginWays){
                                $(this).attr('selected',true)
                            }
                        })



                        form.render()

                    }
                })

            }
        }
        newtheTrigger.init();


        $('#theTrigger').click(function () {
            var str=''
            if(theTrigger!=undefined){
                for(var i=0;i<theTrigger.length;i++){
                    str+='<tr>' +
                            '<td>'+theTrigger[i].pluginTypeName+'<input type="hidden" value="'+theTrigger[i].pluginType+'" name="pluginTypes"></td>' +
                            '<td>'+theTrigger[i].sortId+'<input type="hidden" value="'+theTrigger[i].sortId+'" name="sortIds"></td>' +
                            '<td>'+theTrigger[i].name+'<input type="hidden" value="'+theTrigger[i].name+'" name="namelllss"></td>' +
                            '<td>'+function(){
                            if(theTrigger[i].pluginName==undefined){
                                return ''
                            }else {
                                return theTrigger[i].pluginName
                            }
                        }()+'<input type="hidden" value="'+theTrigger[i].plugin+'"></td>' +
                            '<td>'+theTrigger[i].pluginWayName+'<input type="hidden" value="'+theTrigger[i].pluginWay+'" name="pluginWays"></td>' +
                            '<td>'+theTrigger[i].description+'<input type="hidden" value="'+theTrigger[i].description+'" name="descriptions"></td>' +
                            '<td><input type="hidden" name="businessLogicId" value="'+theTrigger[i].businessLogicId+'"><input type="hidden" name="theIncrease" value="'+theTrigger[i].id+'">' +
                        '<input type="hidden" name="isGlobals" value="'+theTrigger[i].isGlobal+'"><a href="javascript:void(0)" class="dataCid" style="margin-right: 5px;cursor:pointer;color: #2b7fe0" data-Cid="1">编辑</a>' +
                            '<a href="javascript:void(0)" style="color:#2b7fe0;margin-right: 5px;" data-dele="1">删除</a>' +
                        '<label><input name="startThe" type="checkbox" '+function () {
                                if(theTrigger[i].actived==1){
                                    return 'checked'
                                }
                        }()+'>启用</label>' +
                        '</tr>'
                }
            }

            layer.open({
                type:0,
                title:'管理触发器',
                content:'<div class="bottomstepstwoss" style="height: 460px">\
            <ul class="candidatesUl" style="display: block;border: none;background: #fff">\
                <li>\
                     <p class="candidatesPone">管理触发器 <label style="cursor: pointer"  class="newtheTrigger dataCid" data-Cid="0">新建触发器</label></p> \
                     <div class="candidatesPTwo" style="border: none;margin-bottom: 20px;width: 91%">\
                         <table>\
                          <thead>\
                                    <tr>\
                                        <th width="10%">触发节点</th>\
                                        <th width="10%">排序号</th>\
                                        <th width="15%">名称</th>\
                                        <th width="15%">执行插件</th>\
                                        <th width="15%">执行方式</th>\
                                        <th width="15%">触发器描述</th>\
                                        <th width="20%">操作</th>\
                                    </tr>\
                                </thead>\
                                <tbody id="thetriggersTwo">'+str+' </tbody>\
                         </table>\
                     </div>\
                    <p class="candidatesPTwo" style="color: red;font-size: 12px;margin-top: 5px;border: none;">说明：列表中按照 【新建操作】->【接收操作】->【保存操作】->【转交操作】->【委托操作】->【退回操作】 的顺序呈现\
            同时，同一触发节点通过 [排序号] 控制触发顺序</p>\
                </li>\
            </ul>\
            </div>',
                area:['900px','600px'],
                btn:['确定','关闭'],
                yes:function (index) {
                    $('.setUpThe').removeClass('active')
                layer.close(index);

                },
                btn2:function () {
                    $('.setUpThe').removeClass('active')
                }
            })
        })
        $(document).delegate('[data-dele="1"]','click',function () {
            var me=this;
            $.get('/tigger/deleteTigger',{'id':$(this).siblings('[name="theIncrease"]').val()},function (json) {
                $(me).parent().parent().remove()
                alert('删除成功')
            },'json')
        })

        var canWriteField={//字段权限设置
            obj:{},
            init:function () {
                var me=this;
                $(document).delegate('.canWriteFields','click',function () {
                    me.openAlert()
                })
                $(document).delegate('.bottomsteptwos','click',function () {
                    me.bottomsteptwo(this);
                })
            },
            openAlert:function () {
                var str='';
                var arr=[
                    {'standard':'督办工作内容及完成标准','name':'111'},
                    {'standard':'责任部门','name':'111'},
                    {'standard':'	完成时间','name':'111'},
                    {'standard':'督办工作完成情况','name':'111'},
                    {'standard':'验证结果','name':'111'},
                ]
                for(var i=0;i<arr.length;i++){
                    str+='<tr>\
                              <td width="35%">'+arr[i].standard+'</td>\
                              <td width="75%">\
                                      <input type="checkbox" title="保密模式" lay-skin="primary">\
                                       <input type="checkbox" title="只读模式" lay-skin="primary">\
                                      <input type="checkbox" title="删除模式" lay-skin="primary">\
                               </td>\
                        </tr>'
                }
                layer.open({
                    type:1,
                    title:'字段权限设置',
                    content:'<div class="bottomstepstwoss layui-form" style="height: 300px">\
            <ul class="candidatesUl" style="display: block;border: none;padding-left: 7%;background: #fff">\
                <li>\
                 <p class="candidatesPTwo" style="border: none;margin-bottom: 20px;width: 92%;margin-top: 36px;">\
                    <table>\
                                <tbody>'+str+'</tbody>\
                      </table>\
                 </p>\
                </li>\
            </ul></div>',
                    area:['600px','400px'],
                    btn:['确定','关闭'],
                    yes:function () {

                    },
                    success:function () {
                        form.render()
                    }
                })
            },
            bottomsteptwo:function (me) {
                if(alertData==undefined){
                    $.layerMsg({content:'正在保存表单，即将刷新！',icon:2},function(){
                        location.reload()
                    });

                }
                var str='';

                for(var i=0;i<alertData.length;i++){
                        str += '<input type="checkbox" title="' + alertData[i].title + '" value="' + alertData[i].title + '">'
                }

                layer.open({
                    type:1,
                    title:'本步骤可写字段',
                    content:'<div class="bottomstepstwo layui-form" style="margin: 10px ;"><div class="divAllData">' +
                    ''+function () {
                       if(trueFile==1){
                           return '<input type="checkbox" title="流程公共附件" value="[A@]">'
                       }else {
                           return ''
                       }
                    }()+''+str+'' +
                    '<input type="checkbox" title="工作名称/文号" value="[B@]"></div>' +
                    '<div id="checkAll" style="margin-top: 15px;"><span><input type="checkbox" title="全选"></span></div>'+
                    '</div>' ,
                    area:['400px','300px'],
                    btn:['确定','关闭'],
                    yes:function (index) {
                        var strs='';
                        var strTwo='';
                        var obj=$('.bottomstepstwo .divAllData input[type=checkbox]:checked');
                        obj.each(function (i,n) {
                            if(i<obj.length-1){
                                strs+=$(this).val()+','
                            }else {
                                strs+=$(this).val();
                            }
                            strTwo+='<li>('+(i+1)+')'+$(this).next().find('span').text()+'</li>'
                        })
                        $(me).nextAll('input').val(strs);
                        $(me).prev().html(strTwo)
                        layer.close(index)
                    },
                    success:function () {
                        var prcsItemNum=$('[name="prcsItem"]').val();
                        if(prcsItemNum!=''){
                            var prcsItemArrs=prcsItemNum.split(',')
                            var prcsItemArrsTwo=$('.divAllData input[type=checkbox]');
                            for(var i=0;i<prcsItemArrsTwo.length;i++){
                                for(var n=0;n<prcsItemArrs.length;n++){
                                    if($(prcsItemArrsTwo[i]).val()==prcsItemArrs[n]){
                                        $(prcsItemArrsTwo[i]).attr('checked',true)
                                    }
                                }
                            }
                        }

                        form.render();
                    }
                })

            }
        }
        canWriteField.init()
        $(document).delegate('.qingkongs','click',function () {
            $(this).siblings('input').val('')
            $(this).siblings('ul').html('')
        })
        $('.QKone').click(function () {
            $(this).siblings('input').val('')
            $(this).parent().prev().html('')
        })

        $('#canWriteField').click(function () {//可写字段


            layer.open({
                type:0,
                title:'编辑可写字段',
                content:' <form class="layui-form"><div class="bottomstepstwoss " style="height: 460px">\
            <ul class="candidatesUl" style="display: block;border: none;background:#fff">\
                <li>\
                     <p class="candidatesPone">本步骤可写字段</p> \
                     <div class="candidatesPTwoall" style="margin-bottom: 20px;position:relative">\
                         <ul id="prcsItem"></ul>\
                         <a href="javascript:;" class="bottomsteptwos" style="position:absolute;top:5px;right:105px;color:#2f8ae3">选择</a>\
                         <a href="javascript:viod(0)" style="position: absolute;top: 30px;right: 105px;color: #2f8ae3;" class="qingkongs">清空</a>\
                          <input type="hidden" name="prcsItem">\
                     </div>\
                </li>\
                <li>\
                     <p class="candidatesPone">列表控件模式</p> \
                     <div class="candidatesPTwo" style="border: none;margin-bottom: 20px;">\
                           <table>\
                                <thead>\
                                    <tr>\
                                        <th width="20%">列表名称</th>\
                                        <th width="60%">列表内容</th>\
                                        <th width="20%">字段权限 </th>\
                                    </tr>\
                                </thead>\
                                <tbody>\
                                </tbody>\
                           </table>\
                   </div>\
                </li>\
                <li>\
                     <p class="candidatesPone">附件上传控件权限（只针对office文档附件，其他格式不控制）</p> \
                     <div class="candidatesPTwo" style="border: none;margin-bottom: 20px;">\
                           <table id="fileUp">\
                                <thead>\
                                    <tr>\
                                        <th width="20%">附件名称</th>\
                                        <th width="80%">控件权限</th>\
                                    </tr>\
                                </thead>\
                                <tbody>\
                                </tbody>\
                           </table>\
                   </div>\
                </li>\
                <li>\
                     <p class="candidatesPone">图片上传控件权限</p> \
                     <div class="candidatesPTwo" style="border: none;margin-bottom: 20px;">\
                           <table id="tupianUp">\
                                <thead>\
                                    <tr>\
                                        <th width="30%">图片名称</th>\
                                        <th width="70%">图片控件权限</th>\
                                    </tr>\
                                </thead>\
                                <tbody>\
                                </tbody>\
                           </table>\
                   </div>\
                </li>\
                 <li>\
                     <p class="candidatesPone activeall" style="margin-bottom:-15px">公文正文权限设置</p> \
                     <div style="margin-top:15px">\
                       <input type="checkbox"  lay-filter="editdocumentEditPriv" title="编辑" '+function () {
                    if(canwritefieldtwo.documentEditPriv!=undefined){
                        if(canwritefieldtwo.documentEditPriv==0){
                            return ''
                        }else {
                            return 'checked'
                        }
                    }else {
                        return ''
                    }
                }()+' name="documentEditPriv">\
                     </div>\
                </li>\
                 <li style="display:none">\
                     <div style="margin-top:15px">\
                      <input type="checkbox" title="word保存" name="documentEditPrivDetail" value="1001">\
                      <input type="checkbox" title="套红" name="documentEditPrivDetail" value="1002">\
                      <input type="checkbox" title="留痕" name="documentEditPrivDetail" value="1003">\
                      <input type="checkbox" title="不留痕" name="documentEditPrivDetail" value="1004">\
                      <input type="checkbox" title="强制留痕" name="documentEditPrivDetail" value="1007">\
                     </div>\
                     <div style="margin-top:15px">\
                      <input type="checkbox" title="显示痕迹" name="documentEditPrivDetail" value="1005">\
                      <input type="checkbox" title="隐藏痕迹" name="documentEditPrivDetail" value="1006">\
                      <input type="checkbox" title="版式文件保存" name="documentEditPrivDetail" value="2001">\
                      <input type="checkbox" title="下载" name="documentEditPrivDetail" value="2002">\
                      <input type="checkbox" title="打印" name="documentEditPrivDetail" value="2003">\
                     </div>\
                     <div style="margin-top:15px">\
                        <input type="checkbox" title="删除" name="documentEditPrivDetail" value="2004">\
                     </div>\
                      <div style="margin-top:15px">\
                        <input type="checkbox" title="盖章" name="documentEditPrivDetail" value="2005">\
                        <input type="checkbox" title="手写" name="documentEditPrivDetail" value="2006">\
                        <input type="checkbox" title="上传word" name="documentEditPrivDetail" value="3001">\
                        <input type="checkbox" title="上传版式文件" name="documentEditPrivDetail" value="3002">\
                        <input type="checkbox" title="转换版式文件" name="documentEditPrivDetail" value="3003">\
                     </div>\
                </li>\
               <li>\
                     <p class="candidatesPone" style="font-weight:bold">其他设置项</p> \
                     <p class="candidatesPone">允许在不可写情况下自动赋值的宏控件</p> \
                     <div class="candidatesPTwoall" style="margin-bottom: 20px;position:relative">\
                         <ul></ul>\
                         <a href="javascript:;" class="bottomsteptwos" style="position:absolute;top:17px;right:105px;color:#2f8ae3">选择</a>\
                     </div>\
                </li>\
                <li>\
                     <p class="candidatesPone activeall" style="margin-bottom:-15px">公共附件中的Office文档详细权限设置</p> \
                     <div style="margin-top:15px">\
                       <input type="checkbox" title="新建权限" name="attachPriv" value="1">\
                       <input type="checkbox" title="编辑权限" name="attachPriv" value="2">\
                        <input type="checkbox" title="删除权限" name="attachPriv" value="3">\
                       <input type="checkbox" title="下载权限" name="attachPriv" value="4">\
                       <input type="checkbox" title="打印权限" name="attachPriv" value="5">\
                     </div>\
                </li>\
                <li>\
                     <p class="candidatesPone activeall" style="margin-bottom:-15px">是否允许本步骤经办人编辑附件</p> \
                     <div>\
                        <label class="canWriteFie"><input type="radio" title="允许" name="attachEditPriv" value="0"></label>\
                        <label class="canWriteFie"><input type="radio" checked="true" title="不允许" name="attachEditPriv" value="1"></label>\
                     </div>\
                </li>\
                <li>\
                     <p class="candidatesPone activeall" style="margin-bottom:-15px">是否允许本步骤办理人在线创建文档</p> \
                     <div>\
                        <label class="canWriteFie"><input type="radio" checked="true" title="允许" name="attachEditPrivOnline" value="0"></label>\
                         <label class="canWriteFie"><input type="radio" title="不允许" name="attachEditPrivOnline" value="1"></label>\
                      </div>\
                 </li>\
                  <li>\
                     <p class="candidatesPone activeall" style="margin-bottom:-15px">宏标记附件上传为图片时展示效果</p> \
                     <div>\
                        <label class="canWriteFie"><input type="radio" checked="true" title="显示图片" name="attachMacroMark" value="0"></label>\
                        <label class="canWriteFie"><input type="radio" title="显示图标和名称" name="attachMacroMark" value="1"></label>\
                     </div>\
                </li>\
            </ul>\
            </div></form>',
                area:['800px','600px'],
                btn:['确定','关闭'],
                yes:function (index) {
                    var obj={};
                    obj.prcsItem=$('[name="prcsItem"]').val();
                    obj.attachPriv='';
                    $('[name="attachPriv"]:checked').each(function (i,n) {
                        obj.attachPriv+=$(this).val()+','
                    })
                    obj.attachEditPriv=$('[name="attachEditPriv"]:checked').val()
                    obj.attachEditPrivOnline=$('[name="attachEditPrivOnline"]:checked').val()
                    obj.attachMacroMark=$('[name="attachMacroMark"]:checked').val()
                    if($('[name="documentEditPriv"]').is(':checked')){
                        obj.documentEditPriv=1;
                    }else {
                        obj.documentEditPriv=0;
                    }
                    obj.documentEditPrivDetail='';
                    $('[name="documentEditPrivDetail"]:checked').each(function (i,n) {
                        obj.documentEditPrivDetail+=$(this).val()+','
                    })

                    var str=JSON.stringify(obj)
                    $('.setUpThe').removeClass('active')
                    $('[name="prcsItemTwo"]').val(str);
                    var arrFileUp=[];
                    $('#fileUp tbody tr').each(function (i,n) {
                        var fileObj={};
                        fileObj['FILE_PRIV_'+$(this).find('input[type="hidden"]').val()+'']=[];
                        var fileObjArr=$(this).find('[name="fileuploadXiazai"]:checked');
                        for(var m=0;m<fileObjArr.length;m++){
                            fileObj['FILE_PRIV_'+$(this).find('input[type="hidden"]').val()+''].push(fileObjArr[m].value)
                        }
                        arrFileUp.push(fileObj)
                    })
                    $('[name="fileuploadPriv"]').val(JSON.stringify(arrFileUp));
                    var arrtupianUp=[];

                    $('#tupianUp tbody tr').each(function (i,n) {
                        var tupianObj={};
                        tupianObj['IMG_PRIV_'+$(this).find('input[type="hidden"]').val()+'']=[];
                        var tupianObjArr=$(this).find('[name="imguploadXiazai"]:checked');
                        for(var m=0;m<tupianObjArr.length;m++){
                            tupianObj['IMG_PRIV_'+$(this).find('input[type="hidden"]').val()+''].push(tupianObjArr[m].value)
                        }
                        arrtupianUp.push(tupianObj)
                    })
                    $('[name="imguploadPriv"]').val(JSON.stringify(arrtupianUp));
                layer.close(index)
                },
                btn2:function () {
                    $('.setUpThe').removeClass('active')
                },
                success:function () {
                    form.render();

                    if(alertData!=undefined){
                        var strshangchuan='';
                        var strfujian=''

                        for(var i=0;i<alertData.length;i++){
                            if(alertData[i].dataType=='imgupload'){
                                strshangchuan += '<tr>' +
                                    '<td>'+alertData[i].title+'<input type="hidden" value="'+alertData[i].name+'"></td>' +
                                    '<td>' +
                                    '<input type="checkbox" title="新建" name="imguploadXiazai" value="1">' +
                                    '<input type="checkbox" title="删除" name="imguploadXiazai" value="2">' +
                                    '<input type="checkbox" title="下载" name="imguploadXiazai" value="3">' +
                                    '</td>' +
                                    '</tr>'
                            }
                            if(alertData[i].dataType=='fileupload'){
                                strfujian += '<tr>' +
                                    '<td>'+alertData[i].title+'<input type="hidden" value="'+alertData[i].name+'"></td>' +
                                    '<td>' +
                                    '<input type="checkbox" title="新建" name="fileuploadXiazai" value="1">' +
                                    '<input type="checkbox" title="编辑" name="fileuploadXiazai" value="2">' +
                                    '<input type="checkbox" title="删除" name="fileuploadXiazai" value="3">' +
                                    '<input type="checkbox" title="下载" name="fileuploadXiazai" value="4">' +
                                    '<input type="checkbox" title="打印" name="fileuploadXiazai" value="5">' +
                                    '</td>' +
                                    '</tr>'
                            }
                        }
                        $('#tupianUp tbody').html(strshangchuan)
                        $('#fileUp tbody').html(strfujian)

                        var fileUpArr=$('#fileUp tbody tr');
                        if($('[name="fileuploadPriv"]').val()!='') {
                            var fileuploadPrivArr = JSON.parse($('[name="fileuploadPriv"]').val())
                            for (var i = 0; i < fileUpArr.length; i++) {
                                var fileUpArrTwo = $(fileUpArr[i]).find('[name="fileuploadXiazai"]');
                                for (var m = 0; m < fileUpArrTwo.length; m++) {
                                    for (var u = 0; u < fileuploadPrivArr.length; u++) {
                                        for (var key in  fileuploadPrivArr[i]) {
                                            for (var ml = 0; ml < fileuploadPrivArr[i][key].length; ml++) {
                                                if (fileUpArrTwo[m].value == fileuploadPrivArr[i][key][ml]) {
                                                    $(fileUpArrTwo[m]).prop('checked', true)
                                                }
                                            }
                                        }

                                    }

                                }

                            }
                        }


                        if($('[name="imguploadPriv"]').val()!='') {
                            var fileUpArr = $('#tupianUp tbody tr');
                            var fileuploadPrivArr = JSON.parse($('[name="imguploadPriv"]').val())
                            for (var i = 0; i < fileUpArr.length; i++) {
                                var fileUpArrTwo = $(fileUpArr[i]).find('[name="imguploadXiazai"]');
                                for (var m = 0; m < fileUpArrTwo.length; m++) {
                                    for (var u = 0; u < fileuploadPrivArr.length; u++) {
                                        for (var key in  fileuploadPrivArr[i]) {
                                            for (var ml = 0; ml < fileuploadPrivArr[i][key].length; ml++) {
                                                if (fileUpArrTwo[m].value == fileuploadPrivArr[i][key][ml]) {
                                                    $(fileUpArrTwo[m]).prop('checked', true)
                                                }
                                            }
                                        }

                                    }

                                }

                            }
                        }












                        form.render();

                    }











                    form.on('checkbox(editdocumentEditPriv)', function(data){
                        if(data.elem.checked){
                            $(data.elem).parent().parent().next().show()
                        }else {
                            $(data.elem).parent().parent().next().hide()
                        }

                    });

                    if($('[name="documentEditPriv"]').is(':checked')){
                        $('[name="documentEditPriv"]').parent().parent().next().show()
                    }



                    if(canwritefieldtwo==undefined){
                        $.layerMsg({content:'正在保存表单，即将刷新！',icon:2},function(){
                            location.reload()
                        });
                    }
                    inputTheEcho('prcsItem',canwritefieldtwo.prcsItem)
                    ulTheEcho('prcsItem',canwritefieldtwo.prcsItem)
                    radioTheEcho('attachEditPriv',canwritefieldtwo.attachEditPriv)
                    radioTheEcho('attachEditPrivOnline',canwritefieldtwo.attachEditPrivOnline)
                    radioTheEcho('attachMacroMark',canwritefieldtwo.attachMacroMark)
                    checkboxTheEcho('attachPriv',canwritefieldtwo.attachPriv)
                    checkboxTheEcho('documentEditPrivDetail',canwritefieldtwo.documentEditPrivDetail)



                }
            })

        })
        
        
        
        $('.btnTime').click(function () {
            var me=this;
            layer.open({
                type:0,
                title:'编辑可写字段',
                content:' <form class="layui-form"><div class="bottomstepstwoss " style="height: 150px">\
            <ul class="candidatesUl" style="display: block;border: none;background:#fff">\
                <li>\
                     <p class="candidatesPone activeall" style="margin-bottom:-15px">请选择办理时限类型</p> \
                     <div style="margin-top:15px">\
                       <input type="radio" title="小时" name="timetype" value="hour">\
                       <input type="radio" title="天" name="timetype" value="day">\
                     </div>\
                </li>\
            </ul>\
            </div></form>',
                area:['400px','300px'],
                btn:['确定','关闭'],
                yes:function (index) {
                    $(me).attr('data-type',$('[name="timetype"]:checked').val())
                    $(me).html($('[name="timetype"]:checked').attr('title'))
                    layer.close(index)
                },
                success:function () {
                    form.render();
                }
            })
        })
    });
})
