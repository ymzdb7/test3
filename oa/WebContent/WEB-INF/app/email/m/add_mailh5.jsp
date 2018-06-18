<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <link rel="stylesheet" href="../../css/email/m/jquery.mobile.css" />
    <link rel="stylesheet" href="../../css/diary/m/mui.min.css"/>
    <link rel="stylesheet" href="../../css/email/m/mail.css" />
    <link rel="stylesheet" type="text/css" href="../../css/email/m/add_mail.css"/>
    <title>发邮件</title>
    <style>
        html,body{
            height: 100%;
            width:100%;
            overflow: auto;
        }
        .mui-table-view-cell{
            padding: 6px 15px;
        }
        .mui-bar-nav~.mui-content {
            height: 100%;
            background: #fff;
            overflow: auto;
        }
        .mui-input-row label{
            padding-left: 0;font-family:'microsoft yahei';width: 80px;
        }
        .mui-input-row label~input{
            float: left;
            padding: 10px 0;
            width: calc(100% - 120px);
        }
        .mui-input-row span{
            float: right;
            line-height: 40px;
        }
        .mui-input-row span img{
            vertical-align: top;
        }
        .mui-text-justify{
            height: calc(100% - 100px) !important;
        }
        textarea{
            height: calc(100% - 40px) !important;
            border: 0;
            text-indent: 2em;
            padding: 10px;
        }
        .mui-content form p{
            margin: 20px;
            font-size: 16px;
        }
        #forms label,#forms1 label{
            width: 400px;
        }
        #modal header{overflow: hidden;}
        .checkbox1,.checkbox2{
            width: 70px;
            height: 70px;
        }
    </style>
</head>
<body id="add">
<header class="mui-bar mui-bar-nav" id="header">
    <a class="mui-action-back mui-icon mui-icon-left-nav mui-pull-left"></a>
    <h1 class="mui-title">写邮件</h1>
    <a class="mui-btn mui-btn-blue mui-btn-link mui-pull-right" id="send">发送</a>
</header>
<div class="mui-content" id="aaa">
    <div class="mui-table">
        <ul class="mui-table-view">
            <li class="mui-table-view-cell mui-input-row"><label class="mui-left">收件人：</label><input type="text" placeholder="选择联系人" value="" class="mui-input-clear" id="tname"/><input value="" type="hidden" id="reciever"/><a
                    href="javascript:;" style="display: grid;" id="Popover_0"><span class='mui-icon mui-icon-plus'  ></span></a></li>
            <li class="mui-table-view-cell mui-input-row"><label class="mui-left">抄送人：</label><input type="text" placeholder="选择联系人" value="" id="cname" class="mui-input-clear"/><input type="hidden" value="" id="copyreciever"/><a
                    href="javascript:;" style="display: grid;" id="Popover_1"><span class='mui-icon mui-icon-plus'></span></a></li>
            <li class="mui-table-view-cell mui-input-row"><label class="mui-left">标题：</label><input type="text" placeholder="请输入主题" class="mui-input-clear" value="" id="mtitle"/></li>
            <li class="mui-table-view-cell">
                <div class="new_type">附&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;件：<span class='mui-icon mui-icon-plus mui-pull-right' onclick="appendByGallery()"></span></div>
                <div class="log_share" id=''>
                    <ul id="files" style="text-align:left;width: 85%;display: inline-block;">
                        <p id="empty" style="font-size:12px;color:#C6C6C6;">无上传文件</p>
                    </ul>
                </div>
            </li>
        </ul>
    </div>
    <div class="mui-text-justify">
        <textarea class="mui-text-left mui-bor" placeholder="输入正文" id="msg_str"></textarea>
        <div class="mui-text-center" id="start"></div>
    </div>
</div>

