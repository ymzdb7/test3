/**
 * Created by 骆鹏 on 2018/3/1.
 */
if(type=='zh_CN'){
    var main_schedule = '日程安排';
    var no_Data='暂无数据';
    var Please_look_process='请查看流程';
}else if(type=='zh_TW'){
    var main_schedule = '日程安排';
    var no_Data='暂无数据';
    var Please_look_process='请查看流程';
}else if(type=='en_US'){
    var main_schedule = 'Schedule';
    var no_Data='No data';
    var Please_look_process='Please look at the process';
}else {
    var main_schedule = '日程安排';
    var no_Data='暂无数据';
    var Please_look_process='请查看流程';
}




function p(s) {
    return s < 10 ? '0' + s: s;
}
function getNowFormatDate(type) {
    var date = new Date();
    var seperator1 = "-";
    var seperator2 = ":";
    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    var currentdate = date.getFullYear() + seperator1 + month + seperator1 + strDate
        + " " + p(date.getHours()) + seperator2 + p(date.getMinutes())
        + seperator2 + p(date.getSeconds());
    if(type==1) {
        return currentdate;
    }else if(type==2){
        return {
            'nian':date.getFullYear(),
            'yue':month,
            'ri':strDate,
            'shi':p(date.getHours()),
            'fen':p(date.getMinutes()),
            'miao':p(date.getSeconds())
        }
    }
}

function news() {

    var obj={
        page:1,
        pageSize:6,
        useFlag:true
    };
    $.get('/news/newsManage',obj,function (json) {
        if(json.flag){
            var datas=json.obj;
            var hsonstrone='';
            var jsonstr='';

            if(datas.length!=0) {
                var imgurl = datas[0].attachment;
                if(imgurl.length!=0){
                    var attachName=imgurl[0].attachName.split('.')[1];
                    if(attachName=='jpg'||attachName=='png'||attachName=='jpeg'){
                        $('.topmainleft .daiban .lt img').prop('src','/xs?'+imgurl[0].attUrl);
                        for(var i=0;i<datas.length;i++){
                            if(i<3) {
                                jsonstr += '<a style="color: #000" href="/news/detail?newsId=' + datas[i].newsId + '" target="_blank"><li class="clearfix">\
                                    <div class="sor-t">\
                                        <div class="sr-f">' + datas[i].subject + '</div>\
                                        <div class="src-r">' + datas[i].newsDateTime.slice(0, 10) + '</div>\
                                    </div>\
                                    <div class="sor-b">' + datas[i].content.replace(/<\/?.+?>/g, "").replace(/ /g, "") + '</div>\
                            </li></a>'
                            }
                        }
                        $('#sorc').html(jsonstr);
                    }else {
                        for(var i=0;i<datas.length;i++){
                            if(i<3) {
                                jsonstr += '<a style="color: #000" href="/news/detail?newsId=' + datas[i].newsId + '" target="_blank"><li class="clearfix">\
                                    <div class="sor-t">\
                                        <div class="sr-f">' + datas[i].subject + '</div>\
                                        <div class="src-r">' + datas[i].newsDateTime.slice(0, 10) + '</div>\
                                    </div>\
                                    <div class="sor-b">' + datas[i].content.replace(/<\/?.+?>/g, "").replace(/ /g, "") + '</div>\
                            </li></a>'
                            }else {
                                hsonstrone += '<a style="color: #000" href="/news/detail?newsId=' + datas[i].newsId + '" target="_blank"><li class="clearfix">\
                                    <div class="sor-t">\
                                        <div class="sr-f">' + datas[i].subject + '</div>\
                                        <div class="src-r">' + datas[i].newsDateTime.slice(0, 10) + '</div>\
                                    </div>\
                                    <div class="sor-b">' + datas[i].content.replace(/<\/?.+?>/g, "").replace(/ /g, "") + '</div>\
                            </li></a>'
                            }




                        }
                        $('#sorc').html(hsonstrone);
                        $('#sorcs').html(jsonstr);
                        $('#sorcs').siblings('img').remove()
                    }
                }else {
                    for(var i=0;i<datas.length;i++){
                        if(i<3) {
                            jsonstr += '<a style="color: #000" href="/news/detail?newsId=' + datas[i].newsId + '" target="_blank"><li class="clearfix">\
                                    <div class="sor-t">\
                                        <div class="sr-f">' + datas[i].subject + '</div>\
                                        <div class="src-r">' + datas[i].newsDateTime.slice(0, 10) + '</div>\
                                    </div>\
                                    <div class="sor-b">' + datas[i].content.replace(/<\/?.+?>/g, "").replace(/ /g, "") + '</div>\
                            </li></a>'
                        }else {
                            hsonstrone += '<a style="color: #000" href="/news/detail?newsId=' + datas[i].newsId + '" target="_blank"><li class="clearfix">\
                                    <div class="sor-t">\
                                        <div class="sr-f">' + datas[i].subject + '</div>\
                                        <div class="src-r">' + datas[i].newsDateTime.slice(0, 10) + '</div>\
                                    </div>\
                                    <div class="sor-b">' + datas[i].content.replace(/<\/?.+?>/g, "").replace(/ /g, "") + '</div>\
                            </li></a>'
                        }
                    }
                    $('#sorc').html(hsonstrone);
                    $('#sorcs').html(jsonstr);
                    $('#sorcs').siblings('img').remove()
                }
            }










            if(datas.length==0) {
                $('.lt').remove();
                $('.rt').remove();
                var lis = '<div class="no_notice" style="text-align: center;border: none;">' +
                    '<img style="margin-top: 62px;"  src="/img/main_img/shouyekong.png" alt="">' +
                    '<h2 style="text-align: center;color: #666;font-size: 14px">'+no_Data+'</h2>' +/*暂无数据*/
                    '</div>';
                    $('.topmainleft .daiban').append(lis)

            }
        }else {
            $('.lt').remove();
            $('.rt').remove();
            var lis = '<div class="no_notice" style="text-align: center;border: none;">' +
                '<img style="margin-top: 62px;"  src="/img/main_img/shouyekong.png" alt="">' +
                '<h2 style="text-align: center;color: #666;font-size: 14px">'+no_Data+'</h2>' +/*暂无数据*/
                '</div>';
            $('.topmainleft .daiban').append(lis)

        }
    },'json')
}

