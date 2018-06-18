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
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no, minimum-scale=1.0, maximum-scale=1.0">
    <meta name="apple-mobile-web-app-status-bar-style" content="black" />
    <meta name="format-detection" content="telephone=no" />
    <title>新建工作</title>
    <link rel="stylesheet" type="text/css" href="/static/pack/mobile/style/common.css?161115">
    <script type="text/javascript">
        var td_lang = {};
        td_lang.pda = {
            msg_1:'暂无更多信息',
            msg_2:'加载中...',
            msg_3:'页面加载错误',
            msg_4:'下拉刷新...',
            msg_5:'释放立即刷新...',
            msg_6:'上拉加载更多...',
            msg_7:'释放加载更多...',
            msg_8:'已全部加载完毕',
            msg_9:'读取附件中...',
            no_cnt:'暂无信息',
            cancel:'取消',
            reload:'重新加载',
        };	var P = "hfaalm896ku4j0rughj3mq4a35";
        var C_VER = "";
        var P_VER = "";
        var isIDevice = (/iphone|ipad/gi).test(navigator.appVersion);

    </script>
    <script type="text/javascript" src="/static/pack/mobile/js/common.js"></script>
    <script>
        tMobileSDK.platForm = 'h5';
        tMobileSDK.configs.headerType='header';
        tMobileSDK.collectInfo("http://stat.tongda2000.com/h5app/");
    </script>
</head><style>
    .select{font-size: 14px;}
    .ui-dialog-ft.ui-btn-group{right: 2px;}
    .ui-pages{height: auto;}
    .ui-page{position: static; display:none;}
    .ui-page.ui-page-active{ display: block;}
    .ui-page1{overflow: scroll, -webkit-overflow-scrolling: touch;height:auto;}
</style>
<section class="ui-container">
    <section id="pages" class="ui-pages">
        <!-- page of 工作列表-->
        <section id="new_list" class="ui-page"></section>
        <!-- page of 新建工作-->
        <section id="new_edit" class="ui-page"></section>
        <!-- page of 触发器-->
        <section id="plugin" class="ui-page">
            <div id="scroller_plugin"></div>
        </section>
    </section>
</section>