<div class="mui-content" style="display: none" id="ccc">
    <div class="mui-bar mui-bar-nav" id="header2">
        <a class="mui-icon mui-icon-close mui-pull-left" href="#modal" id="app"></a>
        <h1 class="mui-title">选择人员</h1>
        <a class="mui-btn-link mui-pull-right" id="re_mail">确认</a>
    </div>
    <div  style="height: 100%;">
        <div id="forms">

        </div>
    </div>
</div>
<div class="mui-content"  style="display: none" id="bbb">
    <div class="mui-bar mui-bar-nav" id="header1">
        <a class="mui-icon mui-icon-close mui-pull-left" href="#modal1" ></a>
        <h1 class="mui-title">选择人员</h1>
        <a class="mui-btn-link mui-pull-right" id="re_mail1">确认</a>
    </div>
    <div  style="height: 100%;">
        <div id="forms1">

        </div>
    </div>
</div>
<script type="text/javascript" src="../../js/notes/jquery-2.1.2.min.js" ></script>
<script type="text/javascript" src="../../js/diary/m/mui.min.js" ></script>
<script type="text/javascript" src="../../js/diary/m/simbaJs.js" ></script>
<script type="text/javascript" src="../../js/diary/m/vue.min.js" ></script>
<%--<script src="/ui/_js/base.js"></script>--%>
<script type="text/javascript">
    /**
     * @property{IDString} id id元素
     * @param {AttrString}
     * @param {AttrValueString}
     * @type {HTMLString}
     */
    var mid='',num='';
    var checkVals;
    var checkVals1
    var u = navigator.userAgent;
    var isAndroid = u.indexOf('Android') > -1 || u.indexOf('Adr') > -1; //android终端
    var isiOS = !!u.match(/\(i[^;]+;( U;)? CPU.+Mac OS X/); //ios终端
    if(isAndroid == true){
        document.getElementById("start").innerHTML='---发自我的全流程Android版本---';
    }else if(isiOS == true){
        document.getElementById("start").innerHTML='---发自我的全流程IOS版本---';
    }
//    function plusReady(){
//        plus.io.requestFileSystem( plus.io.PRIVATE_WWW, function( fs ) {
//            // 可通过fs操作PRIVATE_WWW文件系统
//            // ......
//        }, function ( e ) {
//            alert( "Request file system failed: " + e.message );
//        });
//    }
//    if(window.plus){
//        plusReady();
//    }else{
//        document.addEventListener('plusready',plusReady,false);
//    }
//    (function($) {
//        $.init({
//            beforeback:function(){
//                var list=plus.webview.currentWebview().opener();
//                mui.fire(list,'refresh');
//                return true;
//            }
//        });
//    })(mui);
    //选择收件人，抄送人
    			var btn0 = document.getElementById("Popover_0");
    			btn0.addEventListener('tap', function() {
                        var bt111 = document.getElementById("aaa");
                        var bt = document.getElementById("ccc");
                            bt111.style.display= "none";
                            bt.style.display= "block";
                    mui.ajax('/user/getAlluser', {
                        dataType: 'json',//服务器返回json格式数据
                        type: 'get',//HTTP请求类型
                        success: function (data) {
                            //服务器返回响应，根据响应结果，分析是否登录成功；
                            if (data.flag) {
                                var str='';
                                var arr=data.obj
                                for(var i=0;i<arr.length;i++){
                                    str+='<div class="mui-input-row mui-checkbox mui-left">'+
                                        '<label>'+arr[i].userName+'</label>'+
                                        '<input style="width: 70px;height: 70px;" class="checkbox1" name="checkbox1" value="'+arr[i].userName+'" type="checkbox" ids="'+arr[i].userId+'">'+
                                    '</div>'
                                }

                            }

                            $("#forms")[0].innerHTML = str;
                        },
                        error: function (xhr, type, errorThrown) {
                            //异常处理；
                            //console.log(type);
                        }
                    });
                    mui("#header2").on('tap', '#re_mail', function () {
                            var rdsObj   = document.getElementsByClassName('checkbox1');
                             var checkVal = new Array();
                            var k        = 0;
                            for(i = 0; i < rdsObj.length; i++){
                                if(rdsObj[i].checked){
                                    checkVal[k] = rdsObj[i].value;
                                    k++;
                                }
                            }

                        var rdsObj   = document.getElementsByClassName('checkbox1');
                         checkVals = new Array();

                        var k = 0;
                        for(i = 0; i < rdsObj.length; i++){
                            if(rdsObj[i].checked){
                                checkVals[k] = rdsObj[i].getAttribute('ids');
                                k++;
                            }
                        }
                        bt111.style.display= "block";
                        bt.style.display= "none";
                        document.getElementById("tname").setAttribute('value',checkVal);
                        document.getElementById("tname").setAttribute('ids',checkVals);
                    });
                });

    var btn1 = document.getElementById("Popover_1");
    btn1.addEventListener('tap', function() {
        var bt111 = document.getElementById("aaa");
        var bt = document.getElementById("bbb");
        bt111.style.display= "none";
        bt.style.display= "block";
        mui.ajax('/user/getAlluser', {
            dataType: 'json',//服务器返回json格式数据
            type: 'get',//HTTP请求类型
            success: function (data) {
                //服务器返回响应，根据响应结果，分析是否登录成功；
                if (data.flag) {
                    var str='';
                    var arr=data.obj
                    for(var i=0;i<arr.length;i++){
                        str+='<div class="mui-input-row mui-checkbox mui-left">'+
                            '<label>'+arr[i].userName+'</label>'+
                            '<input style="width: 70px;height: 70px;" class="checkbox2" name="checkbox2" value="'+arr[i].userName+'" type="checkbox" ids="'+arr[i].userId+'">'+
                            '</div>'
                    }

                }

                $("#forms1")[0].innerHTML = str;
            },
            error: function (xhr, type, errorThrown) {
                //异常处理；
                //console.log(type);
            }
        });
        mui("#header1").on('tap', '#re_mail1', function () {

            var rdsObj   = document.getElementsByClassName('checkbox2');
            var checkVal = new Array();
            var k        = 0;
            for(i = 0; i < rdsObj.length; i++){
                if(rdsObj[i].checked){
                    checkVal[k] = rdsObj[i].value;
                    k++;
                }
            }
            var rdsObj   = document.getElementsByClassName('checkbox2');
             checkVals1 = new Array();
            var k = 0;
            for(i = 0; i < rdsObj.length; i++){
                if(rdsObj[i].checked){
                    checkVals1[k] = rdsObj[i].getAttribute('ids');
                    k++;
                }
            }
            bt111.style.display= "block";
            bt.style.display= "none";
            document.getElementById("cname").setAttribute('value',checkVal);
            document.getElementById("cname").setAttribute('ids',checkVals1);
        });
    });
//     拍照添加文件
//    function appendByCamera(){
//        plus.camera.getCamera().captureImage(function(p){
//            appendFile(p);
//        });
//    }
////     从相册添加文件
//    function appendByGallery(){
//        plus.gallery.pick(function(p){
//            appendFile(p);
//        });
//    }
////     添加文件
//    var index=1;
//    function appendFile(p){
//        var fe=document.getElementById("files");
//        var li=document.createElement("li");
//        var n=p.substr(p.lastIndexOf('/')+1);
//        li.innerText=n;
//        fe.appendChild(li);
//        files.push({name:"uploadkey"+index,path:p});
//        index++;
//        empty.style.display="none";
//    }
////     产生一个随机数
//    function getUid(){
//        return Math.floor(Math.random()*100000000+10000000).toString();
//    }
////     从相册添加文件
//    			function appendByGallery(){
//    				plus.gallery.pick(function(p){
//    			        // 添加文件
//    					var index=1;
//    					var p=p;
//    					//function appendFile(p){
//    						var fe=document.getElementById("files");
//    						var li=document.createElement("li");
//    						var n=p.substr(p.lastIndexOf('/')+1);
//    						li.innerText=n;
//    						fe.appendChild(li);
//    						files.push({name:"uploadkey"+index,path:p});
//    						index++;
//    						empty.style.display="none";
//    					//}
//    			    });
//    			}
////     创建上传任务
//    var files=[];
//    function upload(mid,num) {
//        var server='http://app.oaoa.pro/app/mail/a/add.php?bid='+mid+'&num='+num;
//        if(files.length<=0){
//            mui.openWindow({
//                id:'index.html',
//                url:'index.html'
//            });
//            plus.webview.currentWebview().close('none')
//        }else{
//            var wt=plus.nativeUI.showWaiting();
//            var task=plus.uploader.createUpload(server,
//                {method:"POST"},
//                function(t,status){ //上传完成
//                    if(status==200){
//                        mui.back();
//                        plus.webview.currentWebview().close('none');
//                        wt.close();
//                    }else{
//                        alert("失败");
//                        wt.close();
//                    }
//                }
//            );
//            task.addData("client","HelloH5+");
//            task.addData("uid",getUid());
//            for(var i=0;i<files.length;i++){
//                var f=files[i];
//                task.addFile(f.path,{key:f.name});
//            }
//            task.start();
//        }
//    }
//    //发送邮件
    mui('#header').on('tap', '#send', function(e) {



        var str1=''
        if(checkVals1==undefined){
            str1=''
        }else{
            str1+=checkVals1.join(",")
        }

        if(document.getElementById("tname").value==""){
            var btnArray = ['确认'];
            mui.confirm('请选择至少一个收件人！', ' ', btnArray, function(e) {
            })
        }else{
            if(document.getElementById("mtitle").value==""){
                var btnArray = ['是', '否'];
                mui.confirm('邮件没有主题，是否继续发送？', '提示信息', btnArray, function(e) {
                    if (e.index == 0) {
                        send_mail(document.getElementById("reciever").value,document.getElementById("copyreciever").value);
                    } else {
                        var btnArray = ['确认'];
                        mui.confirm('您取消了发送！', ' ', btnArray, function(e) {
                        })
                    }
                });
            }else{
                var str='';
                str+=checkVals.join(",")
                mui.ajax('/email/sendEmail',{
                    data:{
                        toId2:str,
                        copyToId:str1,
                        subject:document.getElementById("mtitle").value,
                        content:document.getElementById("msg_str").value,
                        remark:document.getElementById("start").innerHTML
                    },
                    dataType:'json',//服务器返回json格式数据
                    type:'post',//HTTP请求类型
                    success:function(data){
                if(data.flag){
                   var btnArray = ['确认'];
                    mui.confirm('发送成功', ' ', btnArray, function(e) {
                        mui.back();
                    })
                }else{
                    var btnArray = ['确认'];
                    mui.confirm('发送失败！', ' ', btnArray, function(e) {
                    })
                }

                    }
//
                });
            }
        }

    });
//    function send_mail(str1,str2){
//        mui.ajax('http://app.oaoa.pro/app/mail/a/add.php',{
//            data:{
//                sflag:'1',
//                tid_str:str1,
//                cid_str:str2,
//                mtiltle:document.getElementById("mtitle").value,
//                message:document.getElementById("msg_str").value,
//                remark:document.getElementById("start").innerHTML
//            },
//            dataType:'json',//服务器返回json格式数据
//            type:'post',//HTTP请求类型
//            beforeSend: function() {
//                mui('#send').button('loading');
//            },
//            complete: function() {
//                mui('#send').button('reset');
//            },
//            success:function(data){
//                if( data.state=="ok"){
//                    mid=data.bid;
//                    num=data.count;
//                    upload(mid,num);
//                    plus.nativeUI.toast('发布成功！','500') ;
//                    mui.back();
//                }else{
//                    plus.nativeUI.toast('发布失败！','500') ;
//                }
//            },
//            error:function(e){
//                mui.alert(JSON.stringify(e));
//            }
//        });
//    }
</script>
</body>
</html>