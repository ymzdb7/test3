/**
 * 作者: 张航宁
 * 日期: 2017/9/26
 * 说明: 主页显示限时待办
 */
$(function () {
    $.ajax({
        url: "/document/selectTimeOutDoc",
        type: "get",
        dataType: "json",
        success: function (res) {
            var obj = res.datas;
            if (obj.length > 0) {
                var str = "";
                for (var i = 0; i < obj.length; i++) {
                    str += '<tr>' +
                        '<td>' + function () {
                            if (obj[i].documentType == "0") {
                                return "发文"
                            } else if (obj[i].documentType == "1") {
                                return "收文"
                            }
                        }() + '</td>' +
                        '<td>' + obj[i].title + '</td>' +
                        '<td>' + obj[i].createrName + '</td>' +
                        '<td>' +
                        '<p style="' + function () {
                            if (obj[i].ifOutTime != undefined && obj[i].ifOutTime == true) {
                                return "color:red";
                            } else {
                                return "color:green";
                            }
                        }() + '">' + function () {
                            if (obj[i].timeOutStr != undefined && obj[i].timeOutStr != 'undefined') {
                                return obj[i].timeOutStr;
                            } else {
                                return ""
                            }
                        }() + '</p></td>' +
                        '<td>' +
                        '<a href="/workflow/work/workform?flowId=' + obj[i].flowId + '&prcsId=' + obj[i].realPrcsId + '&flowStep=' + obj[i].step
                        + '&runId=' + obj[i].runId + '&tabId=' + obj[i].id + '&tableName=' + obj[i].tableName + '&isNomalType=false&hidden=true" target="_blank" style="margin-right: 10px">办理</a>' +
                        '</td>' +
                        '</tr>'
                }
                layer.open({
                    title: "限时待办工作",
                    type: 1,
                    skin: 'layui-layer-rim', //加上边框
                    area: ['600px', '400px'], //宽高
                    content: '<table style="width: 80%;margin-top: 10px" align="center">' +
                    '<thead><tr><td>类型</td><td>标题</td><td>发送人</td><td>时限</td><td>操作</td></tr>' +
                    '</thead>' +
                    str + '</table>'
                });
            }
        }
    })
});