function announcement() {

    var obj={
        page:1,
        pageSize:4,
        useFlag:true,
        documentType:1
    };
    $.get('/document/selWillDocSendOrReceive',obj,function (json) {
        if(json.flag){
            var datas=json.datas;
            var jsonstr='';
            for(var i=0;i<datas.length;i++){
                jsonstr+='<li class="clearfix">\
                    <div class="lef"><div style="float: left;margin: 0 4px"><img style="width: 95%" src="'+function () {
                        if(datas[i].avater==0){
                            return '/img/user/boy.png'
                        }
                        else if(datas[i].avater==1){
                            return '/img/user/girl.png'
                        }else {
                            // return '/img/user/'+datas[i].avater
                            return '/img/user/boy.png'
                        }
                    }()+'" alt=""></div><a style="color: #000;position: relative;top: 2px;">'+function () {

                        if(datas[i].createrName==''||datas[i].createrName==undefined){
                            return datas[i].createrName=''
                        } else {
                            return datas[i].createrName
                        }
                    }()+'<div><a style="color: #1b5e8d;line-height: 24px;" href="/workflow/work/workform?flowId='+datas[i].flowId+'&prcsId='+datas[i].realPrcsId+'&flowStep='+datas[i].step
                    +'&runId='+datas[i].runId+'&tabId='+datas[i].id+'&tableName='+datas[i].tableName+'&isNomalType=false&hidden=true&opFlag='+datas[i].opFlag+'" target="_blank">'+function () {
                        if(datas[i].title==''||datas[i].title==undefined){
                            return datas[i].title=''
                        } else {
                            return datas[i].title
                        }
                    }()+'</a></div></div>\
                    </a><div class="rit">'+datas[i].printDate+'</div>\
                </li>'
            }
            $('#witgw').html(jsonstr);
            if(datas.length==0) {
                var lis = '<li class="no_notice" style="text-align: center;border: none;">' +
                    '<img style="margin-top: 62px;"  src="/img/main_img/shouyekong.png" alt="">' +
                    '<h2 style="text-align: center;color: #666;font-size: 14px">'+no_Data+'</h2>' +/*暂无数据*/
                    '</li>';
                $('#witgw').html(lis);
            }
        }else {
            var lis = '<li class="no_notice" style="text-align: center;border: none;">' +
                '<img style="margin-top: 62px;"  src="/img/main_img/shouyekong.png" alt="">' +
                '<h2 style="text-align: center;color: #666;font-size: 14px">'+no_Data+'</h2>' +/*暂无数据*/
                '</li>';
            $('#witgw').html(lis);
        }
    },'json')
}

