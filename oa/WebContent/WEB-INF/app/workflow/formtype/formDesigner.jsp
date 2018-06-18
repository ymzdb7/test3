<%@ page contentType="text/html;charset=UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>表单设计</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link href="../css/ueditor/bootstrap.css" rel="stylesheet" type="text/css" />
    <!--[if lte IE 6]>
    <link rel="stylesheet" type="text/css" href="${ctx }/styles/bootstrap/2.2.2/css/bootstrap-ie6.css">
    <![endif]-->
    <!--[if lte IE 7]>
    <link rel="stylesheet" type="text/css" href="${ctx }/styles/bootstrap/2.2.2/css/ie.css">
    <![endif]-->
    <link href="../css/ueditor/site.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" href="../css/ueditor/styleUpdate.css">
    <link rel="stylesheet" href="../css/base.css">
    <script type="text/javascript" src="../../js/jquery/jquery-1.9.1.js" ></script>
    <script src="../../js/base/base.js"></script>
    <script src="../../js/workflow/work/workform.js"></script>
    <style>
        /*右侧整体内容*/
        .row::-webkit-scrollbar,.people_wenjian::-webkit-scrollbar{
            width: 0px;
            height: 16px;
            background-color: #f5f5f5;
        }
        /*定义滚动条的轨道，内阴影及圆角*/
        .row::-webkit-scrollbar-track,.people_wenjian::-webkit-scrollbar-track{
            -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
            border-radius: 10px;
            background-color: #f5f5f5;
        }
        /*定义滑块，内阴影及圆角*/
        .row::-webkit-scrollbar-thumb,.people_wenjian::-webkit-scrollbar-thumb{
            width: 0px;
            height: 20px;
            border-radius: 10px;
            -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
            background-color: #555;
        }

    </style>
</head>
<body>
<script type="text/javascript">
    var pluginId = 1;
