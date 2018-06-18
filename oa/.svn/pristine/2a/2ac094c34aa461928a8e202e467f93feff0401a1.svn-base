<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
 <head>
    <title><fmt:message code="common.th.selPeople" /></title><%--选择人员--%>
    <meta http-equiv="Content-Type" content="text/html; charset=gbk" />
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=10,chrome=1" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimum-scale=1.0, maximum-scale=1.0">
    <link rel="stylesheet" type="text/css" href="../css/common/style.css" />
	<link rel="stylesheet" type="text/css" href="../css/common/select.css" />
	 <link rel="stylesheet" href="../lib/layui-v1.0.9_rls/layui/css/layui.css"  media="all">
<!-- 	<link rel="stylesheet" type="text/css" href="../css/common/ui.dynatree.css"> -->
	<link rel="stylesheet" type="text/css" href="../css/common/org_select.css">
	<link rel="stylesheet" type="text/css" href="../lib/easyui/themes/easyui.css"/>
    <link rel="stylesheet" type="text/css" href="../lib/easyui/themes/icon.css"/>
	<script type="text/javascript" src="../js/jquery/jquery-1.9.1.js"></script>
	 <script type="text/javascript" src="../js/spirit/qwebchannel.js"></script>     <script type="text/javascript" src="/js/spirit/qwebchannel.js"></script>    <script src="/js/base/base.js"></script>
	<script type="text/javascript" src="../lib/easyui/jquery.easyui.min.js" ></script>
    <script type="text/javascript" src="../lib/easyui/tree.js" ></script>
	 <script>
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

         if (!Array.prototype.indexOf)
         {
             Array.prototype.indexOf = function(elt /*, from*/)
             {
                 var len = this.length >>> 0;
                 var from = Number(arguments[1]) || 0;
                 from = (from < 0)
                     ? Math.ceil(from)
                     : Math.floor(from);
                 if (from < 0)
                     from += len;
                 for (; from < len; from++)
                 {
                     if (from in this &&
                         this[from] === elt)
                         return from;
                 }
                 return -1;
             };
         }
	 </script>
	 <style>
		 #dept_menu{
			 overflow-x: auto;
		 }
		 .left_choose ul li div,.left_choose ul li h1,.left_choose ul img{
			 float:left;
		 }
		 .left_choose ul img{
		 <!-- margin-top:8px; -->
		 }
		 .left_choose ul li{
			 width:80%;
			 height:20px;
		 <!-- background:red; -->
			 margin-top:10px;
		 }
		 .mar{
			 margin-left:10%;
		 }
		 .name li{
			 list-style-type:none;
		 }
		 .choose{
			 background:#D6E4EF !important;
		 }
		 .layui-form-checkbox{
			 height: 25px;
			 line-height: 23px;
		 }
		 .layui-form-item .layui-form-checkbox {
			 float: left;
			 left: 50px;
			 margin-top: 2px;
		 }
		 .byPrivOrgStrsli{
			 background: #fff;
		 }
		 .byPrivOrgStrsli.actives{
			 background:#5FB878;
			 color: #fff;
		 }
		 .byPrivOrgStrsli:hover{
			 cursor: pointer;
		 }
	 </style>
</head>

<body>
<div id="north">
   <div id="navMenu" style="width:auto;">
      <%--<a href="#" title="已选人员" class="tab_btn"  block="selected" hidefocus="hidefocus"><span>已选</span></a>--%>
      <a href="#" title='<fmt:message code="doc.th.AllHandlers" />' block="allSelect" hidefocus="hidefocus" class=" tab_btn active"><span><fmt:message code="doc.th.AllHandlers" /></span></a><%--全部经办人 全部经办人--%>
      <%--<a href="#" title='<fmt:message code="common.th.chooseByProcess" />' class="tab_btn" block="byFlow" hidefocus="hidefocus"><span><fmt:message code="common.th.chooseByProcess" /></span></a>&lt;%&ndash;按流程选择 按流程选择&ndash;%&gt;--%>
      <a href="#" title='<fmt:message code="common.th.selByDepart" />' class="tab_btn" block="byDept" hidefocus="hidefocus"><span><fmt:message code="common.th.selByDepart" /></span></a><%--按部门选择 按部门选择--%>
      <a href="#" title='<fmt:message code="common.th.selByRole" />' class="tab_btn" block="byPriv" hidefocus="hidefocus"><span><fmt:message code="common.th.selByRole" /></span></a><%--按角色选择 按角色选择--%>
      <a href="#" block="query" class="tab_btn" hidefocus="hidefocus" style="display:none;"><span><fmt:message code="common.th.customGroup" /></span></a><%--自定义组--%>
   </div>
   <div id="navRight" style="float:right;">

      <%--<div class="search">--%>
         <%--<div class="search-body">--%>
            <%--<div class="search-input"><input notlogin_flag="" id="keyword" type="text" value=""></div>--%>
            <%--<div id="search_clear" class="search-clear" style="display:none;"></div>--%>
         <%--</div>--%>
      <%--</div>--%>
   </div>
