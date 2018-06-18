$(document).ready(function(e) {

    //文凭
    $.ajax({
        url:'/code/getCode',
        type:'get',
        data:{parentNo:'GRADE_TYPE'},
        dataType:'json',
        success:function(reg){
            var datas=reg.obj;
            for (var i=0;i<datas.length;i++){
                if(datas[i].codeOrder==13){
                    var str='<option value="'+datas[i].codeName+'" selected="true">'+datas[i].codeName+'</option>';
                }else{
                    var str='<option value="'+datas[i].codeName+'">'+datas[i].codeName+'</option>';
                }
                $("#grade").append(str);
            }
        }
    })
    //学年
    $.ajax({
        url:'/code/getCode',
        type:'get',
        data:{parentNo:'EDU_YEAR_NO'},
        dataType:'json',
        success:function(reg){
            var datas=reg.obj;
            for (var i=0;i<datas.length;i++){
                if(datas[i].codeOrder==13){
                    var str='<option value="'+datas[i].codeName+'" selected="true">'+datas[i].codeName+'学年</option>';
                }else{
                    var str='<option value="'+datas[i].codeName+'">'+datas[i].codeName+'学年</option>';
                }
                $("#term").append(str);
            }
            fn();
        }
    })


});

function fn() {
    gradeType=$("#grade").find("option:selected").val();
    schoolYear=$("#term").find("option:selected").val();
    schoolTerm=$("#semester").find("option:selected").val();
    first_load(gradeType,schoolYear,schoolTerm);


    $.ajax({
        url: '/eduSchoolCalendar/getYearTerm',
        type: 'get',
        dataType: 'json',
        success: function (obj) {
            var data=obj.object;
            if(obj.flag){
                if(data.schoolTerm==1){
                    $(".info").html(data.schoolYear+"学年第一学期校历");
                }else{
                    $(".info").html(data.schoolYear+"学年第二学期校历");
                }
            }
        }
    })

}

function test_delete(){
	delete_event($("#edit_description").attr("num"))
}
//		//console.log("a")
//首次加载
 function first_load(gradeType,schoolYear,schoolTerm){
	$.ajax({
			url : "/eduSchoolCalendar/selSchoolCalendarByCond",
			type : "post",		
			data: {
                gradeType:gradeType,
				schoolYear:schoolYear,
                schoolTerm:schoolTerm
			},
			dataType : "json",
			success : function (data) {
                $("#year_description").find("textarea").val("");
                $(".school_calendar_tab").Print_SchoolCalendar({BegDate:data.attributes.BEGIN_DATA,EndDate:data.attributes.END_DATA});
                $("#year_description").find("textarea").val(data.attributes.DESCRIPTION)
                School_Calenda.addEvents(data.attributes.list);
            },
			error: function(data){
			}
	});
}

function userDate_Select(){
	$.ajax({
			url : "/eduSchoolCalendar/selSchoolCalendarByCond",
			type : "post",
			data: {
				gradeType: $(".grade").find("option:selected").val(),
                schoolYear:  $(".term").find("option:selected").val(),
                schoolTerm: $(".semester").find("option:selected").val()
			},
			dataType : "json",
			success : function (data) {
                $("#year_description").find("textarea").val("");
                $(".school_calendar_tab").Print_SchoolCalendar({BegDate:data.attributes.BEGIN_DATA,EndDate:data.attributes.END_DATA});
                $("#year_description").find("textarea").val(data.attributes.DESCRIPTION)
                School_Calenda.addEvents(data.attributes.list);
            },
			error: function(data){
			}
	});
}

