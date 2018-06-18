/**
 * zlj
 * js多语言引入文件
 * @param name
 * @returns {null}
 */

function getCookie(name)
{
    var arr,reg=new RegExp("(^| )"+name+"=([^;]*)(;|$)");
    if(arr=document.cookie.match(reg))
        return unescape(arr[2]);
    else
        return null;
}

var oHead = document.getElementsByTagName('HEAD').item(0);

var oScript= document.createElement("script");
var type = getCookie("language");
oScript.type = "text/javascript";

if(type){
    oScript.src="/js/Internationalization/"+type+".js";
}else{
    oScript.src="/js/Internationalization/zh_CN.js";
}
oHead.appendChild(oScript);
