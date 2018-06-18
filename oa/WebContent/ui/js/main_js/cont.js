/*document.write(" <script language=\"javascript\" src="\/com\/js/base/base.js \" > <\/script>"); */
if (!Function.prototype.bind) {//bind方法
    Function.prototype.bind = function (oThis) {
        if (typeof this !== "function") {
            throw new TypeError("Function.prototype.bind - what is trying to be bound is not callable");
        }
        var aArgs = Array.prototype.slice.call(arguments, 1),
            fToBind = this,
            fNOP = function () {},
            fBound = function () {
                return fToBind.apply(this instanceof fNOP && oThis
                        ? this
                        : oThis,
                    aArgs.concat(Array.prototype.slice.call(arguments)));
            };
        fNOP.prototype = this.prototype;
        fBound.prototype = new fNOP();
        return fBound;
    };
}
document.write("<script language=javascript src='js/base/base.js'></script>");
document.write("<script language=javascript src='js/base/base.js'></script>");
document.write("<script language=javascript src='js/jquery/jquery.cookie.js'></script>");
var gonggaostr='';
var tongzhistr='';
var str_litwo='';

//获取国际语言标志
var type = getCookie("language");

var no_Data="";
/*var main_schedule = "";
var main_network = "";
var email_th_news = "";
var ConferenceNotice = "";
var PleaseCheckMyMail = "";
var main_worklog = "";
var notice_title_notify = "";
var PublicSchoolAffairs = "";*/
if (type == 'zh_CN') {
    no_Data='暂无数据';
/*    main_schedule = '日程安排';
    main_network = '网络硬盘';
    email_th_news = '新闻';
    ConferenceNotice = '会议通知';
    PleaseCheckMyMail = '请查看我的邮件';
    main_worklog = '工作日志';
    notice_title_notify = '公告通知';
    PublicSchoolAffairs = '校务公开管理';*/
} else if (type == 'en_US') {
    no_Data='No data';
/*    main_schedule = 'Schedule';
    main_network = 'Network Disk';
    email_th_news = 'News';
    ConferenceNotice = 'Conference notice';
    PleaseCheckMyMail = 'Please check my mail';
    main_worklog = 'Work Log';
    notice_title_notify = 'Notice';
    PublicSchoolAffairs = 'Public administration of school affairs';*/
} else if (type == 'zh_TW') {
    no_Data='暫無數據';
   /* main_schedule = '日程安排';
    main_network = '網路硬碟';
    email_th_news = '新聞';
    ConferenceNotice = '會議通知';
    PleaseCheckMyMail = '請查看我的郵件';
    main_worklog = '工作日志';
    notice_title_notify = '公告通知';
    PublicSchoolAffairs = '校務公開管理';*/
} else {
    no_Data='暂无数据';
   /* main_schedule = '日程安排';
    main_network = '网络硬盘';
    email_th_news = '新闻';
    ConferenceNotice = '会议通知';
    PleaseCheckMyMail = '请查看我的邮件';
    main_worklog = '工作日志';
    notice_title_notify = '公告通知';
    PublicSchoolAffairs = '校务公开管理';*/
}

//当前日期日期计算
var now = null;
var  today_now=null;
function p(s) {
    return s < 10 ? '0' + s: s;
}

function urlHost(url) {
    document.location.href=url;
}

function tiaozhuan(that) {
    window.open($(that).attr('data-url'))
}
var myDate = new Date();
//获取当前年
var year=myDate.getFullYear();
//获取当前月
var month=myDate.getMonth()+1;
//获取当前日
var date=myDate.getDate();
var h=myDate.getHours();       //获取当前小时数(0-23)
var m=myDate.getMinutes();     //获取当前分钟数(0-59)
var s=myDate.getSeconds();

now=year+'-'+p(month)+"-"+p(date)+" "+p(h)+':'+p(m)+":"+p(s);
today_now=year+'-'+p(month)+"-"+p(date);
// 获取某个时间格式的时间戳
var timestamp2 = Date.parse(new Date(now));
timestamp2 = timestamp2 / 1000;//当前时间
/*console.log(now + "的时间戳为：" + timestamp2);*/
//今天时间
var	timestamp1= Date.parse(new Date(today_now));
timestamp1 = timestamp1 / 1000;//当前今天时间
//明天时间
var timestamp3=timestamp1+86400;
// 后天时间
var timestamp4=timestamp3+86400;

var mobileObj={//标签左右移动动画
    mobileWidth:null,
    mobileLiWidth:null,
    liNum:null,//能放几个
    liAllnum:null,//能移动多少个
    counters:0,//计数器
    ULLeft:0,//定位
    timer:null,
    timers:null,
    status:true,
    statusTwo:true,
    init:function () {
        this.mobileWidth=$('.main_title').width()
        this.mobileLiWidth=$('.main_title ul li').width();
        this.liNum=parseInt(this.mobileWidth/this.mobileLiWidth);
        var me=this;
        $('#leftSpan').click(function () {
            if(me.status){
                me.right()
            }

        })
        $('#rightSpan').click(function () {
            if(me.statusTwo){
                me.left()
            }

        })
    },
    left:function (fn) {
        if($('.main_title ul li').length<=this.liNum){
            return
        }
        this.liAllnum=$('.main_title ul li').length-this.liNum;
        if(this.counters==(this.liAllnum-1)){
            $('#rightSpan').hide()
        }
        if(this.counters==this.liAllnum){
            return
        }


        if($('.main_title ul li').length>this.liNum){
            $('#leftSpan').show()
        }
        this.statusTwo=false;

        this.timer = setTimeout(this.movestep.bind(this,fn), 100)
    },
    movestep:function (fn) {
        var me=this;
        me.timers = setInterval(function () {
            if (parseInt(String(me.ULLeft).replace(/-/,'')) < me.mobileLiWidth) {
                me.ULLeft--;
                var num=parseInt($('.main_title ul').css('left'));
                $('.main_title ul').css('left',--num);
            } else {
                clearInterval(me.timers);
                me.timers = null;
                me.ULLeft=0;
                me.counters++;
                me.statusTwo =true;
                if(fn!=undefined){
                    fn()
                }
            }
        }, 1)
    } ,
    right:function (fn) {
        if($('.main_title ul li').length<=this.liNum){
            $('#leftSpan').hide()
            $('#rightSpan').hide()
            fn()
            return
        }



        this.liAllnum=$('.main_title ul li').length-this.liNum;
        if(this.counters==1){
            $('#leftSpan').hide()
        }
        if(this.counters==0){
            return
        }
        if($('.main_title ul li').length>this.liNum){
            $('#rightSpan').show()
        }
        this.status=false;

        this.timer = setTimeout(this.movestepRight.bind(this, fn), 100)


    },
    movestepRight:function (fn) {
        var me=this;
        me.timers = setInterval(function () {
            if (me.ULLeft < me.mobileLiWidth) {
                me.ULLeft++;
                var num=parseInt($('.main_title ul').css('left'));
                $('.main_title ul').css('left',++num);
            } else {
                clearInterval(me.timers);
                me.timers = null;
                me.ULLeft=0;
                me.counters--;
                me.status=true;
                if(fn!=undefined){
                    fn();
                }
            }
        }, 1)
    }
}








var dataLoad={
    timer:null,
    status:true,
    init:function () {
        var me=this;
        this.timer=setInterval(function () {
            if(me.status){
                me.status=false;
                listTable(function () {
                    me.status=true;
                })
            }
        },120000)
    }
};



//全局函数

function ajaxdata() {
    return
}


function clickrenwu(id,el) {
    window.open('/sys/userDetails?uid='+id)
}