<script type="text/javascript">
    var P = '86;hfaalm896ku4j0rughj3mq4a35;';//"hfaalm896ku4j0rughj3mq4a35";
    var flow_id,
        force_pre_set,
        auto_edit;
    var q_flow_prcs = 1;
    var q_prcs_id = 1;
    var q_flow_id = '';
    var q_run_id = '';
    var q_prcs_key_id = '';
    var q_run_name_left = '';
    var q_run_name = '';
    var q_run_name_right = '';
    var q_auto_num = '';
    var q_auto_num_month = '';
    var q_auto_num_year = '';
    var q_all_run_name = '';
    var g_tirgger_type = '';
    var nonewworkpriv = "您没有新建此工作的权限";
    var norunname = "名称/文号不能为空";
    var samerunname = "创建失败，输入的工作名称/文号与之前的工作重复，请重新设置。";
    var failednewwork = "新建工作失败，请重新创建！";
    var sameautonum = "输入的自增编号与之前的工作重复，请重新设置。";
    var triggerloadfile = "触发器加载失败";
    var initFlag = false;

    $.ProLoading = {
        show: function(msg){
            this.el = $.loading({
                content: msg,
            })
        },
        hide:function(){
            this.el.loading("hide");
        }
    }

    function showMessage(t)
    {
        showMessage.el = $.tips({
            content: t,
            stayTime: 2000,
            type:"success"
        });
    }

    //define an object for router mapping usage
    var routerMapping = {
        root: 'category'
    };

    Zepto(function($){
        routie({
            'new_list': function(){
                if(!initFlag){
                    // 效果优化，第一次进到new_work.php时没有li会加载loading，在history.back时已经有li不会加载loading
                    if($('#new_list').find('li').length == 0){
                        $.ProLoading.show();
                    }
                    loadInitList();
                }
                initFlag = true;
            },

            'new_list/?:id': function(id){
                var a_para = id.split('&');
                var id = a_para[0].split('=')[1];
                var file_type = a_para[1].split('=')[1];
                getContent(id, file_type);
                initFlag = false;
            },

            'new_edit/?:id': function(id){
                newWorkFlowEdit(id);
                initFlag = false;
            },

            'plugin/?:id': function(id){
                q_flow_id = id;
                goOnTriggerPage("CREATE");
            }
        });
    })

    function routiePage(q_id, file_type)
    {
        if(file_type == 'process'){
            newWorkFlowEdit(q_id);
        }else{
            routie('new_list/Q_ID='+q_id+'&FILE_TYPE='+file_type+'');
        }
    }

    function newWorkFlow(control_type)
    {
        $.ProLoading.show();
        var run_name_left = $("#RUN_NAME_LEFT").length == 1 ? $.trim($("#RUN_NAME_LEFT").val()) : "";
        var run_name = $("#RUN_NAME").length == 1 ? $.trim($("#RUN_NAME").val()) : "";
        var run_name_right = $("#RUN_NAME_RIGHT").length == 1 ? $.trim($("#RUN_NAME_RIGHT").val()) : "";
        var auto_num = $('[name="AUTO_NUM"]').val();
        var auto_num_month = $('[name="AUTO_NUM_MONTH"]').val();
        var auto_num_year = $('[name="AUTO_NUM_YEAR"]').val();
        var all_run_name  = run_name_left + run_name + run_name_right;

        q_run_name_left = run_name_left ? run_name_left : q_run_name_left;
        q_run_name = run_name ? run_name : q_run_name;
        q_run_name_right = run_name_right ? run_name_right : q_run_name_right;
        q_auto_num = auto_num ? auto_num : q_auto_num;
        q_auto_num_month = auto_num_month ? auto_num_month : q_auto_num_month;
        q_auto_num_year = auto_num_year ? auto_num_year : q_auto_num_year;
        q_all_run_name = all_run_name ? all_run_name : q_all_run_name;

        if(force_pre_set == 1 && (auto_edit == 2 || auto_edit == 4) && (run_name_left == "" || q_run_name_left == "")){
            $.ProLoading.hide();
            showMessage("前缀不能为空");
            return false;
        }else if(run_name == "" || q_run_name == ""){
            $.ProLoading.hide();
            showMessage("名称/文号不能为空");
            return false;
        }else if(force_pre_set == 1 && (auto_edit == 3 || auto_edit == 4) && (run_name_right == "" || q_run_name_right == "")){
            $.ProLoading.hide();
            showMessage("后缀不能为空");
            return false;
        }

        var para = {
            "P": P,
            "FLOW_ID": flow_id,
            "RUN_NAME": q_all_run_name,
            "AUTO_NUM": q_auto_num,
            "AUTO_NUM_MONTH": q_auto_num_month,
            "AUTO_NUM_YEAR": q_auto_num_year,
            "FOLDER": "PDA"
        };
        if(control_type){
            para['TRIGGER'] = control_type;
            var $form_plugin = $('[name="form_plugin"]');
            $form_plugin.each(function(i, e){
                var plugin_arr = $(e).serializeArray();
                for(var v in plugin_arr){
                    para[plugin_arr[v]['name']] = plugin_arr[v]['value'];
                }
            });
        }

        $.get('/mobile/work_flow/client_interface/createWork.php', para, function(data){
            $.ProLoading.hide();
            data = JSON.parse(data);
            var status = data.status;
            var detail_url = data.detail_url;
            if(status == "false" && detail_url == nonewworkpriv){
                showMessage(nonewworkpriv);
                return false;
            }else if(status == "false" && detail_url == norunname){
                showMessage(norunname);
                return false;
            }else if(status == "false" && detail_url == samerunname){
                showMessage(samerunname);
                return false;
            }else if(status == "false" && detail_url == failednewwork){
                showMessage(failednewwork);
                return false;
            }else if(status == "false" && detail_url == 'TRIGGER'){
                routie("plugin/"+q_flow_id+"");
                return;
            }else{
                detail_url = detail_url.replace("mobile", "pda");
                detail_url = detail_url.replace("work_flow", "workflow");
                detail_url = detail_url.replace("index", "handle");
                location.href = detail_url;
            }
        });
    }

    //创建列表页模板
    var tmplList = '<li class=" ui-border-t" onclick="routiePage(\'<%=q_id%>\', \'<%=file_type%>\');" style="height:69px;" data-id="<%=q_id%>" data-type="<%=file_type%>" data-category-id="<%=parent_id%>">' +
        '<% if(file_type == "process"){ %>' +
        '<i class="ui-icon-textfile ui-list-iconfont-size" style="line-height:69px;"></i>' +
        '<% } else { %>' +
        '<i class="ui-icon-file ui-list-iconfont-size" style="line-height:69px;"></i>' +
        '<% } %>' +
        '<div class="ui-list-info">' +
        '<h4 class="ui-nowrap"><%=name%></h4>' +
        '</div>' +
        '</li>';

    var tmplContent =   '<% if(auto_edit == 2 || auto_edit == 4){%>' +
        '<div class="ui-form-item">前缀</div>' +
        '<div class="ui-form-item ui-border-b">' +
        '<input placeholder="前缀" class="ui-txt-muted" name="RUN_NAME_LEFT" id="RUN_NAME_LEFT">' +
        '</div>' +
        '<% } %>' +
        '<div class="ui-form-item">请填写该工作的名称或文号</div>' +
        '<div class="ui-form-item ui-border-b" <% if(auto_edit != 1){ %> style="height:200px;" <% } %>>' +
        '<% if(auto_edit == 1){ %>'+
        '<input placeholder="请填写该工作的名称或文号" class="ui-txt-muted" name="RUN_NAME" id="RUN_NAME" value="<%=run_name%>">' +
        '<% } else { %>'+
        '<textarea placeholder="请填写该工作的名称或文号" disabled rows="10" class="ui-txt-muted" name="RUN_NAME" id="RUN_NAME" style="padding-left:0px; color:#969696;"><%=run_name%></textarea>' +
        '<% } %>'+
        '</div>' +
        '<% if(auto_edit == 3 || auto_edit == 4){ %>'+
        '<div class="ui-form-item">后缀</div>' +
        '<div class="ui-form-item ui-border-b">' +
        '<input placeholder="后缀" class="ui-txt-muted" name="RUN_NAME_RIGHT" id="RUN_NAME_RIGHT">' +
        '</div>' +
        '<% } %>' +
        '<input type="hidden" name="AUTO_NUM" value="<%=auto_num%>">' +
        '<input type="hidden" name="AUTO_NUM_MONTH" value="<%=auto_num_month%>">' +
        '<input type="hidden" name="AUTO_NUM_YEAR" value="<%=auto_num_year%>">';

    //加载列表页，首屏
    function loadInitList(){

        $.get('/mobile/work_flow/client_interface/getCreateWorkList.php', {
            'P': P,
            'Q_ID': 0
        }, function(data){
            if($('#new_list').find('li').length == 0){
                $.ProLoading.hide();
            }
            var dest = '';
            data = JSON.parse(data);
            $.each(data,function(index, item){
                dest += $.tpl(tmplList, item);
                if(!routerMapping[item.q_id]){
                    routerMapping[item.q_id] = item.file_type;
                }
            });
            var listContainer = $('<ul class="ui-list ui-list-link ui-border-tb"></ul>').append(dest);
            $('#new_list').empty().append(listContainer).removeClass("ui-whitespace");
        });
    }

    //封一个响应列表元素点击的函数
    function getContent(id, file_type){

        var file_type = routerMapping[id] || file_type;
        var q_id = id;
        //配置参数
        var argus = {
            'P': P,
            'Q_ID':  q_id
        };
        if(file_type == "category"){
            //加载内容
            $.get('/mobile/work_flow/client_interface/getCreateWorkList.php',argus,function(data){
                if(data != "NOMOREDATA"){
                    var dest = '';
                    var data = JSON.parse(data);
                    $.each(data,function(index, item){
                        dest += $.tpl(tmplList, item);
                        if(!routerMapping[item.q_id]){
                            routerMapping[item.q_id] = item.file_type;
                        }
                    });
                }
                var listContainer = $('<ul class="ui-list ui-list-link ui-border-tb"></ul>').append(dest);
                $('#new_list').empty().append(listContainer).removeClass("ui-whitespace");
            });
        }
    }

    function newWorkFlowEdit(q_id)
    {
        q_flow_id = flow_id = q_id;
        $.get('/mobile/work_flow/client_interface/getRunName.php', {
            "P": P,
            "FLOW_ID": flow_id
        }, function(data){
            var dest = "";
            var data = JSON.parse(data);
            force_pre_set = data.force_pre_set;
            auto_edit = data.auto_edit;
            dest = $.tpl(tmplContent, data);
            var listContainer = $('<div class="ui-form ui-border-t"></div>').append(dest);
            $('#new_edit').empty().append(listContainer);
            routie('new_edit/'+flow_id+'');
        });
    }

    function goOnTriggerPage(type){
        g_tirgger_type = type;
        var data = {"flow_id": q_flow_id, "run_id": q_run_id, "flow_prcs": q_flow_prcs, "prcs_id": q_prcs_id, "prcs_key_id": q_prcs_key_id, "type": g_tirgger_type, "folder":"pda"};
        $.ajax({
            type: 'POST',
            url: 'trigger.php',
            cache: false,
            data: data,
            beforeSend: function(){
                $.ProLoading.show();
            },
            success: function(data)
            {
                $.ProLoading.hide();
                $("#scroller_plugin").empty().append(data);
            },
            error: function(data){
                $.ProLoading.hide();
                showMessage(triggerloadfile);
            }
        });
    }

    function turnTrigger()
    {
        var trigger_type = g_tirgger_type.toLowerCase();
        //用户自定义js脚本执行程序
        var beforeCustomScript = $("#"+trigger_type+"BeforeCustomScript").val();
        if(typeof beforeCustomScript !== 'undefined')
        {
            var customScriptArr = beforeCustomScript.split(",");
            for(var customScriptCount = 0; customScriptCount < customScriptArr.length; customScriptCount++)
            {
                if (typeof window[customScriptArr[customScriptCount]] == 'function')
                {
                    var ret = window[customScriptArr[customScriptCount]]();
                    // console.log(ret);
                    if(typeof ret !== 'undefined')
                    {
                        return;
                    }
                }
            }
        }

        if(g_tirgger_type == 'CREATE'){
            newWorkFlow('CREATE');
        }

        //用户自定义js脚本执行程序
        var afterCustomScript = $("#"+trigger_type+"AfterCustomScript").val();
        if(typeof afterCustomScript !== 'undefined')
        {
            var customScriptArr = afterCustomScript.split(",");
            for(var customScriptCount = 0; customScriptCount < customScriptArr.length; customScriptCount++)
            {
                if (typeof window[customScriptArr[customScriptCount]] == 'function')
                {
                    var ret = window[customScriptArr[customScriptCount]]();
                    if(typeof ret !== 'undefined')
                    {
                        return;
                    }
                }
            }
        }
    }

    var tHeadData = {"new_list":{"l":{"class":"","event":"history.back();","title":""},"c":{"title":"\u65b0\u5efa\u5de5\u4f5c"},"r":""},"new_edit":{"l":{"class":"","event":"history.back();","title":""},"c":{"title":"\u65b0\u5efa\u5de5\u4f5c"},"r":{"class":"","event":"newWorkFlow();","title":"\u786e\u8ba4"}},"plugin":{"l":{"class":"","event":"history.back();","title":""},"c":{"title":"\u89e6\u53d1\u5668\u64cd\u4f5c"},"r":{"class":"","event":"turnTrigger();","title":"\u63d0\u4ea4"}}};
    callback = function(){  };
    tHeadData.new_list.r = null;
    tMobileSDK.ready(function() {
        window.pages = new gmu.Pages({

            el: $('#pages'),

            router: (function(data){
                var router = {};
                $.each(data, function(k, v){
                    //if(parseInt(k)){ return }
                    router[k] = callback;
                });
                return router;
            })(tHeadData),

            header: tHeadData

        })
    })
</script>
</body>
</html>
