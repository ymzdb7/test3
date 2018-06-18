package com.myoa.controller.seal;

import com.myoa.model.seal.SealJingeKey;
import com.myoa.service.seal.SealJingeKeyService;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/sealJingeKey" })
public class SealJingeKeyController {

	@Autowired
	SealJingeKeyService sealJingeKeyService;

	@ResponseBody
	@RequestMapping({ "/addSealJingeKeyList" })
	public ToJson<SealJingeKey> addSealJingeKeyList(HttpServletRequest request,
			SealJingeKey sealJingeKey) {
		return this.sealJingeKeyService.addSealJingeKeyList(request,
				sealJingeKey);
	}

	@ResponseBody
	@RequestMapping({ "/getSealJingeKeyList" })
	public ToJson<SealJingeKey> getSealJingeKeyList(Integer sealId) {
		return this.sealJingeKeyService.getSealJingeKeyList(sealId);
	}

	@ResponseBody
	@RequestMapping({ "/getSealJingeKey" })
	public ToJson<SealJingeKey> getSealJingeKey(Integer keyId) {
		return this.sealJingeKeyService.getSealJingeKey(keyId);
	}

	@ResponseBody
	@RequestMapping({ "/updateSealJingeKey" })
	public ToJson<SealJingeKey> updateSealJingeKey(SealJingeKey sealJingeKey) {
		return this.sealJingeKeyService.updateSealJingeKey(sealJingeKey);
	}

	@ResponseBody
	@RequestMapping({ "/deleteSealJingeKey" })
	public ToJson<SealJingeKey> deleteSealJingeKey(Integer keyId) {
		return this.sealJingeKeyService.deleteSealJingeKey(keyId);
	}
}