function listTable(fn) {   //待办
    $.get('/todoList/smsListByType',function (json) {
        if(json.flag){
            var email=json.data.email;
            var emaileStr='';
            var notify=json.data.notify;
            var notifyStr='';
            var workFlow=json.data.workFlow;
            var workFlowStr='';
            var news=json.data.newsList;
            var newsStr='';
            var documentObj = json.data.documentList;
            var documentStr = '';
            var toupiao=json.data.toupiao;
            var toupiaos='';
            $('#docunmentSeasethree').html(documentObj.length);
            if(documentObj.length==0){
                $('#documentToDoObj').hide()
            }else {
                for(var i=0;i<documentObj.length;i++){
                    documentStr+='<li onclick="windowOpenNew(this)" data-s="2" data-url="'+documentObj[i].remindUrl+'">' +
                        '<img  style="vertical-align: middle" src="'+documentObj[i].img+'" alt="">' +
                        '<span  class="windowopen" data-id="'+documentObj[i].qid+'" style="vertical-align: middle" title="'+documentObj[i].content+'"><b style="font-size: 14px;font-weight: bold;">主题：</b> '+function(){
                            if(documentObj[i].type=='doctment'){
                                return documentObj[i].content;
                            }else {
                                return documentObj[i].content;
                            }
                        }()+'</span>' +
                        '<span><label style="margin-right: 1em;" title="'+documentObj[i].userName+'">'+documentObj[i].userName+'</label>' +
                        '<label style="color: #999;width: 10em" title="'+documentObj[i].sendTimeStr+'">'+function(){
                            if(documentObj[i].type=='doctment'){
                                return documentObj[i].sendTimeStr.replace(/\s/g,'<b style="margin-left: 0.5em;"></b>')
                            }else {
                                return documentObj[i].sendTimeStr.replace(/\s/g,'<b style="margin-left: 0.5em;"></b>')
                            }
                        }()+'</label></span>' +
                        '</li>'
                }
                $('#documentToDoList').html(documentStr)
                $('#documentToDoObj').show()
            }
            for(var i=0;i<email.length;i++){
                emaileStr+='<li onclick="windowOpenNew(this)" data-s="1">' +
                    '<img  style="vertical-align: middle" src="'+email[i].img+'" alt="">' +
                    '<span  class="windowopen" data-id="'+email[i].qid+'" style="vertical-align: middle" title="'+email[i].content+'"><b style="font-size: 14px;font-weight: bold;">主题：</b> '+function(){
                        if(email[i].type=='willdo'){
                            return email[i].content
                        }else {
                            return email[i].content
                        }
                    }()+'</span>' +
                    '<span><label style="margin-right: 1em;" title="'+email[i].userName+'">'+email[i].userName+'</label>' +
                    '<label style="color: #999;width: 10em" title="'+email[i].sendTimeStr+'">'+function(){
                        if(email[i].type=='willdo'){
                            return email[i].sendTimeStr.replace(/\s/g,'<b style="margin-left: 0.5em;"></b>')
                        }else {
                            return email[i].sendTimeStr.replace(/\s/g,'<b style="margin-left: 0.5em;"></b>')
                        }
                    }()+'</label></span>' +
                    '</li>'
            }

            $('#userSease').html(email.length)
            $('#emailAll').html(emaileStr)
            if(email.length==0){
                $('#emailId').hide()
            }else {
                $('#emailId').show()
            }
            for(var n=0;n<notify.length;n++){
                notifyStr+='<li onclick="windowOpenNew(this)" data-s="3" data-qid="'+notify[n].qid+'">' +
                    '<img style="vertical-align: middle" src="'+notify[n].img+'" alt="">' +
                    '<span class="windowopen" data-id="'+notify[n].qid+'" style="vertical-align: middle" title="'+notify[n].content+'"><b style="font-size: 14px;font-weight: bold;">标题：</b> '+function(){
                        if(notify[n].type=='willdo'){
                            return notify[n].content
                        }else {
                            return notify[n].content
                        }
                    }()+'</span>' +
                    '<span><label style="margin-right: 1em;" title="'+notify[n].userName+'">'+notify[n].userName+'</label>' +
                    '<label style="color: #999;width: 10em" title="'+notify[n].sendTimeStr+'">'+function(){
                        if(notify[n].type=='willdo'){
                            return notify[n].sendTimeStr.replace(/\s/g,'<b style="margin-left: 0.5em;"></b>')
                        }else {
                            return notify[n].sendTimeStr.replace(/\s/g,'<b style="margin-left: 0.5em;"></b>')
                        }
                    }()+'</label></span>' +
                    '</li>'
            }
            $('#notifyAll').html(notifyStr)
            $('#userSeaseTwo').html(notify.length)
            for(var i=0;i<news.length;i++){
                newsStr+='<li onclick="windowOpenNew(this)" data-s="4" data-new="'+news[i].qid+'">'+
                    '<img  style="vertical-align: middle" src="img/main_img/theme3/newspaper.png" alt="">' +
                    '<span  class="windowopen" data-id="'+news[i].qid+'" style="vertical-align: middle" title="'+news[i].content+'"><b style="font-size: 14px;font-weight: bold;">标题：</b> '+function(){
                        if(news[i].type=='willdo'){
                            return news[i].content
                        }else {
                            return news[i].content
                        }
                    }()+'</span>' +
                    '<span><label style="margin-right: 1em;" title="'+news[i].userName+'">'+news[i].userName+'</label>' +
                    '<label style="color: #999;width: 10em" title="'+news[i].sendTimeStr+'">'+function(){
                        if(news[i].type=='willdo'){
                            return news[i].sendTimeStr.replace(/\s/g,'<b style="margin-left: 0.5em;"></b>')
                        }else {
                            return news[i].sendTimeStr.replace(/\s/g,'<b style="margin-left: 0.5em;"></b>')
                        }
                    }()+'</label></span>' +
                    '</li>'
            }
            $('#userSeasenew').html(news.length)
            $('#newsAll').html(newsStr)
            for(var m=0;m<workFlow.length;m++){
                workFlowStr+='<li onclick="windowOpenNew(this)" data-s="2" data-url="'+workFlow[m].remindUrl+'">' +
                    '<img style="vertical-align: middle" src="'+workFlow[m].img+'" alt="">' +
                    '<span class="windowopen" data-id="'+workFlow[m].uid+'" style="vertical-align: middle" title="'+workFlow[m].content+'"><b style="font-size: 14px;font-weight: bold;">标题：</b> '+function(){
                        if(workFlow[m].type=='willdo'){
                            return workFlow[m].content
                        }else {
                            return workFlow[m].content
                        }
                    }()+'</span>' +
                    '<span><label style="margin-right: 1em;" title="'+workFlow[m].userName+'">'+workFlow[m].userName+'</label>' +
                    '<label style="color: #999;width: 10em" title="'+workFlow[m].sendTimeStr+'">'+function(){
                        if(workFlow[m].type=='willdo'){
                            return workFlow[m].sendTimeStr.replace(/\s/g,'<b style="    margin-left: 0.5em;"></b>')

                        }else {
                            return workFlow[m].sendTimeStr.replace(/\s/g,'<b style="margin-left: 0.5em;"></b>')
                        }
                    }()+'</label></span>' +
                    '</li>'
            }

            $('#workFlowAll').html(workFlowStr)
            $('#userSeasethree').html(workFlow.length)
            //投票代办查询
            for(var m=0;m<toupiao.length;m++){
                toupiaos+='<li onclick="windowOpenNew(this)" data-s="11" data-url="'+toupiao[m].remindUrl+'">' +
                    '<img style="vertical-align: middle" src="'+toupiao[m].img+'" alt="">' +
                    '<span class="windowopen" data-id="'+toupiao[m].qid+'" style="vertical-align: middle" title="'+toupiao[m].content+'"><b style="font-size: 14px;font-weight: bold;">标题：</b> '+function(){
                        if(toupiao[m].type=='toupiao'){
                            return toupiao[m].content
                        }else {
                            return toupiao[m].content
                        }
                    }()+'</span>' +
                    '<span><label style="margin-right: 1em;" title="'+toupiao[m].userName+'">'+toupiao[m].userName+'</label>' +
                    '<label style="color: #999;width: 10em" title="'+toupiao[m].sendTimeStr+'">'+function(){
                        if(toupiao[m].type=='toupiao'){
                            return toupiao[m].sendTimeStr.replace(/\s/g,'<b style="    margin-left: 0.5em;"></b>')

                        }else {
                            return toupiao[m].sendTimeStr.replace(/\s/g,'<b style="margin-left: 0.5em;"></b>')
                        }
                    }()+'</label></span>' +
                    '</li>'
            }
            $('#toupiaourl').html(toupiaos)
            $('#toupiao1').html(toupiao.length)
            if(toupiao.length==0){
                $('#toupiao').hide()
            }else {
                $('#toupiao').show()
            }
            var he = parseInt($('#toupiao1').text()) + parseInt($('#docunmentSeasethree').text()) + parseInt($('#userSeasethree').text()) + parseInt($('#userSeaseTwo').text()) + parseInt($('#userSeasenew').text()) + parseInt($('#userSease').text());
            if(he >= 100){
                he = '99+';
            }
            $('#sns').html('<div class="he">'+ he +'</div>');
            if(he==0){
                $('#sns .he').hide()
            }else {
                $('#sns .he').show()
            }
            if(typeof fn=='function'){
                fn()
            }
        }
    },'json')
}



function schedule(me){//日程接口
    if($(me).attr('data-url')=='/schedule/getAllschedule') {
        var obj = {userId: $.cookie('userId')}
    }else if($(me).attr('data-url')=='/schedule/getscheduleByDay'){
        var obj = {
            userId: $.cookie('userId')
        }
        if($(me).attr('data-schedule')==1){
            obj.time=timestamp1
        }else if($(me).attr('data-schedule')==2){
            obj.time=timestamp3
        }else {
            obj.time=timestamp4
        }
    }

    $.ajax({
        url: $(me).attr('data-url'),
        type: 'get',
        data:obj,
        dataType: 'json',
        success: function (obj) {
            if(obj.flag) {
                var data = obj.obj;
                var li = '';
                for (var i = 0; i < data.length; i++) {
                    li += '<li class="chedule_li" onclick="getMenuOpen(this)" menu_tid="0124" data-url="calendar">' +
                        '<h2 style="display: none">日程安排</h2><div style="margin-left:12px;"><img src="img/data_point.png"></div><div class="richeng_title r_title">' + data[i].content + '</div><div class="richeng_time" style="float: right; color: #919191;">' + data[i].stim.replace(/\s/g, '<i style="margin-right: 10px"></i>') + ' -- ' + data[i].etim.replace(/\s/g, '<i style="margin-right: 10px"></i>') + '</div></li>'
                }

                $('.chedule_all').html(li);
                if(obj.obj.length==0) {
                    var lis = '<li class="no_notice" style="text-align: center;border: none;">' +
                        '<img style="margin-top: 62px;"  src="/img/main_img/shouyekong.png" alt="">' +
                        '<h2 style="text-align: center;color: #666;">'+no_Data+'</h2>' +
                        '</li>';
                    $('.chedule_all').html(lis);
                }
            }

        }
    });
}

