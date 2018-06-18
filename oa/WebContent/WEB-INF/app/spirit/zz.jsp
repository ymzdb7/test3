<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<!-- saved from url=(0082)file:///C:/Users/gaosubo/Desktop/OA%E7%B2%BE%E7%81%B5_files/saved_resource(1).html -->
<html><!--<![endif]-->
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title></title>

    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <script type="text/javascript">
        var MYOA_JS_SERVER = "";
        var MYOA_STATIC_SERVER = "";
    </script>
    <link rel="stylesheet" type="text/css" href="../css/spirit/style.css">
    <link rel="stylesheet" type="text/css" href="../css/spirit/ipanel.css">
    <link rel="stylesheet" type="text/css" href="../css/main/theme1/bootstrap.min.css"/>
	<link rel="stylesheet" type="text/css" href="../css/main/theme1/index.css"/>
    <link rel="stylesheet" type="text/css" href="../css/spirit/user_online.css">
    <link rel="stylesheet" type="text/css" href="../css/spirit/ui.dynatree.css">
    <style>
        .avatarimg{
            border-radius: 100%;
        }
        #deptOrg li .childdept a{
            font-size: 14px;
            vertical-align: middle;
        }

        span.dynatree-checkbox{
            vertical-align: middle;
        }
        /*#modules{*/
            /*margin-left: 0px;*/
        /*}*/
        #deptOrg .childdept{
            display: block;
            line-height: 26px;
        }
        #deptOrg .childdept:hover{
            background: #abd9fe;
        }
        ul.dynatree-container a:hover{
            background: none;
        }
        #modules{
            margin-left: 0px;
            padding:0px;
        }
        ul.dynatree-no-connector > li span.childdept{
            padding-left: 20px;
        }
        .dynatree-checkbox>img{
            width: 20px!important;
            height: 20px!important;
        }
        span.dynatree-checkbox{
            vertical-align: middle;
            width: 20px;
            height: 20px;
        }
        span.dynatree-checkbox.actives{
            vertical-align: middle;
            width: 16px;
            height: 16px;
        }
        span.dynatree-checkbox.actives>img{

            width: 8px!important;
            height: 8px!important;
            margin-top:4px;
        }
        span.dynatree-has-children a{
            font-weight: normal;
        }
    </style>
    <script type="text/javascript" src="../js/jquery/jquery-1.11.1.min.js"></script>
    <script type="text/javascript" src="../js/spirit/qwebchannel.js"></script>

    <script type="text/javascript">
        function init() {
            jQuery("#body").height(jQuery(window).height() - jQuery("#sub_tabs").outerHeight());
        }

        window.onresize = init;
    </script>
    <style type="text/css">
        .dynatree-checkbox{
            margin-right:5px;!important;
        }
            #dyna_li:hover{background:#EFEFEF;}
            #dept_li:focus{background:#EFEFEF;}
        .dynatree-title{
            font-weight: normal;
        }
        .ul.dynatree-container ul{
            padding:0!important;
        }
        .tab_ctwo{
            background: #fff;
        }
    </style>
</head>


<body onload="init();window.setTimeout(init, 1);" marginwidth="0" marginheight="0">
<%--<div id="sub_tabs" class="sub_tabs">
    <ul id="sub_tabs_ul">
        <li><a href="javascript:;" title="人员" index="1" module="org" class="active"><span
                class="dropdown-containter"><label id="label_org">在线</label><span class="dropdown"></span></span></a>
        </li>
        <li><a href="javascript:;" title="分组" index="2" module="user_group"><span class="dropdown-containter">分组<span
                class="dropdown"></span></span></a></li>
        <li><a href="javascript:;" title="最近联系人" index="3" module="recent"><span>最近</span></a></li>
        <li><a href="javascript:;" title="群组" index="4" module="im_group"><span>群组</span></a></li>
    </ul>
    <a id="org_refresh" href="javascript:;" title="刷新"></a>
</div>--%>
<div id="sub_menu_org" class="sub_menu" style="width: 110px; display: none;">
    <a href="javascript:;" index="0" class="active">显示在线人员</a>
    <a href="javascript:;" index="1" class="">显示全部人员</a>
</div>
<div id="sub_menu_user_group" class="sub_menu" style="width:110px;">
    <a href="javascript:;" index="0" class="active">我的自定义组</a>
    <a href="javascript:;" index="1" class="">公共自定义组</a>
