<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fmt" uri="http://www.springframework.org/tags" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="gbk">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
    <title>分享给</title>
    <link rel="stylesheet" href="/static/pack/mobile/style/mui.min.css">
    <link rel="stylesheet" type="text/css" href="/static/pack/mobile/style/iStarted.css">
    <link rel="stylesheet" href="/static/pack/mobile/style/diary_base.css">
    <link rel="stylesheet" href="/static/pack/mobile/style/depart_list.css">
    <script src="/static/js/jquery-1.10.2/jquery.min.js"></script>
    <script type="text/javascript">
    // 自适应布局
    	(function (doc, win) {
        var docEl = doc.documentElement,
            resizeEvt = 'orientationchange' in window ? 'orientationchange' : 'resize',
            recalc = function () {
                var clientWidth = docEl.clientWidth;
                if (!clientWidth) return;
                if(clientWidth>=640){
                    docEl.style.fontSize = '100px';
                }else{
                    docEl.style.fontSize = 100 * (clientWidth / 720) + 'px';
                }
            };

        if (!doc.addEventListener) return;
        win.addEventListener(resizeEvt, recalc, false);
        doc.addEventListener('DOMContentLoaded', recalc, false);
    	})(document, window);
    </script>
    <script type="text/javascript">
    // 转换字符串到元素
    function strToDom (str) {
      var $div = $('<div></div>');
      $div.html(str);
      return $div.children().unwrap();
    }
    // 是否全部选中
    function isAllChecked(arr) {
      var select = true;
      for(var i = 0, len = arr.length; i < len; i++) {
        if(arr[i].checked === false) {
          select = false;
        }
      }
      return select;
    }
    // 创建部门元素
    function createPart (res, checked, upDepId) {
      if(res.data && res.data.length) {
        var data = res.data;
        var str = '';
        var checkedStr = checked ? 'checked=true' : '';
        for(var i = 0, len = data.length; i < len; i++) {
          str +=  '<div class="department">' +
                    '<h3 class="mui-input-row mui-checkbox mui-right" data-dept-id='+data[i].DEPT_ID+' data-up-deptid='+upDepId+' >' +
                      '<label>' +
                        '<i class="file"></i>' +
                        '<span>' + data[i].DEPT_NAME + '</span>' +
                      '</label>' +
                      '<input type="checkbox" name="" id="" '+checkedStr+' />' +
                    '</h3>'+
                  '</div>'
        }
        return strToDom(str);
      }
    }
    //创建人员元素
    function createPerson (res, checked, upDepId) {
      if(res.item && res.item.length) {
        var data = res.item;
        var checkStr = checked ? 'checked=true' : '';
        var str = '';
        for(var i = 0, len = data.length; i < len; i++) {
          // str +=  '<li class="mui-input-row mui-checkbox mui-right person" data-user-id='+data[i].USER_ID+'>' +
          //             '<label><span>'+data[i].USER_NAME+'</span>' +
          //           '</label>' +
          //           '<input name="checkbox1" value="Item 1" type="checkbox"'+checkStr+'>' +
          //         '</li>'
          str += '<div class="department">' +
                    '<h3 class="mui-input-row mui-checkbox mui-right" data-up-deptid='+upDepId+' data-user-id='+data[i].USER_ID+'>' +
                      '<label>' +
                        '<span>' + data[i].USER_NAME + '</span>' +
                      '</label>' +
                      '<input type="checkbox" name="" id="" '+checkStr+' />' +
                    '</h3>'+
                  '</div>'
        }
        return strToDom(str);
      }
    }
    // 初始化页面
    $.ajax({
      url: '/pda/diary/data/data.php',
      datatype: 'json',
      type: 'get',
      data: {
        flag: 20,
        PARENT_ID: ''
      },
      success: function(res) {
        res = JSON.parse(res);
          var parts = createPart(res, false, 0);
          var persons = createPerson(res, false, 0);
          $('.main').append(parts);
          $('.main').append(persons);
      }
    })

    // 缓存部门点击事件是否点击
    var clicked = {};

    $(function () {
      // 部门点击事件
      $('.main').on('click', '[data-dept-id]', function (e){
        var checkBox = $(this).find('>[type=checkbox]')
        var checked = checkBox.prop('checked');
        var curEle = $(this);
        curEle.nextAll().toggle();
        var depid = curEle.attr('data-dept-id');
        // console.log('depid', depid);
        if (!clicked["deptid"+ depid]) {
          clicked["deptid"+ depid] = true;
          $.ajax({
            url: "/pda/diary/data/data.php",
            data: {
              flag: 20,
              PARENT_ID: depid
            },
            type: 'get',
            success: function (res) {
              res = JSON.parse(res);
              var personEle = createPerson(res, checked, depid);
              var partEle = createPart(res, checked, depid);
              curEle.parent().append(personEle).append(partEle);
            }
          })
        }
      })
      // 部门总体点击按钮是否点击
      function totalCheck(el) {
        // 获取总的input框
        var $parent = $(el).parent().parent().parent();
        var totalCheckbox = $parent.find('>h3.mui-input-row>[type=checkbox]')
        // 获取当前同等级的checkbox
        var equalCheckbox = $parent.find('>div.department>.mui-input-row>[type=checkbox]');
        // 下一级菜单选中之后，上一级菜单是否全选中
        totalCheckbox.prop('checked', isAllChecked(equalCheckbox));
        // 下一个
        var upLevelCatalog = $parent.parent().find('>h3.mui-input-row>[type=checkbox]');
        if(upLevelCatalog.length) {
          totalCheck(totalCheckbox)
        }
      }
      // 复选款的点击事件
      $('.main').on('click', '[type=checkbox]', function (e) {
        // 全部选中
        var selectVal = $(this).prop('checked');
        $(this).parent().parent().find('[type=checkbox]').prop('checked', selectVal)
        totalCheck(this);
        e.stopPropagation();
      })
      // 发送数据
      $('#save_share').on('click', function() {
        let $checkboxs = $('input[type=checkbox]');
        var DEPT_ID="";
        var USER_ID="";
        var userDeptName="";
        var depId, userId;
        for(var i = 0, len = $checkboxs.length; i < len; i++) {
          if($checkboxs[i].checked === true) {
            var parent = $($checkboxs[i]).parent();
            depId =  parent.attr('data-dept-id');
            userDeptName +=  parent.find("span").html() +",";
            if(depId !== '' && depId != undefined) {
              DEPT_ID += depId + ','
            }
            userId = parent.attr('data-user-id');
            if(userId !== '' && userId != undefined) {
 				USER_ID += userId + ','
            }
          }
        }
        function GetQueryString(name) {
			var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
			var r = window.location.search.substr(1).match(reg);
			if (r != null) return unescape(r[2]); return null;
		}
       var DIA_ID = GetQueryString("DIA_ID"); //括号里放地址栏传参变量
		window.location='/pda/diary/Create.php?USER_ID='+USER_ID+'&DEPT_ID='+DEPT_ID+'&id='+DIA_ID;
      })
      // 去除重复的部分
//    function deleteRepeat(USER_ID,DEPT_ID) {
//      var deptIdArr = DEPT_ID;
//      var userIdArr = USER_ID;
//      for(var i = 0, len = userIdArr.length; i < len; i++) {
//        var curUpDepId = $('[data-user-id='+userIdArr[i]+']').attr('data-up-deptid');
//        if(isInArr(curUpDepId, deptIdArr)) {
//            delItem(userIdArr[i], userIdArr);
//        }
//      }
//      for(var j = 0; j < deptIdArr.length; j++) {
//          var $curUpDepId = $('[data-dept-id='+deptIdArr[j]+']').attr('data-up-deptid');
//          if(isInArr($curUpDepId, deptIdArr)) {
//            delItem(deptIdArr[j], deptIdArr);
//            j--;
//          }
//      }
//      return USER_ID ;
//      return DEPT_ID;
//    }
      // 数组查询方法
//    function isInArr (str, arr) {
//      var isHas = false;
//      for(var i = 0, len = arr.length; i < len; i++) {
//        if(arr[i] === str) {
//          isHas = true;
//        }
//      }
//      return isHas;
//    }
      // 数组删除元素方法
//    function delItem(str, arr) {
//      var index;
//      for(var i = 0, len = arr.length; i < len; i++) {
//        if(arr[i] === str) {
//          index = i;
//        }
//      }
//      if(index!=undefined) {
//        arr.splice(index, 1);
//      }
//      return arr;
//    }

      // 搜索框事件
      $('.top [type=search]').on('keyup', function (e){
        var val = $(this).val().trim();
        if(e.keyCode === 13 && val !== '' ) {
          $.ajax({
            url: '/pda/diary/data/data.php',
            type: 'get',
            data: {
              flag: 20,
              keyword: val
            },
            success: function (res) {
              res = JSON.parse(res);
              console.log(res);
              var partEl = createPart(res);
              var personEl = createPerson(res);
              $('.main').html('').append(partEl).append(personEl);
            }
          })
        }
      })

      var $top = $('.top');
      var $hiddenEl = $top.find('.mui-input-row>.mui-icon');

      $top.on('click', 'p', function () {
        $(this).hide();
        $top.find('[type=search]').focus();
      })

      $('.top [type=search]').on('blur', function() {
        if($(this).val() === '') {
          $(this).parent().find('>p').show();
        }
        $hiddenEl.addClass('mui-hidden');
      })

      $('.top [type=search]').on("focus", function() {
        $hiddenEl.removeClass('mui-hidden');
      })
    })
    //
    </script>
