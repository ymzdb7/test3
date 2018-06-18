/**
 * Created by 骆鹏 on 2017/7/26.
 */

var ajaxPage={
    data:{
        page:1,//当前处于第几页
        pageSize:5,//一页显示几条
        useFlag:true,
        documentType:0,
        // curUserID:0,
        printDate:null,
        dispatchType:null,
        title:null,
        docStatus:null
    },
    init:function () {
        $.get('/code/GetDropDownBox',{CodeNos:'GWTYPE'},function (json) {
            var arrTwo=json.GWTYPE;
            var str='<option value="">请选择</option>'
            for(var i=0;i<arrTwo.length;i++){
                str+='<option value="'+arrTwo[i].codeNo+'">'+arrTwo[i].codeName+'</option>'
            }
            $('[name="dispatchType"]').html(str)
        },'json')

    },
    page:function () {
        var me=this;
        this.data.printDate=$('[name="printDate"]').val();
        this.data.dispatchType=$('[name="dispatchType"]').val()
        this.data.title=$('[name="title"]').val()
        this.data.docStatus=$('[name="status"]').val()
        $.get('/eduExam/allExam',me.data,function (json) {

            var str='';
            var arr=json.obj
            console.log(arr);
            for(var i=0;i<arr.length;i++){
                str+='<tr id='+arr[i].id+'>' +
                    '<td><input type="checkbox" id="jqg_gridTable_1871"  class="cbox" style="background:white;"></td>' +
                    '<td>'+arr[i].id+'</td>' +
                    '<td>'+arr[i].schoolYear+'</td>' +
                    '<td>'+arr[i].semester+'</td>' +
                    '<td>'+arr[i].examName+'</td>' +
                    '<td>'+function () {
                        if(arr[i].examType==01){
                            return '期末考试'
                        }else if(arr[i].examType==02){
                            return '重考'
                        }else if(arr[i].examType==03){
                            return '会考'
                        }else if(arr[i].examType==04){
                            return '入学考试'
                        }else if(arr[i].examType==05){
                            return '期中考试'
                        }else if(arr[i].examType==06){
                            return '月考'
                        }else if(arr[i].examType==07){
                            return '其他'
                        }
                    }()+'</td>' +
                    '<td>'+function (){return new Date(parseInt(arr[i].releaseTime)).toLocaleString().replace(/:\d{1,2}$/,' ');}()+'</td>' +
                    '<td class="pagediv" id="operation">' +
                    '<a href="javascript:;" target="_blank" style="margin-right: 10px" class="search">详细信息</a>' +
                    '<a href="javascript:;" target="_blank" style="margin-right: 10px" class="edit">修改</a>' +
                    '<a href="javascript:;" target="_blank" class="remove">删除</a>' +
                    '</td>' +
                    '</tr>'
            }
            $('.pagediv table tbody').html(str)
            me.pageTwo(json.totleNum,me.data.pageSize,me.data.page)

        },'json')
    },
    pageTwo:function (totalData, pageSize,indexs) {
        var mes=this;
        $('#dbgz_page').pagination({
            totalData: totalData,
            showData: pageSize,
            jump: true,
            coping: true,
            homePage:'',
            endPage: '',
            current:indexs||1,
            callback: function (index) {

                mes.data.page=index.getCurrent();
                mes.page();
            }
        });
    }
}
$(function () {
    ajaxPage.init()
    ajaxPage.page()
    $('.Query').click(function () {
        ajaxPage.data.page=1;
        ajaxPage.page()
    })
})

//点击查看详情
$(document).on('click','.search',function(){
    var Id=$(this).parent().parent().attr('id');
    $.ajax({
        type:'post',
        url:'/eduExam/getOne',
        dataType:'json',
        data:{'Id':Id},
        success:function(reg){
            var data=reg.obj;
            layer.open({
                type:1,
                title:['查看详情', 'background-color:#2b7fe0;color:#fff;'],
                area: ['600px', '398px'],
                shadeClose: true, //点击遮罩关闭
                content:'<div class="div_table">' +
                '<div class="div_tr"><span class="span_td span_lf">学 年<span></span>：</span><span>'+ data.schoolYear+'</span></div>'+
                '<div class="div_tr"><span class="span_td span_lf">学 期：</span><span>'+data.semester+'</span></div>'+
                '<div class="div_tr" style="word-wrap:break-word;word-break:break-all;"><span class="span_td span_lf">考试范围(年级)：</span><span class="seeCon" >'+data.gradeName+'</span></div>'+
                '<div class="div_tr" style="word-wrap:break-word;word-break:break-all;"><span class="span_td span_lf">考试范围(班级)：</span><span><div class="inPole">'+data.className+'</div></span></div>'+
                '<div class="div_tr" style="word-wrap:break-word;word-break:break-all;"><span class="span_td span_lf">考试范围(人员)：</span><span><div class="inPole">'+data.examUserName+'</div></span></div>'+
                '<div class="div_tr"><span class="span_td span_lf">考试名称：</span><span><div class="inPole">'+data.examName+'</div></span></div>'+
                '<div class="div_tr"><span class="span_td span_lf">考试类型：</span><span><div class="inPole">'+
                    function () {
                        if(data.examType==01){
                            return '期末考试'
                        }else if(data.examType==02){
                            return '重考'
                        }else if(data.examType==03){
                            return '会考'
                        }else if(data.examType==04){
                            return '入学考试'
                        }else if(data.examType==05){
                            return '期中考试'
                        }else if(arr[i].examType==06){
                            return '月考'
                        }else if(arr[i].examType==07){
                            return '其他'
                        }
                    }()+'</div></span></div>'+
                '<div class="div_tr"><span class="span_td span_lf">考试安排：</span><span><div class="inPole">'+data.examArrange+'</div></span></div>'+
                '<div class="div_tr"><span class="span_td span_lf">附件文档：</span><span><div class="inPole">'+data.tag+'</div></span></div>'+
                '</div>'
            })

        }
    })
})


