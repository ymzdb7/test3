/**
 * Created by 骆鹏 on 2017/6/26.
 */
function inputcheck(name,value) {
    $('[name="'+name+'"]').val(value)
}
function checkboxChecked(name,value) {
    if(value==1){
        $('[name="'+name+'"]').prop('checked',true)
    }
}
function radiochecked(name,value) {
    $('[name="'+name+'"]').each(function (i,n) {
        if($(this).val()==value){
            $(this).prop('checked',true)
            return false
        }
    })
}
var deptidnum;
$(function () {

    $.get('/sys/getInterfaceInfo',function (json) {
        if(json.flag){
            if(json.object.loginValidation!=3){
                $('.jiaoyu').hide()
            }
        }
    },'json')


    $('.tdAnewrole').click(function () {
        if($($(this).parent().parent().siblings('.trrole')[0]).css('display')==='none'){
            $(this).parent().parent().siblings('.trrole').show()
        }else {
            $(this).parent().parent().siblings('.trrole').hide()
            $('#senduser7').val('')
            $('#senduser8').val('')
            $('#senduser7').attr('dataid','')
            $('#senduser8').attr('deptid','')

        }

    });
    $('.clearData').click(function () {
        $(this).siblings('textarea').val('')
        $(this).siblings('textarea').attr('userpriv','')
        $(this).siblings('textarea').attr('deptid','')
    });
    $('.clearDataTwo').click(function () {
        $(this).parent().siblings('textarea').val('')
        $(this).parent().siblings('textarea').attr('userpriv','')
        $(this).parent().siblings('textarea').attr('deptid','')
        $(this).parent().siblings('textarea').attr('dataid','')
    });



    //        获取学科控件
    function getYear(year){
        $.ajax({
            url:'/code/getCode',
            type:'get',
            data:{parentNo:'COURSE_REALM'},
            dataType:'json',
            //data:datas,
            success:function(reg){
                var datas=reg.obj;

                for (var i=0;i<datas.length;i++){
                    str='<option value="'+datas[i].codeOrder+'">'+datas[i].codeName+'</option>';
                    $(year).append(str);
                }

            }
        })
    }
    getYear('.subject');


    function isCardID(sId){
        var iSum=0 ;
        var info="" ;
        if(!/^\d{17}(\d|x)$/i.test(sId)) return fillError;
        sId=sId.replace(/x$/i,"a");
        if(aCity[parseInt(sId.substr(0,2))]==null) return feifa;
        sBirthday=sId.substr(6,4)+"-"+Number(sId.substr(10,2))+"-"+Number(sId.substr(12,2));
        var d=new Date(sBirthday.replace(/-/g,"/")) ;
        if(sBirthday!=(d.getFullYear()+"-"+ (d.getMonth()+1) + "-" + d.getDate()))return feiDate;
        for(var i = 17;i>=0;i --) iSum += (Math.pow(2,i) % 11) * parseInt(sId.charAt(17 - i),11) ;
        if(iSum%11!=1) return fillcard;
        //aCity[parseInt(sId.substr(0,2))]+","+sBirthday+","+(sId.substr(16,1)%2?"男":"女");//此次还可以判断出输入的身份证号的人性别
        return true;
    }
    
    $('[name="SUMMARY"]').click(function () {
        if(!$(this).is(':checked')){
            $(this).parent().parent().parent().siblings('.inthide').show()
        }else {
            $(this).parent().parent().parent().siblings('.inthide').hide();
            $(this).parent().parent().parent().siblings('.inthide').find('input')[0].value=-1
        }
    });
    
    $('.departmentbu').click(function () {
        if($(this).parent().parent().next().is(':hidden')){
            $(this).parent().parent().next().show()
        }else {
            $(this).parent().parent().next().hide();
            $('#departments').attr('deptid','');
            $('#departments').val('')
        }
    });

    $('#selectUsertwo').click(function () {
        if($(this).parent().parent().next().is(':hidden')){
            $(this).parent().parent().next().show()
        }else {
            $(this).parent().parent().next().hide();
            $('#sendusers').val('');
            $('#sendusers').attr('userpriv','')
        }
    });

    // 初始化 查询考勤类型 岗位 职务数据 成功后调用根据UID查询接口 判断是否为编辑
    $.when(selOaTheam(),selAttend(),selJob(),selPost()).then(function () {
        selUserById()
    })
});

// 查询系统默认主题
function selOaTheam() {
    var dtd = $.Deferred(); // 新建一个Deferred对象
    $.ajax({
        url: "/sys/getInterfaceInfo",
        type: 'get',
        dataType: "JSON",
        success: function (data) {
            if(data.flag){
                $('select[name="THEME"]').val(data.object.theme);
            }
            // 改变状态
            dtd.resolve();
        }
    });
    return dtd.promise();
}

// 查询所有考勤类型
function selAttend() {
    var dtd = $.Deferred(); // 新建一个Deferred对象
    $.ajax({
        url: "/attendSet/selsectAttendSet",
        type: 'get',
        dataType: "JSON",
        success: function (data) {
            var data = data.data;
            var str = '';
            for (var i = 0; i < data.length; i++) {
                str += '<option value="' + data[i].sid + '">' + data[i].title + '</option>'
            }
            $('select[name="twoSele"]').append(str);
            // 改变状态
            dtd.resolve();
        }
    });
    return dtd.promise();
}

// 查询所有岗位
function selJob() {
    var dtd = $.Deferred(); // 新建一个Deferred对象
    $.ajax({
        url: "/position/selectUserJob",
        type: 'get',
        dataType: "JSON",
        success: function (res) {
            var data = res.obj;
            var str = '';
            for (var i = 0; i < data.length; i++) {
                str += '<option value="' + data[i].jobId + '">' + data[i].jobName + '</option>'
            }
            $('select[name="jobId"]').append(str);
            // 改变状态
            dtd.resolve();
        }
    });
    return dtd.promise();
}