</div>
<div id="body" style="height: calc(100% - 40px);">
    <div id="modules">
        <div id="module_org" class="container moduleContainer" style="display: block;">
            <div class="pickCompany">
                <span style="height:32px;line-height:32px;" class="childdept">
                    <img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_company.png" alt="" style="vertical-align: middle;width: 15px;
                    margin-right: 10px;margin-left: 13px;margin-bottom: 4px;">
                    <a href="javascript:void(0)" class="dynatree-title"
                       title="" style="display: inherit;margin-left: 0;color: #111;font-size: 14px">

                    </a>
                </span>
            </div>




            <div id="sub_module_org_0" class="module-block" style="">
                <ul class="dynatree-container dynatree-no-connector tab_ctwo" id="deptOrg">
                </ul>
            </div>
            <div id="sub_module_org_1" class="module-block" style="display:none;"></div>
        </div>
        <div id="module_user_group" class="container module-block" style="display:none;"></div>
        <div id="module_recent" class="container module-block" style="display:none;"></div>
        <div id="module_im_group" class="container module-block" style="display:none;"></div>
    </div>

    <div id="module_user_group_op_menu" class="attach_div small" style="width:80px;">
        <a op="msg" href="javascript:;"><span>微讯</span></a>
        <a op="email" href="javascript:;"><span>邮件</span></a>
    </div>

</div>