function windowOpenNew(me) {
    if($(me).attr('data-s')==1){
        window.open('/email/details?id='+$(me).find('.windowopen').attr('data-id'))
    }else if($(me).attr('data-s')==2){
        var objGet=$(me).attr('data-url');
        window.open(objGet)
        $(me).remove();
    }else if($(me).attr('data-s')==3){
        window.open('/notice/detail?notifyId='+$(me).attr('data-qid'))
    }else if($(me).attr('data-s')==4){
        window.open('/news/detail?newsId='+$(me).attr('data-new'))
    }else {
        window.open($(me).attr('data-url'))
    }


    if($('.daiban').find('li').length==0) {
        var lis = '<li class="no_notice" style="text-align: center;border: none;">' +
            '<img style="margin-top: 62px;"  src="/img/main_img/shouyekong.png" alt="">' +
            '<h2 style="text-align: center;color: #666;">'+no_Data+'</h2>' +
            '</li>';
        $('.daiban').html(lis);
    }
}
function announcement(me){  //公告查询方法
    var obj={
        read:'',
        page:1,
        pageSize:6,
        useFlag:'true',
        typeId:$(me).attr('data-bool')
    };
    // console.log(obj)
    $.ajax({
        url:"notice/notifyManage",
        type:'get',
        data:obj,
        dataType:'json',
        success:function(obj) {

            var data = obj.obj;
            /*console.log(data);*/
            var str_li = '';
            var notice_li = '';
            for (var i = 0; i < data.length; i++) {
                var strnbsp = function(){
                    if(data[i].notifyDateTime!=undefined){
                        return data[i].notifyDateTime.replace(/\s/g, '<i style="margin-right: 10px"></i>')
                    }else {
                        return ''
                    }
                }()
                /*var time=data[i].notifyDateTime.slice(0,10);*/
                /*console.log(time);*/
                str_li += '<li onclick="tiaozhuan(this)" data-url="/notice/detail?notifyId=' + data[i].notifyId + '"><div class="n_img"><img src="'+function () {
                        if(data[i].users.avatar==0){
                            return '/img/user/boy.png'
                        }
                        else if(data[i].users.avatar==1){
                            return '/img/user/girl.png'
                        }else {
                            return '/img/user/'+data[i].users.avatar
                        }
                    }()+'"></div><div class="n_word">' +
                    '<h1 class="n_name">' + data[i].name + '</h1><h3 class="n_time">' +
                    '<p>' + strnbsp + '</p>' +
                    '</h3><a href="javascript:;"  style="color:#000;" class="public_title" target="_blank"><h2 class="n_title" data-tid="' + data[i].notifyId + '">' + data[i].subject + '</h2></a>' +
                    ''+function () {
                        if(data[i].attachmentId==''){
                            return ''
                        } else {
                            return '<img class="n_accessory" src="img/main_img/accessory.png" alt="">'
                        }
                    }()+'</div></li>'

                notice_li += '<a href="/notice/detail?notifyId=' + data[i].notifyId + '" style="color:#000;" class="public_title" target="_blank">' +
                    '	<li class="tixing_one_all">' +
                    '<div class="tixing_every">' +
                    '<div class="company">' +
                    '<img src="'+function () {
                        if(data[i].users.avatar==0){
                            return '/img/user/boy.png'
                        }
                        else if(data[i].users.avatar==1){
                            return '/img/user/girl.png'
                        }else {
                            return '/img/user/'+data[i].users.avatar
                        }
                    }()+'" alt="">' +
                    '<h1>' + data[i].name + '</h1>' +
                    '<h2 class="company_time" style="margin-left: 57px;">' + data[i].notifyDateTime + '</h2>' +
                    '</div>' +
                    '<h1 class="thing">请查看我的公告</h1>' +
                    '<div class="liushuihao">' +
                    '<h1>主题：</h1><' +
                    'span>' + data[i].subject + '</span>' +
                    '</div>' +
                    '</div>' +
                    '</li></a>';


            }

            $('.no_read_notice_two').html(str_li);
            //console.log(notice_li)

            // console.log($('.right_notice').html())

            if(obj.obj.length==0) {
                var lis = '<li class="no_notice" style="text-align: center;border: none;">' +
                    '<img style="margin-top: 62px;"  src="/img/main_img/shouyekong.png" alt="">' +
                    '<h2 style="text-align: center;color: #666;">'+no_Data+'</h2>' +
                    '</li>';
                $('.no_read_notice_two').html(lis);
            }

        }
    })
}

// function announcementXiaoWu(me){  //校务公开查询方法
//
//     var obj={
//         read:'',
//         page:1,
//         pageSize:6,
//         useFlag:'true',
//         typeId:$(me).attr('data-bool')
//     };
//     // console.log(obj)
//     $.ajax({
//         url:"eduSchoolBusiness/eduSchoolShow",
//         type:'get',
//         data:obj,
//         dataType:'json',
//         success:function(obj) {
//
//             var data = obj.obj;
//             /*console.log(data);*/
//             var str_li = '';
//             var notice_li = '';
//             for (var i = 0; i < data.length; i++) {
//                 var strnbsp = function(){
//                     if(data[i].notifyDateTime!=undefined){
//                         return data[i].notifyDateTime.replace(/\s/g, '<i style="margin-right: 10px"></i>')
//                     }else {
//                         return ''
//                     }
//                 }()
//                 /*var time=data[i].notifyDateTime.slice(0,10);*/
//                 /*console.log(time);*/
//                 str_li += '<li ><div class="n_img"><img src="'+function () {
//                         if(data[i].users.avatar==0){
//                             return '/img/user/boy.png'
//                         }
//                         else if(data[i].users.avatar==1){
//                             return '/img/user/girl.png'
//                         }else {
//                             return '/img/user/'+data[i].users.avatar
//                         }
//                     }()+'"></div><div class="n_word">' +
//                     '<h1 class="n_name">' + data[i].name + '</h1><h3 class="n_time">' +
//                     '<p>' + strnbsp + '</p>' +
//                     '</h3><a href="/eduSchoolBusiness/detail?notifyId=' + data[i].notifyId + '"  style="color:#000;" class="public_title" target="_blank"><h2 class="n_title" data-tid="' + data[i].notifyId + '">' + data[i].subject + '</h2></a>' +
//                     ''+function () {
//                         if(data[i].attachmentId==''){
//                             return ''
//                         } else {
//                             return '<img class="n_accessory" src="img/main_img/accessory.png" alt="">'
//                         }
//                     }()+'</div></li>'
//
//                 notice_li += '<a href="/eduSchoolBusiness/detail?notifyId=' + data[i].notifyId + '" style="color:#000;" class="public_title" target="_blank">' +
//                     '	<li class="tixing_one_all">' +
//                     '<div class="tixing_every">' +
//                     '<div class="company">' +
//                     '<img src="'+function () {
//                         if(data[i].users.avatar==0){
//                             return '/img/user/boy.png'
//                         }
//                         else if(data[i].users.avatar==1){
//                             return '/img/user/girl.png'
//                         }else {
//                             return '/img/user/'+data[i].users.avatar
//                         }
//                     }()+'" alt="">' +
//                     '<h1>' + data[i].name + '</h1>' +
//                     '<h2 class="company_time" style="margin-left: 57px;">' + data[i].notifyDateTime + '</h2>' +
//                     '</div>' +
//                     '<h1 class="thing">请查看我的校务</h1>' +
//                     '<div class="liushuihao">' +
//                     '<h1>主题：</h1><' +
//                     'span>' + data[i].subject + '</span>' +
//                     '</div>' +
//                     '</div>' +
//                     '</li></a>';
//
//
//             }
//
//             $('.xiaoWuyete').html(str_li);
//             //console.log(notice_li)
//
//             // console.log($('.right_notice').html())
//
//             if(obj.obj.length==0) {
//                 var lis = '<li class="no_notice" style="height: 100%;text-align: center;border: none;"><img style="margin-top: 5%;" src="/img/noData.png" alt=""><h2 style="margin-left: -5%;text-align: center">暂无数据</h2></li>';
//                 $('.no_read_notice_two').html(lis);
//             }
//
//         }
//     })
// }


