<?
   include_once("../header.php");
   include_once("inc/utility_all.php");
?>
<style>
body{
    background-color: #fff;
    -webkit-overflow-scrolling: touch;
}
.ui-diary-comment{
    height:120px;
}
.ui-form-item{
    padding:0;
}
.ui-input-wrap{
    z-index: 100;
}
#commentlist h4{
    font-size: 13px;

}
#commentlist p{
    font-size: 14px;

}
.ui-diary-commenter{
    color: #00a5e0;
}
.ui-page{
    display: none;
}
.ui-page-active{
    display: block;
}
</style>

<section class="ui-container ui-whitespace">
    <section id="pages" class="ui-pages">
    	<div class="ui-page" id="page_read">
    	</div>
    </script>
</section>
</section>
<footer class="ui-footer ui-footer-stable ui-border-t" style="height:45px;">
    <section class="ui-input-wrap ui-border-t">
        <div class="ui-input ui-border-radius" id="commentwrap">
            <input type="text" name="" value="" placeholder="��Ҳ˵һ��..." id="comment">
        </div>
        <button class="ui-btn" ><?=_("����")?></button>
    </section>
</footer>
<script id="diary-detail-tmpl" type="x-tmpl">
<!--��־ͷ��-->
<h1 class="ui-article-title" data-id="<%=q_id%>"><%=subject%></h1>
<h2 class="ui-article-subtitle ui-border-b">
	<span class="ui-txt-muted"><%=dia_type_desc%></span>
	<!--<span class="ui-txt-muted ui-margin-left"></span>-->
	<span class="ui-txt-muted ui-margin-left"><%=dia_time%></span>
</h2>

<!--��־����-->
<div class="ui-article-content">
	<p><%=content%></p>
</div>
<div  style="position: relative;"></div>
<!--��־����-->
<% if ( attachment_id != "" &&  attachment_name !==""){%>
	<div class="ui-attachment-wrap ui-margin-bottom" >
		<%=attachment_link%>
	</div>
<% } %>

<!--��־�����б�-->
<% if ( diary_comment.length > 0){%>
<ul class=" ui-list-pure ui-border-b" style="clear:both;margin-bottom:60px; " id="commentlist">
    <% for (var i = 0;i<diary_comment.length;i++){%>
        <li class="ui-border-t">
            <p class="ui-txt-muted">
                <span class="ui-diary-commenter" data-user-id="<%=diary_comment[i].c_user_id%>"><%=diary_comment[i].c_user_name%></span>
                <span class="date ui-margin-left "> <%=diary_comment[i].send_time%></span>
                <!--<a class="date ui-float-right ui-comment-delete" data-comment-id=''></a>
                <a class="date ui-float-right ui-comment-reply " data-comment-id='<%=diary_comment[i].comment_id%>'> <?=_("�ظ�")?></a>-->
            </p>
            <h4><%=diary_comment[i].comment_content%></h4>

            <!--��־�ظ�����-->
             <ul class=" ui-list-pure ui-margin-left" style="clear:both;margin-right:-15px; " id="replylist">
                <% for (var j = 0;j<diary_comment[i].comment_reply.length;j++) {%>
                    <li >
                        <p class="ui-txt-muted">
                            <span class="ui-diary-commenter"  data-reply-id='<%=diary_comment[i].comment_reply[j].r_id%>' data-replyer-id='<%=diary_comment[i].comment_reply[j].replyer_id%>'><%=diary_comment[i].comment_reply[j].replyer%></span>
                            <span class="ui-txt-muted"><?=_("�ظ�")?></span>

                            <span class="ui-diary-commenter" data-to-id='<%=diary_comment[i].comment_reply[j].comment_id%>'><%=diary_comment[i].comment_reply[j].to_name%></span>
                            <span class="date ui-margin-left "> <%=diary_comment[i].comment_reply[j].reply_time%></span>
                            <!-- <a class="date ui-float-right ui-comment-delete"  data-comment-id='' data-reply-id=''></a>
                            <a class="date ui-float-right ui-reply-comment  "  data-reply-id='<%=diary_comment[i].comment_reply[j].r_id%>' data-comment-id='<%=diary_comment[i].comment_id%>'> <?=_("�ظ�")?></a>-->

                        </p>
                        <h4><%=diary_comment[i].comment_reply[j].replay_comment%></h4>
                    </li>
                <% } %>
            </ul>
        </li>
    <% } %>
</ul>
<% } %>
<br/>
</script>

