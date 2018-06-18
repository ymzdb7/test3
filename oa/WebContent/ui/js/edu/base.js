if (!Array.prototype.forEach) {

    Array.prototype.forEach = function(callback/*, thisArg*/) {

        var T, k;

        if (this == null) {
            throw new TypeError('this is null or not defined');
        }

        // 1. Let O be the result of calling toObject() passing the
        // |this| value as the argument.
        var O = Object(this);

        // 2. Let lenValue be the result of calling the Get() internal
        // method of O with the argument "length".
        // 3. Let len be toUint32(lenValue).
        var len = O.length >>> 0;

        // 4. If isCallable(callback) is false, throw a TypeError exception.
        // See: http://es5.github.com/#x9.11
        if (typeof callback !== 'function') {
            throw new TypeError(callback + ' is not a function');
        }

        // 5. If thisArg was supplied, let T be thisArg; else let
        // T be undefined.
        if (arguments.length > 1) {
            T = arguments[1];
        }

        // 6. Let k be 0.
        k = 0;

        // 7. Repeat while k < len.
        while (k < len) {

            var kValue;

            // a. Let Pk be ToString(k).
            //    This is implicit for LHS operands of the in operator.
            // b. Let kPresent be the result of calling the HasProperty
            //    internal method of O with argument Pk.
            //    This step can be combined with c.
            // c. If kPresent is true, then
            if (k in O) {

                // i. Let kValue be the result of calling the Get internal
                // method of O with argument Pk.
                kValue = O[k];

                // ii. Call the Call internal method of callback with T as
                // the this value and argument list containing kValue, k, and O.
                callback.call(T, kValue, k, O);
            }
            // d. Increase k by 1.
            k++;
        }
        // 8. return undefined.
    };
}
;;var domain = document.location.origin;
var hostname = document.location.hostname;
var layerjspate = domain+'/lib/layer/layer.js';
document.write("<script src="+layerjspate+"><\/script>");
var widthnum=1;
var boolTwo=true;
var departments=true;
var employeeUrl='/getUserByCondition';
var loadSidebarurl='/department/getChDeptfq';
var loadALLDeptSidebarurl='/department/getAlldept';
function imgDown(deptNum,me){

        ajaxdata(deptNum, me)

    // if($(me).attr('data-numString')!=1) {

    // }
        if($(me).attr('data-types')==undefined) {
            $(me).find('img').attr('src', $(me).find('img').attr('src') == '/img/sys/dapt_right.png' ? '/img/sys/dapt_down.png' : '/img/sys/dapt_right.png');
            if ($(me).find('img').attr('src') == '/img/sys/dapt_right.png') {
                $(me).find('img').css({"margin-top": "-3px", "margin-right": "4px", "margin-left": ""});
                $(me).find('img').width(8);
                $(me).find('img').height(14);
                $(me).next().hide()
                $(me).next().html('')
            } else if ($(me).find('img').attr('src') == '/img/sys/dapt_down.png') {
                $(me).find('img').css({"margin-top": "-3px", "margin-right": "4px", "margin-left": "-5px"});
                $(me).find('img').width(14);
                $(me).find('img').height(9);
                $(me).next().show();
            }
        }
        else {
                if ($(me).attr('data-types') == '1') {
                    $(me).next().show();
                    $(me).attr('data-types', '2')
                } else if ($(me).attr('data-types') == '2') {
                    $(me).next().hide();
                    $(me).attr('data-types', '1')
                }
        }

    if($(me).attr('data-numstring')==1){
        if(boolTwo) {
            if($(me).next().css('display')=='none'){
                return;
            }
            $.loadrole($(me).next(), deptNum, $(me).attr('data-numtrue'));
        }
    }
    if($(me).next().html()=='') {
        if(departments) {
            $.loadSidebar($(me).next(), deptNum, function () {
                if (boolTwo) {
                    $.loadrole($(me).next(), deptNum, $(me).attr('data-numtrue'))
                }
            })
        }
    }

}
$.extend({
    popWindow:function(url,title,top,left,width,height) {

        var top = top || '100';
        var left = left || '300';
        var width = width || '640';
        var height = height || '500';
        var specs = 'top='+top+',left='+left+',width='+width+',height='+height;

        window.open(url,title,specs);
    },
    layerAlert:function (option,cb) {
        layer.alert(option.content, {
            icon: option.icon,
            title:option.title
        },function(index){
            layer.close(index);
            cb();
        });
    },
    layerMsg:function (option,cb) {
        layer.msg(option.content,{icon: option.icon,time : 1000 }, function(){
            if(cb){
                cb();
            }

        });
    },
    layerConfirm:function (option,success,cancel) {
        layer.confirm(option.content, {
            icon:option.icon,
            title:option.title,
            btn: [sure,console] //按钮
        }, function(index){
            if(success){
                success();
                layer.close(index)
            }
        }, function(){
            if(cancel){
                cancel();
            }
        });
    },
    GetRequest:function(urls) {//获取get窗口数据
        var url;
        if(urls==undefined) {
            url = location.search; //获取url中"?"符后的字串
        }else {
            url=urls.substr(urls.indexOf("?"))
        }
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
});
$.fn.deptSelect = function(args,timers){
    var _this = $(this);
    if(timers!=null){
        clearInterval(timers);
        timers=null;
    }
    $.ajax({
        url:loadALLDeptSidebarurl,
        type:'get',
        data:{},
        dataType:'json',
        success:function(obj){

            var data=obj.obj;
            departmentData= digui(data,0);
            var str = departmentChild(departmentData,'<option value="-1">请选择部门</option>',0,-1);
            _this.html(str);
            if(_this.attr('pval') && (_this.attr('pval').indexOf('_') > -1)){
                var pval = _this.attr('pval').split('_');
                _this.val(pval[0]);
            }

            if(args!=undefined){
                args(_this)
            }
        },
        error:function(){

        }
    });
};
$.fn.deptquerySelect = function(args,timers){
    var _this = $(this);
    if(timers!=null){
        clearInterval(timers);
        timers=null;
    }
    $.ajax({
        url:loadALLDeptSidebarurl,
        type:'get',
        data:{},
        dataType:'json',
        success:function(obj){

            var data=obj.obj;
            departmentData= digui(data,2);
            var str = departmentChild(departmentData,'<option value="-1">请选择部门</option>',0,-1);
            _this.html(str);
            if(_this.attr('pval') && (_this.attr('pval').indexOf('_') > -1)){
                var pval = _this.attr('pval').split('_');
                _this.val(pval[0]);
            }

            if(args!=undefined){
                args(_this)
            }
        },
        error:function(){

        }
    });
};

$(function(){
    $.ajaxSetup({ cache:false });
    $(document).delegate('.collect span','click',function () {
        $('.collect span').removeClass('add_back')
        $(this).addClass('add_back')
    })

    $.extend({
        setCookie:function(user) {
            var uid = user.uid || '';
            var userId = user.userId || '';
            var userName = user.userName || '';
            var userPriv = user.userPriv || '';
            var userPrivName = user.userPrivName || '';
            var deptId = user.deptId || '';
            var sex = user.sex || '';
            var language = user.language || '';
            var company = user.company || '';
            $.cookie('company',company , { expires: 7 });
            $.cookie('language',language , { expires: 7 });
            $.cookie('uid',uid , { expires: 7 });
            $.cookie('userId',userId , { expires: 7 });
            $.cookie('userName', userName, { expires: 7 });
            $.cookie('userPriv', userPriv, { expires: 7 });
            $.cookie('userPrivName', userPrivName, { expires: 7 });
            $.cookie('deptId', deptId, { expires: 7 });
            $.cookie('sex', sex, { expires: 7 });


        }
    });
    $.extend({
        loadSidebar:function (target,deptId,fn) {
            $.ajax({
                url: loadSidebarurl,
                type: 'get',
                data: {
                    deptId: deptId
                },
                dataType: 'json',
                success: function (data) {
                    if (deptId == 2) {
                        var str = '';
                        data.obj.forEach(function (v, i) {
                            if (v.deptName) {
                                str += '<li><span data-types="1"  data-numtrue="1" ' +
                                    'onclick= "imgDown(' +v.deptId + ',this)"  style="height:35px;line-height:35px;padding-left: 14px" deptid="' + v.deptId + '" class="childdept"><span class=""></span><img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_company.png" alt="" style="vertical-align: middle;width: 15px;margin-right: 10px;margin-left:15px;"><a href="javascript:void(0)" class="dynatree-title" title="' + v.deptName + '">' + v.deptName + '</a></span><ul style="display:none;" class="dpetWhole0"></ul></li>';
                            }
                        })
                        widthnum++;
                        target.html(str);
                        if(fn!=undefined){
                            fn()
                        }
                    } else if(deptId == 0){
                        var str = '';
                        data.obj.forEach(function (v, i) {
                            if (v.deptName) {
                                str += '<li><span data-types="1"  data-numtrue="1" ' +
                                    'onclick= "imgDown(' +v.deptId + ',this)"  style="height:35px;line-height:35px;padding-left: 14px" deptid="' + v.deptId + '" class="childdept"><span class=""></span><img src="/img/commonTheme/${sessionScope.InterfaceModel}/icon_company.png" alt="" style="vertical-align: middle;width: 15px;margin-right: 10px;margin-left:15px;"><a href="javascript:void(0)" class="dynatree-title" title="' + v.deptName + '">' + v.deptName + '</a></span><ul style="display:none;" class="dpetWhole0"></ul></li>';
                            }
                        })
                        widthnum++;
                        target.html(str);
                        if(fn!=undefined){
                            fn($(target).find('.dpetWhole0'))
                        }


                    }else{
                        var str = '';

                        data.obj.forEach(function (v, i) {
                            var targetnum=parseInt($(target).prev().attr('data-numtrue'))

                            if (v.deptName && v.isHaveCh==1) {
                                str += '<li><span  onclick= "imgDown(' +v.deptId + ',this)" data-numString="2" deptid="' + v.deptId + '" data-numtrue="'+(targetnum+1)+'"  style="padding-left:'+(20+(20*parseInt($(target).prev().attr('data-numtrue'))))+'px;height:35px;line-height:35px;"  deptid="' + v.deptId + '" class="childdept"><span></span><img id="img'+v.deptId+'" src="/img/sys/dapt_right.png" style="width: 8px;height:14px;margin-top: -3px;margin-right:4px;" alt="">&nbsp;<a href="javascript:void(0)" class="dynatree-title" title="' + v.deptName + '">' + v.deptName + '</a></span><ul style="display:none;"></ul></li>';
                            } else {
                                str += '<li><span onclick="imgDown(' +v.deptId + ',this)" data-numString="1" deptid="' + v.deptId + '" data-numtrue="'+(targetnum+1)+'" style="padding-left:'+(20+(20*parseInt($(target).prev().attr('data-numtrue'))))+'px;height:35px;line-height:35px;"  deptid="' + v.deptId + '" class="childdept"><span></span><img  src="/img/sys/dapt_right.png" style="width: 8px;height:14px;margin-top: -3px;margin-right:4px;" alt="">&nbsp;<a href="javascript:void(0)" class="dynatree-title" title="' + v.deptName + '">' + v.deptName + '</a></span><ul style="display:none;"></ul></li>';
                            }

                        });
                        widthnum++
                        target.html(str);
                        if(fn!=undefined){
                            fn()
                        }
                    }
                }
            })
        },
        loadrole:function (target,teptId,num,fn) {
            $.ajax({
                url: employeeUrl,
                type: 'get',
                data: {
                    deptId: teptId
                },
                dataType: 'json',
                success: function (data) {
                    if(!data.flag){
                        return
                    }
                    var str='';
                    var arr=[];
                    if($(target).find('li').length==0) {
                        for (var i = 0; i < data.object.length; i++) {
                            str += '<li><span onclick="clickrenwu(' + data.object[i].uid + ',this)" data-uid="' + data.object[i].uid + '" data-numString="1"  style="padding-left:' + (20+20*parseInt(num)) + 'px;height:35px;line-height:35px;"  class="childdept"><span></span>' +
                                '<img  src="'+function () {
                                    if(data.object[i].avatar==0){
                                        return '/img/email/icon_head_man_06.png'
                                    }else if(data.object[i].avatar==1){
                                        return '/img/email/icon_head_woman_06.png'
                                    }else {
                                        return '/img/user/'+data.object[i].avatar
                                    }
                                }()+'" style="width: 20px;height:20px;margin-top: -3px;margin-right:4px;" alt="">&nbsp;<a href="javascript:void(0)" class="dynatree-title" title="' + data.object[i].userName + '">' + data.object[i].userName + '</a></span></li>';

                        }
                        $(target).html(str);
                    }else {
                        $(target).find('li').each(function (m, b) {
                            for (var i = 0; i < data.object.length; i++) {
                                if ( $($(target).find('li')[i]).children('span').attr('data-uid')!= data.object[i].uid) {
                                    str = '<li><span onclick="clickrenwu(' + data.object[i].uid + ',this)" data-uid="' + data.object[i].uid + '" data-numString="1"  style="padding-left:' + (20+20*parseInt(num) ) + 'px;height:35px;line-height:35px;"  class="childdept"><span></span>' +
                                        '<img  src="'+function () {
                                            if(data.object[i].avatar==0){
                                                return '/img/email/icon_head_man_06.png'
                                            }else if(data.object[i].avatar==1){
                                                return '/img/email/icon_head_woman_06.png'
                                            }else {
                                                return '/img/user/'+data.object[i].avatar
                                            }
                                        }()+'" style="width: 20px;height:20px;margin-top: -3px;margin-right:4px;" alt="">&nbsp;<a href="javascript:void(0)" class="dynatree-title" title="' + data.object[i].userName + '">' + data.object[i].userName + '</a></span></li>';
                                    $(target).append(str)
                                }
                            }
                            return false
                        })
                    }

                }
            })
        }
    })

	$.fn.privSelect = function (args) {
        var _this = $(this);
        $.ajax({
            url:domain+"/userPriv/getAllPriv",
            type:'get',
            data:{},
            dataType:'json',
            success:function(res){
                if(res.flag){
                    var  optionStr = '<option value="0">请选择角色</option>'
                    res.obj.forEach(function (v,i) {
                        optionStr += '<option value="'+v.userPriv+'">'+v.privName+'</option>'
                    });
                }
                 _this.html(optionStr);
            },
            error:function(){

            }
        });
    };
	$.extend({
		getQueryString:function(name) {
	        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
	        var r = window.location.search.substr(1).match(reg);
	        if (r != null) return unescape(r[2]);
	        return null;
	    }
	});
	$.extend({
		upload:function(e,cb){
			if(!$('#uploadiframe').is('iframe')){
				$("body").append('<iframe id="uploadiframe" style="display:none;"  class="uploadiframe" name="uploadiframe" ></iframe>');
			}
            e.attr('target','uploadiframe')
			e.submit();
			var l = $('#uploadiframe'),a=null;
			 var f = setInterval(function(){
				 try{
					 a = l.contents().find("body").text();

				 }catch(i){
					 console.log("上传接口存在跨域", i);
					 clearInterval(f);
				 }
				 if(a){

					clearInterval(f);
					l.contents().find("body").html("");
					var c = {};
					try{ c = JSON.parse(a); a={};$('#uploadiframe').remove() } catch (i) {a = {};alert("你的上传大小超出上限", i) }
					cb(c);
				 }
			 },300);
		}
	});
})
Date.prototype.Format = function(fmt)   
{
  var o = {   
    "M+" : this.getMonth()+1,                 //月份   
    "d+" : this.getDate(),                    //日   
    "h+" : this.getHours(),                   //小时   
    "m+" : this.getMinutes(),                 //分   
    "s+" : this.getSeconds(),                 //秒   
    "q+" : Math.floor((this.getMonth()+3)/3), //季度   
    "S"  : this.getMilliseconds()             //毫秒   
  };   
  if(/(y+)/.test(fmt))   
    fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length));

  for(var k in o)   
    if(new RegExp("("+ k +")").test(fmt))   
  fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));   
  return fmt;   
}
//部门遍历方法
function digui(datas,departId) {
    var data=new Array();
    for(var i=0;i<datas.length;i++){
        if(datas[i].deptParent==departId){
            datas[i]["childs"]=digui(datas,datas[i].deptId);
            data.push(datas[i]);
        }
    }
    return data;
}
//部门遍历方法
function departmentChild(datas,opt_li,level,dept){
    for(var i=0;i<datas.length;i++){
        var String="";
        var space=""
        for(var j=0;j<level;j++){
            space+="├&nbsp;";
        }
		/* console.log("kongge"+space+"kongge")*/
        if(i==0){
            String=space+"┌";
        }else
        if(i!=0){
            String=space+"├";
        }else
        if(i==datas.length-1){
            String=space+"└";
        }
        if(dept==datas[i].deptId){
            opt_li+='<option value="'+datas[i].deptId+'" selected="selected">'+String+datas[i].deptName+'</option>';
        }else{
            opt_li+='<option value="'+datas[i].deptId+'">'+String+datas[i].deptName+'</option>';
        }
		/* 	console.log(datas[i].childs);*/
        if(datas[i].childs!=null){
            opt_li = departmentChild(datas[i].childs,opt_li,level+1,dept);
        }
    }
    return opt_li;
}


