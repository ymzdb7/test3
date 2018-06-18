package com.myoa.controller.salary.bonusmsg;

import com.myoa.model.salary.bonusmsg.BonusMsg;
import com.myoa.service.salary.bonusmsg.BonusMsgService;
import com.myoa.util.ToJson;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping({ "/bonusmsg" })
public class BonusMsgController {

	@Autowired
	private BonusMsgService bonusMsgService;

	@ResponseBody
	@RequestMapping({ "/insert" })
	public ToJson bmImport(MultipartFile file, HttpServletRequest request,
			HttpServletResponse response, String time, Integer type) {
		return this.bonusMsgService.bmImport(file, request, response, time,
				type);
	}

	@ResponseBody
	@RequestMapping({ "/query" })
	public ToJson<BonusMsg> queryBMsg(BonusMsg bonusMsg, Integer page,
			Integer pageSize, boolean useFlag, HttpServletRequest request) {
		return this.bonusMsgService.queryBMsg(bonusMsg, page, pageSize,
				useFlag, request);
	}
}