function administrivia(me) {//新闻
    $.ajax({
        url: '/news/newsManage',
        type: 'get',
        data:{
            page:'1',
            read:$(me).attr('data-bool'),
            pageSize:'5',
            useFlag:'true'
        },
        dataType: 'json',
        success: function (obj) {

            var li = '';
            var data = obj.obj;
            for (var i = 0; i < data.length; i++) {
                li += '<li class="chedule_li" onclick="tiaozhuan(this)" data-url="/news/detail?newsId='+data[i].newsId+'">' +
                    '<div style="margin-left:12px;">' +
                    '<img src="img/data_point.png">' +
                    '</div>' +
                    '<a href="javscript:;" ><div class="new_title richeng_title">' + data[i].subject + '</div></a>' +
                    '<div class="every_times">' +function () {

                        if(data[i].newsDateTime!=undefined){
                            return data[i].newsDateTime.replace(/\s/g, '<i style="margin-right:10px;"></i>')
                        }else {
                            return ''
                        }


                    }()  + '</div>' +
                    '</li>'
            }
            $('.new_all').html(li);
            if(obj.obj.length==0) {
                var lis = '<li class="no_notice" style="text-align: center;border: none;">' +
                    '<img style="margin-top: 62px;"  src="/img/main_img/shouyekong.png" alt="">' +
                    '<h2 style="text-align: center;color: #666;">'+no_Data+'</h2>' +
                    '</li>';
                $('.new_all').html(lis);
            }


        }
    });
}
function documentFile(me) {//待办公文
    $.ajax({
        url: '/todoList/getWillDocSendOrReceive',
        type: 'get',
        data:{
            documentType:me
        },
        dataType: 'json',
        success: function (obj) {
            // console.log(obj)
            var str='';
            var daiba_li='';
            var data=obj.data;
            /*		console.log(data)*/
            if(data.length>0){
                for(var i=0;i<data.length;i++){
                    str += '<li  data-s="1" class="no_readss clearfix" onclick="tiaozhuan(this)" data-url="'+data[i].remindUrl+'">' +
                        '<div class="e_img">' +
                        '<img src="'+ function () {
                            if(data[i].avater==0){
                                return '/img/user/boy.png'
                            }
                            else if(data[i].avater==1){
                                return '/img/user/girl.png'
                            }else {
                                return '/img/user/'+data[i].avater
                            }
                        }()+'">' +
                        '</div>' +
                        '<div class="e_word">' +
                        '<h1 class="n_name">'+data[i].fromName+'</h1>' +
                        '<h3 class="n_time"><p>'+data[i].sendTimeStr.replace(/\s/,'<i style="margin: 0px 5px;"></i>')+'</p></h3>' +
                        '<a href="javascript:;" data-url="" class="windowopen"  style="color:#1b5e8d;" class="public_title" target="_blank">' +
                        '<h2 style="font-size: 8px; color: #1b5e8d;width: 300px" emil-tid="'+data[i].content+'" class="e_title">'+data[i].content+'</h2>' +
                        '</a>' +
                        '</div>' +
                        '</li>'
                }
            }
            // if(data.workFlow!=undefined){
            //     for(var m=0;m<data.workFlow.length;m++){
            //         daiba_li+='<li onclick="windowOpenNew(this)"  data-url="'+data.workFlow[m].remindUrl+'"  data-s="2" class="clearfix">' +
            //             '<div class="n_img"><img src="'+function () {
            //                 if(data.workFlow[m].avater==0){
            //                     return '/img/user/boy.png'
            //                 }
            //                 else if(data.workFlow[m].avater==1){
            //                     return '/img/user/girl.png'
            //                 }else {
            //                     return '/img/user/'+data.workFlow[m].avater
            //                 }
            //             }()+'"></div>' +
            //             '<div class="n_word">' +
            //             '<h1 class="n_name">'+data.workFlow[m].userName+'</h1>'+
            //             '<h3 class="n_time"><p>'+data.workFlow[m].sendTimeStr.replace(/\s/,'<i style="margin: 0px 5px;"></i>')+'</p></h3>' +
            //             '<a href="javascript:void(0)" data-id="'+data.workFlow[m].qid+'" class="windowopen">' +
            //             '<h2 class="n_title" title="'+data.workFlow[m].content+'">'+data.workFlow[m].content+'</h2></a>'+      '<span style="position: absolute;right: 10px;top: 21px;color: #999;">请查看流程</span>'+
            //             '</div>' +
            //             '</li>'
            //     }
            // }

            $('.gongwen').html(str);

            // $('.right_daiban').html(daibans);
            if(data.length==0) {
                var lis = '<li class="no_notice" style="text-align: center;border: none;">' +
                    '<img style="margin-top: 62px;"  src="/img/main_img/shouyekong.png" alt="">' +
                    '<h2 style="text-align: center;color: #666;">'+no_Data+'</h2>' +
                    '</li>';
                $('.gongwen').html(lis);
                // $('.right_daiban').html(lis);
            }
        }
    });
}
function meeting(me) {//会议通知
    $.ajax({
        url: '/meeting/getMeetingNotify',
        type: 'get',
        data:{
            page:'1',
            pageSize:'10',
            useFlag:'true'
        },
        dataType: 'json',
        success: function (obj) {

            var li = '';
            var data = obj.obj;
            for (var i = 0; i < data.length; i++) {
                li += '<li class="chedule_li" onclick="tiaozhuan(this)" data-url="meeting/detail?meetingId='+data[i].sid+'">' +
                    '<div style="margin-left:12px;">' +
                    '<img src="img/data_point.png">' +
                    '</div>' +
                    '<a href="javascript:;" ><div class="new_title richeng_title">' + data[i].meetName + '</div></a>' +
                    '<div class="every_times">' +function () {

                        if(data[i].startTime!=undefined){
                            return data[i].startTime.replace(/\s/g, '<i style="margin-right:10px;"></i>')
                        }else {
                            return ''
                        }


                    }()  + '</div>' +
                    '</li>'
            }
            $('.meeting').html(li);
            if(obj.obj.length==0) {
                var lis = '<li class="no_notice" style="text-align: center;border: none;">' +
                    '<img style="margin-top: 62px;"  src="/img/main_img/shouyekong.png" alt="">' +
                    '<h2 style="text-align: center;color: #666;">'+no_Data+'</h2>' +
                    '</li>';
                $('.meeting').html(lis);
            }


        }
    });
}




function fileCabinet(me){//文件柜
    $.ajax({
        url:$(me).attr('data-url'),
        type:'get',
        dataType:'json',
        success:function(obj){


            /*console.log(obj);*/
            wenjian_li = '';
            var li = '';
            for (var i = 0; i < obj.length; i++) {
                li += '<li class="chedule_li wenjian"' +
                    'data-num="1" data-id="'+obj[i].id+'" menu_tid="'+function () {
                        if($(me).attr('data-url')=='/file/writeTree'){
                            return '3001'
                        }else if($(me).attr('data-url')=='/file/writeTreePerson'){
                            return '0136'
                        }
                    }()+'" onclick="getMenuOpen(this)" data-url="'+function () {
                        if($(me).attr('data-url')=='/file/writeTree'){
                            return 'knowledge_management'
                        }else if($(me).attr('data-url')=='/file/writeTreePerson'){
                            return 'file_folder/index2.php'
                        }
                    }()+'"><h2 style="display: none">'+function () {
                        if($(me).attr('data-url')=='/file/writeTree'){
                            return '公共文件柜'
                        }else if($(me).attr('data-url')=='/file/writeTreePerson'){
                            return '个人文件柜'
                        }
                    }()+'</h2><div style="margin-left:4px;"><img src="img/data_point.png"></div><div class="new_title richeng_title">' + obj[i].text + '</div></li>'
            }
            $('.pets_wenjian').html(li);
            if(obj.length==0) {
                var lis = '<li class="no_notice" style="text-align: center;border: none;">' +
                    '<img style="margin-top: 62px;"  src="/img/main_img/shouyekong.png" alt="">' +
                    '<h2 style="text-align: center;color: #666;">'+no_Data+'</h2>' +
                    '</li>';

                $('.pets_wenjian').html(lis);
            }
        }



    })
}