</div>
		
		<!-- //内容 -->
	<div class="layui-form-item">
		<!-- 已选 -->
		<div class="main-block" id="selectedDox" >
			<div class="left moduleContainer" id="dept_menu">
				<div class="tree">
					<ul class="dynatree-container dynatree-no-connector" id="deptOrg">
					</ul>
				</div>

			</div>
			<div class="right" id="dept_item">
				<div class="block-right" id="dept_item_2">
					<!-- 部门名 -->
					<div id="block-right-add" class="block-right-add"><fmt:message code="meet.th.addAll" /></div><%--全部添加--%>
					<div id="block-right-remove" class="block-right-remove"><fmt:message code="meet.th.DeleteAll" /></div><%--全部删除--%>

					<div class="userItem">

					</div>
				</div>
			</div>
		</div>
		<div class="main-block aitem" id="allSelect" style="display:block;">
			   <div class="left moduleContainer" id="dept_menu" style="">
				   <div class="tree">
					   	<ul class="dynatree-container dynatree-no-connector" id="deptOrg">
					   	</ul>
				   </div>
			 
			   </div>
			   <div class="right" id="all_item" style="">
					<div class="block-right" id="all_item_2">
						<!-- 全部经办人 -->
						<div class="block-right-header" title=""></div>
						
						<div id="block-right-add" class="block-right-add"><fmt:message code="meet.th.addAll" /></div><%--全部添加--%>
						<div id="block-right-remove" class="block-right-remove"><fmt:message code="meet.th.DeleteAll" /></div><%--全部删除--%>
						<div class="allItem">

						</div>
					</div>   
				</div>
		</div>



		<!-- 按流程选人 -->
		<div class="main-block aitem" id="byFlow" >
			   <div class="left moduleContainer" id="byFlow_menu">
				   <div class="tree">
					   	<ul class="dynatree-container dynatree-no-connector" id="byFloworg">
					   	</ul>
				   </div>
			 
			   </div>
			   <div class="right" id="byFlow_item">
					<div class="block-right" id="byFlow_item_2">
						<!-- 部门名 -->
						<div id="block-right-add" class="block-right-add"><fmt:message code="meet.th.addAll" /></div><%--全部添加--%>
						<div class="block-right-remove"><fmt:message code="meet.th.DeleteAll" /></div><%--全部删除--%>
						
						<div class="byFlowItem">

						</div>
					</div>   
				</div>
		</div>
		<!-- 按部门选择 -->
		<div class="main-block aitem" id="byDept" >
			   <div class="left moduleContainer" id="byDept_menu">
				   <div class="tree">
					   	<ul class="dynatree-container dynatree-no-connector" id="byDeptOrg">
					   	</ul>
				   </div>
			 
			   </div>
			   <div class="right" id="byDeptitem">
					<div class="block-right" id="byDept_item_2">
						<!-- 部门名 -->
						<div id="block-right-add" class="block-right-add"><fmt:message code="meet.th.addAll" /></div><%--全部添加--%>
						<div class="block-right-remove"><fmt:message code="meet.th.DeleteAll" /></div><%--全部删除--%>
						<div class="byDeptItem">

						</div>
					</div>   
				</div>
		</div>

		<!-- 按角色选择 -->
		<div class="main-block aitem" id="byPriv" >
			<div class="left moduleContainer" id="byPriv_menu">
				<div class="tree">
					<ul class="dynatree-container dynatree-no-connector" id="byPrivOrg">
					</ul>
				</div>

			</div>
			<div class="right" id="byPrivitem">
				<div class="block-right" id="byPriv_item_2">
					<!-- 部门名 -->
					<div class="block-right-remove"><fmt:message code="meet.th.DeleteAll" /></div><%--全部删除--%>
					<div class="byPrivItem">

					</div>
				</div>
			</div>

		</div>
	</div>
	<!-- //结束 -->
	<div id="south">
	   <input type="button" class="BigButtonA" value='<fmt:message code="global.lang.ok" />' onclick="close_window();">&nbsp;&nbsp;<%--确定--%>
	</div>