function dbsend() {

    var obj={
        page:1,
        pageSize:4,
        useFlag:true,
        documentType:0,
    };
    $.get('/document/selWillDocSendOrReceive',obj,function (json) {
        if(json.flag){
            var datas=json.datas;
            var jsonstr='';
            for(var i=0;i<datas.length;i++){
                jsonstr+='<li class="clearfix">\
                    <div class="lef"><div style="float: left;margin: 0 4px"><img style="width: 95%" src="'+function () {
                        if(datas[i].avater==0){
                            return '/img/user/boy.png'
                        }
                        else if(datas[i].avater==1){
                            return '/img/user/girl.png'
                        }else {
                            // return '/img/user/'+datas[i].avater
                            return '/img/user/boy.png'
                        }
                    }()+'" alt=""></div><a style="color: #000;position: relative;top:2px;">'+function () {

                        if(datas[i].createrName==''||datas[i].createrName==undefined){
                            return datas[i].createrName=''
                        } else {
                            return datas[i].createrName
                        }
                    }()+'<div><a style="color: #1b5e8d;line-height: 24px;" href="/workflow/work/workform?flowId='+datas[i].flowId+'&prcsId='+datas[i].realPrcsId+'&flowStep='+datas[i].step
                    +'&runId='+datas[i].runId+'&tabId='+datas[i].id+'&tableName='+datas[i].tableName+'&isNomalType=false&hidden=true&opFlag='+datas[i].opFlag+'" target="_blank">'+function () {
                        if(datas[i].title==''||datas[i].title==undefined){
                            return datas[i].title=''
                        } else {
                            return datas[i].title
                        }
                    }()+'</a></div></div>\
                    </a><div class="rit">'+datas[i].printDate+'</div>\
                </li>'
            }
            $('#dbsend').html(jsonstr);
            if(datas.length==0) {
                var lis = '<li class="no_notice" style="text-align: center;border: none;">' +
                    '<img style="margin-top: 62px;"  src="/img/main_img/shouyekong.png" alt="">' +
                    '<h2 style="text-align: center;color: #666;font-size: 14px">'+no_Data+'</h2>' +/*暂无数据*/
                    '</li>';
                $('#dbsend').html(lis);
            }
        }else {
            var lis = '<li class="no_notice" style="text-align: center;border: none;">' +
                '<img style="margin-top: 62px;"  src="/img/main_img/shouyekong.png" alt="">' +
                '<h2 style="text-align: center;color: #666;font-size: 14px">'+no_Data+'</h2>' +/*暂无数据*/
                '</li>';
            $('#dbsend').html(lis);
        }
    },'json')
}

function meti() {

    var obj={
        page:1,
        pageSize:4,
        useFlag:true,
    };
    $.get('/meeting/getMeetingNotify',obj,function (json) {
        if(json.flag){
            var datas=json.obj;
            var jsonstr='';
            for(var i=0;i<datas.length;i++){
                jsonstr+='<li class="clearfix">\
                    <div class="lef" style="margin-top: 7px;font-size: 14px"><div style="float: left;margin: 0 8px"><img src="img/data_point.png" alt=""></div><a style="color: #1b5e8d" href="meeting/detail?meetingId='+datas[i].sid+'" target="_blank">'+function () {
                        if(datas[i].meetName==''||datas[i].meetName==undefined){
                            return datas[i].meetName=''
                        } else {
                            return datas[i].meetName
                        }
                    }()+'</a></div>\
                    <div class="rit">'+function () {

                        if(datas[i].startTime!=undefined){
                            return datas[i].startTime.slice(0,10)
                        }else {
                            return ''
                        }


                    }()+'</div>\
                </li>'
            }
            $('#huiyi').html(jsonstr);
            if(datas.length==0) {
                var lis = '<li class="no_notice" style="text-align: center;border: none;">' +
                    '<img style="margin-top: 62px;"  src="/img/main_img/shouyekong.png" alt="">' +
                    '<h2 style="text-align: center;color: #666;font-size: 14px">'+no_Data+'</h2>' +/*暂无数据*/
                    '</li>';
                $('#huiyi').html(lis);
            }
        }else {
            var lis = '<li class="no_notice" style="text-align: center;border: none;">' +
                '<img style="margin-top: 62px;"  src="/img/main_img/shouyekong.png" alt="">' +
                '<h2 style="text-align: center;color: #666;font-size: 14px">'+no_Data+'</h2>' +/*暂无数据*/
                '</li>';
            $('#huiyi').html(lis);
        }
    },'json')
}