function getMenuOpen(me){//应用门户跳转
    if($(me).attr('data-num')==1){
        var wangpanId=$(me).attr('data-id')
    }
    var url=$(me).attr('data-url');
    var menu_tid=$(me).attr('menu_tid');
    if(menu[url.replace(/\//g,'_')]){
        url = menu[url.replace(/\//g,'_')]+'?'+wangpanId;
        /*   console.log(url)*/
    }else{
        url=url;
    }
    if($('#f_'+menu_tid).length>0){
        //页面一打开，切换显示
        $('.all_content .iItem').hide();
        $('#f_'+menu_tid).show();
        if($(me).attr('data-num')==1){
            $('#f_'+menu_tid).find('iframe').attr('src',url)
        }
        $('#t_'+menu_tid).css({
            'background':'url(img/main_img/title_yes.png) 0px 4px no-repeat',
            'color':'#2a588c',
            'position':'relative',
            'z-index':99999
        })
        $('#t_'+menu_tid).siblings().css({
            'background':'url(img/main_img/'+$('[name="sessionType"]').val()+'/title_no.png) 0px 4px no-repeat',
            'color':'#fff',
            'position':'relative',
            'z-index':999
        })
    }else{
        //页面不存在，新增 title和iframe
        var titlestr = '<li class="choose" index="0;" id="t_'+menu_tid+'" title="'+$(me).find('h2').html()+'"><h1>'+$(me).find('h2').html()+'</h1><div class="img" style="display:none;"><img class="close"  src="img/main_img/icon.png"></div></li>';

        var iframestr = '<div id="f_'+menu_tid+'" class="iItem" ><iframe id="every_module" src="'+url+'" frameborder="0" scrolling="yes" height="100%" width="100%" noresize="noresize" tid="2"></iframe></div>';

        $('.main_title ul').append(titlestr);


        $('#t_'+menu_tid).siblings().attr('style','background: url(img/main_img/theme1/title_no.png) 0px 4px no-repeat;');
        $('#t_'+menu_tid).siblings().css('color','#fff');
        /* console.log($('#t_'+menu_tid).siblings()); */
        $('.all_content').append(iframestr);
        $('.all_content .iItem').hide();
        $('#f_'+menu_tid).show();

             $('#t_'+menu_tid).siblings().attr('style','background: url(img/main_img/'+$('[name="sessionType"]').val()+'/title_no.png) 0px 4px no-repeat;');
            $('#t_'+menu_tid).siblings().css('color','#fff');
            /* console.log($('#t_'+menu_tid).siblings()); */
            $('.all_content').append(iframestr);
            $('.all_content .iItem').hide();
            $('#f_'+menu_tid).show();

        mobileObj.left()

    }
}
$(function(){
    var names = $('input[name=sessionType]').val();//获取当前皮肤字段

    $.get('/code/GetDropDownBox?CodeNos=NOTIFY',function (json) {
        var str='';
        var arr=json.NOTIFY;
        for(var i=0;i<4;i++){
            str+='<li class="weidu_notice head_title sort" style="width: 40px;" onclick="announcement(this)" data-bool="'+arr[i].codeNo+'">'+arr[i].codeName+'</li>'
        }
        $('#notice_listTwo').append(str)
    },'json')


    //公告查询调用
    announcement($('#all_notice'))//默认查询全部
    administrivia($('[data-bool=""]'))//新闻
    schedule($('[data-url="/schedule/getscheduleByDay"]'))//日程
    fileCabinet($('[data-url="/file/writeTree"]'))
    meeting();
    mobileObj.init();
    dataLoad.init();
    listTable()
    //校务查询调用
    // announcementXiaoWu($('#xiaoWu'))//默认查询全部
    // administrivia($('[data-bool=""]'))//标题
    // schedule($('[data-url="/schedule/getAllschedule"]'))//日程
    // fileCabinet($('[data-url="/file/writeTree"]'))
    // mobileObj.init();
    // dataLoad.init();

    //首页右侧提醒页面里的功能
    //点击用户，展开用户中的内容
    $('.search_one_all').on('click',function(){
        /*alert('111');*/
        /*		alert($('.search_two_all').css('display')==none)*/
        if($(this).siblings('.search_two_all').css('display')=='none'){
            $(this).siblings('.search_two_all').show();
            $(this).find('.custom_close').attr('src','img/main_img/cus_open.png');
        }else{
            $(this).siblings('.search_two_all').hide();
            $(this).find('.custom_close').attr('src','img/main_img/cus_close.png');
        }
    });
    $('.apply_one_all').on('click',function(){
        /*alert('111');*/
        /*		alert($('.search_two_all').css('display')==none)*/
        if($(this).siblings('.search_two_all').css('display')=='none'){
            $(this).siblings('.search_two_all').show();
            $(this).find('.custom_close').attr('src','img/main_img/cus_open.png');
        }else{
            $(this).siblings('.search_two_all').hide();
            $(this).find('.custom_close').attr('src','img/main_img/cus_close.png');
        }
    });
    //搜索的接口
    $('#index_find').on('click',function(){

        var text = $('#searchText').val();
        $.ajax({
            url: '/todoList/queryUserByUserId',
            type: 'get',
            data:{
                userName:text
            },
            dataType: 'json',
            success: function (obj) {
                var str='';
                var data=obj.obj;
                $('#userSearchNum').text(data.length);
                for(var i=0;i<data.length;i++){
                    str+='<li>' +
                        '<div class="custom-two-left">' +
                        '<img style="width: 25px;height: 25px;" src="'+function () {

                            if(data[i].avatar==0){
                                return '/img/user/boy.png'
                            }
                            else if(data[i].avatar==1){
                                return '/img/user/girl.png'
                            }else {
                                return '/img/user/'+data[i].avatar
                            }

                        }()+'" alt="">' +
                        '</div>' +
                        '<div class="custom-two-mid">' +
                        '<h1>'+data[i].userName+'</h1>' +
                        '<span class="priv_name">'+data[i].userPrivName+'</span>' +
                        '<h2>电话：<span>'+data[i].mobilNo+'</span>' +
                        '</h2>' +
                        '</div>' +
                        '<div class="custom-two-right">' +
                        '</div>' +
                        '</li>'//<div class="two-right-all"><img src="img/main_img/cus_email.png" alt=""><h1>邮件</h1></div>
                }

                $('.search_custom .custom_two').html(str);
            }
        });
        $.ajax({
            url: '/todoList/getSysFunctionByName',
            type: 'get',
            data:{
                funName:text
            },
            dataType: 'json',
            success: function (obj) {
                var str='';
                var data=obj.obj;
                // $('#apply_num').text(data.length);
                $('#applySearchNum').text(data.length);
                for(var i=0;i<data.length;i++){
                    str+='<li style="cursor: pointer" onclick="getMenuOpen(this)" data-url="'+data[i].url+'" menu_tid="'+data[i].id+'">' +
                        '<h2 style="display: none">'+data[i].name+'</h2><div class="custom-two-left">' +
                        '<img style="width: 25px;height: 25px;margin-top: 18px;" src="img/icon_mydoc_03.png" alt=""></div><div class="custom-two-mid" style="height:59%;margin-top: 11px;"><h1>'+data[i].name+'</h1></div><div class="custom-two-right"></div></li>'//<div class="two-right-all"><img src="img/main_img/cus_email.png" alt=""><h1>邮件</h1></div>
                }
                $('.search_apply .custom_two').html(str);
            }
        });
    })


    $('#searchText').bind('keypress',function(event){
        if(event.keyCode == "13")
        {
            $('#index_find').click()
        }
    });
    //待办工作的接口
    $.ajax({
        url: '/todoList/smsListByType',
        type: 'get',
        dataType: 'json',
        success: function (obj) {

            var str='';
            var daiba_li='';
            var data=obj.data;
            /*		console.log(data)*/
            if(data.email.length==10000){
                for(var i=0;i<data.email.length;i++){
                    str += '<li onclick="windowOpenNew(this)" data-s="1" class="no_readss clearfix">' +
                        '<div class="e_img">' +
                        '<img src="'+ function () {
                            if(data.email[i].avater==0){
                                return '/img/user/boy.png'
                            }
                            else if(data.email[i].avater==1){
                                return '/img/user/girl.png'
                            }else {
                                return '/img/user/'+data.email[i].avater
                            }
                        }()+'">' +
                        '</div>' +
                        '<div class="e_word">' +
                        '<h1 class="n_name">'+data.email[i].userName+'</h1>' +
                        '<h3 class="n_time"><p>'+data.email[i].time.replace(/\s/,'<i style="margin: 0px 5px;"></i>')+'</p></h3>' +
                        '<a href="javascript:void(0)" data-id="'+data.email[i].qid+'" class="windowopen"  style="color:#1b5e8d;" class="public_title" target="_blank">' +
                        '<h2 style="font-size: 8px; color: #1b5e8d;" emil-tid="'+data.email[i].qid+'" class="e_title">'+data.email[i].fromName+'</h2>' +
                        '</a>' +
                        '<span style="position: absolute;right: 10px;top: 21px;color: #999;">请查看邮件</span>' +
                        '</div>' +
                        '</li>'
                }
            }
            if(data.workFlow!=undefined){
                for(var m=0;m<data.workFlow.length;m++){
                    daiba_li+='<li onclick="windowOpenNew(this)"  data-url="'+data.workFlow[m].remindUrl+'"  data-s="2" class="clearfix">' +
                        '<div class="n_img"><img src="'+function () {
                            if(data.workFlow[m].avater==0){
                                return '/img/user/boy.png'
                            }
                            else if(data.workFlow[m].avater==1){
                                return '/img/user/girl.png'
                            }else {
                                return '/img/user/'+data.workFlow[m].avater
                            }
                        }()+'"></div>' +
                        '<div class="n_word">' +
                        '<h1 class="n_name">'+data.workFlow[m].userName+'</h1>'+
                        '<h3 class="n_time"><p>'+data.workFlow[m].sendTimeStr.replace(/\s/,'<i style="margin: 0px 5px;"></i>')+'</p></h3>' +
                        '<a href="javascript:void(0)" data-id="'+data.workFlow[m].qid+'" class="windowopen">' +
                        '<h2 class="n_title" title="'+data.workFlow[m].content+'">'+data.workFlow[m].content+'</h2></a>'+      '<span style="position: absolute;right: 10px;top: 21px;color: #999;">请查看流程</span>'+
                        '</div>' +
                        '</li>'
                }
            }

            $('.daiban').html(daiba_li);

            // $('.right_daiban').html(daibans);
            if(data.workFlow.length==0) {
                var lis = '<li class="no_notice" style="text-align: center;border: none;">' +
                    '<img style="margin-top: 62px;"  src="/img/main_img/shouyekong.png" alt="">' +
                    '<h2 style="text-align: center;color: #666;">'+no_Data+'</h2>' +
                    '</li>';
                $('.daiban').html(lis);
                // $('.right_daiban').html(lis);
            }
        }
    });
    //待办公文接口
    documentFile(0);

    //网络硬盘的接口
    $.ajax({
        url: '/netdiskSettings/selectNetdiskSettings',
        type: 'get',
        dataType: 'json',
        success: function (obj) {
            var data=obj.object;
            var li='';
            for(var i=0;i<data.length;i++){

                li += '<li class="all_li" onclick="getMenuOpen(this)"' +
                    ' data-url="netdisk" data-num="1" data-id="'+data[i].diskId+'"  menu_tid="3010"><h2 style="display: none">网络硬盘</h2><div class="total_wenjian"  tid="3001" url="file/home"><img src="img/main_img/wenjian.png" ></div><h1 style="    height: 20px;    line-height: 20px; text-align: center;">'+data[i].diskName+'</h1></li>'

            }
            $('.pets_yingpan').html(li);
            if(obj.object.length==0){
                var lis = '<li class="no_notice" style="text-align: center;border: none;">' +
                    '<img style="margin-top: 62px;"  src="/img/main_img/shouyekong.png" alt="">' +
                    '<h2 style="text-align: center;color: #666;">'+no_Data+'</h2>' +
                    '</li>';
                $('.pets_yingpan').html(lis);
            }
        }
    });
    //新闻的接口

    //点击新闻更多
    $('.more_news').on('click',function(){

        var tid=$(this).attr('tid');
        var url=$(this).attr('url');
        if($('#f_'+tid).length>0){
            $('.all_content .iItem').hide();
            $('#f_'+tid).show();

            $('#t_'+tid).css({
                'background':'url(img/main_img/title_yes.png) 0px 4px no-repeat',
                'color':'#2a588c',
                'position':'relative',
                'z-index':99999
            })
            $('#t_'+tid).siblings().css({
                'background':'url(img/main_img/'+ names +'/title_no.png) 0px 4px no-repeat',
                'color':'#fff',
                'position':'relative',
                'z-index':999
            })
        }else{
            var titlestrs = '<li class="choose " index="0;" id="t_'+tid+'" title="新闻"><h1>新闻</h1><div class="img" style="display:none;"><img class="close" src="img/main_img/icon.png"></div></li>';
            var iframestr = '<div id="f_'+tid+'" class="iItem"><iframe id="every_module" src="'+url+'" frameborder="0" scrolling="yes" height="100%" width="100%" noresize="noresize" tid="2"></iframe></div>';
            $('.main_title ul').append(titlestrs);
            $('#t_'+tid).siblings().attr('style','background: url(img/main_img/'+ names +'/title_no.png) -1px 2px no-repeat; ');
            $('#t_'+tid).siblings().css('color','#fff');
            $('.all_content').append(iframestr);
            $('.all_content .iItem').hide();
            $('#f_'+tid).show();
        }
    })
    //点击会议通知更多
    $('.more_meeting').on('click',function(){

        var tid=$(this).attr('tid');
        var url=$(this).attr('url');
        if($('#f_'+tid).length>0){
            $('.all_content .iItem').hide();
            $('#f_'+tid).show();

            $('#t_'+tid).css({
                'background':'url(img/main_img/title_yes.png) 0px 4px no-repeat',
                'color':'#2a588c',
                'position':'relative',
                'z-index':99999
            })
            $('#t_'+tid).siblings().css({
                'background':'url(img/main_img/'+ names +'/title_no.png) 0px 4px no-repeat',
                'color':'#fff',
                'position':'relative',
                'z-index':999
            })
        }else{
            var titlestrs = '<li class="choose " index="0;" id="t_'+tid+'" title="新闻"><h1>会议通知</h1><div class="img" style="display:none;"><img class="close" src="img/main_img/icon.png"></div></li>';
            var iframestr = '<div id="f_'+tid+'" class="iItem"><iframe id="every_module" src="'+url+'" frameborder="0" scrolling="yes" height="100%" width="100%" noresize="noresize" tid="2"></iframe></div>';
            $('.main_title ul').append(titlestrs);
            $('#t_'+tid).siblings().attr('style','background: url(img/main_img/'+ names +'/title_no.png) -1px 2px no-repeat; ');
            $('#t_'+tid).siblings().css('color','#fff');
            $('.all_content').append(iframestr);
            $('.all_content .iItem').hide();
            $('#f_'+tid).show();
        }
    })
    //邮件tab切换
    $('.s_head').on('click','li',function(){

        $(this).parent().find(" li").removeClass("active");
        $(this).addClass('active');
        if($(this).attr('id')=='all_m'){
            /* init(); */
            $('.all_mail').css("display","block");
            $('.no_read').css("display","none");
            $('.read').css("display","none");
        }else if($(this).attr('id')=='weidu'){
            $('.no_read').css("display","block");
            $('.all_mail').css("display","none");
            $('.read').css("display","none");

            $('.read').css("display","none");
        } else if($(this).attr('id')=='yidu'){
            $('.read').css("display","block");
            $('.no_read').css("display","none");
            $('.all_mail').css("display","none");
        }
    });
    //新闻tab切换
    $('.s_head').on('click','li',function(){
        $(".s_head li").removeClass("active");
        $(this).addClass('active');


        if($(this).attr('id')=='news_al'){
            /* init(); */
            $('.new_all').css("display","block");
            $('.new_noread').css("display","none");

        }else if($(this).attr('id')=='333'){
            $('.new_noread').css("display","block");
            $('.new_all').css("display","none");

        }
    });

    //公告tab切换
    $('.notice_head').on('click','li',function(){
        $(".notice_head li").removeClass("active");
        $(this).addClass('active');
    })

    //文件柜tab切换
    $('.wenjian_head').on('click','li',function(){
        $(this).parent().find("li").removeClass("active");
        $(this).addClass('active');
        if($(this).attr('id')=='pets'){
            $('.pets_wenjian').css("display","block");
            $('.people_wenjian').css("display","none");


        }else if($(this).attr('id')=='person'){
            $('.people_wenjian').css("display","block");
            $('.pets_wenjian').css("display","none");

        }

    })

    //邮件接口
    $.ajax({
        url:'email/showEmail',
        type:'get',
        data:{
            flag:'inbox',
            page:1,
            pageSize:5,
            useFlag:'true',
            // userID:'admin'
        },
        dataType:'json',
        success:function(obj){
            if(obj.flag) {
                var data = obj.obj;
                var li = '';
                var read_li = '';
                var all_li = '';
                var email_li = '';
                for (var i = 0; i < data.length; i++) {

                    for (var j = 0; j < data[i].emailList.length; j++) {
                        var sendTime = new Date((data[i].sendTime) * 1000).Format('MM-dd hh:mm:ss');
                        if (data[i].emailList[j].readFlag == 0) {

                            var sendTime = new Date((data[i].sendTime) * 1000).Format('MM-dd  hh:mm:ss');
                            li += '<li class="no_read" onclick="tiaozhuan(this)" data-url="/email/details?id=' + data[i].emailList[j].emailId + '"><div class="e_img"><img src="'+function () {
                                    if(data[i].users.avatar==0){
                                        return '/img/user/boy.png'
                                    }
                                    else if(data[i].users.avatar==1){
                                        return '/img/user/girl.png'
                                    }else {
                                        return '/img/user/'+data[i].users.avatar
                                    }
                                }()+'"></div><div class="e_word"><h1 class="e_name" data-userId="'+data[i].users.userId+'">' + data[i].users.userName + '</h1>' +
                                '<h3 class="e_time">' + sendTime.replace(/\s/g, '<i style="margin-right:10px;"></i>') + '</h3>' +
                                '<a href="javascript:;" style="color:#1b5e8d;" class="public_title" target="_blank">' +
                                '<h2 style="font-size: 8px; color: #1b5e8d;" emil-tid="' + data[i].emailList[j].emailId + '" ' +
                                'class="e_title">' + data[i].content.replace(/<\/?.+?>/g,"").replace(/ /g,"") + '</h2></a>' +
                                ''+function () {
                                    if(data[i].attachmentId==''){
                                        return ''
                                    }else {
                                        return '<img  class="accessory" src="img/main_img/accessory.png" alt="">'
                                    }
                                }()+'</div></li>'
                        } else if (data[i].emailList[j].readFlag == 1) {
                            var sendTime = new Date((data[i].sendTime) * 1000).Format('MM-dd hh:mm:ss');
                            read_li += '<li onclick="tiaozhuan(this)" data-url="/email/details?id=' + data[i].emailList[j].emailId + '"><div class="e_img"><img src="'+function () {
                                    if(data[i].users.avatar==0){
                                        return '/img/user/boy.png'
                                    }
                                    else if(data[i].users.avatar==1){
                                        return '/img/user/girl.png'
                                    }else {
                                        return '/img/user/'+data[i].users.avatar
                                    }
                                }()+'"></div>' +
                                '<div class="e_word">' +
                                '<h1 class="e_name" data-userName="'+data[i].users.userName+'" data-userId="'+data[i].users.userId+'">' + data[i].users.userName + '</h1>' +
                                '<h3 class="e_time">' + sendTime.replace(/\s/g, '<i style="margin-right:10px;"></i>') + '</h3>' +
                                '<a href="javascript:;" style="color:#1b5e8d;" class="public_title" target="_blank"><h2 style="font-size: 8px; color: #1b5e8d;" emil-tid="' + data[i].emailList[j].emailId + '" class="e_title">' + data[i].subject + '</h2></a>' +
                                ''+function () {
                                    if(data[i].attachmentId==''){
                                        return ''
                                    }else {
                                        return '<img  class="accessory" src="img/main_img/accessory.png" alt="">'
                                    }
                                }()+'</div></li>'
                        }
                        var sendTimews = new Date((data[i].sendTime) * 1000).Format('MM-dd hh:mm:ss');
                        all_li += '<li onclick="tiaozhuan(this)" data-url="/email/details?id=' + data[i].emailList[j].emailId + '"><div class="e_img">' +
                            '<img src="'+function () {
                                if(data[i].users.avatar==0){
                                    return '/img/user/boy.png'
                                }
                                else if(data[i].users.avatar==1){
                                    return '/img/user/girl.png'
                                }else {
                                    return '/img/user/'+data[i].users.avatar
                                }
                            }()+'">' +
                            '</div><div class="e_word"><h1 class="e_name" data-userName="'+data[i].users.userName+'" data-userId="'+data[i].users.userId+'">' +data[i].users.userName + '</h1><h3 class="e_time">' + sendTimews.replace(/\s/g, '<i style="margin-right:10px;"></i>') + '</h3><a href="javascript:;" style="color:#1b5e8d;" class="public_title" target="_blank"><h2 style="font-size: 8px; color: #1b5e8d;" emil-tid="' + data[i].emailList[j].emailId + '" class="e_title">' + data[i].subject + '</h2></a>' +
                            ''+function () {
                                if(data[i].attachmentId==''){
                                    return ''
                                }else {
                                    return '<img  class="accessory" src="img/main_img/accessory.png" alt="">'
                                }
                            }()+'</div></li>'



                        email_li += '	<li class="tixing_one_all" onclick="tiaozhuan(this)" data-url="/email/details?id=' + data[i].emailList[j].emailId + '"><div class="tixing_every"><div class="company">' +
                            '<img src="'+function () {
                                if(data[i].users.avatar==0){
                                    return '/img/user/boy.png'
                                }
                                else if(data[i].users.avatar==1){
                                    return '/img/user/girl.png'
                                }else {
                                    return '/img/user/'+data[i].users.avatar
                                }
                            }()+'" alt=""><h1>' + data[i].emailList[j].toName + '</h1><h2 class="company_time" style="margin-left: 88px;">' + sendTime + '</h2>' +
                            '</div><a href="javascript:;" style="color:#1b5e8d;" class="public_title" target="_blank"><h1 class="thing">请查看我的邮件</h1><div class="liushuihao"><h1>主题：</h1><span>' + data[i].subject + '</span></div></a>' +
                            '</div></li>';

                    }


                }
                $('.all_mail').html(all_li);

                $('.read').html(read_li);
                $('.no_read').html(li);


                if(li==''){
                    var lis = '<li class="no_notice" style="text-align: center;border: none;">' +
                        '<img style="margin-top: 62px;"  src="/img/main_img/shouyekong.png" alt="">' +
                        '<h2 style="text-align: center;color: #666;">'+no_Data+'</h2>' +
                        '</li>';
                    $('.no_read').html(lis);
                }




                if(all_li=='') {

                    var lis = '<li class="no_notice" style="text-align: center;border: none;">' +
                        '<img style="margin-top: 62px;"  src="/img/main_img/shouyekong.png" alt="">' +
                        '<h2 style="text-align: center;color: #666;">'+no_Data+'</h2>' +
                        '</li>';
                    $('.all_mail').html(lis);
                }
            }else {
                var lis = '<li class="no_notice" style="text-align: center;border: none;">' +
                    '<img style="margin-top: 62px;"  src="/img/main_img/shouyekong.png" alt="">' +
                    '<h2 style="text-align: center;color: #666;">'+no_Data+'</h2>' +
                    '</li>';
                $('.all_mail').html(lis);
                $('.read').html(lis);
                $('.no_read').html(lis);
            }

        }
    })

    $('.all_mail').on('click','.e_name',function () {
        var userId=$(this).attr('data-userId');
        var userName=$(this).attr('data-userName');
        userName=encodeURI(encodeURI(userName));
        window.open('/email/addbox?userId='+userId+'&userName='+userName);
    })

    //点击邮件更多，显示邮件页面
    $('.more_emil').on('click',function(){
        var tid=$(this).attr('tid');
        var url=$(this).attr('url');
        if($('#f_'+tid).length>0){
            $('.all_content .iItem').hide();
            $('#f_'+tid).show();

            $('#t_'+tid).css({
                'background':'url(img/main_img/title_yes.png) 0px 4px no-repeat',
                'color':'#2a588c',
                'position':'relative',
                'z-index':99999
            })
            $('#t_'+tid).siblings().css({
                'background':'url(img/main_img/'+ names +'/title_no.png) 0px 4px no-repeat',
                'color':'#fff',
                'position':'relative',
                'z-index':999
            })
        }else{
            var titlestrs = '<li class="choose " index="0;" id="t_'+tid+'" title="电子邮件"><h1>电子邮件</h1><div class="img" style="display:none;"><img class="close" src="img/main_img/icon.png"></div></li>';
            var iframestr = '<div id="f_'+tid+'" class="iItem"><iframe id="every_module" src="'+url+'" frameborder="0" scrolling="yes" height="100%" width="100%" noresize="noresize" tid="2"></iframe></div>';
            $('.main_title ul').append(titlestrs);
            $('#t_'+tid).siblings().attr('style','background: url(img/main_img/'+ names +'/title_no.png) -1px 2px no-repeat; ');
            $('#t_'+tid).siblings().css('color','#fff');
            $('.all_content').append(iframestr);
            $('.all_content .iItem').hide();
            $('#f_'+tid).show();
        }
    })
    /*}*/

    //日志接口
    $.ajax({
        url:'diary/getIndex',
        type:'get',
        data:{
            page:1,
            pageSize:5,
            useFlag:'true',
            userId:$.cookie('userId')
        },
        dataType:'json',
        success:function(obj){

            var data = obj.obj;
            /*	console.log(data);*/
            var str_li = '';
            for (var i = 0; i < data.length; i++) {
                /*console.log(data[0].userName);*/
                str_li += '<li onclick="tiaozhuan(this)" data-url="/diary/details?id=' + data[i].diaId + '"><div class="d_img">' +
                    '<img src="'+function () {
                        if(data[i].avatar==0){
                            return '/img/user/boy.png'
                        }
                        else if(data[i].avatar==1){
                            return '/img/user/girl.png'
                        }else {
                            return '/img/user/'+data[i].avatar
                        }
                    }()+'">' +
                    '</div><div class="d_word"><h1 class="d_name">' + data[i].userName + '</h1><h3 class="d_time">' +function () {
                        if(data[i].diaDate!=undefined){
                            return data[i].diaDate
                        }else {
                            return ''
                        }
                    }()  + '</h3><a href="javascript:;" style="color:#000;" class="public_title" target="_blank"><h2 class="d_title">' + data[i].subject + '</h2></a>' +
                    ''+function () {
                        if(data[i].attachmentId==''){
                            return ''
                        }else {
                            return '<img class="d_accessory" src="img/main_img/accessory.png" alt="">'
                        }
                    }()+'</div></li>'
                /*console.log(str_li);*/
            }

            $('.all_daily').html(str_li);
            if(obj.obj.length==0) {
                var lis = '<li class="no_notice" style="text-align: center;border: none;">' +
                    '<img style="margin-top: 62px;"  src="/img/main_img/shouyekong.png" alt="">' +
                    '<h2 style="text-align: center;color: #666;">'+no_Data+'</h2>' +
                    '</li>';
                $('.all_daily').html(lis);
            }

        }
    })



    $('.all_daily').on('click','li',function(){
        /*	alert('111');*/
        $(this).find('h2').sibling().css('color','#000');
        $(this).find('h2').css('color',' #00a2d4');

    });


    //点击日志更多，显示日志页面
    $('.daily_more').on('click',function(){
        var tid=$(this).attr('tid');

        var url=$(this).attr('url');

        if($('#f_'+tid).length>0){
            $('.all_content .iItem').hide();
            $('#f_'+tid).show();

            $('#t_'+tid).css({
                'background':'url(img/main_img/title_yes.png) 0px 4px no-repeat',
                'color':'#2a588c',
                'position':'relative',
                'z-index':99999
            })
            $('#t_'+tid).siblings().css({
                'background':'url(img/main_img/'+ names +'/title_no.png) 0px 4px no-repeat',
                'color':'#fff',
                'position':'relative',
                'z-index':999
            })
        }else{
            var titlestrs = '<li class="choose " index="0;" id="t_'+tid+'" title="工作日志"><h1>工作日志</h1><div class="img" style="display:none;"><img class="close" src="img/main_img/icon.png"></div></li>';
            var iframestr = '<div id="f_'+tid+'" class="iItem"><iframe id="every_module" src="'+url+'" frameborder="0" scrolling="yes" height="100%" width="100%" noresize="noresize" tid="2"></iframe></div>';
            $('.main_title ul').append(titlestrs);
            $('#t_'+tid).siblings().attr('style','background: url(img/main_img/'+ names +'/title_no.png) 0px 4px no-repeat; ');
            $('#t_'+tid).siblings().css('color','#fff');
            $('.all_content').append(iframestr);
            $('.all_content .iItem').hide();
            $('#f_'+tid).show();
        }
    })


    $('.notify').on('click','li',function(){
        /*alert('111');*/
        $(this).find('h2').siblings().css('color','#000');
        $(this).find('h2').css('color',' #00a2d4');

    });



    $('.no_read_notice').on('click','li',function(){
        /*alert('111');*/
        $(this).find('h2').sibling().css('color','#000');
        $(this).find('h2').css('color',' #00a2d4');

    });

    //点击公告更多，显示公告页面
    $('.more_notice').on('click',function(){
        var tid=$(this).attr('tid');
        var url=$(this).attr('url');
        if($('#f_'+tid).length>0){
            $('.all_content .iItem').hide();
            $('#f_'+tid).show();
            $('#t_'+tid).css({
                'background':'url(img/main_img/title_yes.png) 0px 4px no-repeat',
                'color':'#2a588c',
                'position':'relative',
                'z-index':99999
            })
            $('#t_'+tid).siblings().css({
                'background':'url(img/main_img/'+ names +'/title_no.png) 0px 4px no-repeat',
                'color':'#fff',
                'position':'relative',
                'z-index':999
            })
        }else{
            var titlestrs = '<li class="choose " index="0;" id="t_'+tid+'" title="公告通知"><h1>公告通知</h1><div class="img" style="display:none;"><img class="close" src="img/main_img/icon.png"></div></li>';
            var iframestr = '<div id="f_'+tid+'" class="iItem"><iframe id="every_module" src="'+url+'" frameborder="0" scrolling="yes" height="100%" width="100%" noresize="noresize" tid="2"></iframe></div>';
            $('.main_title ul').append(titlestrs);
            $('#t_'+tid).siblings().attr('style','background: url(img/main_img/'+ names +'/title_no.png) 0px 4px no-repeat; ');
            $('#t_'+tid).siblings().css('color','#fff');
            $('.all_content').append(iframestr);
            $('.all_content .iItem').hide();
            $('#f_'+tid).show();
        }
    })


    //点击日程安排更多，显示公告页面
    $('.more_chedule').on('click',function(){
        var tid=$(this).attr('tid');
        var url=$(this).attr('url');
        if($('#f_'+tid).length>0){
            $('.all_content .iItem').hide();
            $('#f_'+tid).show();

            $('#t_'+tid).css({
                'background':'url(img/main_img/title_yes.png) 0px 4px no-repeat',
                'color':'#2a588c',
                'position':'relative',
                'z-index':99999
            })
            $('#t_'+tid).siblings().css({
                'background':'url(img/main_img/'+ names +'/title_no.png) 0px 4px no-repeat',
                'color':'#fff',
                'position':'relative',
                'z-index':999
            })
        }else{
            var titlestrs = '<li class="choose " index="0;" id="t_'+tid+'" title="日程安排"><h1>日程安排</h1><div class="img" style="display:none;"><img class="close" src="img/main_img/icon.png"></div></li>';
            var iframestr = '<div id="f_'+tid+'" class="iItem"><iframe id="every_module" src="'+url+'" frameborder="0" scrolling="yes" height="100%" width="100%" noresize="noresize" tid="2"></iframe></div>';
            $('.main_title ul').append(titlestrs);
            $('#t_'+tid).siblings().attr('style','background: url(img/main_img/'+ names +'/title_no.png) 0px 4px no-repeat; ');
            $('#t_'+tid).siblings().css('color','#fff');
            $('.all_content').append(iframestr);
            $('.all_content .iItem').hide();
            $('#f_'+tid).show();
        }
    })

    //公共文件柜接口


    //个人文件柜接口



    //点击文件柜更多，显示文件柜页面
    $('.more_wenjian').on('click',function(){
        var tid=$(this).attr('tid');
        var url=$(this).attr('url');
        var titleStr='';
        if(tid==3001){
            titleStr='公共文件柜'
        }else {
            titleStr='网络硬盘'
        }
        /* alert(tid);
         alert(url);*/
        if($('#f_'+tid).length>0){
            $('.all_content .iItem').hide();
            $('#f_'+tid).show();

            $('#t_'+tid).css({
                'background':'url(img/main_img/title_yes.png) 0px 4px no-repeat',
                'color':'#2a588c',
                'position':'relative',
                'z-index':99999
            })
            $('#t_'+tid).siblings().css({
                'background':'url(img/main_img/'+ names +'/title_no.png) 0px 4px no-repeat',
                'color':'#fff',
                'position':'relative',
                'z-index':999
            })
        }else{
            var titlestrs = '<li class="choose " index="0;" id="t_'+tid+'" title="文件柜"><h1>'+titleStr+'</h1><div class="img" style="display:none;"><img class="close" src="img/main_img/icon.png"></div></li>';
            var iframestr = '<div id="f_'+tid+'" class="iItem"><iframe id="every_module" src="'+url+'" frameborder="0" scrolling="yes" height="100%" width="100%" noresize="noresize" tid="2"></iframe></div>';
            $('.main_title ul').append(titlestrs);
            $('#t_'+tid).siblings().attr('style','background: url(img/main_img/'+ names +'/title_no.png) 0px 4px no-repeat; ');
            $('#t_'+tid).siblings().css('color','#fff');
            $('.all_content').append(iframestr);
            $('.all_content .iItem').hide();
            $('#f_'+tid).show();
        }
    })


    //个人文件柜更多，显示文件柜页面
    $('.people_wenjian').on('click','.wenjian',function(){
        /*alert('111')*/
        var tid=$(this).attr('tid');
        var url=$(this).attr('url');
        /* alert(tid);
         alert(url);*/
        if($('#f_'+tid).length>0){
            $('.all_content .iItem').hide();
            $('#f_'+tid).show();

            $('#t_'+tid).css({
                'background':'url(img/main_img/title_yes.png) 0px 4px no-repeat',
                'color':'#2a588c',
                'position':'relative',
                'z-index':99999
            })
            $('#t_'+tid).siblings().css({
                'background':'url(img/main_img/'+ names +'/title_no.png) 0px 4px no-repeat',
                'color':'#fff',
                'position':'relative',
                'z-index':999
            })
        }else{
            var titlestrs = '<li class="choose " index="0;" id="t_'+tid+'" title="文件柜"><h1>公共文件柜</h1><div class="img" style="display:none;"><img class="close" src="img/main_img/icon.png"></div></li>';
            var iframestr = '<div id="f_'+tid+'" class="iItem"><iframe id="every_module" src="'+url+'" frameborder="0" scrolling="yes" height="100%" width="100%" noresize="noresize" tid="2"></iframe></div>';
            $('.main_title ul').append(titlestrs);
            $('#t_'+tid).siblings().attr('style','background: url(img/main_img/'+ names +'/title_no.png) 0px 4px no-repeat; ');
            $('#t_'+tid).siblings().css('color','#fff');
            $('.all_content').append(iframestr);
            $('.all_content .iItem').hide();
            $('#f_'+tid).show();
        }
    })
    //公共文件柜更多，显示文件柜页面
    $('.pets_wenjian').on('click','.total_wenjian',function(){
        /*  alert('111')*/
        var tid=$(this).attr('tid');
        var url=$(this).attr('url');
        /* alert(tid);
         alert(url);*/
        if($('#f_'+tid).length>0){
            $('.all_content .iItem').hide();
            $('#f_'+tid).show();

            $('#t_'+tid).css({
                'background':'url(img/main_img/title_yes.png) 0px 4px no-repeat',
                'color':'#2a588c',
                'position':'relative',
                'z-index':99999
            })
            $('#t_'+tid).siblings().css({
                'background':'url(img/main_img/'+ names +'/title_no.png) 0px 4px no-repeat',
                'color':'#fff',
                'position':'relative',
                'z-index':999
            })
        }else{
            var titlestrs = '<li class="choose " index="0;" id="t_'+tid+'" title="文件柜"><h1>公共文件柜</h1><div class="img" style="display:none;"><img class="close" src="img/main_img/icon.png"></div></li>';
            var iframestr = '<div id="f_'+tid+'" class="iItem"><iframe id="every_module" src="'+url+'" frameborder="0" scrolling="yes" height="100%" width="100%" noresize="noresize" tid="2"></iframe></div>';
            $('.main_title ul').append(titlestrs);
            $('#t_'+tid).siblings().attr('style','background: url(img/main_img/'+ names +'/title_no.png) 0px 4px no-repeat; ');
            $('#t_'+tid).siblings().css('color','#fff');
            $('.all_content').append(iframestr);
            $('.all_content .iItem').hide();
            $('#f_'+tid).show();
        }
    })

    //点击校务公开更多，显示校务公开页面
    $('.more_edu').on('click',function(){
        var tid=$(this).attr('tid');
        var url=$(this).attr('url');
        if($('#f_'+tid).length>0){
            $('.all_content .iItem').hide();
            $('#f_'+tid).show();

            $('#t_'+tid).css({
                'background':'url(img/main_img/title_yes.png) 0px 4px no-repeat',
                'color':'#2a588c',
                'position':'relative',
                'z-index':99999
            })
            $('#t_'+tid).siblings().css({
                'background':'url(img/main_img/'+ names +'/title_no.png) 0px 4px no-repeat',
                'color':'#fff',
                'position':'relative',
                'z-index':999
            })
        }else{
            var titlestrs = '<li class="choose " index="0;" id="t_'+tid+'" title="校务公开管理"><h1>校务公开管理</h1><div class="img" style="display:none;"><img class="close" src="img/main_img/icon.png"></div></li>';
            var iframestr = '<div id="f_'+tid+'" class="iItem"><iframe id="every_module" src="'+url+'" frameborder="0" scrolling="yes" height="100%" width="100%" noresize="noresize" tid="2"></iframe></div>';
            $('.main_title ul').append(titlestrs);
            $('#t_'+tid).siblings().attr('style','background: url(img/main_img/'+ names +'/title_no.png) 0px 4px no-repeat; ');
            $('#t_'+tid).siblings().css('color','#fff');
            $('.all_content').append(iframestr);
            $('.all_content .iItem').hide();
            $('#f_'+tid).show();
        }
    })
})



