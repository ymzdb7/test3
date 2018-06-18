/**
 * Created by ASUS on 2017/5/24.
 */

var flowDesign;
var formTwo;
var boolean=false;
var dataToAll;//全部数据
var theTrigger;//触发器
var jsondata = {
    "title": "",
    "nodes": {},
    "lines": {},
    "areas": {},
    "initNum": 0
}
var alertData;//条件设置字段
var flowidurl=window.location.href;
var flowstr=GetRequest().flowId
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














$(function () {
    // var fromIdtwo = 17;






    var $width=$('body').width();
    var $height=parseInt(document.documentElement.clientHeight||document.body.offsetHeight);
    var property = {//绘图初始化定义
        width: $width,
        height: $height,
        haveGroup: true,
        useOperStack: true
    };
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


                    var strtitles='';



                    designdata.forEach(function (v, i) {

                        jsondata.nodes['node_' + v.prcsId] = {
                            designerId:v.id,
                            name: v.prcsName,
                            left: v.setLeft,
                            type: v.setType,
                            top: v.setTop
                        }

                        strtitles+='<tr>' +
                            '<td align="center" style="border-right: 1px solid #c0c0c0;">'+v.prcsId+'</td>' +
                            '<td align="center" style="border-right: 1px solid #c0c0c0;">'+v.prcsName+'</td>' +
                            '<td align="center">'+function(){
                                if(v.prcsTo=='0,'){
                                    return '结束'
                                }else {
                                    return '→'+v.prcsTo;
                                }
                            }()+'</td>' +
                            '</tr>'

                    });

                    $('#flowDesignTableTwo table tbody').html(strtitles)
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






                flowDesign.loadData(jsondata);

            }
        });
    }

    flowDesign = $.createGooFlow($("#flowDesignTable"), property);

    ajaxSvg()
})