// 查询所有职务
function selPost() {
    var dtd = $.Deferred(); // 新建一个Deferred对象
    $.ajax({
        url: "/duties/selectUserPostList",
        type: 'get',
        dataType: "JSON",
        success: function (res) {
            var data = res.obj;
            var str = '';
            for (var i = 0; i < data.length; i++) {
                str += '<option value="' + data[i].postId + '">' + data[i].postName + '</option>'
            }
            $('select[name="postId"]').append(str);
            dtd.resolve();
        }
    });
    return dtd.promise();
}

// 根据uid查询
function selUserById() {
    if(location.href.split('?')[1]!=0){
        // if(location.href.split('?')[1]==1) {
        //     $('input').each(function (i, n) {
        //         $(this).prop('readonly', 'readonly');
        //         $(this).css('background', '#ddd');
        //         if ($(this).prop('type') == 'radio' || $(this).prop('type') == 'checkbox') {
        //             $(this).prop('disabled', 'disabled')
        //         }
        //     })
        //     $('select').each(function (i, n) {
        //         if ($(this).prop('name') != 'deptId') {
        //             $(this).prop('disabled', 'disabled');
        //             $(this).css('background', '#ddd');
        //         }
        //     });
        //     $('textarea').each(function (i, n) {
        //         $(this).prop('readonly', 'readonly');
        //         $(this).css('background', '#ddd')
        //     })
        // }
        $('#btn1').val(saveNew)
        $.get('/user/getUserByuid',{'uid':location.href.split('?')[1]},function (json) {
            if(json.flag){
                $('.titleTxt').html(updateUser)
                document.title = updateUser;
                $('.newname').text(window.opener.userstr)
                inputcheck('userId',json.object.byname)
                inputcheck('userName',json.object.userName)
                inputcheck('txtsenduser',json.object.userPrivName)
                inputcheck('txtsendusers',json.object.userPrivOtherName)
                inputcheck('userNo',json.object.userNo)
                inputcheck('postPriv',json.object.postPriv)
                inputcheck('idNumber',json.object.idNumber)
                inputcheck('traNumber',json.object.traNumber)
                $('.subject option[value='+json.object.subject+']').attr('selected',true)
                $('#department').deptSelect(function (me) {
                    $(me).append('<option value="0">'+lizhi+'</option>')
                    $(me).val(json.object.deptId)

                });
                if(json.object.userPrivOtherName == ''){
                    $('#fuzhuPriv').hide();
                }else{
                    $('#fuzhuPriv').show();
                }
                if(json.object.userPrivOtherName == ''){
                    $('#otherDept').hide();
                }else{
                    $('#otherDept').show();
                }
                deptidnum=json.object.deptId;
                $('[name="txtsenduser"]').attr('userPriv',json.object.userPriv+',')
                $('[name="txtsendusers"]').attr('userpriv',json.object.userPrivOther)
                checkboxChecked('notViewUser',json.object.notViewUser)
                checkboxChecked('notViewTable',json.object.notViewTable)
                checkboxChecked('useingKey',json.object.useingKey)
                checkboxChecked('usingFinger',json.object.usingFinger)
                radiochecked('notLogin',json.object.notLogin)
                radiochecked('notMobileLogin',json.object.notMobileLogin)
                inputcheck('imRange',json.object.imRange)
                inputcheck('twoSele',json.object.userExt.dutyType)
                inputcheck('emailCapacity',json.object.userExt.emailCapacity)
                inputcheck('folderCapacity',json.object.userExt.folderCapacity)
                checkboxChecked('usePop3',json.object.userExt.usePop3)
                checkboxChecked('useEmail',json.object.userExt.useEmail)
                inputcheck('webmailNum',json.object.userExt.webmailNum)
                inputcheck('webmailCapacity',json.object.userExt.webmailCapacity)
                inputcheck('txtbindIp',json.object.userExt.bindIp)
                inputcheck('txtremark',json.object.userExt.remark)
                inputcheck('password',json.object.password)
                inputcheck('sex',json.object.sex)
                inputcheck('birthday',json.object.birthday)
                checkboxChecked('isLunar',json.object.isLunar)
                checkboxChecked('mobilNoHidden',json.object.mobilNoHidden)
                inputcheck('mobilNo',json.object.mobilNo)
                inputcheck('email',json.object.email)
                inputcheck('telNoDept',json.object.telNoDept)
                inputcheck('txtPrivName',json.object.modulePriv.privName)
                $('[name="txtPrivName"]').attr('userpriv',json.object.modulePriv.privId)
                inputcheck('txtUserName',json.object.modulePriv.userName)
                $('[name="txtUserName"]').attr('dataid',json.object.modulePriv.userId)
                inputcheck('txtDeptName',json.object.modulePriv.deptName)
                $('[name="txtDeptName"]').attr('deptid',json.object.modulePriv.deptId)
                inputcheck('departmentname',json.object.deptOtherName)
                $('[name="departmentname"]').attr('deptid',json.object.deptIdOther)
                if(json.object.post!=undefined){
                    inputcheck('post',json.object.post)
                }
                $('select[name="postId"]').val(json.object.postId)
                $('select[name="jobId"]').val(json.object.jobId)
                if(json.object.uid==1){
                    $('.addUserPriv').css("display","none")
                    $('.clearUserPriv').css("display","none")
                }
            }else {
                alert(intelError)
            }
        },'json')
    }else {
        $('.newname').text(window.opener.userstr)
        document.title = addUser;
    }
}