</body>
	<script>
		function close_window(){
			var itemsArr = $('.aitem .active')
			var selectUserName = [];
			var selectUserId = '';
			for(var i=0;i<itemsArr.length;i++){
				var obj = itemsArr.eq(i);
				if(selectUserName.indexOf(obj.attr('item_name')) == -1){
                    selectUserId+=(obj.attr("user_id")+',');
                    selectUserName.push(obj.attr("item_name"));
				}


			};
			var zhuban=($('.layui-form-item .layui-form-checked span').attr('username')||'')
			var zhubanId=($('.layui-form-item .layui-form-checked span').attr('user_id')|| '')
			var jingban=selectUserName.join(',');
			var jingbanId=selectUserId;
			if(selectUserName.length==0){
                jingban=zhuban;
                jingbanId=zhubanId;
			}


			parent.opener.document.getElementById(parent.opener.UserItem).value =jingban;
			parent.opener.document.getElementById(parent.opener.UserItem).setAttribute('user_id',jingbanId);

			parent.opener.document.getElementById(parent.opener.UserItemMain).value = ($('.layui-form-item .layui-form-checked span').attr('username')||'');
			parent.opener.document.getElementById(parent.opener.UserItemMain).setAttribute('user_id', ($('.layui-form-item .layui-form-checked span').attr('user_id')|| ''));
			window.close();
		}
		prcsPrivlist = parent.opener.prcsPrivlist;
		prcsUserlist = parent.opener.prcsUserlist;
		prcsDeptlist = parent.opener.prcsDeptlist;
        var selectedList = {
            main:''
        };
		$(function(){

            var UserItem = parent.opener.document.getElementById(parent.opener.UserItem).getAttribute('user_id');
            var UserItemMain = parent.opener.document.getElementById(parent.opener.UserItemMain).getAttribute('user_id');

            buildItemList($("#allSelect .allItem"),prcsUserlist,true);

            $('#byDept #byDeptOrg').tree({
                url: '/department/getChDeptfq?deptId=0',
                animate:true,
                loadFilter: function(node){
                    var arr = convert(node.obj);
                    return arr;
                },
                onClick:function(node){
//                    build(node.id);
					var strs=[];
					var list=prcsUserlist;
					var nums=0;
					for(var i=0;i<list.length;i++){
					    if(node.id==list[i].deptId){
//					        $('#all_item #allItem').
					        var active = '';
					        var checked = '';
                            strs.push($('<div class="block-right-item '+list[i].uid+'" ' +
                                'item_id="'+list[i].uid+'" item_name="'+list[i].userName+'"  ' +
                                'user_id="'+list[i].userId+'" uid="'+list[i].uid+'" title="'+list[i].userName+'">' +
                                '<div class="layui-unselect layui-form-checkbox" lay-skin="">' +
                                '<span uid="'+list[i].uid+'"  user_id="'+list[i].userId+'" userName="'+list[i].userName+'">主办</span>' +
                                '<i class="layui-icon"></i></div>' +
                                '<span class="name">'+list[i].userName+' '+list[i].userPrivName+'<span class="status"> ' +
                                '</span></span></div>'));
                            nums++;
						}
					}
					if(nums==0){
                        $("#byDept .byDeptItem").html('')
					}else {
                        $("#byDept .byDeptItem").html(strs)
                    }
                },
                onBeforeExpand:function(node,param){
                    $('#byDept #byDeptOrg').tree('options').url = "../department/getChDeptfq?deptId=" + node.id;// change the url
                }
            });

			var byPrivOrgStrs='';
            for(var i=0;i<prcsUserlist.length;i++){
                if(byPrivOrgStrs.indexOf(prcsUserlist[i].userPrivName)==-1) {
                    byPrivOrgStrs += '<li class="byPrivOrgStrsli" style="' +
						'padding-left: 20px;border: 1px solid #ddd;height:30px ;line-height:30px;' +
						'border-radius: 4px;">' + prcsUserlist[i].userPrivName + '</li>'
                }
			}
			$('#byPriv_menu #byPrivOrg').html(byPrivOrgStrs)

            $('#byPriv_menu #byPrivOrg').delegate('li','click',function () {
				$(this).siblings('li').removeClass('actives');
				$(this).addClass('actives');
				var me=this;
				var list=prcsUserlist;
				var strarr=[];
                for(var i=0;i<list.length;i++){
                    if($(me).text()==list[i].userPrivName) {
                        strarr.push($('<div class="block-right-item '+list[i].uid+'" ' +
                            'item_id="' + list[i].uid + '" item_name="' + list[i].userName + '"  ' +
                            'user_id="' + list[i].userId + '" uid="' + list[i].uid + '" title="' + list[i].userName + '">' +
                            '<div class="layui-unselect layui-form-checkbox" lay-skin="">' +
                            '<span uid="' + list[i].uid + '"  user_id="' + list[i].userId + '" userName="' + list[i].userName + '">主办</span>' +
                            '<i class="layui-icon"></i></div>' +
                            '<span class="name">' + list[i].userName + ' ' + list[i].userPrivName + '<span class="status"> ' +
                            '</span></span></div>'));
                    }
                }
                $("#byPriv .byPrivItem").html(strarr)
            });

            function buildItemList(target,list,defaultdate) {

                if(list && list.length > 0){
                    var str = [];
                    if(defaultdate){
                        for(var i=0;i<list.length;i++){
                            var className = 'block-right-item';//active
                            var checked = 'layui-unselect layui-form-checkbox';//layui-form-checked
                            if(UserItem.indexOf(list[i].userId) > -1){
                                className += ' active';
                            }
//                            if(isNaN(list[i].userId.replace(','))) {
//                                console.log(list[i].userId)
//                            }
//                            console.log(UserItemMain)
                            if(UserItemMain.replace(/,/g,'') == list[i].userId){
                                checked += ' layui-form-checked';
                            }
                            str.push($('<div class="'+className+' '+list[i].uid+'" item_id="'+list[i].uid+'" item_name="'+list[i].userName+'" id="" ' +
                                'user_id="'+list[i].userId+'" uid="'+list[i].uid+'" title="'+list[i].userName+'">' +
                                '<div class="'+checked+'" lay-skin=""><span uid="'+list[i].uid+'"  user_id="'+list[i].userId+'" ' +
                                'userName="'+list[i].userName+'">主办</span><i class="layui-icon"></i></div><span class="name">' +
                                '['+list[i].deptName+'] '+list[i].userName+' '+list[i].userPrivName+'<span class="status"> </span></span></div>'));
						}
					}else{
                       for(var i=0;i<list.length;i++){
                           str.push($('<div class="block-right-item '+list[i].uid+'" ' +
							   'item_id="'+list[i].uid+'" item_name="'+list[i].userName+'" id="'+list[i].uid+'" ' +
							   'user_id="'+list[i].userId+'" uid="'+list[i].uid+'" title="'+list[i].userName+'">' +
							   '<div class="layui-unselect layui-form-checkbox" lay-skin="">' +
							   '<span uid="'+list[i].uid+'"  user_id="'+list[i].userId+'" userName="'+list[i].userName+'">主办</span>' +
							   '<i class="layui-icon"></i></div>' +
							   '<span class="name">'+list[i].userName+' '+list[i].userPrivName+'<span class="status"> ' +
							   '</span></span></div>'));
					   }
					}
                    target.html(str)
                }
            }
            $('.layui-form-item').on('click','.block-right-item',function (e) {
                var that = $(this);
                var uid = that.attr('uid');
                if(!($(e.target).parent().attr('class').indexOf('layui-form-checkbox') > 0)){
                    if(that.attr('class').indexOf('active') > -1){
                        that.removeClass("active");
                        selectedList[uid] = false;
                    }else{
                        var divObj = $(that.prop("outerHTML"));
                        selectedList[uid] = true;
                        divObj.addClass("active");
                        that.addClass("active");
                    }
                    console.log($('.allItem ').find('.layui-form-checked').length)
                    if($('.allItem ').find('.layui-form-checked').length == 0){

                        $(e.target).siblings().addClass('layui-form-checked')
					}else{
                        $(e.target).siblings().removeClass('layui-form-checked')
					}
				}else{
                    if($(e.target).parent().attr('class').indexOf('layui-form-checked') > -1){
                        $(e.target).parent().removeClass('layui-form-checked');
                        selectedList.main = "";
                    }else{
                        $('.aitem').find('.layui-form-checkbox').removeClass('layui-form-checked');
                        selectedList.main = uid;
                        selectedList[uid] = true;
                        $(e.target).parent().addClass('layui-form-checked');
                        $(e.target).parent().parent().addClass("active");
                    }
				}
            });
            function buildUserList(id){
                $.ajax({
                    type: "get",
                    url: "../department/getChDept?deptId=" + id,
                    dataType: 'JSON',
                    success: function (res) {
                        var tr = [];
                       res.obj.forEach(function (v,i) {
							var divObj ;
						   if(v.userId){
                               if(v.sex==0){
                                   divObj = $('<div class="block-right-item" item_id="'+v.uid+'" item_name="'+v.userName+'" id="'+v.uid+'" user_id="'+v.userId+'" uid="'+v.uid+'" title="'+v.userName+'"><span class="name">'+v.userName+' '+v.userPrivName+'<span class="status"> </span></span></div>');
                               }else if(v.sex==1){
                                   divObj = $('<div class="block-right-item" item_id="'+v.uid+'" item_name="'+v.userName+'"  id="'+v.uid+'"  user_id="'+v.userId+'" uid="'+v.uid+'" title="'+v.userName+'"><span class="name">'+v.userName+' '+v.userPrivName+'<span class="status"></span></span></div>');
                               }
                               if( $('#selectedDox .userItem #'+v.uid).length > 0 ){
                                   divObj.addClass('active')
							   }
                           }
                           tr.push(divObj);
                       });
                        $('#deptBox .userItem').html(tr);
                    }
                });
			}
			function TreeNode(id,text,state,children){
				this.id = id;
				this.text = text;
				this.state = state;
				this.children = children;
			}
			function convert(data){

				var arr = [];
				var tr = '';
				data.forEach(function(v,i){
					if(v.deptId){
						var node = new TreeNode(v.deptId,v.deptName,"closed") 
						arr.push(node);
					}else if(v.userId){
						if(v.sex==0){
							tr+='<div class="block-right-item" item_id="'+v.uid+'" item_name="'+v.userName+'" id="'+v.uid+'" user_id="'+v.userId+'" uid="'+v.uid+'" title="'+v.userName+'"><span class="name">'+v.userName+' '+v.userPrivName+'<span class="status"> </span></span></div>';
						}else if(v.sex==1){
							tr+='<div class="block-right-item" item_id="'+v.uid+'" item_name="'+v.userName+'"  id="'+v.uid+'"  user_id="'+v.userId+'" uid="'+v.uid+'" title="'+v.userName+'"><span class="name">'+v.userName+' '+v.userPrivName+'<span class="status"></span></span></div>';
						}	
					}					
				});
				$('#deptBox .userItem').html(tr);
				return arr;
			}
				//组织
				$('.tab_btn').click(function(){
					var type = $(this).attr('block');
					$(this).addClass("active").siblings().removeClass('active');
					switch(type){
						case "selected":
							$('#selectedDox').show().siblings().hide();
							break;
                        case "allSelect":
                            $('#allSelect').show().siblings().hide();
                            break;
						case "byFlow":
							$('#byFlow').show().siblings().hide();
							break;
						case "byDept":
                            $('#byDept').show().siblings().hide();
							break;
						case "byPriv":
                            $('#byPriv').show().siblings().hide();
							break;
						case "query":
							break;
					}
				});
            //全部经办人 全部选中
				$('#allSelect ').on('click','#block-right-add',function () {
					$('#allSelect .allItem .block-right-item').addClass('active');
					var str  = '';
					$('#allSelect .allItem .active').each(function (i,v) {
					    var uid = $(v).attr('uid');
                        selectedList[uid] = true;
					});
					$('#selectedDox .userItem').append(str);
				});
				//全部经办人 全部删除
				$('#allSelect ').on('click','#block-right-remove',function () {
					$('#allSelect .allItem .active').each(function (i,v) {
                        var uid = $(v).attr('uid');
                        selectedList[uid] = false;
						if( $('#selectedDox .userItem #'+$(this).attr('uid')).length > 0){
							$('#selectedDox .userItem #'+$(this).attr('uid')).remove();
						}
					});
					$('#allSelect .allItem .block-right-item').removeClass('active');
				});
				$('#dept_item').on("click",".block-right-item",function(){
					var that = $(this);
					if(that.attr('class').indexOf('active') > 0){
						that.removeClass("active");
                        if( $('#selectedDox .userItem #'+that.attr('uid')).length > 0){
                            $('#selectedDox .userItem #'+that.attr('uid')).remove();
                        }
					}else{
						var divObj = $(that.prop("outerHTML"));
						divObj.addClass("active");
						that.addClass("active");
                        if( $('#selectedDox .userItem #'+that.attr('uid')).length < 1){
                            $('#selectedDox .userItem').append(divObj);
                        }
					}
				});
				$('.tree .dynatree-container').on('click','.childdept',function(){
					var  that = $(this);
					getChDept(that.next(),that.attr('deptid'));
					var title=that.find('a').text();
					$('.block-right-header').html(title);
				});
							
				$('.block-right').on('mouseover','div',function(){
					$(this).addClass('hover');
				});	
				$('.block-right').on('mouseout','div',function(){
					$(this).removeClass('hover');
				});	
		});
	</script>
</html>
 