</head>
<body id="share">
  <div class="top" style="margin-top:0px;">
    <div class="mui-input-row mui-search">
      <input type="search" class="mui-input-clear">
      <span class="mui-icon mui-icon-search mui-hidden"></span>
      <p><span class="mui-icon mui-icon-search"></span>搜索</p>
    </div>
  </div>
	<div class="main">
    <!--<div class="department">
      <h3 class="mui-input-row mui-checkbox mui-right">
        <label>
          <i class="file"></i>
          <span>钁ｄ簨闀垮姙鍏</span>
        </label>
        <input type="checkbox" name="" id="" />
      </h3>
      <div class="department-level2">
        <h3 class="mui-input-row mui-checkbox mui-right">
          <label>
            <i class="file"></i>
            <span>钁ｄ簨闀垮姙鍏</span>
          </label>
          <input type="checkbox" name="" id="" />
          <ul>
            <li class="mui-input-row mui-checkbox mui-right person">
                <label><span>Ding Zu-Mei/涓佺锟斤拷-->
    </div>
    <nav class="mui-bar mui-bar-tab ">
		<a class="mui-tab-item" href="#" style="padding:0px 10px;" id="save_share">
			<div class="box_confirm" id="com_submit" style="background-color: #5890D7;">
				确定
			</div>
		</a>
	</nav>
</body>
</html>