var now = null;
var  today_now=null;

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


function richeng(time) {
    $.get('/schedule/getscheduleByDay',{
        userId: $.cookie('userId'),
        time: time
    },function (json) {
        if(json.flag){
            var arr=json.obj;
            var str='';
            for(var i=0;i<arr.length;i++){/*日程安排*/
                str+='<li>\
                    <img style="margin-right: 5px" src="img/main_img/naozhong.png" alt="">\
                    <span class="overhides">'+arr[i].content+'</span>\
                    <div class="fr"\
                    onclick="parent.getMenuOpen(this)" menu_tid="0124" data-url="calendar">\
                    <img style="margin: 0 10px;cursor: pointer" src="img/main_img/xiugaia.png" alt="">\
                    <h2 class="hide">'+main_schedule+'</h2>\
                     </div>\
                     <div class="fr"\
                    onclick="parent.getMenuOpen(this)" menu_tid="0124" data-url="calendar">\
                    <img  style="cursor: pointer" src="img/main_img/chakana.png" alt="">\
                    <h2 class="hide">'+main_schedule+'</h2>\
                    </div>\
                    </li>'
            }
            $('.topmainright .topmainright-main').html(str)
            if(arr.length==0) {
                var lis = '<li class="no_notice" style="text-align: center;border: none;margin-top: 0px;line-height:107px;">' +

                    '<p style="height:0;text-align: center;color: #666;font-size: 11pt">暂无待办日程</p>' +/*暂无数据*/
                    '</li>';
                $('.topmainright .topmainright-main').html(lis);
            }
        }
    },'json')
}

