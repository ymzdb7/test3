/**
 * Created by 骆鹏 on 2017/7/12.
 */
var operateType = 0;
var firstCode = "";

function ajaxdata() {
    var str = ''
    $.get('/document/getRuleAll', function (json) {
        var arr = json.obj;
        for (var i = 0; i < arr.length; i++) {
            str += '<tr>' +
                '<td>' + (i + 1) + '<input type="hidden" value="' + arr[i].orderId + '"></td>' +
                '<td>' + arr[i].name + '</td>' +
                '<td>' + arr[i].code + '<input type="hidden" value="' + arr[i].digit + '"></td>' +
                '<td>' + arr[i].expression + '<input type="hidden" value="' + arr[i].expressionStr + '"></td>' +
                '<td>' + arr[i].description + '</td>' +
                '<td>' +
                '<a href="javascript:void (0)" class="preview">'+yulan+'</a>' +
                '<a href="javascript:void (0)" class="newsBtntwo" data-num="1">'+edit1+'</a>' +
                '<a href="javascript:void (0)" class="numAdminister" data-id="' + arr[i].id + '">'+bianhaoManage+'</a>' +
                '<a href="javascript:void (0)" class="delete">'+del+' <input type="hidden" value="' + arr[i].id + '"></a>' +
                '</td>' +
                '</tr>'
        }
        $('.mainBottom table tbody').html(str)
    }, 'json')
}

function checkCodeAjax(code, fn) {
    if (code != undefined && code != "undefined" && code != "") {
        $.get('/document/codeIfUse', {code: code}, function (res) {
            if (fn != undefined) {
                fn(res.flag)
            }
        }, 'json')
    } else {
        fn(false);
    }

}

function checkCode(code, fn) {
    if (operateType == 0) {
        checkCodeAjax(code, function (flag) {
            if (fn != undefined) {
                fn(flag)
            }
        });
    } else if (operateType == 1) {
        if (firstCode != undefined && code != undefined && firstCode != code) {
            checkCodeAjax(code, function (flag) {
                if (fn != undefined) {
                    fn(flag)
                }
            });
        }else{
            fn(true);
        }
    }
}


