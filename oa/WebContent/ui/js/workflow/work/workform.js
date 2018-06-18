var workForm = {
    option : {
        formhtmlurl :domain+ '/form/formType',
        formid : 1,
        target:"",
        flowStep:1,//-1预览
        listFp:'',
        pageModel:'',
        flowRun:'',
        eleObject:{},
        formLength:0,
        preView :false,
        ish5:false
    },
    init:function(options,cb){
        var _this = this;
        $.extend( _this.option, options );
        if(_this.option.preView){
            _this.option.resdata.preView = 1;
        }else{
            _this.option.resdata.preView = 0;
        }

        _this.option.prcsId = _this.option.resdata.prcsId;
        if(options.flag == '3'){
            return _this.getSearchData(cb);
        }
        _this.buildHTML(cb);
    },
    render:function(){
        this.ReBuild();
        this.MacrosRender();
        this.RadioRender();
        this.AutoCode();
        this.DateRender();
        this.ImgUpload();
        this.KgSignRender();
        this.FileUpload();
        this.MacrosSignRender();
        this.userSelectRender();
        this.deptSelectRender();
        this.SignPluin();
        this.qrcodeRender();
        this.ListRender();
        this.readComments();
        this.filter();//表单流程权限控制
        return   this.option.eleObject;
    },
    readComments:function () {
        var that = this;
        var readcommentsObj = that.option.eleObject.find('.readcomments');
        readcommentsObj.each(function () {
            var _this = $(this);
            var btnObj = $('<button targetid="'+_this.attr('id')+'" class="position: absolute !important;top:'+(_this.attr('orgheight')-15)+'px; !important">阅文意见</button>')
            var btn = _this.after(btnObj);
            btnObj.on('click',function () {
                var targetid = $(this).attr('targetid');
                var valid = $(this).prev().val();
                var disable = $(this).prev().attr('disabled');
                if(disable != 'disabled'){
                    layer.open({
                        type: 1,
                        title: "阅文意见控件",
                        closeBtn: 0, //不显示关闭按钮
                        area: ['840px', '500px'],
                        content: $('#readcommentstpl').html(), //iframe的url，no代表不显示滚动条
                        btn: ['确定', '取消'],//按钮
                        success: function (num,a) {
                            console.log(num)
                            console.log(num.find('.select1'))
                            $('.centertion textarea').append(valid);

                            $('.layui-rows ul li').click(function () {
                                $('.centertion textarea').append($(this).text())
                            });
                            $('.layui-rows select').change(function () {
                                var text = $(this).children('option:selected').html();
                                if(text.indexOf('┌') > -1){

                                    text = text.substr(text.lastIndexOf('┌')+1);
                                }
                                if(text.indexOf('├')>-1){
                                    text = text.substr(text.lastIndexOf('├')+1);
                                    console.log(text.substr(text.lastIndexOf('├')+1))
                                }
                                $('.centertion textarea').append(text);
                                if($(this).attr('num') == 1){
                                    var that = $(this);
                                    var val = $(this).children('option:selected').val();
                                    $.ajax({
                                        url: "/user/getByDeptId",
                                        type: 'get',
                                        data: {deptId:val},
                                        dataType: 'json',
                                        success: function (obj) {
                                            var data = obj.obj;
                                            var str = '<option value="-1">请选择人员</option>';
                                            for(var i=0;i<data.length;i++){
                                                str += '<option value="'+ data[i].uid +'">'+ data[i].userName +'</option>'
                                            }
                                            that.next().html(str)
                                        },
                                        error: function () {
                                        }
                                    });
                                }
                            })
                        },
                        yes: function (num,a) {
                            console.log(num)
                            console.log(a)
                            var html = a.find('.centertion textarea').val();
                            $('.centertion textarea').eq(0).html('');
                            $('.centertion textarea').eq(1).html('');
                            $('#'+targetid).html(html)
                            layer.closeAll();

                        }

                    });
                }

            })
        });
    },
    qrcodeRender:function () {
        var that = this;
        var kgsignObj = that.option.eleObject.find('.qrcode');
        kgsignObj.each(function () {
            var _this = $(this);
            var orgtype = _this.attr('orgtype');
            var textStr = ''
            var id = _this.attr('id');

            if(orgtype == 'flowinfo'){
                textStr = (domain+'/workflow/work/workformh5PreView?flowId='+that.option.resdata.flowId+'&prcsId='+that.option.resdata.prcsId+'&flowStep='+that.option.resdata.flowStep+'&runId='+that.option.flowRun.runId)
            }else{
                textStr = textStr
            }
            var objStr = $('<div id="'+id+'" textStr="'+textStr+'" name="'+_this.attr('name')+'" class="'+_this.attr('class')+'" data-type="qrcode" style="'+_this.attr('style')+'" title="'+_this.attr('title')+'" orgtype="'+_this.attr('orgtype')+'" orgwidth="'+_this.attr('orgwidth')+'" orgheight="'+_this.attr('orgheight')+'"></div>');
            _this.before(objStr);
            _this.remove();
            if(!that.option.ish5){
                var msg = {"mark":"SID_WORKFLOW","url":textStr}
                $.getScript(domain+'/lib/qrcode.js')
                    .done(function () {
                        var qrcode = new QRCode(id, {
                            text: JSON.stringify(msg),
                            width: _this.attr('orgwidth'),
                            height: _this.attr('orgheight'),
                            colorDark : '#000000',
                            colorLight : '#ffffff',
                            correctLevel : QRCode.CorrectLevel.H
                        });
                        // qrcode.makeCode
                    })
            }
        });
    },
    KgSignRender:function () {
        var that = this;
        var kgsignObj = that.option.eleObject.find('.kgsign');
        if(kgsignObj.length >0 && Signature){
            kgsignObj.each(function () {
                var _this = $(this);
                var isPc = _this.attr('ispc');
                var isApp = _this.attr('isapp');
                var isSeal = _this.attr('isseal');
                var isHandwriting = _this.attr('ishandwriting');
                var isMoveable = _this.attr('ismoveable')=='1'?true:false;
                var serverConfig = {
                    keysn:'C84CF78C359E757E',
                    delCallBack: delCB,
                    imgtag: 0, //签章类型：0：无; 1:公章; 2:私章; 3:法人章; 4:法人签名; 5:手写签名
                    showSealsDlg: false,
                    password:'123456',
                    moveable: isMoveable,
                    valid : false,    //签章和证书有效期判断， 缺省不做判断
                    icon_move : isMoveable, //移动签章按钮隐藏显示，缺省显示
                    icon_remove : true, //撤销签章按钮隐藏显示，缺省显示
                    icon_sign : true, //数字签名按钮隐藏显示，缺省显示
                    icon_signverify : true, //签名验证按钮隐藏显示，缺省显示
                    icon_sealinfo : true, //签章验证按钮隐藏显示，缺省显示
                    certType : 'server',//设置证书在签章服务器
                    sealType : 'server',//设置印章从签章服务器取
                    serverUrl : 'http://192.168.0.134:8080/iSignatureHTML5',//
                    documentid:that.option.runId,//设置文档ID
                    documentname:that.option.flowRun.runName,//设置文档名称
                    pw_timeout:'s1800', //s：秒；h:小时；d:天
                    scaleImage: 0.9 //签章图片的缩放比例
                }
                var clientConfig = {//初始化属性
                    clientConfig:{//初始化客户端参数
                        'SOFTTYPE':'0'//0为：标准版， 1：网络版
                    },
                    delCallBack: delCB,
                    imgtag: 0, //签章类型：0：无; 1:公章; 2:私章; 3:法人章; 4:法人签名; 5:手写签名
                    valid : false,    //签章和证书有效期判断， 缺省不做判断
                    icon_move : isMoveable, //移动签章按钮隐藏显示，缺省显示
                    icon_remove : true, //撤销签章按钮隐藏显示，缺省显示
                    icon_sign : true, //数字签名按钮隐藏显示，缺省显示
                    icon_signverify : true, //签名验证按钮隐藏显示，缺省显示
                    icon_sealinfo : true, //签章验证按钮隐藏显示，缺省显示
                    certType : 'client',//设置证书在签章服务器
                    sealType : 'client',//设置印章从签章服务器取
                    serverUrl : 'http://192.168.0.134:8080/iSignatureHTML5',//
                    documentid:that.option.runId,//设置文档ID
                    documentname:that.option.flowRun.runName,//设置文档名称
                    pw_timeout:'s1800' //s：秒；h:小时；d:天
                };
                var bottomH5Str = 'bottom: 0px;';
                if(that.option.ish5){
                    bottomH5Str = 'bottom: 0px;';
                    Signature.init(serverConfig);
                }else{
                    Signature.init(clientConfig);
                }
                var divObjWidth =  Number(_this.attr('height'))+25;
                var divObj = $('<div name="'+_this.attr('name')+'" style="text-align: center; position:relative; inline-block;height: '+ divObjWidth +'px;width: '+_this.attr('width')+'px" class="form_item kgsign" data-type="kgsign" title="'+_this.attr('title')+'" gwidth="'+_this.attr('gwidth')+'" gheight="'+_this.attr('gheight')+'"  id="'+_this.attr('id')+'" signattrlist="'+_this.attr('signattrlist')+'"  ismoveable="'+_this.attr('ismoveable')+'" ispc="'+_this.attr('ispc')+'" isapp="'+_this.attr('isapp')+'" isseal="'+_this.attr('isseal')+'" ishandwriting="'+_this.attr('ishandwriting')+'" signlist="'+_this.attr('signlist')+'" ></div>');
                _this.removeAttr('id');
                _this.removeAttr("class");
                divObj.append(_this.prop("outerHTML"));
                if(isSeal == '1'&& isHandwriting == '1'){
                    divObj.append('<button SealType="1" style="width: 60px;'+bottomH5Str+'position: absolute;width: 72px;right: 72px;" >盖章</button><button  style="width: 60px;'+bottomH5Str+'position: absolute;width: 72px;right: 0px;" SealType="2">手写</button>');
                }else if(isSeal == '1'){
                    divObj.attr('SealType','1')
                }else if(isHandwriting == '1'){
                    divObj.attr('SealType','2')
                }
               _this.before(divObj);
                _this.remove();
                var signattrlist = _this.attr('signattrlist').split(",");
                signattrlist.forEach(function (v,i) {
                    var obj = that.option.eleObject.find('#'+v);
                    obj.attr('kg-desc',obj.attr('title'))
                });
                var posid = divObj.attr('id');
                divObj.on('click',function (e) {
                    var SealType = $(e.target).attr('SealType')||$(this).attr('SealType');
                    if(that.option.ish5){
                        if($(this).attr('isapp') != '1'){
                            layer.msg(wu, {time: 5000, icon:0});
                            return false;
                        }
                    }else{
                        if($(this).attr('ispc') != '1'){
                            layer.msg(wuqian, {time: 5000, icon:0});
                            return false;
                        }
                    }
                    if($(this).attr('disabled') !='disabled'){
                        var signatureCreator = Signature.create();
                        if(SealType == '2'){
                            signatureCreator.handWriteDlg({
                                image_height: "4",
                                image_width: "4",
                                onBegin: function() {
                                    console.log('onbegin');
                                },
                                onEnd: function() {
                                    console.log('onEnd');
                                }
                            }, function(param){
                                signatureCreator.runHW(param, {
                                    protectedItems:signattrlist,//设置定位页面DOM的id，自动查找ID，自动获取保护DOM的kg-desc属性作为保护项描述，value属性为保护数据。不设置，表示不保护数据，签章永远有效。
                                    position:posid,//设置盖章定位dom的ID，必须设置
                                    okCall: function(fn) {//点击确定后的回调方法，this为签章对象 ,签章数据撤销时，将回调此方法，需要实现签章数据持久化（保存数据到后台数据库）,保存成功后必须回调fn(true/false)渲染签章到页面上
                                        if( $('#'+posid).attr('signatureId')){
                                            $('#'+posid).attr('signatureId',$('#'+posid).attr('signatureId')+','+this.getSignatureid());
                                        }else{
                                            $('#'+posid).attr('signatureId',this.getSignatureid());
                                        }

                                         $('#'+posid).find('img').hide();
                                        fn(true);
                                    },
                                    cancelCall : function() {//点击取消后的回调方法
                                        console.log(cancel)
                                    }
                                });
                            });
                        }else{
                            signatureCreator.run({
                                protectedItems:signattrlist,//设置定位页面DOM的id，自动查找ID，自动获取保护DOM的kg-desc属性作为保护项描述，value属性为保护数据。不设置，表示不保护数据，签章永远有效。
                                position: posid,//设置盖章定位dom的ID，必须设置
                                okCall: function(fn, image) {//点击确定后的回调方法，this为签章对象 ,签章数据撤销时，将回调此方法，需要实现签章数据持久化（保存数据到后台数据库）,保存成功后必须回调fn(true/false)渲染签章到页面上

                                    var signlist = $('#'+posid).attr('signlist');
                                    if(signlist !=0 && signlist != this.oriSignatureData.seal.signsn){
                                        var layerindex = layer.alert("您签章权限不符，请重新签署！", {
                                            skin: 'layui-layer-molv' //样式类名
                                            ,closeBtn: 0
                                        }, function(){
                                            layer.close(layerindex);
                                        });
                                    }

                                    if( $('#'+posid).attr('signatureId')){
                                        $('#'+posid).attr('signatureId',$('#'+posid).attr('signatureId')+','+this.getSignatureid());
                                    }else{
                                        $('#'+posid).attr('signatureId',this.getSignatureid());
                                    }

                                     $('#'+posid).find('img').hide();

                                    fn(true);
                                },
                                cancelCall : function() {//点击取消后的回调方法
                                    console.log(cancel)
                                }
                            });
                        }

                    }
                })
            });
        }
    },
    SignPluin:function () {
        var that = this;
        signglobleObj = {
            C:'{{content}}',
            U:$.cookie('userName'),
            D:$.cookie('deptName'),
            R:$.cookie('userPrivName'),
            T:new Date().Format('yyyy-MM-dd hh:mm:ss'),
            P:'',
            O:''
        };
        this.option.eleObject.find('.sign').each(function () {
            var orgtempl =  $(this).attr('orgtempl').replace(/\r?\n/gi, "<br />");;
            orgtempl = Mustache.render(orgtempl,signglobleObj)
            var textArea = $('<div templ="'+orgtempl+'" width="" height=""><div id="eiderarea">'+orgtempl+'<div></div>');
            $(this).attr('style','width:'+$(this).attr('gwidth')+'px;height:'+$(this).attr('gheight')+'px;');
            $(this).bind("input propertychange", function () {
                var pre = $(this).prev();
                pre.html(Mustache.render(pre.attr('templ'),{content:$(this).val()}))
            });
            $(this).before(textArea);
        });

    },
    ImgUpload:function(){
        var that = this;
        if(!that.option.preView){
            var uploadformObj = '<form id="imgupload" target="uploadiframe" action="/upload?module=workflow" method="post"><input type="file" multiple="multiple" name="file" id="imguploadinput" class="w-icon5" style="display:none;"></form>';
            $('body').append(uploadformObj);
            var imuploadobj = {};
            that.option.eleObject.on('click','.imgupload',function(){
                if($(this).attr('disabled') != 'disabled'){
                    imuploadobj = $(this);
                    $('#imguploadinput').click();
                }
            });
            // $(document).delegate('.imgupload_data','click',function () {
            //     if(that.option.ish5){
            //         var str='<div style="z-index: 1000;position: fixed;top: 0;left: 0;right: 0;bottom: 0;' +
            //             'background: rgba(111,111,111,.5)"><img width="800" height="500"' +
            //             'style="z-index: 1000;position: fixed;top: 50%;margin-top: -250px;left: 50%;margin-left: -400px" src="'+$(this).attr('src')+'" alt="">' +
            //             '<b class="guanbi" style="cursor:pointer;color: red;font-size: 18px;font-weight: bold;position: fixed;top: 76px;right: 20px;">x</b></div>';
            //         $('body').append(str)
            //     }
            // })
            // $(document).delegate('.guanbi','click',function () {
            //     $(this).parent().remove()
            // })
            $('#imguploadinput').on('change', function() {
                if($('#imguploadinput').val() != ''){
                    $("#imgupload").ajaxSubmit(function (res) {
                        res = JSON.parse(res);
                        var listStr = '<img name="'+imuploadobj.attr('name')+'" src="'+'/xs?'+res.obj[0].attUrl+'" style="cursor: pointer;'+imuploadobj.attr('style')+'"  id="'+imuploadobj.attr('name')+'" title="'+imuploadobj.attr('title')+'" align="absmiddle" style=""  class="imgupload_data"    width="'+imuploadobj.attr('width')+'" height="'+imuploadobj.attr('height')+'"/>';
                        imuploadobj.before(listStr);
                    });
                }
            });
        }

    },
    FileUpload:function(){
        var that = this;
        var iconImgType = {
            txt : '../../img/icon_file.png',
            jpg : '../../img/icon_image.png',
            png : '../../img/icon_image.png',
            pdf :  '../../img/icon_pdf.png',
            ppt : '../../img/icon_ppt.png',
            pptx :  '../../img/icon_ppt.png',
            doc : '../../img/icon_word.png',
            docx : '../../img/icon_word.png',
            xls :  '../../img/icon_excel.png',
            xlsx :  '../../img/icon_excel.png'
        };
        var uploadformObj1 = '<form id="fileupload" target="uploadiframe" action="/upload?module=workflow" method="post"><input type="file" multiple="multiple" name="file" id="fileuploadinput" class="w-icon5" style="display:none;"></form>';
        $('body').append(uploadformObj1);
        var fileuploadobj = {};
        that.option.eleObject.on('click','.fileupload',function(){
            if($(this).attr('disabled') != 'disabled'){
                fileuploadobj = $(this);
                $('#fileuploadinput').click();
            }else{
                if($(this).attr('atturl')){
                    window.location.href="./../../download?"+$(this).attr('atturl');
                }
            }

        });
        $('#fileuploadinput').on('change', function(){
            // console.log($('#fileuploadinput').val());
            if($('#fileuploadinput').val() != ''){
                $("#fileupload").ajaxSubmit(function (res) {
                    res = JSON.parse(res);
                    fileuploadobj.attr('attUrl',res.obj[0].attUrl);
                    var attachName = res.obj[0].attachName;
                    var attachNameArrByc = attachName.split('.');
                    var attrnametype = attachNameArrByc[attachNameArrByc.length-1];
                    fileuploadobj.attr('src',iconImgType[attrnametype]);
                });
            }
        });
    },
    deptSelectRender:function () {
        var that = this;
        // console.log(this.option.eleObject.find('.deptselect').length);
        this.option.eleObject.find('.deptselect').on('click',function () {
            var __this = $(this);
            dept_id = __this.attr('id');
            $.popWindow("../../common/selectDept");
        });

    },
    userSelectRender:function () {
        var that = this;
        this.option.eleObject.find('.userselect').on('click',function () {
            var __this = $(this);
            user_id = __this.attr('id');
            $.popWindow("../../common/selectUser");
        });
    },
    MacrosSignRender:function () {
        var that = this;
        if(!that.option.preView){
            that.option.eleObject.find('.macrossign').each(function () {
                var _this = $(this);
                console.log($(this).attr("datafld"));
                var value =that.tool.getMacrosData($(this).attr("datafld"))() ||'{宏标记-会签控件}';
                var divObj = '<span id="'+$(this).attr('name')+'" name="'+$(this).attr('name')+'" title="'+$(this).attr('title')+'" data-type="'+$(this).attr('data-type')+'" style="'+$(this).attr('style')+'" datafld="'+$(this).attr('datafld')+'" class="form_item macrossign">'+value+'</span>';
                _this.before('<div style="display: inline-block;">'+divObj+'</div>');
                _this.remove();
            });
        }
    },
    ListRender:function () {
        var that = this;
        this.option.eleObject.find('.listing').each(function (element,index) {
            var _this = $(this);
            var tableStr = '<table name="'+_this.attr('name')+'" title="'+_this.attr('title')+'" id="'+_this.attr('name')+'" lv_cal="'+_this.attr('lv_cal')+'" lv_coltype="'+_this.attr('lv_coltype')+'"  lv_sum="'+_this.attr('lv_sum')+'"   lv_colvalue="'+_this.attr('lv_colvalue')+'"  lv_size="'+_this.attr('lv_size')+'"  lv_title="'+_this.attr('lv_title')+'" lv_field="'+_this.attr('lv_field')+'" datafrom="'+_this.attr('datafrom')+'" data-type="listing" class="form_item list  table table-hover">';
            var lv_title = _this.attr('lv_title').split('`');
            var lv_field = _this.attr('lv_field').split('`');
            var lv_size = _this.attr('lv_size').split('`');
            var lv_coltype = _this.attr('lv_coltype').split('`');
            var lv_cal = _this.attr('lv_cal').split('`');
            var lv_colvalue = _this.attr('lv_colvalue').split('`');
            var default_cols = _this.attr('default_cols');
            var titleTd = '<th width="40">操作</th>'
            var tdStr = '<td ><button class="add_btn">新增</button></td>';
            var addtr ='<td><a style="" title=del class="delete_row" href="javascript:void(0)"><img src="/img/workflow/delete.png"></a></td>';
            for(var i=0;i<lv_title.length-1;i++){
                titleTd+=('<th width="'+lv_size[i]+'">'+lv_field[i] +'</th>');
                tdStr+='<td></td>';
            }
            tableStr+=('<tr class="listhead">'+titleTd+'</tr>');//title

            var default_colsStr = '';
            for(var k=0;k<default_cols;k++){
                var addtr2 = that.tool.renderListDeaultTd(k,lv_cal,lv_coltype,lv_colvalue,lv_size);

                default_colsStr += ('<tr id="row_'+k+'">'+addtr+addtr2+'</tr>');
            }
            tableStr += default_colsStr;
            tableStr += ('<tr class="listfoot">'+tdStr+'</tr>');
            tableStr += '</table>';
            _this.before(tableStr);
            _this.prev().on("click",'.delete_row',function () {
                $(this).parent().parent().remove();
            });
            _this.prev().find('.add_btn').on('click',function () {

                $(this).parent().parent().before('<tr>'+addtr+that.tool.renderListDeaultTd(k,lv_cal,lv_coltype,lv_colvalue,lv_size)+'</tr>');
            });
            _this.remove();
        });
    },
    filter:function() {
        var that = this;
        if(that.option.flowStep && that.option.flowStep  != -1){
            that.option.listFp.forEach(function (v,i) {
                if(v.prcsId == that.option.prcsId){
                    var steptOpt = v;
                    that.tool.requiredItem = v.requiredItem;
                    that.tool.ajaxHtml('/workflow/work/selectFlowData',{flowId:that.option.flowRun.flowId,runId:that.option.flowRun.runId},function (res) {
                        var opflag =  $.getQueryString("opflag") || '';
                        that.option.eleObject.find('.form_item').each(function(i,v){
                            var _this = $(this);
                            var _hidden = false;
                            var dataType = _this.attr("data-type");
                            //权限控制
                            if(steptOpt.prcsItem.indexOf(_this.attr("title")) == -1){
                                if(_this.attr("data-type") == 'macros'){
                                    _this.attr('value','');
                                }else if(_this.attr("data-type") == 'macrossign'){
                                    //_this.html('');
                                }else if(_this.attr("data-type") == 'sign'){
                                   _this.prev().find('#eiderarea').hide()
                                }
                                else if(_this.attr("data-type") == 'fileupload'){
                                    _this.before('<span class="'+_this.attr("id")+'event_th_nothing">无</span>');
                                    _this.hide();
                                }else if(_this.attr("data-type") == 'imgupload'){
                                    _this.before('<span class="'+_this.attr("id")+'event_th_nothing"> 无 </span>');
                                    _this.hide();
                                }else if(_this.attr("data-type") == 'kgsign'){
                                    _this.find('button').hide();
                                }
                                _this.attr("disabled","disabled");
                            }else{
                                if(_this.attr("data-type") == 'macros'){
                                    if(_this.is('input')){
                                        _this.attr("disabled","disabled");
                                    }
                                }
                                if(steptOpt.requiredItem.indexOf(_this.attr("title")) != -1){
                                    _this.attr('ismust',true);
                                }
                            };
                            if(steptOpt.hiddenItem.indexOf(_this.attr("title")) != -1){
                                _hidden = true;
                                _this.attr('hidden',true);
                                _this.before("*****");
                                _this.hide();

                            }
                            //表单填充数据
                            if(res.flag){
                                var dataName = res.obj;
                                if(dataName ){
                                    var dataNameVal = dataName[_this.attr('name')] ||'';
                                    if(that.option.preView){
                                        switch (_this.attr('data-type')){
                                            case 'text':
                                                if(!_hidden){
                                                    _this.before(dataNameVal);
                                                }
                                                _this.attr('value',dataNameVal);
                                                _this.hide();
                                                break;
                                            case 'textarea':
                                                if(!_hidden){
                                                    _this.before(dataNameVal);
                                                }
                                                _this.text(dataNameVal);
                                                _this.hide();
                                                break;
                                            case 'select':
                                                if(!_hidden){
                                                    _this.before(_this.find("option[value='"+dataNameVal+"']").text());
                                                }

                                                _this.find("option[value='"+dataNameVal+"']").attr("selected",true);
                                                _this.hide();
                                                break;
                                            case 'radio':
                                                that.option.eleObject.find("input:radio[name='"+_this.attr('name')+"'][value='"+dataNameVal+"']").prop("checked",'checked');

                                                // console.log('radio not done');
                                                break;
                                            case 'checkbox':
                                                if(dataNameVal == '1'){
                                                    _this.prop("checked",'checked');
                                                }else{
                                                    _this.prop("checked",false);
                                                }
                                                _this.attr("disabled","disabled");
                                                break;
                                            case 'fileupload':
                                                if(dataNameVal){
                                                    var fileConfigArr = dataNameVal.split('&');
                                                    var attNameArr = fileConfigArr[fileConfigArr.length-2].split('=')[1].split('.');
                                                    _this.attr("atturl",dataNameVal);
                                                    _this.attr('src',that.tool.iconImgType[attNameArr[attNameArr.length-1]]);
                                                    _this.attr('disabled','disabled');
                                                }

                                                break;
                                            case 'imgupload':
                                                if(dataNameVal != '' && dataNameVal.indexOf(',')>-1){
                                                    dataNameVal.split(',').forEach(function (v,i) {
                                                        if(v){
                                                            var imgObj = '<img name="'+_this.attr('name')+'" src="'+v+'" style="cursor: pointer;'+_this.attr('style')+'"  id="'+_this.attr('name')+'" title="'+_this.attr('title')+'" align="absmiddle"  class="imgupload_data imgupload_data1"    width="'+_this.attr('width')+'" height="'+_this.attr('height')+'"/>';
                                                            _this.before(imgObj);
                                                        }
                                                    })
                                                    _this.hide();
                                                }
                                                break;
                                            case 'macros':

                                                if(_this.attr('type') == 'text'){
                                                    if(!_hidden){
                                                        _this.before(dataNameVal);
                                                    }
                                                    _this.attr('value',dataNameVal);
                                                    _this.hide();
                                                }else{
                                                    _this.attr('pval',dataNameVal);
                                                    _this.val(dataNameVal);
                                                }
                                                break;
                                            case 'calendar':
                                                if(!_hidden){
                                                    _this.before(dataNameVal);
                                                }

                                                _this.attr('value',dataNameVal);
                                                _this.hide();
                                                break;
                                            case 'kgsign':
                                                _this.find('img').remove();
                                                break;
                                            case 'macrossign':
                                                if(!_hidden){
                                                    _this.before(dataNameVal);
                                                }
                                                _this.remove();
                                                break;
                                            case 'sign':
                                                _this.prev().hide();
                                                // var prevtext = dataNameVal+prev.html();
                                                if(!_hidden){
                                                    _this.before(dataNameVal);
                                                }
                                                _this.prev().attr('templ',prevtext);
                                                _this.hide();

                                                //prev.html(dataNameVal);
                                                break;
                                            case 'autocode':
                                                _this.attr('value',dataNameVal);
                                                _this.hide();
                                            case 'listing':
                                                var vlist = dataNameVal;
                                                that.tool.buildListPluData(_this,vlist,that);
                                                _this.find('.listfoot').remove();
                                                break;
                                            case 'readcomments':
                                                _this.html(dataNameVal);
                                                break;
                                            default:
                                                // console.log(i);
                                        }
                                    }else{                                 
                                        if(opflag == 0){
                                            _this.attr('disabled','disabled');
                                            $('#foot_rig').hide();
                                            $('#foot_rig1').show();
                                        }
                                        if(dataNameVal == '' && steptOpt.prcsItem.indexOf(_this.attr("title")) > -1){

                                        }else{
                                            switch (_this.attr('data-type')){
                                                case 'text':
                                                    _this.attr('value',dataNameVal);
                                                    break;
                                                case 'textarea':
                                                    _this.text(dataNameVal);
                                                    break;
                                                case 'select':
                                                    _this.find("option[value='"+dataNameVal+"']").attr("selected",true);
                                                    break;
                                                case 'radio':
                                                    that.option.eleObject.find("input:radio[name='"+_this.attr('name')+"'][value='"+dataNameVal+"']").prop("checked",'checked');
                                                    break;
                                                case 'checkbox':
                                                    if(dataNameVal == '1'){
                                                        _this.prop("checked",'checked');
                                                    }else{
                                                        _this.prop("checked",false);
                                                    }
                                                    break;
                                                case 'fileupload':
                                                    if(dataNameVal){
                                                        _this.show();
                                                        _this.prev('.'+_this.attr('id')+'无').hide();
                                                        var fileConfigArr = dataNameVal.split('&');
                                                        var attNameArr = fileConfigArr[fileConfigArr.length-2].split('=')[1].split('.');
                                                        _this.attr("atturl",dataNameVal);
                                                        _this.attr('src',that.tool.iconImgType[attNameArr[attNameArr.length-1]]);
                                                    }
                                                    break;
                                                case 'imgupload':
                                                    if(dataNameVal != '' && dataNameVal.indexOf(',')>-1){
                                                        _this.show();
                                                        _this.prev('.'+_this.attr('id')+'无').hide();
                                                        dataNameVal.split(',').forEach(function (v,i) {
                                                            if(v){
                                                                var imgObj = '<img name="'+_this.attr('name')+'" src="'+v+'" style="cursor: pointer;'+_this.attr('style')+'"  id="'+_this.attr('name')+'" title="'+_this.attr('title')+'" align="absmiddle" style=""  class="imgupload_data"    width="'+_this.attr('width')+'" height="'+_this.attr('height')+'"/>';
                                                                _this.before(imgObj);
                                                            }
                                                        });
                                                        if(_this.attr("disabled") == "disabled") {
                                                           _this.hide();
                                                        }
                                                    }
                                                    break;
                                                case 'macros':
                                                    if(_this.attr('type') == 'text'){
                                                        _this.attr('value',dataNameVal);
                                                    }else{
                                                        _this.attr('pval',dataNameVal);
                                                        _this.val(dataNameVal);
                                                    }
                                                    break;
                                                case 'calendar':
                                                    _this.attr('value',dataNameVal);
                                                    break;
                                                case 'kgsign':
                                                    _this.attr('value',dataNameVal);
                                                    _this.find('img').remove();
                                                    break;
                                                case 'macrossign':
                                                   // _this.before(dataNameVal);
                                                   // _this.remove();
                                                    console.log(1);
                                                    break;
                                                case 'sign':
                                                    var prev = _this.prev();
                                                    var prevtext = dataNameVal+prev.html();
                                                    prev.attr('templ',prevtext);
                                                    prev.html(prevtext);
                                                    break;
                                                case 'userselect':
                                                    var valuearr = dataNameVal.split('|');
                                                    _this.attr('user_id',valuearr[0]);
                                                    _this.attr('username',valuearr[1]);
                                                    _this.attr('value',valuearr[1]);
                                                    break;
                                                case 'deptselect':
                                                    var valuearr = dataNameVal.split('|');
                                                    _this.attr('deptid',valuearr[0]);
                                                    _this.attr('deptname',valuearr[1]);
                                                    _this.attr('value',valuearr[1]);
                                                    break;
                                                case 'autocode':
                                                    _this.attr('value',dataNameVal);
                                                    break;
                                                case 'listing':
                                                    var vlist = dataNameVal;
                                                    that.tool.buildListPluData(_this,vlist,that);
                                                    break;
                                                case 'readcomments':
                                                    _this.html(dataNameVal);
                                                    break;
                                                default:
                                            }
                                        }
                                    }
                                }
                            }
                        });
                        if(typeof  Signature != 'undefined'){
                            var signatureCreator = Signature.create();
                            signatureCreator.getSaveSignatures(that.option.flowRun.runId, function(signs){
                                var signdata = new Array();
                                var jsonList = eval("("+signs+")");
                                for(var i=0;i<jsonList.length;i++){
                                    var map = {};
                                    map.signatureid = jsonList[i]["signatureId"];
                                    map.signatureData = jsonList[i]["signature"];
                                    signdata.push(map);
                                }
                                Signature.loadSignatures(signdata);
                            });
                        }



                    });
                }
            });
        }
    },
    RadioRender:function(){
        this.option.eleObject.find('input[data-type="radio"]').each(function(){
            var _this = $(this);
            var name = _this.attr('name');
            var title = _this.attr('title');
            var radio_field = (_this.attr("radio_field") || '').split('`');
            var checked = _this.attr('orgchecked');
            var eleStr = "";
            radio_field.forEach(function(v,i){
                if(v){
                    if(v == checked){
                        eleStr+='<input name="'+name+'" data-type="radio" title="'+title+'" checked="checked" value="'+v+'" type="radio" class="form_item"/>'+v+' ';
                    }else{
                        eleStr+='<input name="'+name+'" data-type="radio" title="'+title+'"  value="'+v+'" type="radio" class="form_item"/>'+v+' ';
                    }

                }
            });
            _this.before(eleStr);
            _this.remove();

        });

    },
    ReBuild:function(ele){
        var that = this;
        var target = {};
        if(ele){
            target = ele;
        }else{
            target = this.option.eleObject;
        }
        target.find('link').each(function () {
            var href = $(this).attr('href');
            var link = domain+'/old'+href.substring(22);
            $(this).attr('href',domain+'/old'+href.substring(22));
        });
        target.find("input").each(function(){
            var _this = $(this);
            var cssLink = '';
            if(_this.attr('hidden')){
                _this.attr("orghidden",_this.attr('hidden'));
                _this.removeAttr("hidden");
            }
            if(_this.attr("class") &&  _this.attr("class").indexOf('AUTO') > -1){
                _this.attr("data-type","macros");
            }else if(_this.attr("class") &&  _this.attr("class").indexOf('list') > -1){
                _this.attr("data-type","listing");
            } else if(_this.attr('data-type') == 'calendar'){
                _this.addClass("laydate-icon");
            }else if(_this.attr('data-type') == 'macrossign'){
                _this.addClass("macrossign");
            }else if(_this.attr('data-type') == 'autocode'){
                _this.addClass("autocode");
            }else{
                if(_this.attr("type")){
                    _this.attr("data-type",$(this).attr("type"));
                }else {
                    _this.attr("data-type",'text');
                }
            }
            _this.addClass("form_item");
            _this.attr("id",$(this).attr("name"));
            var style = _this.attr("style");
            if(style && style.indexOf('width') == -1){
                if(style.indexOf('WIDTH')== -1){
                    _this.attr("style",'width:170px;');
                }
            }
        });
        //list
        target.find("img.LIST_VIEW").each(function () {
            var _this = $(this);
            var datafrom = _this.attr('datatype')=='1'?'inData':'outData';
            var listStr = '<input name="'+_this.attr('name')+'" style="'+_this.attr('style')+'"  id="'+_this.attr('name')+'" title="'+_this.attr('title')+'" type="text" class="form_item list" data-type="listing"  datafrom="'+datafrom+'" lv_field="'+_this.attr('lv_field')+'" lv_title="'+_this.attr('lv_title')+'" lv_size="'+_this.attr('lv_size')+'" lv_colvalue="'+_this.attr('lv_colvalue')+'" lv_sum="'+_this.attr('lv_sum')+'" width="'+_this.attr('width')+'" height="'+_this.attr('height')+'" lv_coltype="'+_this.attr('lv_coltype')+'" lv_cal="'+_this.attr('lv_cal')+'"/>';
            _this.before(listStr);
            _this.remove();
        });
        //图片上传兼容
        target.find("img.IMGUPLOAD").each(function () {
            var _this = $(this);
            var datafrom = _this.attr('datatype')=='1'?'inData':'outData';
            var listStr = '<img name="'+_this.attr('name')+'" src="'+_this.attr('src')+'" style="cursor: pointer;'+_this.attr('style')+'"  id="'+_this.attr('name')+'" title="'+_this.attr('title')+'" align="absmiddle"   class="form_item imgupload" data-type="imgupload"   width="'+_this.attr('width')+'" height="'+_this.attr('height')+'"/>';
            _this.before(listStr);
            _this.remove();
        });
        target.find('img.DATE').each(function(){
            var _this = $(this);
            var objprev = _this.prev();
            if(_this.attr('hidden')){
                _this.attr("orghidden",_this.attr('hidden'));
                _this.removeAttr("hidden");
            }
            var inputObj = '<input name="'+objprev.attr('name')+'" title="'+objprev.attr('title')+'" class="form_item laydate-icon" data-type="calendar" id="'+objprev.attr('name')+'" value="'+_this.attr('date_format')+'"  date_format="'+_this.attr('date_format')+'"/>';
            objprev.remove();
            _this.before(inputObj);
            _this.remove();
        });
        //
        target.find("textarea").each(function(){
            if($(this).attr('data-type') == "textarea"){
                if( $(this).attr('hidden')){
                    $(this).attr("orghidden",_this.attr('hidden'));
                    $(this).removeAttr("hidden");
                }
                $(this).addClass("form_item");
                $(this).attr("data-type","textarea");
                $(this).attr("id",$(this).attr("name"));
            }

        });
        target.find("select").each(function () {
            var _this = $(this);
            $(this).addClass("form_item");
            if(_this.attr('hidden')){
                _this.attr("orghidden",_this.attr('hidden'));
                _this.removeAttr("hidden");
            }
            $(this).attr("data-type","select");
            $(this).attr("id",$(this).attr("name"));
        });
        target.find("img.RADIO").each(function(){
            var _this = $(this);
            if(_this.attr('hidden')){
                _this.attr("orghidden",_this.attr('hidden'));
                _this.removeAttr("hidden");
            }
            var radioStr = ' <input name="'+_this.attr('name')+'" checked="checked" id="'+_this.attr('name')+'" title="'+_this.attr('title')+'" type="radio"  radio_field="'+_this.attr('radio_field')+'" orgchecked="'+_this.attr('radio_checked')+'" classname="radio" class="form_item" data-type="radio" />';
            _this.before(radioStr);

            _this.remove();
        });

        target.find("img.USER").each(function(){
            var _this = $(this);
            if(_this.prev().length>0){
                _this.prev().attr("data-type","userselect");
                _this.prev().attr("readonly","readonly");
                _this.prev().attr("style",'width:150px;');
                var selectImgStr = '<img align="absMiddle"  src="'+domain+'/img/workflow/work/orgselectuser.png" targetId="'+_this.prev().attr('name')+'" title="'+_this.prev().attr('title')+'">';
                _this.before(selectImgStr);
                _this.remove();

            }
        });

    },
    MacrosRender:function(){
        var that = this;
        var flagStr = "";
        that.option.eleObject.find(".AUTO").each(function(index,obj){
            if($(this).attr("orghidden") == 1){
                $(this).attr("hidden","1");
            }
            if(that.tool.MacrosData.option[$(this).attr("datafld")]){
                flagStr+=($(this).attr("datafld")+',');
            }
        });
        if( !that.option.preView){
            that.tool.MacrosData.ready(flagStr,function(MacrosData){
                that.option.eleObject.find(".AUTO").each(function(index,obj){
                    if(that.tool.MacrosData.option[$(this).attr("datafld")]){
                        var selectObj = $('<select id="'+$(this).attr('name')+'" name="'+$(this).attr('name')+'" title="'+$(this).attr('title')+'" data-type="'+$(this).attr('data-type')+'" style="'+$(this).attr('style')+'" datafld="'+$(this).attr('datafld')+'" class="form_item AUTO"></select>');
                        that.tool.getMacrosData($(this).attr("datafld"))(selectObj);
                        $(this).before(selectObj);
                        $(this).remove();
                    }else{
                        $(this).attr('value',that.tool.getMacrosData($(this).attr("datafld"))());
                    }
                });

            });
        }


    },
    AutoCode:function() {
        var that = this;
        that.option.eleObject.find(".autocode").each(function () {
            var _this = $(this);
            var divObj = '<input name="' + _this.attr('name') + '" uuid="' + _this.attr('datafld') + '" title="' + _this.attr('title') + '" class="form_item autocode" data-type="autocode" id="' + _this.attr('name') + '"  /><button class="autocodebtn">赋值</button>';
            _this.before(divObj);
            _this.remove();
        });
        that.option.eleObject.on('click','.autocodebtn',function () {
            var autocode = $(this).prev();
            if(!autocode.attr('disabled')){
                $.ajax({
                    type: "post",
                    url: "../../../document/getRuleById",
                    dataType: 'JSON',
                    data:{
                        id:autocode.attr('uuid'),
                        modelId:that.option.runId
                    },
                    success: function (obj) {
                        if(obj.flag){
                            autocode.attr("value",obj.object.expressionStr)
                        }
                    }
                })
            }

        })
    },
    DateRender:function(){
        var that = this;
        this.option.eleObject.find(".laydate-icon").each(function(){
            var _this = $(this);
            var divObj = '<input readonly="readonly" style="'+_this.attr('style')+'" name="'+_this.attr('name')+'" title="'+_this.attr('title')+'" class="form_item laydate-icon" data-type="calendar" id="'+_this.attr('name')+'"   date_format="'+_this.attr('date_format')+'"/>';
            _this.before(divObj);
            _this.remove();
        });
        this.option.eleObject.find(".laydate-icon").on("click",function(){
            if(!that.option.ish5){
                var format = $(this).attr("date_format");
                var formatArr = '';
                if(format.split(' ').length > 1){
                    formatArr = format.split(' ')[0].toUpperCase() + " " +format.split(' ')[1].toLowerCase();
                }else{
                    formatArr = format.split(' ')[0].toUpperCase();
                }
                laydate({istime: true,format:formatArr});
            }
        });
    },
    buildHTML:function(cb){
        var that = this;
        layer.load();
        that.tool.ajaxHtml(that.option.formhtmlurl,that.option.resdata,function (res) {
            if(res.flag){
                var formObj = res.object.flowFormType || res.object;
                if(formObj.printModel != ''){
                    //$(that.option.target).html(formObj.printModel);
                    var formCss = ''
                    var formJs = ''
                    if(that.option.flowStep != -1){
                        that.option.listFp = res.object.listFp;
                        that.option.flowRun = res.object.flowRun;
                        that.option.flowRunPrcs = res.object.flowRunPrcs;
                        that.option.flowFormType = res.object.flowFormType;
                        that.option['runName'] =  res.object.flowRun.runName;
                        that.option['runDate'] =  res.object.flowRun.beginTime;
                        that.option['runId'] =  res.object.flowRun.runId;
                        that.option.prcsUserlist = res.object.prcsUserlist;
                        that.option.prcsDeptlist = res.object.prcsDeptlist;
                        that.option.prcsPrivlist = res.object.prcsPrivlist;
                        that.option['formName'] = res.object.flowFormType.formName;
                        if(that.option.flowFormType.css){
                            formCss = that.option.flowFormType.css;
                        }
                        if(that.option.flowFormType.css){
                            formCss = that.option.flowFormType.script;
                        }
                    }else {
                        that.option.preView = true;
                        that.option['formName'] = formObj.formName;
                    }
                    that.option.eleObject = $('<div>'+formObj.printModel+'<style>'+ formCss+'</style><script>'+ formCss +'</script>'+'</div>');
                    $(that.option.target).html(that.render());
                    layer.closeAll();
                }else{
                    layer.closeAll();
                    layer.msg(sd, {icon: 6});
                    var noformdata = '<div class="cont_rig" style="text-align: center;margin-top: 200px;"><div class="noData_out"><div class="noDatas_pic"><img style="margin-left: 34px;" src="../../img/workflow/img_nomessage_03.png"></div><div style="margin-top: 19px;" class="noDatas">表单内容为空</div></div></div>'
                    $(that.option.target).html(noformdata);
                }
            }else{
                layer.closeAll();
                layer.msg(failedProcess, {icon: 6 },function () {

                });

            }
            if(cb && that.option.eleObject){
                that.option.eleObject.find('.form_item').each(function () {
                    var _this = $(this);
                    try {
                        if(parseInt(_this.attr('name').split('_')[1]) > that.option.formLength){
                            that.option.formLength =  _this.attr('name').split('_')[1];
                        }
                    }catch (e){
                        // console.log(e);
                    }

                });
                //console.log(that.option.formLength);
                return cb(res,that.option,that.option.eleObject);
            }
            return cb;
        });
    },
    getSearchData:function (cb) {
        var that = this;
        this.tool.ajaxHtml(that.option.formhtmlurl,this.option.resdata,function (data) {
            var formObj = data.object;
            that.option.eleObject = $('<div>'+formObj.printModel+'</div>');
            that.ReBuild();
            var arr = [];
            that.option.eleObject.find(".form_item").each(function () {
                var _this = $(this);
                var item = {
                    name:_this.attr('name'),
                    title:_this.attr("title"),
                    dataType:_this.attr('data-type')
                }
                arr.push(item);
            });
            cb(arr);
        })
    },
    tool:{
        MacrosData:{
            option:{
                SYS_LIST_DEPT : true,//部门列表
                SYS_LIST_USER : true,//人员列表
                SYS_LIST_PRIV:true,//角色列表
                SYS_LIST_PRIV_ONLY:true,
                SYS_LIST_PRIV_OTHER:true,
                SYS_LIST_PRCSUSER1:true,
                SYS_LIST_PRCSUSER2:true,
                SYS_LIST_MANAGER1:true,
                SYS_LIST_MANAGER2:true,
                SYS_LIST_MANAGER3:true,
                SYS_LIST_SQL:true
            },
            data:{},
            SYS_LIST_PRIV_ONLY : function() {
                // console.log("SYS_LIST_PRIV_ONLY");
                return "";
            },
            SYS_FLOW_FORMNAME:function () {
                return workForm.option.flowFormType.formName;
                // return "表单名称";
            },
            SYS_FLOW_FLOWNAME:function () {
                return workForm.option.flowRun.runName;
                // return "流程名称";
            },
            SYS_FLOW_STARTTIME:function () {
                // return "流程开始时间";
                return workForm.option.flowRun.beginTime;
            },
            SYS_FLOW_ENDTIME:function () {
                return workForm.option.flowRun.endTime;
                //return "流程结束时间";
            },
            SYS_FLOW_RUNID:function () {
                return workForm.option.flowRun.runId;
                // return "流水号";
            },
            SYS_FLOW_BEGINNAME:function () {
                return workForm.option.flowRun.userName;
                // return "流程发起人姓名";
            },
            SYS_FLOW_BEGINID:function(){
                return workForm.option.flowRun.uid;
                // return "流程发起人id";
            },
            SYS_FLOW_SIGNTEXT:function () {
                var signtext =  workForm.tool.MacrosData.data.signText || [];
                var str = '';
                signtext.forEach(function(v,i){
                    str+=(v.users.userName+'&nbsp;&nbsp;'+v.editTime+'</br>&nbsp;&nbsp;'+v.content+'</br>');
                });
                return str;
            },

            SYS_LIST_PRIV_OTHER : function() {
                // console.log("SYS_LIST_PRIV_OTHER");
            },
            SYS_LIST_PRCSUSER1 : function() {
                // console.log("SYS_LIST_PRCSUSER1");
                return "";
            },
            SYS_LIST_PRCSUSER2 : function() {
                // console.log("SYS_LIST_PRCSUSER2");
                return "";
            },
            SYS_SIGNTEXT : function (target) {

                return "";
            },
            SYS_LIST_MANAGER1 : function() {
                // console.log("SYS_LIST_MANAGER1");
                return "";
            },
            SYS_LIST_MANAGER2 : function () {
                // console.log("SYS_LIST_MANAGER2");
                return "";
            },
            SYS_LIST_MANAGER3 : function () {
                // console.log("SYS_LIST_MANAGER3");
                return "";
            },
            SYS_LIST_SQL : function () {
                return '';
            },
            SYS_LIST_DEPT :function(target){
                return target.deptSelect();//dept List
            },
            SYS_LIST_USER:function(target){
                var optionStr = '<option value="">select</option>';
                workForm.tool.MacrosData.data.sYS_LIST_USER.forEach(function (v,i) {
                    optionStr+='<option value="'+v.uid+'">'+v.name+'</option>';
                });
                return target.html(optionStr);
            },
            SYS_LIST_PRIV:function (target) {
                var optionStr = '<option value="">role</option>';
                workForm.tool.MacrosData.data.sYS_LIST_PRIV.forEach(function (v,i) {
                    optionStr+='<option value="'+v.userPriv+'">'+v.privName+'</option>';
                });
                return target.html(optionStr);
            },
            SYS_DATE_CN : function(){
                return new Date().Format("yyyy年MM月dd日");
            },
            SYS_DATE_CN_SHORT3 : function(){
                return new Date().Format("yyyy年");
            },
            SYS_DATE_CN_SHORT4 : function(){
                return new Date().Format("yyyy");
            },
            SYS_DATE_CN_SHORT1 : function(){
                return new Date().Format("yyyy年MM月");
            },
            SYS_DATE_CN_SHORT2 : function(){
                return new Date().Format("MM月dd日");
            },
            SYS_TIME : function(){
                return new Date().Format("hh:mm:ss");
            },
            SYS_DATETIME : function(){
                return new Date().Format("yyyy-MM-dd  hh:mm:ss");
            },
            SYS_WEEK : function(){
                return "星期"+"日一二三四五六".charAt(new Date().getDay());//星期几
            },
            SYS_USERID : function(){
                return workForm.tool.MacrosData.data.sYS_USERID;
            },
            SYS_USERNAME : function(obj){
                return workForm.tool.MacrosData.data.sYS_USERNAME;
            },
            SYS_DEPTNAME : function(){
                return workForm.tool.MacrosData.data.sYS_DEPTNAME;
            },
            SYS_DEPTNAME_SHORT : function(){
                return workForm.tool.MacrosData.data.sYS_DEPTNAME_SHORT;
            },
            SYS_USERPRIV : function(){
                return workForm.tool.MacrosData.data.sYS_USERPRIV;
            },
            SYS_USERPRIVOTHER : function(){
                return workForm.tool.MacrosData.data.sYS_USERPRIVOTHER;
            },
            SYS_USERNAME_DATE : function(){
                return workForm.tool.MacrosData.data.sYS_USERNAME+' '+new Date().Format("yyyy-MM-dd");
            },
            SYS_USERNAME_DATETIME : function(){
                return workForm.tool.MacrosData.data.sYS_USERNAME+' '+new Date().Format("yyyy-MM-dd hh:mm:ss");
            },
            SYS_FORMNAME : function(){
                return  workForm.option.formName;
            },
            SYS_RUNNAME : function(){
                return  workForm.option.runName;
            },
            SYS_RUNDATE : function(){
                return  workForm.option.runDate;//开始日期
            },
            SYS_RUNDATETIME : function(){
                return  workForm.option.runDate;//开始日期
            },
            SYS_RUNID : function(){
                return  workForm.option.runId;//开始日期
            },
            SYS_AUTONUM : function(){
                return "";
            },
            SYS_AUTONUM_YEAR : function(){
                return "";
            },
            SYS_AUTONUM_MONTH : function(){
                return "";
            },
            SYS_IP : function(){
                return "";
            },
            SYS_MANAGER1 : function(){
                return "";
            },
            SYS_MANAGER2 : function(){
                return "";
            },
            SYS_MANAGER3 : function(){
                return "";
            },
            SYS_SQL : function(){
                return "";
            },

            SYS_DATE:function(){
                return new Date().Format("yyyy-MM-dd");
            },
            SYS_FLOWSTARTTIME:function () {
                return  workForm.option.flowRun.beginTime;
            },
            SYS_FLOWENDTIME:function () {
                return  workForm.option.flowRun.endTime;
            },
            SYS_FLOWNAME:function () {
                return  workForm.option.runName;
            },
            SYS_FLOWRUNID:function () {
                return  workForm.option.runId;
            },
            SYS_FLOWSTARTUSERNAME:function () {
                return  workForm.option.flowRun.userName;
            },
            SYS_FLOWSTARTUSERID:function () {
                return  workForm.option.flowRun.beginUser;
            },
            SYS_FLOWSIGN:function () {
                return huiqian;
            },
            ready:function(options,cb){
                var that = this;
                $.ajax({
                    type: "get",
                    async: false,
                    url: "../../form/qureyCtrl?controlId=Macro&option="+options+'&flowId='+workForm.option.flowRun.flowId+'&runId='+workForm.option.flowRun.runId+'&prcsId='+workForm.option.flowRunPrcs.prcsId+'&flowPrcs='+workForm.option.flowRunPrcs.flowPrcs,
                    dataType: 'JSON',
                    success: function (res) {
                        that["data"] = res.object;
                        cb(that);
                    }
                })
            }
        },
        getMacrosData:function(flag){
            return this.MacrosData[flag];
        },
        renderListDeaultTd:function(rawIndex,lv_cal,lv_coltype,lv_colvalue,lv_size){

            var tdStr = '';
            for(var i=0;i<lv_colvalue.length;i++){
                var type = lv_coltype[i];
                if(type){
                    switch (type){
                        case 'text':
                            tdStr+='<td id="col_'+i+'" listtype="text" ><input type="text" value="'+lv_colvalue[i]+'"  style="width: '+lv_size[i]+'px"></td>';
                            break;
                        case 'textarea':
                            tdStr+='<td id="col_'+i+'" listtype="textarea"><textarea value="'+lv_colvalue[i]+'"  style="width: '+lv_size[i]+'px">'+lv_colvalue[i]+'</textarea></td>';
                            break;
                        case 'select':
                            var optionValue = lv_cal[i].split('|')[0].split(',');
                            var optionDefaultSelected = lv_colvalue[i] || lv_cal[i].split('|')[1];
                            var optionValueStr = '';
                            optionValue.forEach(function (v,i) {
                                if(v == optionDefaultSelected){
                                    optionValueStr += '<option selected value="'+v+'">'+v+'</option>';
                                }else{
                                    optionValueStr += '<option value="'+v+'">'+v+'</option>';
                                }
                            });
                            tdStr+='<td id="col_'+i+'" listtype="select" ><select style="width: '+lv_size[i]+'px">'+optionValueStr+'</select></td>';
                            break;
                        case 'radio':
                            var radioStr = lv_cal[i]
                            var radioValue = radioStr.split('|')[0].split(',');
                            var radioDefaultSelected =  lv_colvalue[i] || lv_cal[i].split('|')[1];
                            var radioValueStr = '';
                            radioValue.forEach(function (v,index) {
                                if(v == radioDefaultSelected){
                                    radioValueStr += (v+'<input checked="checked" value="'+v+'" name="r'+rawIndex+'_r'+i+'" id="'+v+'"  type="radio">');
                                }else{
                                    radioValueStr += (v+'<input value="'+v+'" name="r'+rawIndex+'_r'+i+'" id="'+v+'" type="radio">');
                                }
                            });
                            tdStr+=('<td id="col_'+i+'" listtype="radio">'+radioValueStr+'</td>');
                            break;
                        case 'checkbox':
                            var checkboxValue = lv_cal[i].split('|')[0].split(',');
                            var checkboxDefaultSelected = (lv_colvalue[i] || lv_cal[i].split('|')[1]).split(',');
                            var checkboxValueStr = '';
                            checkboxValue.forEach(function (v,i) {
                                if(v == checkboxDefaultSelected[i]){
                                    checkboxValueStr += (v+'<input checked="checked" value="'+v+'" id="'+v+'" name="r'+rawIndex+'_r'+i+'"  type="checkbox">&nbsp;');
                                }else{
                                    checkboxValueStr += (v+'<input value="'+v+'" id="'+v+'" name="r'+rawIndex+'_r'+i+'"  type="checkbox">&nbsp;');
                                }
                            });
                            tdStr+=('<td id="col_'+i+'" listtype="checkbox">'+checkboxValueStr+'</td>');
                            break;
                        case 'datetime':
                            var datetime = lv_colvalue[i] || new Date().Format('yyyy-MM-dd')
                            tdStr+='<td id="col_'+i+'" listtype="datetime">'+datetime+'</td>';
                            break;
                        case 'dateAndTime':
                            var dateAndTime = lv_colvalue[i] || new Date().Format('yyyy-MM-dd hh:mm:ss');
                            tdStr+='<td id="col_'+i+'" listtype="dateAndTime">'+dateAndTime+'</td>';
                            break;
                        default:
                            tdStr+='<td id="col_'+i+'" ><input type="text"></td>';
                    }
                }
            }
            return tdStr;
        },
        buildListPluData:function (tableObj,listdata,obj) {
            var trStr = "";
            var addtr ='<td><a style="" title=del class="delete_row" href="javascript:void(0)"><img src="/img/workflow/delete.png"></a></td>';
            listdata.split('\r\n').forEach(function(v,i){
                var lv_cal = tableObj.attr('lv_cal').split('`');
                var lv_coltype = tableObj.attr('lv_coltype').split('`');
                var lv_colvalue = v.split('`');
                var lv_size = tableObj.attr('lv_size').split('`');
                var tdstr = obj.tool.renderListDeaultTd(i,lv_cal,lv_coltype,lv_colvalue,lv_size);
                trStr+=('<tr id="row_'+i+'">'+addtr+tdstr+'</tr>');
            });
            var listheadStr = tableObj.find('.listhead').prop("outerHTML");
            tableObj.find('.listfoot').siblings().remove();
            tableObj.find('.listfoot').before(listheadStr+trStr);



        },
        iconImgType:{
            txt : '../../img/icon_file.png',
            jpg : '../../img/icon_image.png',
            png : '../../img/icon_image.png',
            pdf :  '../../img/icon_pdf.png',
            ppt : '../../img/icon_ppt.png',
            pptx :  '../../img/icon_ppt.png',
            doc : '../../img/icon_word.png',
            docx : '../../img/icon_word.png',
            xls :  '../../img/icon_excel.png',
            xlsx :  '../../img/icon_excel.png'

        },
        popUserSelect:function(target){
            user_id = target;
            $.popWindow(domain+"/common/selectUser");
        },
        ajaxHtml:function (url,data,cb) {
            var that = this;
            $.ajax({
                type: "get",
                url: url,
                async:false,
                dataType: 'JSON',
                data:  data,
                success: function (res) {
                    if(cb){
                        cb(res);
                    }
                },
                error:function(e){
                    // console.log(e);
                }
            });
        },
        Date_format:function(date, format)
        {
            date = date.split(/\D/);
            format = format.split(/[^yMdhHms]+/);
            var real_format = 'y-M-d H:m:s';
            for(var k in format)
            {
                if((/([yMdhHms])+/).test(format[k]))
                {
                    // 兼容两位年份的情况
                    if(format[k]=='y' || format[k]=='yy')
                    {
                        if(78<=date[k] && 99>=date[k])
                        {
                            date[k] = '19' + date[k];
                        }
                        else
                        {
                            date[k] = '20' + date[k];
                        }
                    }
                    real_format = real_format.replace(RegExp.$1, date[k]);
                }
            }
            var date_now = new Date();
            var o =
                {
                    "M+" : date_now.getMonth()+1, //month
                    "d+" : date_now.getDate(),    //day
                    "h+" : '00',   //hour
                    "H+" : '00',   //hour
                    "m+" : '00', //minute
                    "s+" : '00' //second
                    // "q+" : Math.floor((date_now.getMonth()+3)/3),  //quarter
                    // "S" : date_now.getMilliseconds() //millisecond
                };
            if(/(y+)/.test(real_format))
            {
                real_format = real_format.replace(RegExp.$1,(date_now.getFullYear().toString()));
            }
            for(var k in o)
                if(new RegExp("("+ k +")").test(real_format))
                    real_format = real_format.replace(RegExp.$1,RegExp.$1.length==1 ? o[k] : ("00"+ o[k]).substr((""+ o[k]).length));
            return real_format;
        }
    }
}
function delCB(signatureid, signData){
    if(Signature.list != null && Signature.list[signatureid] != null){
        var signatureCreator = Signature.create();
        var position = signData.position
        //console.log(signData.position);
        for(var key in position){
            $('#'+key).find('img').show();
            $('#'+key).find('button').show();
        }

        var a = signatureCreator.removeSignature(signData.documentid, signatureid);
        console.log(a)
    }
    return true;
}