$(function () {


    console.log(getNowFormatDate(2))

    $('.topmainright .r-top h4').text(getNowFormatDate(2).nian+'-'+getNowFormatDate(2).yue+'-'+getNowFormatDate(2).ri)
    $('.topmainright .r-top h3').text(getNowFormatDate(2).shi+':'+getNowFormatDate(2).fen)

    richeng(timestamp2)
    var dates=getNowFormatDate(2);
    $('.daibantop .left h4').text(dates.shi+':'+dates.fen)
    $('.daibantop .left span').text(dates.nian+'-'+dates.yue+'-'+dates.ri)

    announcement()
    dbsend()
    meti()
    news()
    $.get('email/showEmail',{
            flag:'inbox',
            page:1,
            pageSize:5,
            useFlag:'true'
    },function (json) {
        if(json.flag){
            var data=json.obj;
            var all='';
            var yidu='';
            var weidu='';
            for(var i=0;i<data.length;i++){
                for(var m=0;m<data[i].emailList.length;m++){
                    all+=' <li class="clearfix">\
                        <span class="fl">\
                        <img style="width: 38px;" src="'+function () {
                            if(data[i].users.avatar==0){
                                return '/img/user/boy.png'
                            }
                            else if(data[i].users.avatar==1){
                                return '/img/user/girl.png'
                            }else {
                                return '/img/user/'+data[i].users.avatar
                            }
                        }()+'" alt="">\
                        </span>\
                        <div class="textmains fl" style="width: calc(100% - 38px)">\
                        <p class="top">\
                        <label>'+data[i].users.userName+'</label>\
                        <a class="fr" href="javascript:;">'+
                        new Date((data[i].sendTime) * 1000).Format('MM-dd hh:mm:ss').replace(/\s/g, '<i style="margin-right:10px;"></i>')+'</a>\
                    </p>\
                    <p class="buttom">\
                        <span><a target="_blank" href="/email/details?id=' + data[i].emailList[m].emailId + '">'+data[i].subject+'</a></span>\
                    '+function () {
                            if(data[i].attachmentId==''){
                                return ''
                            }else {
                                return '<img style="float: right"  class="accessory" src="img/main_img/accessory.png" alt="">'
                            }
                        }()+'\
                        </p>\
                        </div>\
                        </li>'




                    if (data[i].emailList[m].readFlag == 0) {
                        weidu+='<li class="clearfix">\
                            <span class="fl">\
                            <img style="width: 38px;" src="'+function () {
                                if(data[i].users.avatar==0){
                                    return '/img/user/boy.png'
                                }
                                else if(data[i].users.avatar==1){
                                    return '/img/user/girl.png'
                                }else {
                                    return '/img/user/'+data[i].users.avatar
                                }
                            }()+'" alt="">\
                            </span>\
                            <div class="textmains fl" style="width: calc(100% - 38px)">\
                            <p class="top">\
                            <label>'+data[i].users.userName+'</label>\
                            <a class="fr" href="javascript:;">'+
                            new Date((data[i].sendTime) * 1000).Format('MM-dd hh:mm:ss').replace(/\s/g, '<i style="margin-right:10px;"></i>')+'</a>\
                        </p>\
                        <p class="buttom">\
                            <span><a target="_blank" href="/email/details?id=' + data[i].emailList[m].emailId + '">'+data[i].content.replace(/<\/?.+?>/g,"").replace(/ /g,"")+'</a></span>\
                        '+function () {
                                if(data[i].attachmentId==''){
                                    return ''
                                }else {
                                    return '<img  class="accessory" src="img/main_img/accessory.png" alt="">'
                                }
                            }()+'\
                            </p>\
                            </div>\
                            </li>'
                    }
                    else if(data[i].emailList[m].readFlag == 1){
                        yidu+=  ' <li class="clearfix">\
                        <span class="fl">\
                        <img style="width: 38px;" src="'+function () {
                                if(data[i].users.avatar==0){
                                    return '/img/user/boy.png'
                                }
                                else if(data[i].users.avatar==1){
                                    return '/img/user/girl.png'
                                }else {
                                    return '/img/user/'+data[i].users.avatar
                                }
                            }()+'" alt="">\
                        </span>\
                        <div class="textmains fl" style="width: calc(100% - 38px)">\
                        <p class="top">\
                        <label>'+data[i].users.userName+'</label>\
                        <a class="fr" href="javascript:;">'+
                            new Date((data[i].sendTime) * 1000).Format('MM-dd hh:mm:ss').replace(/\s/g, '<i style="margin-right:10px;"></i>')+'</a>\
                    </p>\
                    <p class="buttom">\
                        <span><a target="_blank" href="/email/details?id=' + data[i].emailList[m].emailId + '">'+data[i].subject+'</a></span>\
                    '+function () {
                                if(data[i].attachmentId==''){
                                    return ''
                                }else {
                                    return '<img style="float: right"  class="accessory" src="img/main_img/accessory.png" alt="">'
                                }
                            }()+'\
                        </p>\
                        </div>\
                        </li>'
                    }
                }
            }

            $('[data-t="all"]').html(all)
            $('[data-t="weidu"]').html(weidu)
            $('[data-t="yidu"]').html(yidu)
            if(all==''){
                var lis = '<li class="no_notice" style="text-align: center;border: none;">' +
                    '<img style="margin-top: 62px;"  src="/img/main_img/shouyekong.png" alt="">' +
                    '<h2 style="text-align: center;color: #666;    font-size: 14px;">'+no_Data+'</h2>' +/*暂无数据*/
                    '</li>';
                $('[data-t="all"]').html(lis);
            }
            if(weidu==''){
                var lis = '<li class="no_notice" style="text-align: center;border: none;">' +
                    '<img style="margin-top: 62px;"  src="/img/main_img/shouyekong.png" alt="">' +
                    '<h2 style="text-align: center;color: #666;    font-size: 14px;">'+no_Data+'</h2>' +/*暂无数据*/
                    '</li>';
                $('[data-t="weidu"]').html(lis);
            }
            if(yidu==''){
                var lis = '<li class="no_notice" style="text-align: center;border: none;">' +
                    '<img style="margin-top: 62px;"  src="/img/main_img/shouyekong.png" alt="">' +
                    '<h2 style="text-align: center;color: #666;    font-size: 14px;">'+no_Data+'</h2>' +/*暂无数据*/
                    '</li>';
                $('[data-t="yidu"]').html(lis);
            }


        }
    },'json')



    $.get('/todoList/smsListByType',function (json) {
        var daiban='';
        var data=json.data;
        if(data.workFlow!=undefined) {
            for (var i = 0; i < data.workFlow.length; i++) {
                daiban += '<li class="clearfix" onclick="parent.windowOpenNew(this)"\
                data-url="'+data.workFlow[i].remindUrl+'" data-s="2" style="cursor: pointer">\
                <span class="fl">\
                <img style="width: 38px;" src="'+function () {
                        if(data.workFlow[i].avater==0){
                            return '/img/user/boy.png'
                        }
                        else if(data.workFlow[i].avater==1){
                            return '/img/user/girl.png'
                        }else {
                            return '/img/user/'+data.workFlow[i].avater
                        }
                    }()+'" alt="">\
                </span>\
                <div class="textmains fl" style="width: calc(100% - 38px)">\
                <p class="top">\
                <label>'+data.workFlow[i].userName+'</label>\
                <a class="fr" href="javascript:;">'+data.workFlow[i].sendTimeStr.replace(/\s/,'<i style="margin: 0px 5px;"></i>')+'</a>\
            </p>\
            <p class="buttom">\
                <span>'+data.workFlow[i].content+'</span>\
            <a href="javascript:;" style="float: right;color: #3c92e5;">'+Please_look_process+'</a>\
                </p>\
                </div>\
                </li>'
            }/*请查看流程*/
            $('#liucheng').html(daiban);
            if(data.workFlow.length==0) {
                var lis = '<li class="no_notice" style="text-align: center;border: none;">' +
                    '<img style="margin-top: 62px;"  src="/img/main_img/shouyekong.png" alt="">' +
                    '<h2 style="text-align: center;color: #666;font-size: 14px">'+no_Data+'</h2>' +/*暂无数据*/
                    '</li>';
                $('#liucheng').html(lis);

            }

        }
    },'json')

    $.get('/portals/selPortalsUser',function (json) {
        if(json.flag){
            var data=json.object;
            $('.daibantop .right strong').text(data.diary.userName);
            $('.daibantop .right .zhiwei').text(data.userPrivName);
            $('.daibanbuttom .buttom').text(data.diary.subject);
            $($('.daibanbuttom .left p')[0]).find('span').text(data.toDoCount);
            $($('.daibanbuttom .left p')[1]).find('span').text(data.doneCount);
            var str='';
            if(data.avatar==0){
                str= '/img/user/boy.png'
            }
            else if(data.avatar==1){
                str= '/img/user/girl.png'
            }else {
                str= '/img/user/'+data.avatar
            }
            $('#nameurl').prop('src',str)
        }
    },'json')



    $.get('/news/newsManage',{
        page:'1',
        read:'',
        pageSize:'2',
        useFlag:'true'
    },function (json) {
        if(json.flag){
            var datas=json.obj;
            var str='';
            for(var i=0;i<datas.length;i++){
                str+=' <div class="textmain">\
                    <p class="title">\
                    <strong>'+datas[i].subject+'</strong>\
                    <a class="fr" href="javascript:;">'+datas[i].newsDateTime.split(/\s/)[0]+'</a>\
                </p>\
                <p class="pmain">\
                '+datas[i].content.replace(/<\/?.+?>/g,"").replace(/ /g,"")+'\
                </p>\
                </div>'
            }
            $('.topmaincenter').append(str);
            if(str==''){

                     str = '<div class="no_notice" style="text-align: center;border: none;">' +
                        '<img style="margin-top: 62px;"  src="/img/main_img/shouyekong.png" alt="">' +
                        '<h2 style="text-align: center;color: #666;    font-size: 14px;">'+no_Data+'</h2>' +/*暂无数据*/
                        '</div>';
                    $('.topmaincenter').append(str);

            }

        }
    },'json')





    
    
    
    $('.navigations span').click(function () {
        $(this).siblings('span').removeClass('active');
        $(this).addClass('active')
        $(this).parent().parent().siblings('ul').hide()
        $(this).parent().parent().siblings('[data-t="'+$(this).attr('data-type')+'"]').show();
    })







})