function save_event(){
	var beD=$("#BegDate").val();
	beD= beD.replace(/\//g, "-");
	var enD=$("#EndDate").val();
	enD= enD.replace(/\//g, "-");
	var tmpd1=new Date(beD);
	var tmpd2=new Date(enD);
	////console.log(tmpd1)
	if(tmpd1>=SchoolCalendarObj.BEGIN_DATA&&tmpd2<=SchoolCalendarObj.END_DATA)
	{
		$.ajax({
				url : "/eduSchoolCalendar/editSchoolCalendar",
				type : "post",		
				data: {
                    schoolYear:$(".term").find("option:selected").val(),
                    schoolTerm:$(".semester").find("option:selected").val(),
                    gradeType:$(".grade").find("option:selected").val(),
					id:$("#edit_description").attr("num"),
					event:$(".SC_event").find("option:checked").val(),
                    holidayNy:$('[name="holiday"]:radio:checked').val(),
                    begenDate:beD,
					endDate:enD,
                    description:$("#edit_description").val()
				},
				dataType : "json",
				success : function(temp){
					var data=temp.object;
        			School_Calenda.clean_Edit_Div();
       				for(var i=0;i<School_Calenda.get_sc_records_length();i++) {
        			    if(School_Calenda.get_sc_records(i).id==data.id&&School_Calenda.get_sc_records(i)!="null") {
              				  var obj=School_Calenda.get_sc_records(i);
							  School_Calenda.removeEventFromCalenda(obj.begenDate,obj.endDate);
							  School_Calenda.del_sc_records(i);
						}
       				 }
      				  School_Calenda.addEventToCalenda(data.begenDate,data.endDate,School_Calenda.get_sc_records_length());
      				  School_Calenda.add_sc_records(data);
      				  School_Calenda.findThisMonthEvent();
  				},
				error: function(data){

					
				}
		});	
	}

}
//删除
function delete_event(id){
	var Del_ID=id;
	$.ajax({
			url : "/eduSchoolCalendar/delSchoolCalendarById",
			type : "post",		
			data: { 
				id:	id
			},
			dataType : "json",
			success : function (data){
                if(data.flag) {
                    for(var i=0;i<School_Calenda.get_sc_records_length();i++) {
                        if(School_Calenda.get_sc_records(i).id==Del_ID&&School_Calenda.get_sc_records(i)!="null") {
                            var obj=School_Calenda.get_sc_records(i);
                            School_Calenda.removeEventFromCalenda(obj.begenDate,obj.endDate);
                            School_Calenda.del_sc_records(i);
                        }
                    }
                }
                School_Calenda.findThisMonthEvent();
            },
			error: function(data){

			}
	});
}
// 通过按钮编辑
function editEventByBtn(el){
	School_Calenda.addEventToEdit_Div(School_Calenda.get_sc_records($(el).parent().attr("eindex")));
}
//通过按钮删除
function delEventByBtn(el){
	var tmp=confirm("确认删除事件!");
    // $.layerConfirm({title:'删除电子校历',content:'确定要删除吗！',icon:0},function(){
     //    delete_event($(el).parent().attr("eid"));
    // })
	if (tmp==true)
	{	
	 delete_event($(el).parent().attr("eid"));
	}
}
//点击学年描述 允许更改
function allowY_Desp(){
	document.getElementById("YearDescription").readOnly=false;
	$("#YearDescription").css("cursor","text");
}
//保存学年描述更改
function saveY_Desp(){
	document.getElementById("YearDescription").readOnly=true;
	$("#YearDescription").css("cursor","default");
	$.ajax({
			url : "/eduSchoolCalendar/editSCDesc",
			type : "post",		
			data: {
                schoolYear:$(".term").find("option:selected").val(),
                schoolTerm:$(".semester").find("option:selected").val(),
                gradeType:$(".grade").find("option:selected").val(),
                description:$("#year_description").find("textarea").val()
			},
			dataType : "json",
			success : function (data){
                document.getElementById("YearDescription").readOnly=true;
                $("#YearDescription").css("cursor","default");
                $("#year_description").find("textarea").val();//这里加值
            },
			error: function(data){
				document.getElementById("YearDescription").readOnly=false;
				$("#YearDescription").css("cursor","text");
			}
	});
}





var str1="(";
var str2=")";
School_Calenda={};
(function($){
	var el;
	sc_records=new Array();
	SchoolCalendarObj=new Object();
	
//--自动翻页
	School_Calenda.pagebtn_out=function(){
		SchoolCalendarObj.sta=0;
	}
	School_Calenda.aotu_page_up=function(){
		
		if(SchoolCalendarObj.showDate>SchoolCalendarObj.BEGIN_DATA&&SchoolCalendarObj.sta==0)
		{
			SchoolCalendarObj.sta=1;
			var d=SchoolCalendarObj.showDate;
			if(d.getMonth()==0)
			{
				d.setFullYear(d.getFullYear()-1);
				d.setMonth(11);
			}
			else
			{
				d.setMonth(d.getMonth()-1);
			}
			////console.log(d)
			
			School_Calenda.Move_Calendar_Top(d);
			
		}
		
	}
	
	School_Calenda.aotu_page_down=function(){
		var end=SchoolCalendarObj.END_DATA;
		end.setDate(1);
		if(SchoolCalendarObj.showDate<end&&SchoolCalendarObj.sta==0)
		{
			////console.log(end)
			SchoolCalendarObj.sta=1;
			var d=SchoolCalendarObj.showDate;
			if(d.getMonth()==11)
			{
				d.setFullYear(d.getFullYear()+1);
				d.setMonth(0);
			}
			else
			{
				d.setMonth(d.getMonth()+1);
			}
			////console.log(d)
			
			School_Calenda.Move_Calendar_Top(d);
			
		}		
	}
	
	
//-------------------------------
//查找某月事件

	School_Calenda.findThisMonthEvent=function(){
		
		$("#month_event_tb").find("tr:gt(0)").remove();
		var sd=new Date(SchoolCalendarObj.showDate)
		var y=sd.getFullYear()
		var m=sd.getMonth();
		
		$(sc_records).each(function(index, element) {
			
			if(typeof(element)=="object")
			{
				element.begenDate= element.begenDate.replace(/-/g, "/");
				element.endDate= element.endDate.replace(/-/g, "/");
				
				var tmp=new Date(element.begenDate)
				
				if(tmp.getFullYear()==y&&tmp.getMonth()==m)
				
				{	
					School_Calenda.addEventToThisMonthEvent(element,index)
				}
			}
        });
		
	}
	School_Calenda.addEventToThisMonthEvent=function(obj,index){

		var _event;
		var holiday;
		var time;
		var BeD=new Date(obj.begenDate);
		var EnD=new Date(obj.endDate);

		if(obj.event=='0')
			_event="事件";
		else
			_event="节日";
		if(obj.holidayNy=='1')
			holiday="是";
		else
			holiday="否";
		var time=(Number(BeD.getMonth())+1)+"."+BeD.getDate()+"-"+(Number(EnD.getMonth())+1)+"."+EnD.getDate()
		var html='<tr><td>'+_event+'</td><td>'+holiday+'</td><td>'+time+'</td><td>'+obj.description+'</td><td  eindex="'+index+'" eid="'+obj.id+'"><font class="edit_btn" onClick="editEventByBtn(this)">编辑</font>&nbsp;<font class="del_btn" onClick="delEventByBtn(this)">删除</font></td></tr>  '
		
		$("#month_event_tb").append(html);	
	}
//校历翻页
	School_Calenda.move_calendar=function(){
		
		var d2=$("#calendar_select_month").find("option:selected").val()+"-"+"01";
	
		d2 = d2.replace(/-/g, "/"); 
	
		d2 = new Date(d2);

		School_Calenda.Move_Calendar_Top(d2);
	}
	School_Calenda.Move_Calendar_Top=function(d){
		
		$(".school_calendar_tab_div").stop(false,true);
		
		var d3=d-new Date(SchoolCalendarObj.showDate);

		if (d3<0)
		
			d3=-d3;
		 
		var time=(Math.ceil(d3/(3600*24*31*1000)))*80+200;
		
		var top=-$(".school_calendar_tab").find("td[year='"+d.getFullYear()+"'][month='"+(d.getMonth()+1)+"'][day='1']").parent().index()*40;
		
		$(".school_calendar_tab_div").animate({top:top},time,function(){
			SchoolCalendarObj.sta=1;
			SchoolCalendarObj.showDate=d;		
			School_Calenda.findThisMonthEvent();				
			var _d=d.getMonth()+1;
			if(_d<10)
				_d="0"+_d;			
			var md=d.getFullYear()+"-"+_d;
			$("#calendar_select_month").find("option[value="+md+"]").attr("selected",true);			
			////console.log(md)			
		});	

	}
//点击选择事件	
	School_Calenda.UserSelectEvent=function(ele){
		if($(this).attr("class").indexOf("static_")>=0)
		{
			School_Calenda.addEventToEdit_Div(sc_records[$(this).attr('num')])
		}
	}
//将某一事件的详细信息添加到编辑窗
	School_Calenda.addEventToEdit_Div=function(arg){
		$("#BegDate").val(arg.begenDate);
		$("#EndDate").val(arg.endDate);
		if(arg.holidayNy=="1")
			document.getElementById('holidayY').checked=true;
		else
			document.getElementById('holidayN').checked=true;
		if(arg.event=="0") {
            $(".SC_event").find("option[value='0']").attr("selected", true)
            $(".SC_event").find("option[value='1']").attr("selected", false)
        }else {
            $(".SC_event").find("option[value='1']").attr("selected", true)
            $(".SC_event").find("option[value='0']").attr("selected", false)
        }
		$("#edit_description").val(arg.description);
		$("#edit_description").attr("num",arg.id);
	}
//清空编辑窗口内容
	School_Calenda.clean_Edit_Div=function(){
		$("#BegDate").val("");
		$("#EndDate").val("");
		$("#edit_description").val("");
		$("#edit_description").attr("num","");	
		$(".SC_event").find("option[value='0']").attr("selected",true)
	}
//向校历中添加全部事件
	School_Calenda.addEvents=function(arr){
		sc_records.length=0;
		$(arr).each(function(index, element) {
				sc_records[index]=element
		});
		$(el).find("td:has(div)").removeClass("tb_BGi tb_BGL tb_BGR tb_BG1");
		$(sc_records).each(function(index, element) {
            School_Calenda.addEventToCalenda(element.begenDate,element.endDate,index);
        });
		School_Calenda.findThisMonthEvent();
	}
//向日历中添加一条已知事件
	School_Calenda.addEventToCalenda=function(d1,d2,num){
		var d1=School_Calenda.StrToDate(d1);
		var d2=School_Calenda.StrToDate(d2);
		var d0=SchoolCalendarObj.FirstDay;
		var _d=School_Calenda.getDaysBetweenTwoDay(d1,d2);
		if(_d==0)
		{
			$(el).find('td:has(div):eq'+str1+School_Calenda.getDaysBetweenTwoDay(d1,d0)+str2).addClass("static_tb_BG1");
			$(el).find('td:has(div):eq'+str1+School_Calenda.getDaysBetweenTwoDay(d1,d0)+str2).attr("num",num)
		}
		else
		{
			$(el).find("td:has(div):eq"+str1+School_Calenda.getDaysBetweenTwoDay(d1,d0)+str2).addClass("static_tb_BGL");
			$(el).find("td:has(div):gt"+str1+School_Calenda.getDaysBetweenTwoDay(d1,d0)+str2+":lt"+str1+(_d-1)+str2).addClass("static_tb_BGi");
			$(el).find("td:has(div):eq"+str1+School_Calenda.getDaysBetweenTwoDay(d0,d2)+str2).addClass("static_tb_BGR");
			if(School_Calenda.getDaysBetweenTwoDay(d1,d0)==0)
			{
				$(el).find("td:has(div):eq"+str1+School_Calenda.getDaysBetweenTwoDay(d1,d0)+str2).attr("num",num)
				$(el).find("td:has(div):gt"+str1+(School_Calenda.getDaysBetweenTwoDay(d1,d0))+str2+":lt"+str1+(_d)+str2).attr("num",num)
			}
			else
			$(el).find("td:has(div):gt"+str1+(School_Calenda.getDaysBetweenTwoDay(d1,d0)-1)+str2+":lt"+str1+(_d+1)+str2).attr("num",num)
		}
		
	}
	
//从日历中移除某事件
	School_Calenda.removeEventFromCalenda=function(d1,d2){
		var d1=School_Calenda.StrToDate(d1);
		var d2=School_Calenda.StrToDate(d2);
		var d0=SchoolCalendarObj.FirstDay;
		var _d=School_Calenda.getDaysBetweenTwoDay(d1,d2);
		if(School_Calenda.getDaysBetweenTwoDay(d1,d0)==0)
		{
			$(el).find("td:has(div):eq"+str1+School_Calenda.getDaysBetweenTwoDay(d1,d0)+str2).attr("num","")
			$(el).find("td:has(div):eq"+str1+School_Calenda.getDaysBetweenTwoDay(d1,d0)+str2).removeClass("static_tb_BGi static_tb_BGL static_tb_BGR static_tb_BG1 tb_BG1");
			$(el).find("td:has(div):gt"+str1+(School_Calenda.getDaysBetweenTwoDay(d1,d0))+str2+":lt"+str1+(_d)+str2).attr("num","")
			$(el).find("td:has(div):gt"+str1+(School_Calenda.getDaysBetweenTwoDay(d1,d0))+str2+":lt"+str1+(_d)+str2).removeClass("static_tb_BGi static_tb_BGL static_tb_BGR static_tb_BG1 tb_BG1");
		}
		else
		{
			$(el).find("td:has(div):gt"+str1+(School_Calenda.getDaysBetweenTwoDay(d1,d0)-1)+str2+":lt"+str1+(_d+1)+str2).attr("num","")
			$(el).find("td:has(div):gt"+str1+(School_Calenda.getDaysBetweenTwoDay(d1,d0)-1)+str2+":lt"+str1+(_d+1)+str2).removeClass("static_tb_BGi static_tb_BGL static_tb_BGR static_tb_BG1 tb_BG1");
		}
	}	
//---字符串转Date对象
	School_Calenda.StrToDate=function(d){

		d = new Date(d.replace(/-/g, "/")); 
		
		return d;
		
	}

	School_Calenda.mouse_over_show_description=function(el){

		if($(el).attr("num")!="")
		{
			if($("#sc_description").attr('num')!=$(el).attr("num"))
			{
				$("#sc_description").attr('num',$(el).attr("num"));
				$("#sc_description").text(sc_records[$(el).attr("num")].description)
				
			}
			
		}
		else
		{
			$("#sc_description").text("");
			$("#sc_description").attr("num","")
		}
	}

	School_Calenda.add_noselect_class=function(){
		$(el).find("td:has(div):lt"+str1+SchoolCalendarObj.gtPoint+str2).addClass("tb_noselect");
		$(el).find("td:has(div):gt"+str1+(SchoolCalendarObj.gtPoint+SchoolCalendarObj.long)+str2).addClass("tb_noselect");
	}




//鼠标按下事件	
	School_Calenda.add_down_event=function(){
		////console.log($(el).find("td:has(div):gt("+(SchoolCalendarObj.gtPoint)+"):lt("+(SchoolCalendarObj.long)+")"))
		if(SchoolCalendarObj.gtPoint==0)
			$(el).find("td:has(div):lt"+str1+(SchoolCalendarObj.long+1)+str2).mousedown(School_Calenda.User_Choice)
		else
		$(el).find("td:has(div):gt"+str1+(SchoolCalendarObj.gtPoint-1)+str2+":lt"+str1+(SchoolCalendarObj.long+1)+str2).mousedown(School_Calenda.User_Choice);//绑定鼠标按下事件

		$(el).find("td:has(div)").mouseup(function(){ //鼠标抬起 解除绑定事件
			
			$(el).find("td:has(div)").unbind("mouseenter",change_BG);
					SchoolCalendarObj.sta=1;
		////console.log(SchoolCalendarObj.sta)	
		})
		
	};
	
//按下鼠标后执行	
	School_Calenda.User_Choice=function(){
		SchoolCalendarObj.sta=0;
		////console.log(SchoolCalendarObj.sta)
		////console.log(SchoolCalendarObj.gtPoint)
		School_Calenda.clean_Edit_Div();
		
		var tmp=typeof($(this).attr("class"));
		
		$(el).find("td:has(div)").removeClass("tb_BGi tb_BGL tb_BGR tb_BG1");	
			
		School_Calenda.add_enter_event();
		
		SchoolCalendarObj.user_BDate=School_Calenda.get_TD_index(this);
		
		$(el).find("td:has(div):eq"+str1+SchoolCalendarObj.user_BDate+str2).addClass("tb_BG1");
		
		$("#BegDate ,#EndDate").val(function(){ 
			
			return School_Calenda.get_YMD(SchoolCalendarObj.user_BDate);
			
		});	

		if ($(this).attr("class").indexOf("static_")>=0)
		{	
			School_Calenda.addEventToEdit_Div(sc_records[$(this).attr('num')]);				
		}
	}
	
//每个日期鼠标进入事件	
	School_Calenda.add_enter_event=function(){
		if(SchoolCalendarObj.gtPoint==0)
			$(el).find("td:has(div):lt"+str1+(SchoolCalendarObj.long+1)+str2).mouseenter(change_BG);
		else
		$(el).find("td:has(div):gt"+str1+(SchoolCalendarObj.gtPoint-1)+str2+":lt"+str1+(SchoolCalendarObj.long+1)+str2).mouseenter(change_BG);
		

	};
	function change_BG(){
			
		School_Calenda.change_BG(School_Calenda.get_TD_index(this))//根据index改变颜色
			
	}
	
//--选择变色
	School_Calenda.change_BG=function(index){
		
		SchoolCalendarObj.user_EDate=index;
		
		if(index>SchoolCalendarObj.user_BDate)
		{
			var m=$(el).find("td:has(div):gt"+str1+(SchoolCalendarObj.user_BDate)+str2+":lt"+str1+(index-SchoolCalendarObj.user_BDate+1)+str2+"[class^='static_']");
			var l=$(el).find("td:has(div)").index(m);
			if(l!=-1)
			{
				$(el).find("td:has(div)").unbind("mouseenter",change_BG);
				
				index=l-1;
				
				SchoolCalendarObj.user_EDate=l-1;
			}
			
			$(el).find("td:has(div)").removeClass("tb_BGi tb_BGL tb_BGR tb_BG1");
			
			$(el).find("td:has(div):eq"+str1+SchoolCalendarObj.user_BDate+str2).addClass("tb_BGL");
			
			$(el).find("td:has(div):eq"+str1+index+str2).addClass("tb_BGR");
			
			$(el).find("td:has(div):gt"+str1+SchoolCalendarObj.user_BDate+str2+":lt"+str1+(index-SchoolCalendarObj.user_BDate-1)+str2).addClass("tb_BGi");
			
			$("#BegDate").val(function(){ 
			
				return School_Calenda.get_YMD(SchoolCalendarObj.user_BDate);
			
			});	
			$("#EndDate").val(function(){ 
			
				return School_Calenda.get_YMD(SchoolCalendarObj.user_EDate);
			
			});				
			
		}
		
		
		if(index<SchoolCalendarObj.user_BDate)
		{
			var m=$(el).find("td:has(div):gt"+str1+(index-1)+str2+":lt"+str1+(SchoolCalendarObj.user_BDate-index+1)+str2+"[class='static_tb_BGR']");
			var l=$(el).find("td:has(div)").index(m);
			if(l!=-1)
			{
				$(el).find("td:has(div)").unbind("mouseenter",change_BG);
				
				index=l+1;
				
				SchoolCalendarObj.user_EDate=l+1;
			}			
			
			
			$(el).find("td:has(div)").removeClass("tb_BGi tb_BGL tb_BGR tb_BG1");
			
			$(el).find("td:has(div):eq"+str1+SchoolCalendarObj.user_BDate+str2).addClass("tb_BGR");
			
			$(el).find("td:has(div):eq"+str1+index+str2).addClass("tb_BGL");
			
			$(el).find("td:has(div):gt"+str1+index+str2+":lt"+str1+(SchoolCalendarObj.user_BDate-index-1)+str2).addClass("tb_BGi");
			
			$("#EndDate").val(function(){ 
			
				return School_Calenda.get_YMD(SchoolCalendarObj.user_BDate);
			
			});	
			$("#BegDate").val(function(){ 
			
				return School_Calenda.get_YMD(SchoolCalendarObj.user_EDate);
			
			});			
		}
		
		
		if(index==SchoolCalendarObj.user_BDate)
		{
			$(el).find("td:has(div)").removeClass("tb_BGi tb_BGL tb_BGR tb_BG1");
			$(el).find("td:has(div):eq"+str1+SchoolCalendarObj.user_BDate+str2).addClass("tb_BG1");
			$("#BegDate ,#EndDate").val(function(){ 
			
				return School_Calenda.get_YMD(SchoolCalendarObj.user_BDate);
			
			});
		}
	}
	
//外部获取School_Calenda属性值
	School_Calenda.get_TD_index=function(el){
		
		return $(el).index("td:has(div)");
		
	};
//外部设置School_Calenda属性值
	School_Calenda.get_YMD=function(index){
		
		var obj=$(el).find("td:has(div):eq"+str1+index+str2);
		
		return $(obj).attr("year")+"-"+$(obj).attr("month")+"-"+$(obj).attr("day");
	};
	
//计算俩日期间相差几天
	School_Calenda.getDaysBetweenTwoDay=function(d1,d2){
		var tmp= Math.ceil((d2-d1)/(3600000*24));
		if(tmp<0)
			return -tmp
		else
			return tmp		
	}
	
//--打印日历
	$.fn.Print_SchoolCalendar=function(arg){
		
		el=$(this);
		
		$(el).empty();
		
		var d1 = arg.BegDate.replace(/-/g, "/"); 
		
		var d2 = arg.EndDate.replace(/-/g, "/");
		 
		d1 = new Date(d1);
		
		d2 = new Date(d2);
		
		SchoolCalendarObj.long=School_Calenda.getDaysBetweenTwoDay(d1,d2);
		
		var tmp_first=new Date(d1.getFullYear()+"/"+(Number(d1.getMonth())+1)+"/"+"01");
		////console.log(tmp_first)
		////console.log(d1)
		////console.log(School_Calenda.getDaysBetweenTwoDay(tmp_first,d1))
		SchoolCalendarObj.gtPoint=School_Calenda.getDaysBetweenTwoDay(tmp_first,d1)
		
		var html='<tr><td></td>'+get_Blank_Html(FirstDayOfMonth_Week(d1.getFullYear(),d1.getMonth()+1));

		var i=FirstDayOfMonth_Week(d1.getFullYear(),d1.getMonth()+1);

		var state=0;
		for(var y=d1.getFullYear();y<=d2.getFullYear();y++)
		{	
			
			for(var m=d1.getMonth()+1;(m<=d2.getMonth()+1)&&(y==d2.getFullYear())||y<d2.getFullYear();m++)
			{
							
				for(var d=1;d<=DaysOfMonth(y,m);d++)
				{	
					if(i==0&&state==1)
					{
						
						html+='<tr><td class="Cl_Week"></td>';
						
					}
					
					i++;
					
					state=1;	
						
					html+='<td year="'+y+'"month="'+m+'" day="'+d+'"  num=""  week="'+i+'"><div class="tb_BG">'+d+'</div</td>';
					
					if(i==7)
					{	
					
						html+='</tr>';
						
						i=0;
						
					}
					
				}//日循环
				
				if(m==12)
				{
					m=0;
					y++;
				}
				
				
			}//月循环
			
		}//年循环
		$(el).append(html);
		
		School_Calenda.add_down_event();	
			
		var showDate=d1.getFullYear()+"/"+(d1.getMonth()+1)+"/01";	
		showDate=new Date(showDate)
		School_Calenda.setSchoolCalendarObjVal("BEGIN_DATA",d1);
		
		School_Calenda.setSchoolCalendarObjVal("END_DATA",d2);
		
		School_Calenda.setSchoolCalendarObjVal("showDate",showDate);
		
		School_Calenda.setSchoolCalendarObjVal("FirstDay",showDate);
		
		$(el).find("td:has(div)").mouseenter(function(){
			
			School_Calenda.mouse_over_show_description(this);
			
		})
	
		pringWeek_Time(d1,d2);
		Print_Select_Month(d1,d2);	
		SchoolCalendarObj.sta=1;
/*			$(el).mousemove(function(){
			//$("#sc_description").css({top:School_Calenda.mousePos(event).y+20,left:School_Calenda.mousePos(event).x});
			
		if(School_Calenda.mousePos(event).x<160&&School_Calenda.mousePos(event).y<165&&SchoolCalendarObj.sta==0)
			{
				//console.log("过界了")
				SchoolCalendarObj.sta=1;
				t0=setTimeout(School_Calenda.aotu_page_up,300);
			}*/
/*			else if(School_Calenda.mousePos(event).x>550&&School_Calenda.mousePos(event).y>360&&SchoolCalendarObj.sta==0)
			{
				SchoolCalendarObj.sta=1;
				t0=setTimeout(School_Calenda.aotu_page_down,300);
			}*/
/*			else
			{
				SchoolCalendarObj.sta=0;
				clearTimeout(t0)
			}
				
		})*/
		
		School_Calenda.add_noselect_class();

	}
	
	var Print_Select_Month=function(d1,d2){
		$("#calendar_select_month").empty();
		var tmp=Calculating_Two_Months(d1.getFullYear(),d2.getFullYear(),d1.getMonth(),d2.getMonth())+1;
		
		var y=d1.getFullYear();
		var m=d1.getMonth()+1;

        var date=new Date;
        var year=date.getFullYear();
        var month=date.getMonth()+1;

		for(var i=0;i<tmp;i++)
		{			
			if(m<10)
				M0="0"+m;
			else
				M0=m
			if((year+'-'+month)==(y+'-'+M0)){
                var html='<option value="'+y+'-'+M0+'"  selected = "selected">'+y+'年'+M0+'月</option>';
			}else {
                var html='<option value="'+y+'-'+M0+'">'+y+'年'+M0+'月</option>';
			}
			$("#calendar_select_month").append(html)
			if(m==12){y++;m=0;}
			m++
		}
	}
	
	var pringWeek_Time = function(d1,d2){/*打印周次*/

		var tb_index1=$(".school_calendar_tab").find("td[month='"+(d1.getMonth()+1)+"'][day='"+d1.getDate()+"']").parent().index();

		var tb_index2=$(".school_calendar_tab").find("td[month='"+(d2.getMonth()+1)+"'][day='"+d2.getDate()+"']").parent().index();

		for(var i=1;i<(tb_index2-tb_index1+2);i++)
		{
			$(".school_calendar_tab").find("tr:eq"+str1+(tb_index1+i-1)+str2).find("td:eq(0)").text("第"+i+"周");
		}
		
	}
//----每月开头空行
	var get_Blank_Html = function(num){
		
		var html="";
		
		for(var i=0;i<num;i++)
		
		{
			
			html+="<td>&nbsp;</td>"
			
		}
		
		return html;
		
	}			
						
//--计算月份差
    var Calculating_Two_Months = function(y1,y2,m1,m2)
	{
		
		return len=(y2-y1)*12+(m2-m1);  

	}
//---判断某月第一天是星期几  参数 year：年 month：月
	var FirstDayOfMonth_Week=function(year,month)
	
	{

		var days=totalDays(year,month);
		
		var tmp=days%7-1;
		
		if (tmp==-1)
		
			tmp=6;
			
		return tmp;

	}	
	
	
//---计算总天数 参数 year：年  month:月
	var totalDays=function(year,month)
	{

		var days=Days_FirstDayOfYear(year);

		for(var i=1;i<month;i++)
		
		{
		
			  days+=DaysOfMonth(year,i);
		
		}
		
		return days;

	}
	
//---计算某年第一天之前有多少天 参数：year（年份）
	var Days_FirstDayOfYear=function(year)
	{
	
		var days=365*year;

		for(var i=1;i<year;i++)
				
		{
		
			  days+=isLeapYear(i);
		
		}

		return days;

	}
	
	
//--判断是否是闰年  参数：year（年份）
	var isLeapYear=function(year) 
	{

		return ((year%4==0 && year%100!=0) ||year%400==0)?1:0;
		
	}
	
	
//--计算某个月一共有多少天 参数：year: 年 
	var DaysOfMonth=function(year,month)
	{

		var arr=[31,28,31,30,31,30,31,31,30,31,30,31];
		
		if(year!=2&&isLeapYear(year)==0)	
			 
			return arr[month-1];
	
		else 
		
			return arr[month-1]+1;

	}
	
	
//--获取当前日期-- 返回值  Y：年  M:月  D：日   W：星期（中文） indexOfWeek：星期索引值
	// H:时  m：分  s：秒  stringTime：日期字符串
	var getNowDate =function()
	{
	
		var now=new Date();
	
		var year=now.getFullYear();
		
		var month=now.getMonth()+1;
		
		var day=now.getDate();
		
		var week=now.getDay()
		
		var ArrayOfWeek=["日","一","二","三","四","五","六",];
		
		var hours=now.getHours();
		
		var minutes=now.getMinutes();
		
		var second=now.getSeconds();
		
		var StringTime=now.toLocaleString();
		
		return{
				
			Y:year,
			
			M:month,
			
			D:day,
			
			W:ArrayOfWeek[week],
			
			indexOfWeek:week,
			
			H:hours,
			
			m:minutes,
			
			s:second,
			
			stringTime:StringTime
			
		}
		
	}	
	
	//获取SchoolCalendarObj的值
	School_Calenda.getSchoolCalendarObjVal=function(key){
		return SchoolCalendarObj[key]
	}
	
	//设置SchoolCalendarObj的值
	School_Calenda.setSchoolCalendarObjVal=function(key,val){
		SchoolCalendarObj[key]=val;
		return SchoolCalendarObj[key]
	}
	School_Calenda.get_sc_records=function(index){
		var obj
		if(typeof(sc_records[index])=="object")
			obj=sc_records[index]
		else obj="null";
		return obj;
	}
	School_Calenda.del_sc_records=function(index){
		delete  sc_records[index];
	}
	School_Calenda.get_sc_records_length=function(){
		var l=sc_records.length
		return l;
	}
	School_Calenda.add_sc_records=function(obj){
		sc_records.push(obj);
		var l=sc_records.length	
		return l;
	}
	
	School_Calenda.mousePos=function(e){
		var x,y;
		var e = e||window.event;
		return {
			x:e.clientX+document.body.scrollLeft+document.documentElement.scrollLeft,
			y:e.clientY+document.body.scrollTop+document.documentElement.scrollTop
		};
	};

})(jQuery)