<script>

    var numS=2;
    function doQtDep(uid,datas) {
        new QWebChannel(qt.webChannelTransport, function(channel) {
            var content = channel.objects.interface;
            content.xoa_sms(uid,datas,"SEND_MSG");
        });
    }
	//组织
		$('#sub_module_org_0 .tab_ctwo').on('click','.childdept',function(){

            var that = $(this);
			if(that.attr("drop")=="true"){
			    that.attr("drop",false);
			    removeChdept(that.next());
			    if(that.attr('data-c')==undefined){
                    that.find('img').prop('src','/img/sys/dapt_right.png')
                }
			}else{
			    that.attr("drop",true);
			    getChDept(that.next(),that.attr('deptid'));
                if(that.attr('data-c')==undefined) {
                    that.find('img').prop('src', '/img/sys/dapt_down.png')
                }
			}
		});
		function removeChdept(target){
		   target.html("");
		}
		function getChDept(target,deptId){
			$.ajax({
				url:'<%=basePath%>/department/getChDept',
				type:'get',	
				data:{
					deptId:deptId
				},		
				dataType:'json',
				success:function(data){
					if(deptId==undefined){
						var str = '';
                        data.obj.forEach(function(v,i){
                            if(v.deptName){
                                str+='<li >' +
                                    '<span  data-num="2" ' +
                                    'style="padding-left: 20px " deptid="'+v.deptId+'" ' +
                                    'class="childdept dynatree-node dynatree-folder ' +
                                    'dynatree-expanded dynatree-has-children ' +
                                    'dynatree-lastsib dynatree-exp-el ' +
                                    'dynatree-ico-ef">' +
                                    '<span class="dynatree-checkbox actives">' +
                                    '<img src="/img/sys/dapt_right.png" alt="" data-type="1">' +
                                    '</span>' +
                                    '<a href="#" class="dynatree-title" ' +
                                    'title="">'+v.deptName+'</a>' +
                                    '</span>' +
                                    '<ul class="dyna_ul" ></ul>' +
                                    '</li>';
                            }else{
                                str+='<li id="dyna_li" onclick="openwin(this)">' +
                                    '<span  ' +
                                    'style="padding-left:20px; " ' +
                                    'data-c="1" deptid="'+v.deptId+'" ' +
                                    'class="childdept dynatree-node dynatree-folder ' +
                                    'dynatree-expanded dynatree-has-children ' +
                                    'dynatree-lastsib dynatree-exp-el dynatree-ico-ef">' +
                                    '<span class="dynatree-checkbox">' +
                                    '<img class="avatarimg" src="'+function () {
                                        if(v.avatar=='0'){
                                            return '/img/email/icon_head_man_06.png'
                                        }else if(v.avatar=='1'){
                                            return '/img/email/icon_head_woman_06.png'
                                        }else if(v.avatar==''){
                                            return '/img/email/icon_head_man_06.png'
                                        }else{
                                            return '/img/user/'+v.avatar
                                        }
                                    }()+'" alt="">' +
                                    '</span><a href="#" class="dynatree-title" ' +
                                    'uid="'+v.uid+'" userPrivName="'+v.userPrivName+'" ' +
                                    'sex="'+v.sex+'" id="'+v.mobilNo+'" ' +
                                    'birthday="'+v.birthday+'" ' +
                                    'title="'+v.userName+'" myStatus="'+ v.mystatus +'">'+v.userName+'</a>' +
                                    '</span>' +
                                    '<ul ></ul>' +
                                    '</li>';
                            }
                        });
					}else{
                        var str = '';
                        var bool=false;
                        data.obj.forEach(function(v,i){
                            if(v.deptName){
                                str+='<li >' +
                                    '<span  data-num="'+(parseInt($(target).prev().attr('data-num'))+1)+'" ' +
                                    'style="padding-left: '+(parseInt($(target).prev().attr('data-num'))*20)+'px; " deptid="'+v.deptId+'" ' +
                                    'class="childdept dynatree-node dynatree-folder ' +
                                    'dynatree-expanded dynatree-has-children ' +
                                    'dynatree-lastsib dynatree-exp-el ' +
                                    'dynatree-ico-ef">' +
                                    '<span class="dynatree-checkbox actives">' +
                                    '<img src="/img/sys/dapt_right.png" alt="" data-type="1">' +
                                    '</span>' +
                                    '<a href="#" class="dynatree-title" ' +
                                    'title="">'+v.deptName+'</a>' +
                                    '</span>' +
                                    '<ul class="dyna_ul" ></ul>' +
                                    '</li>';
                            }else{
                                str+='<li id="dyna_li" onclick="openwin(this)">' +
                                    '<span  ' +
                                    'style="padding-left: '+(parseInt($(target).prev().attr('data-num'))*20)+'px; " ' +
                                    'data-c="1" deptid="'+v.deptId+'" ' +
                                    'class="childdept dynatree-node dynatree-folder ' +
                                    'dynatree-expanded dynatree-has-children ' +
                                    'dynatree-lastsib dynatree-exp-el dynatree-ico-ef">' +
                                    '<span class="dynatree-checkbox">' +
                                    '<img class="avatarimg" src="'+function () {
                                       if(v.avatar=='0'){
                                           return '/img/email/icon_head_man_06.png'
                                       }else if(v.avatar=='1'){
                                           return '/img/email/icon_head_woman_06.png'
                                       }else if(v.avatar==''){
                                           return '/img/email/icon_head_man_06.png'
                                       }else{
                                           return '/img/user/'+v.avatar
                                       }
                                    }()+'" alt="">' +
                                    '</span><a href="#" class="dynatree-title" ' +
                                    'uid="'+v.uid+'" userPrivName="'+v.userPrivName+'" ' +
                                    'sex="'+v.sex+'" id="'+v.mobilNo+'" ' +
                                    'birthday="'+v.birthday+'" ' +
                                    'title="'+v.userName+'" myStatus="'+ v.mystatus +'">'+v.userName+'</a>' +
                                    '</span>' +
                                    '<ul ></ul>' +
                                    '</li>';
                            }
                        });
                    }
					target.html(str);
				}
			})
		}

    $.ajax({
        url:'/sys/showUnitManage',
        type:'get',
        dataType:"JSON",
        data : '',
        success:function(obj){
//                console.log(obj);
            var data = obj.object.unitName;
            $('.pickCompany .dynatree-title').text(data).attr('title',data);
            getChDept($('#deptOrg'));

        },
        error:function(e){
//                console.log(e);
        }
    })




    function openwin(e){
        var uid=$(e).find("a.dynatree-title").attr("uid");
        var uname=$(e).find("a.dynatree-title").attr("title");
        var userPrivName=$(e).find("a.dynatree-title").attr("userPrivName");
        var sex=$(e).find("a.dynatree-title").attr("sex");
        var birthday=$(e).find("a.dynatree-title").attr("birthday");
        var mobilNo=$(e).find("a.dynatree-title").attr("id");
        var myStatus = $(e).find("a.dynatree-title").attr("myStatus");
        var avatar = $(e).find("span.dynatree-checkbox img").attr("src");
        var datas={"uname":uname,"userPrivName":userPrivName,"sex":sex,"birthday":birthday,"mobilNo":mobilNo,"myStatus":myStatus,"avatar":avatar};
        var datass=JSON.stringify(datas);
        doQtDep(uid,datass);
        // window.external.OA_SMS(uid,uname,"SEND_MSG");
    }

</script>
</body>
</html>