</script>
<div class="container">
    <span id="formtitle" class="title">请假申请单</span>
    <p class="nav-right">
        <a href="javascript:void(0)" id="saveFrom_btn" class="updateForm">保存表单</a>
        <a href="javascript:void(0)" id="preview_btn" class="save_f">预览</a>
        <%--<a href="javascript:void(0)" class="save_f">生成版本</a>--%>
        <a href="javascript:void(0)" id="close_btn" class="save_f">关闭</a>
    </p>
    <%--<div class="title_nav" class="clearfix">--%>
    <%--<p class="nav-left">表单智能设计器:您需要先布局,才可以拖拽右侧的组件到左侧内容里设计工作流表单</p>--%>
    <%--<p class="nav-right">--%>
    <%--<a href="javascript:void(0)" id="saveFrom_btn" class="updateForm">保存表单</a>--%>
    <%--<a href="javascript:void(0)" id="preview_btn" class="save_f">浏览</a>--%>
    <%--<a href="javascript:void(0)" class="save_f">生成版本</a>--%>
    <%--<a href="javascript:void(0)" id="close_btn" class="save_f">关闭</a>--%>
    <%--</p>--%>
    <%--</div>--%>
    <form method="post" id="saveform" name="saveform" action="" class="clearfix">
        <input type="hidden" name="fields" id="fields" value="${form.fieldNum }">

        <div class="row" id="content" style="overflow-x: hidden;overflow-y: auto;">
            <%--<div class="span2">--%>
            <ul class="nav nav-list" id="nav">
                <li class="nav-header">
                    <div class="header_l">表单控件</div>
                    <div class="header_r" style="display:none;">扩展控件</div>
                </li>
                <li><a href="javascript:void(0);" type="text"  class="btn btn-link">
                    <img src="../img/workflow/form/icon_textbox.png" alt="">单行文本框
                </a></li>
                <li><a href="javascript:void(0);" type="textarea"  class="btn btn-link">
                    <img src="../img/workflow/form/icon_multiplelinetextbox.png" alt="">多行文本框</a></li>
                <li><a href="javascript:void(0);" type="select"  class="btn btn-link">
                    <img src="../img/workflow/form/icon_dropmenu.png" alt="">下拉菜单</a></li>
                <li><a href="javascript:void(0);" type="radio"  class="btn btn-link">
                    <img src="../img/workflow/form/icon_radiobutton.png" alt="">单选框</a></li>
                <li><a href="javascript:void(0);" type="checkbox"  class="btn btn-link">
                    <img src="../img/workflow/form/icon_checkbox.png" alt="">复选框</a></li>
                <li><a href="javascript:void(0);" type="macros" class="btn btn-link">
                    <img src="../img/workflow/form/icon_hongcontrol.png" alt="">宏控件</a></li>

                <li style=""><a href="javascript:void(0);" type="listing" class="btn btn-link">
                    <img src="../img/workflow/form/icon_list.png" alt="">列表控件</a></li>

                <li><a href="javascript:void(0);" type="calendar" class="btn btn-link">
                    <img src="../img/workflow/form/icon_calendar.png" alt="">日历控件</a></li>
                <%--<li><a href="javascript:void(0);" class="btn btn-link">--%>
                    <%--<img src="../img/workflow/form/icon_calculator.png" alt="">计算控件</a>--%>
                <%--</li>--%>
                <li><a href="javascript:void(0);" type="macrossign" class="btn btn-link">
                    <img src="../img/workflow/form/icon_macrosign.png" alt="">宏标记</a>
                </li>
                <li><a href="javascript:void(0);" type="autocode" class="btn btn-link">
                    <img src="../img/workflow/form/icon_AtuoNumber.png" alt="">自动编号</a>
                </li>
                <li><a href="javascript:void(0);" type="imgupload" class="btn btn-link">
                    <img src="../img/workflow/form/icon_imgUpload.png" alt="">图片上传控件</a>
                </li>
                <li><a href="javascript:void(0);" type="fileupload" class="btn btn-link">
                    <img src="../img/workflow/form/icon_DocUpload.png" alt="">文件上传控件</a>
                </li>
                 <li><a href="javascript:void(0);" type="editor" class="btn btn-link">
                    <img src="../img/workflow/form/icon_DocUpload.png" alt="">富媒体编辑器</a>
                </li>
                <li><a href="javascript:void(0);" type="sign" class="btn btn-link">
                    <img src="../img/workflow/form/icon_countersign.png" alt="">会签控件</a>
                </li>
                <li><a href="javascript:void(0);" type="userselect" class="btn btn-link">
                    <img src="../img/workflow/form/user_select.png" alt="">用户选择控件</a>
                </li>

                <li><a href="javascript:void(0);" type="deptselect" class="btn btn-link">
                    <img src="../img/workflow/form/group_select.png" alt="">部门选择控件</a>
                </li>
                <li><a href="javascript:void(0);" type="qrcode" class="btn btn-link">
                    <img src="../img/workflow/form/qrcodeicon.png" alt="">二维码控件</a>
                </li>
                <li><a href="javascript:void(0);" type="kgsign" class="btn btn-link">
                    <img src="../img/workflow/form/icon_kdsign.png" alt="">签章控件</a>
                </li>
                <li><a href="javascript:void(0);" type="readcomments" class="btn btn-link">
                    <img src="../img/workflow/form/icon_DocUpload.png" alt="">阅文意见控件</a>
                </li>

                <%--<li><a href="javascript:void(0);" onclick="formDesign.exec('progressbar');" class="btn btn-link">进度条</a></li>
                 <li><a href="javascript:void(0);" onclick="formDesign.exec('qrcode');" class="btn btn-link">二维码</a></li>
                 <li><a href="javas cript:void(0);" onclick="formDesign.exec('more');" class="btn btn-link">一起参与...</a></li>
