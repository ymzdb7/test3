package com.myoa.controller.rms.rollRoom;

import com.myoa.model.rms.RmsRollRoom;
import com.myoa.service.rms.RmsRollRoomService;
import com.myoa.util.ToJson;
import com.myoa.util.page.PageParams;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/rmsRollRoom" })
public class RmsRollRoomController {

	@Autowired
	private RmsRollRoomService rmsRollRoomService;

	@RequestMapping({ "/manage" })
	public String toManage() {
		return "/app/rms/rollRoom/manage";
	}

	@ResponseBody
	@RequestMapping({ "/save" })
	public ToJson<RmsRollRoom> save(RmsRollRoom rmsRollRoom,
			HttpServletRequest request) {
		return this.rmsRollRoomService.save(rmsRollRoom, request);
	}

	@ResponseBody
	@RequestMapping({ "/selectById" })
	public ToJson<RmsRollRoom> selectById(Integer roomId) {
		return this.rmsRollRoomService.selectById(roomId);
	}

	@ResponseBody
	@RequestMapping({ "/update" })
	public ToJson<RmsRollRoom> update(RmsRollRoom rmsRollRoom,
			HttpServletRequest request) {
		return this.rmsRollRoomService.update(rmsRollRoom, request);
	}

	@ResponseBody
	@RequestMapping({ "/delete" })
	public ToJson<RmsRollRoom> delete(RmsRollRoom rmsRollRoom,
			HttpServletRequest request) {
		return this.rmsRollRoomService.delete(rmsRollRoom, request);
	}

	@ResponseBody
	@RequestMapping({ "/query" })
	public ToJson<RmsRollRoom> query(RmsRollRoom rmsRollRoom,
			PageParams pageParams) {
		return this.rmsRollRoomService.query(rmsRollRoom, pageParams);
	}

	@ResponseBody
	@RequestMapping({ "/selectAll" })
	public ToJson<RmsRollRoom> selectAll() {
		return this.rmsRollRoomService.selectAll();
	}
}
