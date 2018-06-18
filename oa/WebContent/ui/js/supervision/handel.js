/**
 * Created by gaosubo-sheji on 2017/8/2.
 */
$(function () {
    //获取地址栏参数
    var sId=$.getQueryString('sid');
    var TYPE=$.getQueryString('type');
    var status=$.getQueryString('status');
    var paId=$.getQueryString('paId');
    detailsInit (sId)
    if(TYPE == '0'){ //督办管理-办理

    }else if(TYPE == '1'){//督办任务-处理中-办理

    }else if(TYPE == '2'){//督办任务-查看

    }
    if(paId == 0){
        $('.newAdd').hide();
    }else{
        $('.newAdd').show();
    }

    function detailsInit (sId) {
        $.ajax({
            type:'get',
            url:'/supervision/getSupAssistDetail',
            dataType:'json',
            data:{'sid':sId},
            success:function(res){
                var data=res.object;
                console.log(data);
                if(status != '3' && status != '6'){
                    $('.operationBtn').show();
                    if(data.count0 == 1){
                        $('.throung').show();  //办结
                        $('.suspend').show();  //暂停
                    }
                    if(data.count0 == 1 || data.count2 == 1 || data.count1 == 1){
                        $('.feedback').show(); //反馈
                    }
                    if(data.count2 == 1 || data.count1 == 1){
                        $('.reminders').show();  //催办
                    }
                    if(data.count2 == 1){
                        $('.newAdd').show();  //子任务
                    }
                }else if(status == 3 && data.count0 == 1){
                    $('.replayD').show();
                }
                $('.supName').text('');
                $('.manageUser').text('');
                $('.userName').text('');
                $('.leaderName').text('');
                $('.baginTime').text('');
                $('.endTime').text('');
                $('.workState').text('');
                $('.addUser').text('');
                $('.workTask').text('');
                $('.superior').text('');
                $('.attment').text('');
                $('#suspend').attr('count','');
                $('#comEnd').attr('count','')

                $('.supName').text(data.supName);
                $('.manageUser').text(data.deptName);
                $('.userName').text(data.managerName);
                $('.leaderName').text(data.userPrivName);
                $('.baginTime').text(data.beginTime);
                $('.endTime').text(data.endTime);
                $('.workState').text(data.content);
                $('.addUser').text(data.createrId);
                $('.workTask').text(data.content);
                $('#suspend').attr('count',data.count2);
                $('#comEnd').attr('count',data.count2)
                /*$('.superior').text();
                $('.attment').text();*/
            }
        })
    }
})