//所属分类
$.fn.typeSelect = function(args){
    var _this = $(this);
    $.ajax({
        url:domain+"/supervisionType/getSupNameSelect",
        type:'get',
        data:{},
        dataType:'json',
        success:function(obj){
            var data=obj.obj;
            typementData= typeDigui(data,0);
            var str = typetmentChild(typementData,'<option value="-1">请选择类别</option>',0,-1);
            _this.html(str);

            if(args!=undefined){
                args(_this)
            }
        },
        error:function(){

        }
    });
};

//类别遍历方法
function typeDigui(datas,sid) {
    var data=new Array();
    for(var i=0;i<datas.length;i++){
        if(datas[i].parentId==sid){
            datas[i]["childs"]=typeDigui(datas,datas[i].sid);
            data.push(datas[i]);
        }
    }
    return data;
}
function typetmentChild(datas,opt_li,level,sid){

    for(var i=0;i<datas.length;i++){
        var String="";
        var space=""
        for(var j=0;j<level;j++){
            space+="├&nbsp;";
        }
        if(i==0){
            String=space+"┌";
        }else
        if(i!=0){
            String=space+"├";
        }else
        if(i==datas.length-1){
            String=space+"└";
        }
        if(sid==datas[i].sid){
            opt_li+='<option value="'+datas[i].sid+'" selected="selected">'+String+datas[i].typeName+'</option>';
        }else{
            opt_li+='<option value="'+datas[i].sid+'">'+String+datas[i].typeName+'</option>';
        }
        /* 	console.log(datas[i].childs);*/
        if(datas[i].childs!=null){
            opt_li = typetmentChild(datas[i].childs,opt_li,level+1,sid);
        }
    }
    return opt_li;
}