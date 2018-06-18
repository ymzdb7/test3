package com.myoa.controller.meeting;

import com.myoa.model.meet.MeetingEquuipment;
import com.myoa.service.meeting.MeetEquuipmentService;
import com.myoa.util.ToJson;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/Meetequipment" })
public class MeetequipmentController {

	@Resource
	private MeetEquuipmentService meetEquuipmentService;

	@RequestMapping({ "/getAllEquiet" })
	@ResponseBody
	public ToJson<MeetingEquuipment> getAllEquiet(Integer page,
			Integer pageSize, boolean useFlag) {
		return this.meetEquuipmentService.getAllEquip(page, pageSize, useFlag);
	}

	@RequestMapping({ "/getdetailEquiet" })
	@ResponseBody
	public ToJson<MeetingEquuipment> getdetailEquiet(String Sid) {
		return this.meetEquuipmentService.getdetailEquiet(Sid);
	}

	@RequestMapping({ "/updateEquiet" })
	@ResponseBody
	public ToJson<Object> updateEquiet(MeetingEquuipment meetingEquuipment) {
		return this.meetEquuipmentService.updateEquiet(meetingEquuipment);
	}

	@RequestMapping({ "/deleteEquiets" })
	@ResponseBody
	public ToJson<Object> deleteEquiets(String Sids) {
		return this.meetEquuipmentService.deleteEquiets(Sids);
	}

	@RequestMapping({ "/addEquiets" })
	@ResponseBody
	public ToJson<Object> addEquiet(MeetingEquuipment meetingEquuipment) {
		return this.meetEquuipmentService.addEquiet(meetingEquuipment);
	}
}
