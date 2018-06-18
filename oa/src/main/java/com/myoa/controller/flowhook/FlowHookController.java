package com.myoa.controller.flowhook;

import com.myoa.model.workflow.FlowHookWithBLOBs;
import com.myoa.service.flowhook.FlowHookService;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.dataSource.ContextHolder;

import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/flowhook" })
public class FlowHookController {

	@Resource
	FlowHookService flowHookService;

	@RequestMapping({ "/saveHook" })
	@ResponseBody
	public ToJson<FlowHookWithBLOBs> saveHook(
			FlowHookWithBLOBs flowHookWithBLOBs, HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson();
		try {
			FlowHookWithBLOBs flowHookWithBLOBs1 = this.flowHookService
					.selectByOrderId(flowHookWithBLOBs);
			int result = 0;
			FlowHookWithBLOBs flowHookWithBLOBs3 = this.flowHookService
					.selectByName(flowHookWithBLOBs);
			if ((flowHookWithBLOBs3 != null)
					&& (flowHookWithBLOBs.getHname().equals(flowHookWithBLOBs3
							.getHname()))) {
				tojson.setMsg("保存失败，存在相同的名称!");
				tojson.setFlag(1);
			} else if (flowHookWithBLOBs1 != null) {
				tojson.setMsg("保存失败，存在相同的排序号!");
				tojson.setFlag(1);
			} else {
				result = this.flowHookService.saveHook(flowHookWithBLOBs);
				if (result == 1) {
					tojson.setMsg("保存成功");
					tojson.setFlag(0);
				} else {
					tojson.setMsg("保存失败");
					tojson.setFlag(1);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			tojson.setMsg("保存失败");
			tojson.setFlag(1);
		}

		return tojson;
	}

	@RequestMapping({ "/deleteHook" })
	@ResponseBody
	public ToJson<FlowHookWithBLOBs> deleteHook(
			FlowHookWithBLOBs flowHookWithBLOBs, HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson();
		try {
			int result = this.flowHookService.deleteHook(flowHookWithBLOBs);
			if (result == 1) {
				tojson.setMsg("删除成功");
				tojson.setFlag(0);
			} else {
				tojson.setMsg("删除失败");
				tojson.setFlag(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
			tojson.setMsg("删除失败");
			tojson.setFlag(1);
		}

		return tojson;
	}

	@RequestMapping({ "/updateHook" })
	@ResponseBody
	public ToJson<FlowHookWithBLOBs> updateHook(
			FlowHookWithBLOBs flowHookWithBLOBs, HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson();
		try {
			FlowHookWithBLOBs flowHookWithBLOBs2 = this.flowHookService
					.selectByOrderId(flowHookWithBLOBs);
			FlowHookWithBLOBs flowHookWithBLOBs3 = this.flowHookService
					.selectByName(flowHookWithBLOBs);
			if ((flowHookWithBLOBs3 != null)
					&& (!flowHookWithBLOBs.getOrderId().equals(
							flowHookWithBLOBs3.getOrderId()))) {
				tojson.setMsg("修改失败，存在相同的名称");
				tojson.setFlag(1);
			} else if ((flowHookWithBLOBs2 != null)
					&& (!flowHookWithBLOBs.getOrderId().equals(
							flowHookWithBLOBs2.getOrderId()))) {
				tojson.setMsg("修改失败，存在相同的排序号");
				tojson.setFlag(1);
			} else {
				FlowHookWithBLOBs flowHookWithBLOBs1 = this.flowHookService
						.selectByOrderId(flowHookWithBLOBs);
				if (flowHookWithBLOBs1 != null) {
					int result = this.flowHookService
							.updateHook(flowHookWithBLOBs);
					if (result == 1) {
						tojson.setMsg("修改成功");
						tojson.setFlag(0);
					} else {
						tojson.setMsg("修改失败");
						tojson.setFlag(1);
					}
				} else {
					tojson.setMsg("修改失败，数据不存在");
					tojson.setFlag(1);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return tojson;
	}

	@RequestMapping({ "/getHookById" })
	@ResponseBody
	public ToJson<FlowHookWithBLOBs> getRuleById(
			FlowHookWithBLOBs flowHookWithBLOBs, HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson();
		try {
			FlowHookWithBLOBs result = this.flowHookService
					.getHookById(flowHookWithBLOBs);
			tojson.setObject(result);
			tojson.setMsg("ok");
			tojson.setFlag(0);
		} catch (Exception e) {
			e.printStackTrace();
			tojson.setMsg("err");
			tojson.setFlag(1);
		}
		return tojson;
	}

	@RequestMapping({ "/getHookAll" })
	@ResponseBody
	public ToJson<FlowHookWithBLOBs> getHookAll(
			FlowHookWithBLOBs flowHookWithBLOBs, HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson tojson = new ToJson();
		try {
			List result = this.flowHookService.getHookAll(flowHookWithBLOBs);
			tojson.setObj(result);
			tojson.setMsg("ok");
			tojson.setFlag(0);
		} catch (Exception e) {
			e.printStackTrace();
			tojson.setMsg("err");
			tojson.setFlag(1);
		}
		return tojson;
	}

	@RequestMapping({ "/queryFormId" })
	@ResponseBody
	public ToJson<FlowHookWithBLOBs> queryFormId(String folwId) {
		return this.flowHookService.queryFormId(folwId);
	}
}
