<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String corpId = (String)request.getAttribute("corpId");
    String corpSecret = (String)request.getAttribute("corpSecret");
%>
<!DOCTYPE html>
<head>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0,user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <link rel="stylesheet" href="../../css/diary/m/mui.min.css" />
    <script type="text/javascript" src="../../js/diary/m/mui.min.js" ></script>
    <link rel="stylesheet" href="../../css/email/m/mail.css" />
    <link rel="stylesheet" href="../../css/email/m/add_mail.css" />
    <title>回复邮件</title>
    <style>
        html,body{
            height: 100%;
            width:100%;
            overflow: auto;
        }
        .choose_type{
            height: 50px;
            line-height: 50px;
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
            padding-left: 0;
            font-family:'microsoft yahei';
            width: 90px;
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
            height: 40% !important;
            border: 0;
            text-indent: 2em;
            padding: 10px;
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
    <h1 class="mui-title">回复</h1>
    <a class="mui-btn mui-btn-blue mui-btn-link mui-pull-right" id="send">发送</a>
</header>
<div class="mui-content" id="aaa">
    <div class="mui-table">
        <ul class="mui-table-view">
            <li class="mui-table-view-cell mui-input-row"><label class="mui-left">收件人：</label><input type="text" disabled="disabled" placeholder="选择联系人"  readonly="readonly" value="" class="mui-input-clear" id="tname"/><input value="" type="hidden" id="reciever"/><a
                    href="javascript:;" style="display: initial;" id="Popover_0"><span class='mui-icon mui-icon-plus'  ></span></a></li>
            <li class="mui-table-view-cell mui-input-row"><label class="mui-left">抄送人：</label><input type="text" placeholder="选择联系人" value="" id="cname" class="mui-input-clear"/><input type="hidden" value="" id="copyreciever"/><a
                    href="javascript:;" style="display: initial;" id="Popover_1"><span class='mui-icon mui-icon-plus'></span></a></li>
            <li class="mui-table-view-cell mui-input-row"><label class="mui-left">标题：</label><input type="text" disabled="disabled" placeholder="请输入主题" class="mui-input-clear" value="" id="mtitle"/></li>
            <li class="mui-table-view-cell mui-input-row"><label class="mui-left">附件：</label><a onclick="appendByGallery()" class="mui-pull-right"><span class='mui-icon mui-icon-plus'></span></a></li>
        </ul>
        <ul id="files" style="text-align:left;width: 85%;display: inline-block;">
            <p id="empty" style="font-size:12px;color:#C6C6C6;">无上传文件</p>
        </ul>
    </div>
    <div class="mui-text-justify">
        <textarea class="mui-text-left mui-bor" placeholder="输入正文" id="msg_str"></textarea>
        <div class="mui-text-center" id="start"></div>
        <div style="padding: 5px;width: 100%;text-align: center;color: #6D6D72; ">----------------原始邮件--------------</div>
        <div class="mui-text-left" id="old_message"></div>
    </div>
</div>

<%--<div id="modal" class="mui-modal">--%>
    <%--<div class="mui-bar mui-bar-nav" id="header2">--%>
        <%--<a class="mui-icon mui-icon-close mui-pull-left" href="#modal" id="app"></a>--%>
        <%--<h1 class="mui-title">选择人员</h1>--%>
        <%--<a class="mui-btn-link mui-pull-right" id="re_mail">确认</a>--%>
    <%--</div>--%>
    <%--<div class="mui-content" style="height: 100%;">--%>
        <%--<div id="forms">--%>
        <%--</div>--%>
    <%--</div>--%>
<%--</div>--%>
<div class="mui-content" style="display: none" id="ccc">
    <div class="mui-bar mui-bar-nav" id="header1">
        <a class="mui-icon mui-icon-close mui-pull-left" href="#modal" id="app"></a>
        <h1 class="mui-title">选择人员</h1>
        <a class="mui-btn-link mui-pull-right" id="re_mail1">确认</a>
    </div>
    <div  style="height: 100%;">
        <div id="forms1">

        </div>
    </div>
</div>
<script type="text/javascript" src="../../js/notes/jquery-2.1.2.min.js"></script>
<script type="text/javascript" src="../../js/diary/m/simbaJs.js" ></script>
<script type="text/javascript" src="../../js/diary/m/vue.min.js" ></script>
<script type="text/javascript">
    /**
     * @property{IDString} id id元素
     * @param {AttrString}
     * @param {AttrValueString}
     * @type {HTMLString}
     */
    var mid='',num='';
    var checkVals1
    var u = navigator.userAgent;
    var app='<div><p>发件人：<span id="fnames"></span></p><p>收件人：<span id="toName"></span></p><p>抄送人：<span id="copyName"></span></p><p>发件时间：<span id="sendtime"></span></p><p>主题：<span id="subject"></span></p><p id="objs"></p></div>'
    var isAndroid = u.indexOf('Android') > -1 || u.indexOf('Adr') > -1; //android终端
    var isiOS = !!u.match(/\(i[^;]+;( U;)? CPU.+Mac OS X/); //ios终端
    if(isAndroid == true){
        document.getElementById("start").innerHTML='---发自我的全流程Android版本---';
        document.getElementById("old_message").innerHTML=app;

    }else if(isiOS == true){
        document.getElementById("start").innerHTML='---发自我的全流程IOS版本---';
        document.getElementById("old_message").innerHTML=app;
    }

    var userName=localStorage.getItem("userName");
    var toName=localStorage.getItem("toName");
    var copyName=localStorage.getItem("copyName");
    var sendtime=localStorage.getItem("sendtime");
    var subject=localStorage.getItem("subject");
    var bodyId=localStorage.getItem("bodyId");
    var emailId=localStorage.getItem("emailId");
    var content=localStorage.getItem("content");
    console.log(content)
    document.getElementById("tname").setAttribute('value',userName);
    document.getElementById("mtitle").setAttribute('value',subject);
    document.getElementById("fnames").innerHTML=userName;
    document.getElementById("toName").innerHTML=toName;
    document.getElementById("copyName").innerHTML=copyName;
    document.getElementById("sendtime").innerHTML=sendtime;
    document.getElementById("subject").innerHTML=subject;

    document.getElementById("objs").innerHTML=content;
    //选择收件人，抄送人
    var btn1 = document.getElementById("Popover_1");
    btn1.addEventListener('tap', function() {
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
                var val=document.getElementById("msg_str").value+app
                mui.ajax('/email/sendMessageEmail',{
                    data:{
                        toId2:bodyId,
                        copyToId:str1,
                        emailId:emailId,
                        subject:subject,
//                        content:document.getElementById("msg_str").value,
                        content:val,
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

</script>
</body>
</html>