package com.myoa.controller.footprint;

import com.myoa.model.footprint.Foot;
import com.myoa.service.footprint.FootPrintService;
import com.myoa.service.footprint.FootSetSerivce;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.dataSource.ContextHolder;

import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/footprint" })
public class FootPrintController {

	@Resource
	private FootPrintService footPrintService;

	@Resource
	private FootSetSerivce footSetService;

	@ResponseBody
	@RequestMapping({ "/addFootPrint" })
	public ToJson<Foot> addFootPrint(HttpServletRequest request, Foot foot,
			@RequestParam("create_time") Integer createTime,
			@RequestParam("flag") Byte isNew,
			@RequestParam("update_time") Integer updateTime) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		foot.setCreateTime(createTime);
		foot.setIsNew(isNew.byteValue());
		foot.setUpdateTime(updateTime);
		return this.footPrintService.addFootPrint(foot);
	}

	@ResponseBody
	@RequestMapping(value = { "/getFootPrint" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Foot> getFootPrint(HttpServletRequest request, String app,
			Integer uid, String pageNum) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson(0, "");
		try {
			List footList = this.footPrintService.getFootPrint(app, uid,
					pageNum);
			tojson.setMsg("ok");
			tojson.setFlag(0);
			tojson.setObj(footList);
		} catch (Exception e) {
			tojson.setMsg(e.getMessage());
		}
		return tojson;
	}

	@ResponseBody
	@RequestMapping(value = { "/getTheFootPrint" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Foot> getTheFootPrint(HttpServletRequest request, String day,
			Integer uid) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson(0, "");
		try {
			List foot = this.footPrintService.getTheFootPrint(day, uid);
			tojson.setMsg("ok");
			tojson.setFlag(0);
			tojson.setObject(foot);
		} catch (Exception e) {
			tojson.setMsg(e.getMessage());
		}

		return tojson;
	}

	@RequestMapping({ "/getFootUpdateTime" })
	@ResponseBody
	public ToJson<String> getFootUpdateTime(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson(0, "");
		try {
			String time = this.footSetService.getTime();
			tojson.setMsg("ok");
			tojson.setFlag(0);
			tojson.setObject(time);
		} catch (Exception e) {
			tojson.setMsg(e.getMessage());
		}
		return tojson;
	}

	@RequestMapping({ "/editUpdateTime" })
	@ResponseBody
	public ToJson<Object> editUpdateTime(HttpServletRequest request, String time) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson(0, "");
		try {
			this.footSetService.editUpdateTime(time);
			tojson.setMsg("ok");
			tojson.setFlag(0);
		} catch (Exception e) {
			tojson.setMsg(e.getMessage());
		}

		return tojson;
	}

	@RequestMapping({ "/editUpdateTimeByuid" })
	@ResponseBody
	public ToJson<Foot> editUpdateTimeByuid(String time, Integer uid, Integer id) {
		return this.footPrintService.editUpdateTimeByuid(time, uid, id);
	}

	@RequestMapping(value = { "/findByCondition" }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public ToJson<Foot> findByCondition(HttpServletRequest request,
			String condition, String app, String pageNum, Integer uid) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson(0, "");
		try {
			List list = this.footPrintService.findByCondition(condition, app,
					pageNum, uid);
			tojson.setMsg("ok");
			tojson.setFlag(0);
			tojson.setObj(list);
		} catch (Exception e) {
			tojson.setMsg(e.getMessage());
		}
		return tojson;
	}

	@RequestMapping(value = { "/getTheDayFootPrint" }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public ToJson<Foot> getTheDayFootPrint(HttpServletRequest request,
			String day, Integer uid) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson(0, "");
		try {
			List list = this.footPrintService.getTheDayFootPrint(day, uid);
			tojson.setMsg("ok");
			tojson.setFlag(0);
			tojson.setObj(list);
		} catch (Exception e) {
			tojson.setMsg(e.getMessage());
		}
		return tojson;
	}

	@RequestMapping({ "/index" })
	public String getFootPrintList(HttpServletRequest request) {
		return "app/foot/index";
	}

	@RequestMapping({ "/index1" })
	public String getFootPrintList1(HttpServletRequest request) {
		return "app/foot/index1";
	}

	@RequestMapping({ "/index2" })
	public String getFootPrintList2(HttpServletRequest request) {
		return "app/foot/index2";
	}

	@ResponseBody
	@RequestMapping(value = { "/getWebFootPrint" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Foot> getWebFootPrint(
			HttpServletRequest request,
			String app,
			@RequestParam(value = "time", required = false, defaultValue = "") String time,
			@RequestParam(value = "detail", required = false, defaultValue = "0") String detail,
			Integer uid,
			@RequestParam(value = "page", required = false) Integer page,
			@RequestParam(value = "pageSize", required = false) Integer pageSize,
			@RequestParam(value = "useFlag", required = false) Boolean useFlag) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson(0, "");

		return this.footPrintService.getWebFootPrint(app, time, detail, uid,
				page, pageSize, useFlag);
	}
}
