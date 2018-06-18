package com.myoa.controller.workflow;

import com.alibaba.fastjson.JSONObject;
import com.myoa.model.enclosure.Attachment;
import com.myoa.model.users.Users;
import com.myoa.model.workflow.FlowTypeModel;
import com.myoa.service.enclosure.EnclosureService;
import com.myoa.service.syspara.SysParaService;
import com.myoa.service.workflow.flowtype.FlowTypeService;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.common.wrapper.BaseWrappers;
import com.myoa.util.dataSource.ContextHolder;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.jdom2.Document;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping({ "/flow" })
public class FlowTypeController {

	@Resource
	private EnclosureService enclosureService;

	@Resource
	private FlowTypeService flowTypeService;

	@Resource
	SysParaService sysParaService;

	@RequestMapping(value = { "newFlow" }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public void saveFlow(FlowTypeModel flowTypeModel,
			HttpServletRequest request, HttpServletResponse response) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson flowTypeModelToJson = this.flowTypeService
				.saveFlow(flowTypeModel);
		response.setContentType("text/html; charset=utf-8");
		try {
			ServletOutputStream servletOutputStream = response
					.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(servletOutputStream,
					"UTF-8");
			ow.write(JSONObject.toJSONString(flowTypeModelToJson));
			ow.flush();
			ow.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping(value = { "selectAllFlow" }, produces = { "application/json;charset=UTF-8" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	@ResponseBody
	public ToJson<FlowTypeModel> selectAllFlow(
			@RequestParam("flowId") Integer flowId, HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return this.flowTypeService.selectAllFlow(flowId, request);
	}

	@RequestMapping(value = { "updateFlow" }, produces = { "application/json;charset=UTF-8" }, method = { org.springframework.web.bind.annotation.RequestMethod.POST })
	@ResponseBody
	public void updateFlow(FlowTypeModel flowTypeModel,
			HttpServletRequest request, HttpServletResponse response) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		response.setContentType("text/html; charset=utf-8");
		ToJson flowTypeModelToJson = this.flowTypeService
				.updateFlow(flowTypeModel);
		try {
			ServletOutputStream servletOutputStream = response
					.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(servletOutputStream,
					"UTF-8");
			ow.write(JSONObject.toJSONString(flowTypeModelToJson));
			ow.flush();
			ow.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@RequestMapping(value = { "selectAttachment" }, produces = { "application/json;charset=UTF-8" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET })
	@ResponseBody
	public ToJson selectAttachmentAndInstructions(HttpServletRequest request,
			@RequestParam("flowId") Integer flowId,
			@RequestParam("formId") Integer formId) {
		String sqlType = Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse");

		ContextHolder.setConsumerType(sqlType);
		return this.flowTypeService.selectAttachmentAndInstructions(flowId,
				formId, sqlType);
	}

	@RequestMapping({ "/flowNews" })
	public String flow(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/workflow/flowtype/flowNews";
	}

	@RequestMapping({ "/flowNew" })
	public String newflow(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/workflow/flowtype/flownew";
	}

	@RequestMapping({ "/flowlistbysort" })
	@ResponseBody
	public ToJson<FlowTypeModel> flowListBySort(Integer flowId,
			HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return this.flowTypeService.quertBySortId(flowId);
	}

	@RequestMapping({ "/flowBySearch" })
	@ResponseBody
	public ToJson<FlowTypeModel> flowBySearch(String searchValue,
			Integer flowId, HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return this.flowTypeService.flowBySearch(searchValue, flowId);
	}

	@RequestMapping({ "/flowAuthOrSearch" })
	@ResponseBody
	public ToJson<FlowTypeModel> selectFlowAuthOrSearch(
			HttpServletRequest request, String searchValue, Integer sortId) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return this.flowTypeService.selectFlowAuthOrSearch(request,
				searchValue, sortId);
	}

	@RequestMapping({ "/type/index" })
	public String flowTypeIndex(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		if (!this.sysParaService.checkIsHaveSecure(user, Integer.valueOf(7))) {
			return "app/common/development";
		}
		return "app/workflow/flowtype/index";
	}

	@RequestMapping({ "/flowDetailInfo" })
	@ResponseBody
	public ToJson flowDetailInfo(Integer flowId) {
		return this.flowTypeService.selectFlowDetailInfo(flowId);
	}

	@RequestMapping({ "/fileUpload" })
	@ResponseBody
	public void uploadFile(@RequestParam("file") MultipartFile[] files,
			String module,
			@RequestParam(value = "company", required = false) String company,
			HttpServletRequest request, HttpServletResponse response) {
		BaseWrappers wrappers = new BaseWrappers();
		StringBuffer sb = new StringBuffer();
		if (StringUtils.checkNull(company).booleanValue()) {
			if ((request.getSession().getAttribute("loginDateSouse") != null)
					&& (!"null".equals((String) request.getSession()
							.getAttribute("loginDateSouse"))))
				sb.append(Constant.MYOA
						+ (String) request.getSession().getAttribute(
								"loginDateSouse"));
			else
				sb.append("xoa1001");
		} else
			sb.append(company);
		try {
			List<Attachment> list = this.enclosureService.upload(files,
					sb.toString(), module);
			for (Attachment attachment : list) {
				int aid = attachment.getAid().intValue();
				int attachId = attachment.getAttachId().intValue();
				String ym = attachment.getYm();
				String attachName = attachment.getAttachName();
				String all = aid + "@" + ym + "_" + attachId;
				attachment.setAttStrId(all);
				attachment.setAttStrName(attachName);
			}
			wrappers.setDatas(list);
			wrappers.setFlag(true);
			wrappers.setStatus(true);
		} catch (Exception e) {
			e.printStackTrace();
			wrappers.setFlag(false);
			wrappers.setStatus(false);
			wrappers.setMsg("error");
		}
		response.setContentType("text/html; charset=utf-8");
		try {
			ServletOutputStream servletOutputStream = response
					.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(servletOutputStream,
					"UTF-8");
			ow.write(JSONObject.toJSONString(wrappers));
			ow.flush();
			ow.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping({ "/checkOut" })
	@ResponseBody
	public void checkOut(HttpServletRequest request,
			HttpServletResponse response, Integer flowId) {
		response.setCharacterEncoding("utf-8");
		response.setContentType("multipart/form-data");
		OutputStream os = null;
		try {
			BaseWrapper wrapper = this.flowTypeService.getFlowOutModel(flowId);
			Document doc = (Document) wrapper.getData();
			XMLOutputter xmlOutputter = new XMLOutputter(
					Format.getPrettyFormat());
			String fileName = "新建导出流程.xml";
			if (!StringUtils.checkNull(wrapper.getMsg()).booleanValue()) {
				fileName = wrapper.getMsg() + ".xml";
			}

			String userAgent = request.getHeader("User-Agent");
			byte[] bytes = userAgent.contains("MSIE") ? fileName.getBytes()
					: fileName.getBytes("UTF-8");

			fileName = new String(bytes, "ISO-8859-1");
			response.setHeader("Content-disposition", String.format(
					"attachment; filename=\"%s\"", new Object[] { fileName }));

			os = response.getOutputStream();
			xmlOutputter.output(doc, os);
			os.close();
		} catch (Exception e) {
			e.printStackTrace();
			if (os != null)
				try {
					os.close();
				} catch (Exception p) {
					p.printStackTrace();
				}
		}
	}

	@RequestMapping({ "/inputFlow" })
	@ResponseBody
	public BaseWrapper inputFlow(Integer flowId,
			@RequestParam(name = "file") MultipartFile file) {
		return this.flowTypeService.intputFlowFile(flowId, file);
	}

	@RequestMapping({ "/deleteFlow" })
	@ResponseBody
	public BaseWrapper deleteFlow(Integer flowId) {
		return this.flowTypeService.deleteFlow(flowId);
	}

	@RequestMapping({ "/clearFlow" })
	@ResponseBody
	public BaseWrapper clearFlow(Integer flowId) {
		return this.flowTypeService.clearFlow(flowId);
	}

	@RequestMapping({ "/selAllType" })
	@ResponseBody
	public ToJson<FlowTypeModel> selAllType() {
		return this.flowTypeService.selAllType();
	}
}