<script type="text/javascript">
    $('document').ready(function(){
        loadContent();
    })

//    var diaryData = {
//        l: {event: "headReturn()"},
//        c: {title: "��־����"},
//        r: null
//    };
    var opts = {
        type: "header",
        id: "diaryDetail",
    };

    Zepto(function($){
        //tMobileSDK.buildHeader(diaryData);

        tMobileSDK.ready(function() {

            var tHeadData = {
                "page_read": {
                    // "l": {
                        // "class": "",
                        // 'event': 'history.back();',
                        // "title": ""
                    // },
                    "c":{
                        'title': '��־����',
                        'event': ''
                    },
                    "r": null
                }
            };
            callback = function(){};
            window.pages = new gmu.Pages({
                el: $('#pages'),
                router: (function(data){
                    var router = {};
                    $.each(data, function(k, v){
                        router[k] = callback;
                    });
                    return router;
                })(tHeadData),
                header: tHeadData,
                active: '#page_read'
            })
        });
    })

	function headReturn(){
		window.history.back();
	}
    //��������
    function loadContent(){
        var q_id = "<?=$dia_id?>";
        $.ajax({
            type: "get",
            url: "/mobile/diary/data.php",
            data:{
                P: "<?=session_id()?>",
                ATYPE: "getDiaryContent",
                Q_ID: q_id
            },
            success: function(data){
                //console.log(data);
                var data = JSON.parse(data);
                var tmpl = $('#diary-detail-tmpl').html();
                var content = $.tpl(tmpl,data);
                $('#page_read').html(content);
                var url = document.location.href,
                    pos = url.indexOf("&") + 6,
                    types = url.substr(pos);
                //������־���۵�����
                if ( types=="other" &&��data.is_comments == 0){
                    $("#commentlist").hide();
                    $('.ui-footer').hide();
                }else{
                    $("#commentlist").show();
                    $('.ui-footer').show();
                }
            },
        })
    }


    //�ύ���ۡ��ظ�����
    $('body').delegate('button','click',function(){
        var $comment = $('#comment').val(),
            $dia_id = $('.ui-article-title').attr('data-id');

        $('button').attr("disabled","disabled");
        //�ύ֮ǰ�ж�
        if( $comment == ""  ){

            $.tips({
                content:'����Ϊ��',
                stayTime:2000,
                type:"error"
            })
            setTimeout(function(){
                $('button').removeAttr("disabled");
            },2000);
        }else{
            //�ظ����������
            if ($('button').hasClass('on')  ){
                //��ȡ�ظ����۵�id
                $('a').each(function(){
                    //�ظ�����
                    if( $(this).hasClass('ui-comment-reply') && $(this).hasClass('on')){
                        $c_id = $(this).attr('data-comment-id');
                        $to_id = $(this).parent().find("p .ui-diary-commenter").attr('data-user-id');
                        var data = {
                            P:"<?=session_id()?>",
                            content: $comment,
                            COMMENT_REPLY: "on",
                            ATYPE: "getDiaryContent",
                            c_id: $c_id,
                            to_id: $to_id
                        };
                        var el=$.loading({
                            content:'������...',
                        });

                        $.ajax({
                            type: "get",
                            url: "/mobile/diary/data.php",
                            data: data,
                            success: function(data){
                                //console.log(data)
                                $.tips({
                                    content:'�ظ��ɹ�',
                                    stayTime:2000,
                                    type:"success"
                                });
                                el.loading("hide");
                                $('#comment').val("");
                                setTimeout(function(){
                                    $('button').removeAttr("disabled");
                                },2000);
                                loadContent();
                                hasSubmit = true;
                            },
                            error:function(){
                                $.tips({
                                    content:'�ظ�ʧ��',
                                    stayTime:2000,
                                    type:"error"
                                })
                            }
                        })

                    }else if( $(this).hasClass('ui-reply-comment') && $(this).hasClass('on')){
                        $c_id = $(this).attr('data-comment-id');
                        $to_id = $(this).parent().find("p .ui-diary-commenter").attr('data-replyer-id');
                        $name = $(this).parent().find("p .ui-diary-commenter").html();
                        var data = {
                            P:"<?=session_id()?>",
                            content: $comment,
                            REPLY: "on",
                            ATYPE: "getDiaryContent",
                            c_id: $c_id,
                            to_id: $to_id
                        };
                        var el=$.loading({
                            content:'������...',
                        });

                        $.ajax({
                            type: "get",
                            url: "/mobile/diary/data.php",
                            data: data,
                            success: function(data){
                                //console.log(data)
                                $.tips({
                                    content:'�ظ��ɹ�',
                                    stayTime:2000,
                                    type:"success"
                                });
                                el.loading("hide");
                                $('#comment').val("");
                                setTimeout(function(){
                                    $('button').removeAttr("disabled");

                                },2000);
                                loadContent();
                                hasSubmit = true;

                            },
                            error:function(){
                                $.tips({
                                    content:'�ظ�ʧ��',
                                    stayTime:2000,
                                    type:"error"
                                })
                            }
                        })
                    }else{
                        return;
                    }
                })

            //�������������
            }else{
                var data = {
                    P:"<?=session_id()?>",
                    Q_ID: $dia_id,
                    content: $comment,
                    COMMENT: "on",
                    ATYPE: "getDiaryContent"
                };

            }

            var el=$.loading({
                content:'������...',
            });

            $.ajax({
                type: "get",
                url: "/mobile/diary/data.php",
                data: data,
                success: function(data){
                    //console.log(data)
                    $.tips({
                        content:'���۳ɹ�',
                        stayTime:2000,
                        type:"success"
                    });
                    el.loading("hide");
                    $('#comment').val("");
                    setTimeout(function(){
                        $('button').removeAttr("disabled");

                    },2000);
                    loadContent();
                    hasSubmit = true;

                },
                error:function(){
                    $.tips({
                        content:'����ʧ��',
                        stayTime:2000,
                        type:"error"
                    })
                }
            })
        }
    })
    //�ظ�����
    $('body').delegate('.ui-comment-reply,.ui-reply-comment','click',function(){

        if ($(this).hasClass('on') ){
            $(this).html("�ظ�").removeClass('on');
            $('button').html("����").removeClass('on');

        }else{
            $('.ui-comment-reply,.ui-reply-comment').html("�ظ�").removeClass("on");
            $(this).html("ȡ��").addClass('on');
            $('#comment').focus();
            var $id = $(this).attr("data-comment-id");
            $('button').html("�ظ�").addClass('on');
        }

    })
    //ɾ������
    /*$('body').delegate('.ui-comment-delete','click',function(){
        var $c_id = $(this).attr("data-comment-id");
        if( $(this).attr("data-reply-id")){
           var $c_id = $(this).attr("data-reply-id");
           var el=$.loading({
                content:'������...',
            });
            $.ajax({
                type: "get",
                url: "/mobile/diary/data.php",
                data: {
                    c_id: $c_id,
                    DEL_COMMENT: "on"
                }
                success: function(data){
                    console.log(data)
                    if ( data== "1" ){
                        $.tips({
                            content:'ɾ���ɹ�',
                            stayTime:2000,
                            type:"success"
                        });
                        el.loading("hide");

                        setTimeout(function(){
                            $('button').removeAttr("disabled");
                            loadContent();
                        },2000);
                        hasSubmit = true;
                    }

                },
                error:function(){
                    $.tips({
                        content:'ɾ��ʧ��',
                        stayTime:2000,
                        type:"error"
                    })
                }
            })

        }else{
            var $r_id = $(this).attr("data-comment-id");
            var el=$.loading({
                content:'������...',
            });

            $.ajax({
                type: "get",
                url: "/mobile/diary/data.php",
                data: {
                    r_id : $r_id,
                    DEL_REPLY: "on"
                }
                success: function(data){
                    //console.log(data)
                    if(data=="1"){
                        $.tips({
                            content:'ɾ���ɹ�',
                            stayTime:2000,
                            type:"success"
                        });
                        el.loading("hide");

                        setTimeout(function(){
                            $('button').removeAttr("disabled");
                            loadContent();
                        },2000);
                        hasSubmit = true;
                    }
                },
                error:function(){
                    $.tips({
                        content:'ɾ��ʧ��',
                        stayTime:2000,
                        type:"error"
                    })
                }
            })
        }
    })*/
</script>
</body>
</html>