--%>
            </ul>
            <div class="container_lb" >
                <span class="listclear" style="margin-left: 277px;cursor: pointer;    position: absolute;top: 0;    z-index: 111;">x</span>
                <div class="list00" id="list00" style="left: -309px;">
                    <li>
                        <div class="text-wz">&nbsp;&nbsp;下拉菜单可以使您在一个有限的空间里设置多种选项，并且可以自定义下拉菜单项、设置默认选中项以及能随时修改下拉项的内容和下拉项的排序。但在表单上显示时只显示一个选项，需要通过单击向下的按钮来显示出所有的选项。</div>
                    </li>
                    <li>
                        <div class="text-wz">&nbsp;&nbsp;单选框可以用来设置预定义的选项，您可以通过单击单选框，选择在一组选项中的一个相应的项。该控件具有互相排斥的特性，即选中其中一项时，该组中其他的选项都不能再被选中。</div>
                    </li>
                    <li>
                        <div class="text-wz">&nbsp;&nbsp;复选框可以用来设置预定义的选项，您可以通过单击复选框，选择在一组选项中的一个或多个相应的项。复选框使用时可以选择多个，并且可以设置复选框的初始选中状态。</div>
                    </li>
                    <li>
                        <div class="text-wz">&nbsp;&nbsp;宏控件可以提高填单速度，使工作流的表单填写更加智能与方便。像系统数据库中的经常用到变量，如当前用户姓名，当前日期等，可以直接调用，不用您手动输入。</div>
                    </li>
                    <li>
                        <div class="text-wz">&nbsp;&nbsp;日历控件实现日期选择窗口的弹出，从而进行日期的选择。可以避免手动输入日期和日期格式不正确的情况。</div>
                    </li>
                </div>
                <div class="zz">
                    <div class="arrow" id="prev"><div class="prev"></div>上一条</div>&nbsp;&nbsp;&nbsp;<div class="arrow" id="next">下一条<div class="next"></div></div></div>
            </div>
            <%--</div>--%>
        </div>
        <div class="con_left" id="table_box" style=" width: calc(100% - 309px);">
            <div class="span10">
                <script id="formEditor" type="text/plain" style="width:100%;height: 100%">${form.originalHtml}</script>

                <script type="text/javascript" charset="utf-8" src="../lib/ueditor/ueditor.config.js"></script>
                <script type="text/javascript" charset="utf-8" src="../lib/ueditor/ueditor.all.js"> </script>
                <script type="text/javascript" charset="utf-8" src="../lib/ueditor/lang/zh-cn/zh-cn.js"></script>
                <script type="text/javascript" charset="utf-8" src="../lib/ueditor/formdesign/formdesign.v4.js"></script>
                <script src="../lib/layer/layer.js"></script>
                <!-- script start-->
                <script type="text/javascript">
                    var editorVal=null;
                    var formDesign = {};
                    $(function() {
                        $('.listclear').click(function () {
                            $(this).parent().hide()
                        })
                        autodivheight();
                        function autodivheight() {
                            var winHeight = 0;
                            if (window.innerHeight)
                                winHeight = window.innerHeight;
                            else if ((document.body) && (document.body.clientHeight))
                                winHeight = document.body.clientHeight;
                            if (document.documentElement && document.documentElement.clientHeight)
                                winHeight = document.documentElement.clientHeight;
                            winWidth = document.documentElement.clientWidth;
                            document.getElementById("table_box").style.height = winHeight - 76  + "px";
                            document.getElementById("content").style.height = winHeight - 56  + "px";

                        }
                        window.onresize = autodivheight;
                        var ueheight = $('#table_box').height() - 100;
                        var formid = $.getQueryString("formId")
                        var type = $.getQueryString("type")
                        $("#content .nav-list ").on("click", 'a', function() {

                            formDesign.exec($(this).attr('type'));
                        });
                        var formEditor = UE.getEditor('formEditor', {
                            toolleipi: true, //是否显示，设计器的 toolbars
                            textarea: 'design_content',
                            //这里可以选择自己需要的工具按钮名称,此处仅选择如下五个
                            toolbars: [
                                [
                                    'fullscreen', 'source', '|', 'undo', 'redo', '|',
                                    'bold', 'italic', 'underline', 'fontborder', 'strikethrough', 'superscript', 'subscript', 'removeformat', 'formatmatch', 'autotypeset', 'blockquote', 'pasteplain', '|', 'forecolor', 'backcolor', 'insertorderedlist', 'insertunorderedlist', 'selectall', 'cleardoc', '|',
                                    'rowspacingtop', 'rowspacingbottom', 'lineheight', '|',
                                    'customstyle', 'paragraph', 'fontfamily', 'fontsize', '|',
                                    'directionalityltr', 'directionalityrtl', 'indent', '|',
                                    'justifyleft', 'justifycenter', 'justifyright', 'justifyjustify', '|', 'touppercase', 'tolowercase', '|',
                                    'link', 'unlink', 'anchor', '|' , 'imagenone', 'imageleft', 'imageright', 'imagecenter', '|',
                                    'simpleupload', 'insertimage', 'emotion', 'scrawl', 'insertvideo', 'music', 'attachment', 'map', 'gmap', 'insertframe', 'insertcode', 'webapp', 'pagebreak', 'template', 'background', '|',
                                    'horizontal', 'date', 'time', 'spechars', 'snapscreen', 'wordimage', '|',
                                    'inserttable', 'deletetable', 'insertparagraphbeforetable', 'insertrow', 'deleterow', 'insertcol', 'deletecol', 'mergecells', 'mergeright', 'mergedown', 'splittocells', 'splittorows', 'splittocols', 'charts', '|',
                                    'print', 'preview', 'searchreplace', 'help', 'drafts', '|']
                            ],
                            //focus时自动清空初始化时的内容
                            //autoClearinitialContent:true,
                            //关闭字数统计
                            wordCount: false,
                            //关闭elementPath
                            elementPathEnabled: false,
                            //默认的编辑区域高度
                            initialFrameHeight: ueheight,
                            //编辑器宽度
                            autoClearEmptyNode:true,
                            //                            initialFrameWidth: auto,

                            iframeCssUrl: "../css/ueditor/bootstrap.css" //引入自身 css使编辑器兼容你网站css
                            //更多其他参数，请参考ueditor.config.js中的配置项
                        });
                        formEditor.ready(function() {
                            $('#preview_btn').on('click', function() {
                                var url = '../workflow/work/workform1?formId='+formid;
                                $.popWindow(url,'表单预览',100,300,900,600)
                            });
                            $('#close_btn').on('click', function() {
                                window.close();
                            });
                            $('#saveFrom_btn').on('click', function() {
                                if (formEditor.hasContents()) {
                                    var itemMax = 0;
                                    var checkMore = [];
                                    var checkFlag = true;
                                    $(formEditor.getContent()).find('.form_item ').each(function () {
                                        var name = $(this).attr('name');
                                        if( checkMore[name]){
                                            checkFlag = false;
                                            layer.msg('字段'+name+'存在重复字段', {icon: 3});
                                            return false;
                                        }else{
                                            checkMore[name] = true
                                        }
                                        var max = parseInt(name.split('_')[1]);
                                        if(!isNaN(max) && (max > itemMax)){
                                            itemMax = max;
                                        }
                                    });
                                   if(checkFlag){
                                       $.ajax({
                                           type: 'POST',
                                           url: 'updateFormType',
                                           dataType : 'json',
                                           data: {
                                               'formId': formid,
                                               'printModel': formEditor.getContent(),
                                               'itemMax':itemMax
                                           },
                                           success: function(data) {
                                               if (data.flag) {
                                                   layer.msg('表单保存成功', {icon: 1});
                                                   // window.location.href='${ctx}/config/form';
                                               } else {
                                                   layer.msg('表单保存失败', {icon: 2});
                                               }
                                           }
                                       });
                                   }

                                }else{
                                    layer.msg('表单内容不能为空', {icon: 0});
                                }

                            })
                            if (type == 'edit') {
                                $.ajax({
                                    type: "get",
                                    url: "../form/formType",
                                    dataType: 'JSON',
                                    data: {
                                        fromId: formid
                                    },
                                    success: function(res) {
                                        var formObj = $('<div>' + res.object.printModel + '</div>');

                                        workForm.ReBuild(formObj);
                                        $('#formtitle').html(res.object.formName);
                                        formEditor.setContent(formObj.html(), true);
                                        if(res.object.itemMax){
                                            console.log(pluginId)
                                            pluginId = (res.object.itemMax+1);
                                        }
                                    }
                                });
                            }
                        });

                        UE.registerUI('td_js_script', function(editor, uiname){
                            var me = this;
                            // 创建dialog
                            var jsDialog = new UE.ui.Dialog({

                                // 指定弹出层路径
                                iframeUrl: '/workflow/formtype/control?formId='+formid+'&control=1',
                                // 编辑器实例
                                editor: editor,
                                // dialog 名称
                                name: 'js',
                                // dialog 标题
                                title: 'JS脚本',

                                // dialog 外围 css
                                cssRules:"width:600px;height:350px;",

                                //如果给出了buttons就代表dialog有确定和取消
                                buttons:[
                                    {
                                        className:'edui-okbutton',
                                        label:'确定',
                                        onclick:function () {
                                            var js=editorVal.getValue();
                                            $.ajax({
                                                type: "post",
                                                url: "/form/updateFormType",
                                                dataType: 'JSON',
                                                data: {
                                                    formId: formid,
                                                    script:js
                                                },
                                                success: function (res) {
                                                    console.log("js ")

                                                }
                                            })
                                            jsDialog.close(true);
                                        }
                                    },
                                    {
                                        className:'edui-cancelbutton',
                                        label:'取消',
                                        onclick:function () {
                                            jsDialog.close(false);
                                        }
                                    }
                                ]});

                            editor.ready(function(){
                                //UE.utils.cssRule('td_js_script', 'img.td_js_script{vertical-align: middle;}', editor.document);
                            });

                            var iconUrl = '/img/workflow/js.png';
                            var tmpLink = document.createElement('a');
                            tmpLink.href = iconUrl;
                            tmpLink.href = tmpLink.href;
                            iconUrl = tmpLink.href;

                            var jsBtn = new UE.ui.Button({
                                name: uiname,
                                title: 'JS脚本',
                                //需要添加的额外样式，指定icon图标
                                cssRules :'background: url("' + iconUrl + '") no-repeat center center !important',
                                onclick:function () {
                                    //渲染dialog
                                    jsDialog.render();
                                    jsDialog.open();
                                    me.currentField = "js";
                                    me.ui._dialogs['jsDialog'] = jsDialog;
                                }
                            });

                            //当点到编辑内容上时，按钮要做的状态反射
                            editor.addListener('selectionchange', function () {
                                var state = editor.queryCommandState(uiname);
                                if (state == -1) {
                                    jsBtn.setDisabled(true);
                                    jsBtn.setChecked(false);
                                } else {
                                    jsBtn.setDisabled(false);
                                    jsBtn.setChecked(state);
                                }
                            });

                            return jsBtn;
                        });
                        UE.registerUI('td_css_script', function(editor, uiname){
                            var me = this;
                            // 创建dialog
                            var cssDialog = new UE.ui.Dialog({

                                // 指定弹出层路径
                                iframeUrl: '/workflow/formtype/control?formId='+formid+'&control=2',
                                // 编辑器实例
                                editor: editor,
                                // dialog 名称
                                name: 'css',
                                // dialog 标题
                                title: 'CSS样式',

                                // dialog 外围 css
                                cssRules: 'width:600px; height: 350px;',

                                //如果给出了buttons就代表dialog有确定和取消
                                buttons:[
                                    {
                                        className:'edui-okbutton',
                                        label:'确定',
                                        onclick:function () {

                                            console.log(editorVal.getValue())
                                            var css=editorVal.getValue();
                                            $.ajax({
                                                type: "post",
                                                url: "/form/updateFormType",
                                                dataType: 'JSON',
                                                data: {
                                                    formId: formid,
                                                    css:css
                                                },
                                                success: function (res) {
                                                    console.log("css ")
                                                }
                                            })
                                            cssDialog.close(true);
                                        }
                                    },
                                    {
                                        className:'edui-cancelbutton',
                                        label:'取消',
                                        onclick:function () {
                                            cssDialog.close(false);
                                        }
                                    }
                                ]});

                            editor.ready(function(){
                                //UE.utils.cssRule('td_css_script', 'img.td_css_script{vertical-align: middle;}', editor.document);
                            });

                            var iconUrl = '/img/workflow/css.png';
                            var tmpLink = document.createElement('a');
                            tmpLink.href = iconUrl;
                            tmpLink.href = tmpLink.href;
                            iconUrl = tmpLink.href;

                            var cssBtn = new UE.ui.Button({
                                name: uiname,
                                title: 'CSS样式',
                                //需要添加的额外样式，指定icon图标
                                cssRules :'background: url("' + iconUrl + '") no-repeat center center !important',
                                onclick:function () {
                                    //渲染dialog
                                    cssDialog.render();
                                    cssDialog.open();
                                    me.currentField = "css";
                                    me.ui._dialogs['cssDialog'] = cssDialog;
                                }
                            });

                            //当点到编辑内容上时，按钮要做的状态反射
                            editor.addListener('selectionchange', function () {
                                var state = editor.queryCommandState(uiname);
                                if (state == -1) {
                                    cssBtn.setDisabled(true);
                                    cssBtn.setChecked(false);
                                } else {
                                    cssBtn.setDisabled(false);
                                    cssBtn.setChecked(state);
                                }
                            });

                            return cssBtn;
                        });

                        formDesign = {

                            /*执行控件*/
                            exec: function(method) {
                                formEditor.execCommand(method);
                            },
                            /*
                             Javascript 解析表单
                             template 表单设计器里的Html内容
                             fields 字段总数
                             */
                            parse_form: function(template, fields) {
                                debugger;

                                //正则  radios|checkboxs|select 匹配的边界 |--|  因为当使用 {} 时js报错 (plugins|fieldname|fieldflow)
                                var preg = /(\|-<span(((?!<span).)*plugins=\"(radios|checkboxs|select)\".*?)>(.*?)<\/span>-\||<(img|input|textarea|select).*?(<\/select>|<\/textarea>|\/>))/gi,
                                    preg_attr = /(\w+)=\"(.?|.+?)\"/gi,
                                    preg_group = /<input.*?\/>/gi;
                                if (!fields) fields = 0;

                                var template_parse = template,
                                    template_data = new Array(),
                                    add_fields = new Object(),
                                    checkboxs = 0;

                                var pno = 0;
                                template.replace(preg, function(plugin, p1, p2, p3, p4, p5, p6) {
                                    var parse_attr = new Array(),
                                        attr_arr_all = new Object(),
                                        name = '',
                                        select_dot = '',
                                        is_new = false;
                                    var p0 = plugin;
                                    var tag = p6 ? p6 : p4;
                                    //alert(tag + " \n- t1 - "+p1 +" \n-2- " +p2+" \n-3- " +p3+" \n-4- " +p4+" \n-5- " +p5+" \n-6- " +p6);

                                    if (tag == 'radios' || tag == 'checkboxs') {
                                        plugin = p2;
                                    } else if (tag == 'select') {
                                        plugin = plugin.replace('|-', '');
                                        plugin = plugin.replace('-|', '');
                                    }
                                    plugin.replace(preg_attr, function(str0, attr, val) {
                                        if (attr == 'name') {
                                            if (val == 'NEWFIELD') {
                                                is_new = true;
                                                fields++;
                                                val = 'data_' + fields;
                                            }
                                            name = val;
                                        }
                                        if (tag == 'select' && attr == 'value') {
                                            if (!attr_arr_all[attr]) attr_arr_all[attr] = '';
                                            attr_arr_all[attr] += select_dot + val;
                                            select_dot = ',';
                                        } else {
                                            attr_arr_all[attr] = val;
                                        }
                                        var oField = new Object();
                                        oField[attr] = val;
                                        parse_attr.push(oField);
                                    })
                                    /*alert(JSON.stringify(parse_attr));return;*/
                                    if (tag == 'checkboxs') /*复选组  多个字段 */ {
                                        plugin = p0;
                                        plugin = plugin.replace('|-', '');
                                        plugin = plugin.replace('-|', '');
                                        var name = 'checkboxs_' + checkboxs;
                                        attr_arr_all['parse_name'] = name;
                                        attr_arr_all['name'] = '';
                                        attr_arr_all['value'] = '';
                                        attr_arr_all['content'] = '<span plugins="checkboxs"  title="' + attr_arr_all['title'] + '">';
                                        var dot_name = '',
                                            dot_value = '';
                                        p5.replace(preg_group, function(parse_group) {
                                            var is_new = false,
                                                option = new Object();
                                            parse_group.replace(preg_attr, function(str0, k, val) {
                                                if (k == 'name') {
                                                    if (val == 'NEWFIELD') {
                                                        is_new = true;
                                                        fields++;
                                                        val = 'data_' + fields;
                                                    }
                                                    attr_arr_all['name'] += dot_name + val;
                                                    dot_name = ',';
                                                } else if (k == 'value') {
                                                    attr_arr_all['value'] += dot_value + val;
                                                    dot_value = ',';
                                                }
                                                option[k] = val;
                                            });

                                            if (!attr_arr_all['options']) attr_arr_all['options'] = new Array();
                                            attr_arr_all['options'].push(option);
                                            if (!option['checked']) option['checked'] = '';
                                            var checked = option['checked'] ? 'checked="checked"' : '';
                                            attr_arr_all['content'] += '<input type="checkbox" name="' + option['name'] + '" value="' + option['value'] + '" fieldname="' + attr_arr_all['fieldname'] + option['fieldname'] + '" fieldflow="' + attr_arr_all['fieldflow'] + '" ' + checked + '/>' + option['value'] + '&nbsp;';

                                            if (is_new) {
                                                var arr = new Object();
                                                arr['name'] = option['name'];
                                                arr['plugins'] = attr_arr_all['plugins'];
                                                arr['fieldname'] = attr_arr_all['fieldname'] + option['fieldname'];
                                                arr['fieldflow'] = attr_arr_all['fieldflow'];
                                                add_fields[option['name']] = arr;
                                            }

                                        });
                                        attr_arr_all['content'] += '</span>';
                                        //parse
                                        template = template.replace(plugin, attr_arr_all['content']);
                                        template_parse = template_parse.replace(plugin, '{' + name + '}');
                                        template_parse = template_parse.replace('{|-', '');
                                        template_parse = template_parse.replace('-|}', '');
                                        template_data[pno] = attr_arr_all;
                                        checkboxs++;
                                    } else if (name) {
                                        if (tag == 'radios') /*单选组  一个字段*/ {
                                            plugin = p0;
                                            plugin = plugin.replace('|-', '');
                                            plugin = plugin.replace('-|', '');
                                            attr_arr_all['value'] = '';
                                            attr_arr_all['content'] = '<span plugins="radios" name="' + attr_arr_all['name'] + '" title="' + attr_arr_all['title'] + '">';
                                            var dot = '';
                                            p5.replace(preg_group, function(parse_group) {
                                                var option = new Object();
                                                parse_group.replace(preg_attr, function(str0, k, val) {
                                                    if (k == 'value') {
                                                        attr_arr_all['value'] += dot + val;
                                                        dot = ',';
                                                    }
                                                    option[k] = val;
                                                });
                                                option['name'] = attr_arr_all['name'];
                                                if (!attr_arr_all['options']) attr_arr_all['options'] = new Array();
                                                attr_arr_all['options'].push(option);
                                                if (!option['checked']) option['checked'] = '';
                                                var checked = option['checked'] ? 'checked="checked"' : '';
                                                attr_arr_all['content'] += '<input type="radio" name="' + attr_arr_all['name'] + '" value="' + option['value'] + '"  ' + checked + '/>' + option['value'] + '&nbsp;';

                                            });
                                            attr_arr_all['content'] += '</span>';

                                        } else {
                                            attr_arr_all['content'] = is_new ? plugin.replace(/NEWFIELD/, name) : plugin;
                                        }
                                        //attr_arr_all['itemid'] = fields;
                                        //attr_arr_all['tag'] = tag;
                                        template = template.replace(plugin, attr_arr_all['content']);
                                        template_parse = template_parse.replace(plugin, '{' + name + '}');
                                        template_parse = template_parse.replace('{|-', '');
                                        template_parse = template_parse.replace('-|}', '');
                                        if (is_new) {
                                            var arr = new Object();
                                            arr['name'] = name;
                                            arr['plugins'] = attr_arr_all['plugins'];
                                            arr['title'] = attr_arr_all['title'];
                                            arr['orgtype'] = attr_arr_all['orgtype'];
                                            arr['fieldname'] = attr_arr_all['fieldname'];
                                            arr['fieldflow'] = attr_arr_all['fieldflow'];
                                            add_fields[arr['name']] = arr;
                                        }
                                        template_data[pno] = attr_arr_all;
                                    }
                                    pno++;
                                })
                                var view = template.replace(/{\|-/g, '');
                                view = view.replace(/-\|}/g, '');
                                var parse_form = new Object({
                                    'fields': fields, //总字段数
                                    'template': template, //完整html
                                    'parse': view,
                                    'data': template_data, //控件属性
                                    'add_fields': add_fields //新增控件
                                });
                                return JSON.stringify(parse_form);
                            },
                            /*type  =  save 保存设计 versions 保存版本  close关闭 */
                            fnCheckForm: function(type) {

                                if (formEditor.queryCommandState('source'))
                                    formEditor.execCommand('source'); //切换到编辑模式才提交，否则有bug

                                if (formEditor.hasContents()) {
                                    formEditor.sync(); /*同步内容*/
                                    //--------------以下仅参考-----------------------------------------------------------------------------------------------------
                                    var type_value = '',
                                        fields = $("#fields").val(),
                                        formeditor = '';

                                    if (typeof type !== 'undefined') {
                                        type_value = type;
                                    }
                                    //获取表单设计器里的内容
                                    formeditor = formEditor.getContent();
                                    //解析表单设计器控件
                                    // var parse_form = this.parse_form(formeditor,fields);

                                    //alert(formid);
                                    //异步提交数据
                                    $.ajax({
                                        type: 'POST',

                                        url: 'updateFormType',
                                        //dataType : 'json',
                                        data: {
                                            'formId': formid,
                                            'printModel': formeditor
                                        },
                                        success: function(data) {
                                            if (data) {
                                                alert('表单保存成功');
                                                // window.location.href='${ctx}/config/form';
                                            } else {
                                                alert('表单保存失败');
                                            }
                                        }
                                    });
                                } else {
                                    alert('表单内容不能为空！')
                                    $('#submitbtn').button('reset');
                                    return false;
                                }
                            },
                            /*预览表单*/
                            fnReview: function() {
                                if (formEditor.queryCommandState('source'))
                                    formEditor.execCommand('source'); /*切换到编辑模式才提交，否则部分浏览器有bug*/
                                if (formEditor.hasContents()) {
                                    formEditor.sync(); /*同步内容*/
                                    alert("你点击了预览,请自行处理....");
                                    return false;
                                    //--------------以下仅参考-------------------------------------------------------------------
                                    /*设计form的target 然后提交至一个新的窗口进行预览*/
                                    document.saveform.target = "mywin";
                                    window.open('', 'mywin', "menubar=0,toolbar=0,status=0,resizable=1,left=0,top=0,scrollbars=1,width=" + (screen.availWidth - 10) + ",height=" + (screen.availHeight - 50) + "\"");

                                    document.saveform.action = "";
                                    document.saveform.submit(); //提交表单
                                } else {
                                    alert('表单内容不能为空！');
                                    return false;
                                }
                            }
                        };
                    });
                </script>
                <!-- script end -->
            </div>
        </div>


    </form>

    <script type="text/javascript">
        $(function () {
//        var $width=$(window).width();
//        $('.span10').width($width-330);

            $('#nav').on('click','.btn',function () {
                $('.btn').removeClass('bgBack');
                $(this).addClass('bgBack');
            })
//            autodivheight();
//            function autodivheight() {
//                var winHeight = 0;
//                if (window.innerHeight)
//                    winHeight = window.innerHeight;
//                else if ((document.body) && (document.body.clientHeight))
//                    winHeight = document.body.clientHeight;
//                if (document.documentElement && document.documentElement.clientHeight)
//                    winHeight = document.documentElement.clientHeight;
//                winWidth = document.documentElement.clientWidth;
//                document.getElementById("table_box").style.height = winHeight - 76  + "px";
//                document.getElementById("content").style.height = winHeight - 56  + "px";
//                alert('qqq');
//            }
//            window.onresize = autodivheight;


            var list = document.getElementById('list00');var prev = document.getElementById('prev');
            var next = document.getElementById('next');

            function animate(offset) {
                //获取的是style.left，是相对左边获取距离，所以第一张图后style.left都为负值，
                //且style.left获取的是字符串，需要用parseInt()取整转化为数字。
                var qq = $('#list00').css('left');
                console.log(qq);
                var newLeft = parseInt(list.style.left) + offset;
                console.log(newLeft);
                list.style.left = newLeft + 'px';
                if(newLeft<-927){
                    list.style.left = -309 + 'px';
                }
                if(newLeft>-309){
                    list.style.left = -927 + 'px';
                }
            }

            prev.onclick = function() {
                console.log('0');
                animate(309);
            }
            next.onclick = function() {
                console.log('1');
                animate(-309);
            }

        })


    </script>

</body>

</html>
