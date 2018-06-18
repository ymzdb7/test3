package com.myoa.controller.fixAssets;

import com.myoa.model.fixAssets.EduFixAssets;
import com.myoa.service.fixAssets.EduFixAssetsService;
import com.myoa.util.ToJson;

import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping({ "/eduFixAssets" })
public class FixAssetsController {

	@Resource
	private EduFixAssetsService eduFixAssetsService;

	@RequestMapping({ "/index" })
	public String index() {
		return "app/edu/eduFixAssets/index";
	}

	@RequestMapping({ "/fixAssetsManager" })
	public String fixAssetsManager() {
		return "app/edu/eduFixAssets/fixAssetsManager";
	}

	@RequestMapping({ "/fixAssetsEdit" })
	public String fixAssetsEdit(int editFlag, String id,
			Map<String, Object> map, HttpServletRequest request) {
		map.put("editFlag", Integer.valueOf(editFlag));
		map.put("id", id);
		return "app/edu/eduFixAssets/fixAssetsEdit";
	}

	@RequestMapping({ "/fixAssetsQuery" })
	public String fixAssetsQuery() {
		return "app/edu/eduFixAssets/fixAssetsQuery";
	}

	@ResponseBody
	@RequestMapping({ "/selFixAssetsByCond" })
	public ToJson<EduFixAssets> selFixAssetsByCond(
			@RequestParam(value = "condition", required = false, defaultValue = "2") int condition,
			@RequestParam(value = "output", required = false, defaultValue = "0") int output,
			EduFixAssets eduFixAssets, HttpServletRequest request,
			HttpServletResponse response, HttpSession session, Integer page,
			Integer pageSize, boolean useFlag) {
		return this.eduFixAssetsService.selFixAssetsByCond(condition, output,
				eduFixAssets, request, response, session, page, pageSize,
				useFlag);
	}

	@ResponseBody
	@RequestMapping({ "/insertFixAssets" })
	public ToJson<EduFixAssets> insertFixAssets(HttpServletRequest request,
			MultipartFile imageFile, MultipartFile QRcodeFile,
			EduFixAssets eduFixAssets) {
		return this.eduFixAssetsService.insertFixAssets(request, imageFile,
				QRcodeFile, eduFixAssets);
	}

	@ResponseBody
	@RequestMapping({ "/updateFixAssetsById" })
	public ToJson<EduFixAssets> updateFixAssetsById(HttpServletRequest request,
			MultipartFile imageFile, MultipartFile QRcodeFile,
			EduFixAssets eduFixAssets) {
		return this.eduFixAssetsService.updateFixAssetsById(request, imageFile,
				QRcodeFile, eduFixAssets);
	}

	@ResponseBody
	@RequestMapping({ "/deleteFixAssetsById" })
	public ToJson<EduFixAssets> deleteFixAssetsById(String id) {
		return this.eduFixAssetsService.deleteFixAssetsById(id);
	}

	@ResponseBody
	@RequestMapping({ "/inputFixAsserts" })
	public ToJson<EduFixAssets> inputFixAsserts(HttpServletRequest request,
			HttpServletResponse response, MultipartFile file,
			HttpSession session) {
		return this.eduFixAssetsService.inputFixAsserts(request, response,
				file, session);
	}

	@ResponseBody
	@RequestMapping({ "/selFixAssetsById" })
	ToJson<EduFixAssets> selFixAssetsById(String id) {
		return this.eduFixAssetsService.selFixAssetsById(id);
	}

	@ResponseBody
	@RequestMapping({ "/getFixAssetsId" })
	ToJson<EduFixAssets> getFixAssetsId() {
		return this.eduFixAssetsService.getFixAssetsId();
	}
}
