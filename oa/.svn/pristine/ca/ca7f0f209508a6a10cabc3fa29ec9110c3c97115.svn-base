$(function () {
	
	$('.a1').click(function () {
		var str='<tr class="tian"><td>'+caoSend+'：</td><td><textarea id="copeNameText" name="txt" disabled></textarea><span class="add_img"><a href="javascript:;" id="selectUserO" class="Add" style="margin-left: 16px;font-size: 14px;">'+global_lang_add+'</a></span><span class="add_img"><a href="javascript:;" class="clearCC" style="margin-left: 16px;font-size: 14px;">'+notice_th_delete1+'</a></span></td></tr>';
		var txt=$(this).text();
		if (txt==email_th_addwait) {
			$(this).text(email_th_HideCC);
			$('.append_tr').after(str);
		}else{
			$(this).text(email_th_addwait);
			$('.tian').remove();
		}
	})
	
	$('.a2').click(function () {
		var str='<tr class="mis"><td>'+miSend+'：</td><td><textarea id="secritText" name="txt" disabled></textarea><span class="add_img"><a href="javascript:;" id="selectUserT" class="Add" style="margin-left: 16px;font-size: 14px;">'+global_lang_add+'</a></span><span class="add_img"><a href="javascript:;" class="clearBCC" style="margin-left: 16px;font-size: 14px;">'+notice_th_delete1+'</a></span></td></tr>';
		var txt=$(this).text();
		if (txt==email_th_addbcc) {
			$(this).text(email_th_HiddenSecret);
			$('.append_tr').after(str);
		}else{
			$(this).text(email_th_addbcc);
			$('.mis').remove();
		}
	})
    $('.a3').click(function(){
        var str='<tr class="InText"><td style="padding: 5px;">'+InEmali+'：</td><td style="padding: 5px;"><select><option value="1729562020@qq.com">1729562020@qq.com</option><option value="845708329@qq.com">845708329@qq.com</option></select><span>'+sendMail+'</span></td></tr>';
             var txt=$(this).text();
        if (txt==addOut) {
            	$(this).text(yinOut);
            	$('.append_tr').after(str);
            }else{
            	$(this).text(addOut);
				$('.InText').remove();
            }
	})
    // $('.a3').click(function(){
    //     var str='<tr class="outUser"><td>外部收件人：</td><td>' +
		// 	'<div class="inPole"><textarea id="outName" name="txt" disabled></textarea><span class="add_img"><span class="addImg"></span><a href="javascript:;" id="selectUserOut" class="Add_out">添加</a><span class="add_img"><a href="javascript:;" class="clear_out">清除</a></span></div>' +
		// 	'<div class="addPepl"><a href="javascript:;" class="a4">添加外部抄送人</a><a href="javascript:;" class="a5">添加外部密送人</a></div></td></tr>' +
		// 	'<tr class="InText"><td>Internet邮箱：</td><td><select><option value="1729562020@qq.com">1729562020@qq.com</option><option value="845708329@qq.com">845708329@qq.com</option></select><span>通过该邮箱发送邮件给外部收件人</span></td></tr>';
    //     var txt=$(this).text();
    //     if (txt=='添加外部收件人') {
    //         $(this).text('隐藏外部收件人');
    //         $('.append_tr').after(str);
    //     }else{
    //         $(this).text('添加外部收件人');
    //         $('.outUser').remove();
    //         $('.InText').remove();
    //
    //     }
    // })
    // $('.TABLE').on('click','.a4',function(){
    //     var str='<tr class="out_ser"><td>外部抄送人：</td><td>' +
    //         '<div class="inPole"><textarea id="out_name" name="txt" disabled></textarea><span class="add_img"><span class="addImg"></span><a href="javascript:;" id="selectUserOut" class="Add_outN">添加</a><span class="add_img"><a href="javascript:;" class="clear_outN">清除</a></span></div></td></tr>';
    //     var txt=$(this).text();
    //     if (txt=='添加外部抄送人') {
    //         $(this).text('隐藏外部抄送人');
    //         $('.TABLE .outUser').after(str);
    //     }else{
    //         $(this).text('添加外部抄送人');
    //         $('.out_ser').remove();
    //     }
    // })
    // $('.TABLE').on('click','.a5',function(){
    //     var str='<tr class="out_mis"><td>外部密送人：</td><td>' +
    //         '<div class="inPole"><textarea id="out_nameM" name="txt" disabled></textarea><span class="add_img"><span class="addImg"></span><a href="javascript:;" id="selectUserOut" class="Add_outM">添加</a><span class="add_img"><span class="addImg"></span><a href="javascript:;" class="clear_outM">清除</a></span></div></td></tr>';
    //     var txt=$(this).text();
    //     if (txt=='添加外部密送人') {
    //         $(this).text('隐藏外部密送人');
    //         $('.TABLE .outUser').after(str);
    //     }else{
    //         $(this).text('添加外部密送人');
    //         $('.out_ser').remove();
    //     }
    // })
	
	$('.clear').click(function(){
		$('#senduser').val('');
        $('#senduser').attr('user_id','')
	})

	
})
