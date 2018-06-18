$.extend({
    tabRolling: function (num) {
        return new TabRoll(num);
    }
});
function getMenu(fn) {
    $.get('/getMenu', function (json) {
        if (json.flag) {
            var stringGetMenus = '';
            for (var i = 0; i < json.obj.length; i++) {
                stringGetMenus += '<a href="javascript:void(0)" onclick="getMenuOpen(this)"  menu_tid="' + json.obj[i].id + '" data-url="' + json.obj[i].url + '"><div class="apply_every_logo">' +
                    '<img src="img/main_img/app/' + json.obj[i].id + '.png">' +
                    '<h2 style="color: #666">' + json.obj[i].name + '</h2>' +
                    '</div></a>'
            }
            $('.apply_all').html(stringGetMenus)
            if(fn!=undefined){
                fn()
            }
        }
    }, 'json')
}


function TabRoll(num){
    this.tabArr=[];
    this.index=null;
    this.timer=null;
    this.status=true;
    this.num=num;
    var modo=this;
    $('#f_0 .cont_main').hover(function () {
        modo.status=false;
        if(modo.timer!=null){
            clearTimeout(modo.timer);
            modo.timer=null;
        }
    },function () {
        modo.status=true;
        modo.init();

    })
    this.init=function () {
        var me=this;
        me.timer=setTimeout(function () {
            if(me.status) {
                me.tabArr = $('#f_0 .header ul li');
                for (var i = 0; i < me.tabArr.length; i++) {
                    if ($(me.tabArr[i]).find('span').hasClass('active')) {
                        me.index = i;
                        $(me.tabArr[i]).find('span').removeClass('active');
                        break;
                    }
                }
                $(me.tabArr[(function () {
                    if (me.index == me.tabArr.length - 1) {
                        return 0;
                    } else {
                        return me.index + 1;
                    }

                }())]).find('span').addClass('active');

                $('[data-tabId="' + $(me.tabArr[me.index]).attr('data-id') + '"]').fadeOut("slow", function () {
                    $('[data-tabId="' + $(me.tabArr[(function () {
                            if (me.index == me.tabArr.length - 1) {
                                return 0;
                            } else {
                                return me.index + 1;
                            }

                        }())]).attr('data-id') + '"]').css('z-index','0')
                    $('[data-tabId="' + $(me.tabArr[(function () {
                            if (me.index == me.tabArr.length - 1) {
                                return 0;
                            } else {
                                return me.index + 1;
                            }

                        }())]).attr('data-id') + '"]').fadeIn("slow", function () {
                        clearTimeout(me.timer);
                        me.timer=null;
                        me.init();
                    })
                })
            }
        }, me.num)
    }
}

$(function () {

    if($('[name="sessionType"]').val()=='theme7'){
        $('#contmain_1').find('iframe').prop('src','/intranetRed')
    }else if($('[name="sessionType"]').val()=='theme6'){
        $('#contmain_1').find('iframe').prop('src','/intranetBlue')
    }

    getMenu();

    $.get('/portals/selIndexPortals',function (json) {
        if(json.flag){
            var datas=json.obj;
            var str='';
            for(var i=0;i<datas.length;i++){
                if(datas[i].useFlag == '1') {

                    if (i == 0) {
                        str += ' <li data-id="' + datas[i].portalsId + '">\
                    <span class="head_title active">' + datas[i].portalName + '</span>\
                    </li>'
                    } else {
                        str += ' <li data-id="' + datas[i].portalsId + '">\
                    <span class="head_title">' + datas[i].portalName + '</span>\
                    </li>'
                    }
                    if (datas[i].portalType == 1) {
                        $('#f_0').append('<div class="main_2 cont_main" data-tabid="' + datas[i].portalsId + '"' +
                            'style="height: calc(100% - 45px); z-index: 0; display: none;">' +
                            '<iframe src="' + datas[i].portalLink + '" frameborder="0" style="width: 100%;height: 100%;"></iframe>' +
                            '</div>')
                    }
                }
            }
            $('.header ul').html(str);
            $('#f_0').find('[data-tabid="'+$($('.header ul li')[0]).attr('data-id')+'"]').show();
            if($($('.header ul li')[0]).attr('data-id')=='1'){
                $('#f_0').find('[data-tabid="1"]').css('z-index','0')
            }
            var num=json.object.slideShowTime;
            if(num!=0){
                 $.tabRolling(parseInt(num)*1000).init();
            }



        }
    },'json')
    var flag=true;
    $('#xianyin').on('click',function(){
        var kuan = document.documentElement.clientWidth||document.body.clientWidth;
        if(flag){
            $('#bottom_show_left').addClass('show_off_tag_bg');
            $('#bottom_hide_left').removeClass('show_off_tag_bg');
            $('#xianyin').removeClass('show_on2');
            $('#xianyin').addClass('show_on');
            $('.cont_left').hide();
            $('.cont_rig').css('width',kuan+'px');
            flag=false;
        }else{
            $('#xianyin').removeClass('show_on');
            $('#xianyin').addClass('show_on2');
            $('#bottom_hide_left').addClass('show_off_tag_bg');
            $('#bottom_show_left').removeClass('show_off_tag_bg');
            $('.cont_left').show();
            $('.cont_rig').css('width',kuan-212+'px');
            flag=true;
        }
    })
})

















