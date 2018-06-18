/**
 * Created by 骆鹏 on 2017/7/17.
 */
function GetRequest() {
    var url = location.search; //获取url中"?"符后的字串
    var theRequest = new Object();
    if (url.indexOf("?") != -1) {
        var str = url.substr(1);
        strs = str.split("&");
        for(var i = 0; i < strs.length; i ++) {
            theRequest[strs[i].split("=")[0]]=(strs[i].split("=")[1]);
        }
    }
    return theRequest;
}
var newlinebool=false;
var newnodebool=false;
var designdata=[];
function savemobile() {
    return;
}
var flowobj=GetRequest()//获取urlget参数
var flowstr=flowobj.flowId;
var numId={};

var numIds={};

$(function () {

    var $width=$('body').width();
    var $height=$(document).height()-60;
    var property = {//绘图初始化定义
        width: $width,
        height: $height,
        haveGroup: true,
        useOperStack: true
    };
    function ajaxsvg(flowstr,str) {
        $.ajax({
            type: 'get',
            url: str,
            dataType: 'json',
            data: function () {
               if(flowstr.showType==1){
                   return {'runId':flowstr.runId}
               } else {
                   return flowstr
               }
            }(),
            success: function (json) {
//                    获取数据并添加到流程设计器的插件中
                if (json.flag) {
                    var jsondata={
                        "title": "",
                        "nodes": {},
                        "lines": {},
                        "areas": {},
                        "initNum": 0
                    }
                    if(flowstr.showType==1){
                        var designdata=json.datas;
                        jsondata.title=json.datas[0].prcsName
                        jsondata.initNum=json.datas.length
                    }else {
                        var designdata = json.object.designdata;
                        var connections = json.object.connections;
                        var flowRunPrcsList = json.object.flowRunPrcsList;
                        jsondata.title = json.object.designdata[0].flowTypeModel.flowName;
                        jsondata.initNum = designdata.length;
                    }



                    parent.big(jsondata.title)

                    if(flowstr.showType==1){
                        parent.numOneHtml()
                    }else {
                        parent.numTwoHtml()
                    }

                        if(GetRequest().trueId==undefined) {
                          var numDateLeft=50;
                          var numDateTop=50;
                            designdata.forEach(function (v, i) {

                                jsondata.nodes['node_' + i] = {
                                    name: v.prcsName,
                                    left: function () {
                                        if(i<10){
                                            return numDateLeft+=150;
                                        }else if(i>=10&&i<=20){
                                            return numDateLeft-=150;
                                        }else if(i>=20&&i<=30){
                                            return numDateLeft+=150;
                                        }else if(i>=30&&i<=40){
                                            return numDateLeft-=150;
                                        }else if(i>=40&&i<=50){
                                            return numDateLeft+=150;
                                        }else if(i>=60&&i<=70){
                                            return numDateLeft-=150;
                                        }
                                    }(),
                                    type: 'chat',
                                    top: function () {
                                            if(i!=0) {
                                                if (i % 10 == 0) {
                                                    return numDateTop += 100;
                                                }else {
                                                    return numDateTop
                                                }
                                            }else {
                                                return numDateTop
                                            }
                                    }(),
                                    data: {
                                        prcsName: v.prcsName,
                                        opFlag: v.opFlag,
                                        prcsUserName:v.userName,
                                        prcsFlag: v.prcsFlag,
                                        arriveTime:v.arriveTime,
                                        handleTime:v.handleTime,
                                        createTime:v.createTime,
                                        deliverTime:v.deliverTime,
                                        prcsTime:v.prcsTime

                                    }
                                }
                            })


                            designdata.forEach(function (v, i) {
                                jsondata.lines['line_' + i] = {
                                    type: "sl",
                                    from: "node_" + (i),
                                    to: "node_" +(i+1) ,
                                    name: "",
                                    "M": 41.5,
                                    alt: true
                                }
                            });


                        }else {
                            designdata.forEach(function (v, i) {

                                jsondata.nodes['node_' + v.prcsId] = {
                                    designerId: v.id,
                                    name: v.prcsName,
                                    left: v.setLeft,
                                    type: v.setType,
                                    top: v.setTop,
                                    data: {
                                        prcsName: v.prcsName,
                                        prcsUserName: v.prcsUserName,

                                        createTime:v.createTime,
                                        prcsTime:v.prcsTime,
                                        deliverTime:v.deliverTime
                                    }
                                }
                            })


                            connections.forEach(function (v, i) {
                                jsondata.lines['line_' + i] = {
                                    type: "sl",
                                    from: "node_" + v.from,
                                    to: "node_" +v.to ,
                                    name: "",
                                    "M": 41.5,
                                    alt: true
                                }
                            });

                        }


                }
                flowDesign.onItemDel = function (id, type) {
                    return;
                };

                flowDesign.loadData(jsondata);
            }
        });
    }


    if(flowobj.trueId==undefined) {
        ajaxsvg({'runId': flowobj.rilwId, 'showType':1},'/flowProcess/getFlowRunPrecsAll')
    }else {
        ajaxsvg({"flowId": flowstr, 'runId': flowobj.rilwId,'userId': $.cookie('userId')},'/flowProcess/flowview')
    }



    // handleTime: v.handleTime,
    //     arriveTime:v.arriveTime









    flowDesign = $.createGooFlow($("#flowDesignTable"), property);//实例化绘图

})