$(function () {

    ajaxdata();

    $('.mainBottom').delegate('.delete', 'click', function () {
        var me = this;
        $.layerConfirm({title: queding, content: qued, icon: 0}, function () {
            $.post('/document/deleteRule',
                {'id': $(me).parent().parent().find('td').eq(5).find('[type="hidden"]').val()},
                function (json) {
                    if (json.flag) {
                        $.layerMsg({content: delc, icon: 1}, function () {
                            ajaxdata()
                        });
                    } else {
                        $.layerMsg({content: json.msg, icon: 2})
                    }
                }, 'json')
        })

    });

    $('.mainBottom').delegate('.numAdminister', 'click', function () {
        parent.iframesHref('/workflow/work/numberingAdminister?id=' + $(this).attr('data-id'))
    })

    $('.mainBottom').delegate('.preview', 'click', function () {
        var me = this;
        layer.open({
            title: yulan,
            btn:[sure],
            area: ['800px', '250px'],
            content: '<div class="inputlayout" style="height: 106px;">' +
            '<ul>' +
            '<li class="clearfix">' +
            '<label>'+gui+'</label><input type="text" disabled value="' + $(me).parent().parent().find('td').eq(3).text() + '"></li>' +
            '<li class="clearfix">' +
            '<label>'+jiexi+'</label><input type="text" disabled value="' + $(me).parent().parent().find('td').eq(3).find('[type="hidden"]').val() + '"></li>' +
            '</ul></div>'
        })
    })


    $(document).delegate('.newsBtntwo', 'click', function () {

        var str = '';
        var url = '';

        var obj = {};
        if ($(this).attr('data-num') == 0) {
            str = xinjian;
            obj.orderId = '';
            obj.name = '';
            obj.expression = '';
            obj.digit = '';
            obj.code = '';
            obj.description = '';
            url = '/document/saveRule';
            operateType = 0;
            firstCode = "";
        } else if ($(this).attr('data-num') == 1) {
            str = edit2;
            url = '/document/updateRule';
            obj.orderId = $(this).parent().parent().find('td').eq(0).find('[type="hidden"]').val();
            obj.name = $(this).parent().parent().find('td').eq(1).text();
            obj.expression = $(this).parent().parent().find('td').eq(3).text();
            obj.digit = $(this).parent().parent().find('td').eq(2).find('[type="hidden"]').val();
            obj.code = $(this).parent().parent().find('td').eq(2).text();
            obj.description = $(this).parent().parent().find('td').eq(4).text();
            obj.id = $(this).parent().parent().find('td').eq(5).find('[type="hidden"]').val();
            operateType = 1;
            firstCode = obj.code;
        }
        layer.open({
            title: str,
            area: ['800px', '500px'],
            content: '<form id="saveRule" action="' + url + '"><input type="hidden" name="id" value="' + obj.id + '"><div class="inputlayout">' +
            '<ul>' +
            '<li class="clearfix">' +
            '<label>'+xuhao+' ：</label><input type="text" name="orderId" value="' + obj.orderId + '">' +
            '</li>' +
            '<li class="clearfix">' +
            '<label>'+mingcheng+' ：</label><input type="text" name="name" value="' + obj.name + '">' +
            '</li>' +
            '<li class="clearfix">' +
            '<label>'+guize+' ：</label><textarea name="expression"  value="' + obj.expression + '">' + obj.expression + '</textarea>' +
            '<p style="float: left;padding-left: 180px;color: red;padding-right: 182px;">' +
            ''+biaoda+':<br>[YY]'+year+',<br>[ALL_YY]'+allYear+',<br>[DATE]'+day+',<br>[DATE_TIME]'+allDay+'' +
            ',<br>[H_MOS]'+dayNo+'(01，02),<br>[H_MO]'+dayNo+'(1,2),<br>[MONTHS]'+month+'(01,02)' +
            ',<br>[MONTH]'+month+'(1,2),<br>[COUNTER]'+daibiaoCoun+'</p>' +
            '</li>' +
            '<li class="clearfix">' +
            '<label>'+count+' ：</label><input type="text" name="digit" maxlength="4" value="' + obj.digit + '">' +
            '</li>' +
            '<li class="clearfix">' +
            '<label>'+only+' ：</label><input type="text" name="code" value="' + obj.code + '">' +
            '</li>' +
            '<li class="clearfix">' +
            '<label>'+sprition+' ：</label><textarea name="description" value="' + obj.description + '">' + obj.description + '</textarea>' +
            '</li>' +
            '</ul>' +
            '</div></form>',
            success: function () {
                $("#saveRule").on('blur', 'input[name="code"]', function () {
                    checkCode($(this).val(), function (flag) {
                        if (!flag) {
                            $("#saveRule input[name=code]").css("border-color", "red");
                        } else {
                            $("#saveRule input[name=code]").css("border-color", "#2f8fed");
                        }
                    });
                })
            },
            btn: [sure, cancel],
            yes: function (index) {
                checkCode($("#saveRule input[name=code]").val(), function (flag) {
                    if (!flag) {
                        $("#saveRule input[name=code]").css("border-color", "red");
                    } else {
                        $("#saveRule input[name=code]").css("border-color", "#2f8fed");
                        $('#saveRule').ajaxSubmit({
                            type: 'post',
                            dataType: 'json',
                            success: function (json) {
                                if (json.flag) {
                                    $.layerMsg({content: save, icon: 1}, function () {
                                        ajaxdata();
                                    })
                                } else {
                                    $.layerMsg({content: json.msg, icon: 2})
                                }
                            }
                        })
                    }
                })
            }
        })
    })
})