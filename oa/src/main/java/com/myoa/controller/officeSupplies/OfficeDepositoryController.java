package com.myoa.controller.officeSupplies;

import com.myoa.model.officesupplies.OfficeDepositoryWithBLOBs;
import com.myoa.service.officesupplies.OfficeDepositoryService;
import com.myoa.util.ToJson;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/officeDepository" })
public class OfficeDepositoryController {

	@Resource
	private OfficeDepositoryService depositoryService;

	@ResponseBody
	@RequestMapping({ "/insertDepository" })
	ToJson<OfficeDepositoryWithBLOBs> insertDepository(
			OfficeDepositoryWithBLOBs depositoryWithBLOBs) {
		return this.depositoryService.insertDepository(depositoryWithBLOBs);
	}

	@ResponseBody
	@RequestMapping({ "/updateDepositoryById" })
	ToJson<OfficeDepositoryWithBLOBs> updateDepositoryById(
			OfficeDepositoryWithBLOBs depositoryWithBLOBs) {
		return this.depositoryService.updateDepositoryById(depositoryWithBLOBs);
	}

	@ResponseBody
	@RequestMapping({ "/delDepositoryById" })
	ToJson<OfficeDepositoryWithBLOBs> delDepositoryById(Integer id) {
		return this.depositoryService.delDepositoryById(id);
	}

	@ResponseBody
	@RequestMapping({ "/selDepositoryById" })
	ToJson<OfficeDepositoryWithBLOBs> selDepositoryById(Integer id) {
		return this.depositoryService.selDepositoryById(id);
	}

	@ResponseBody
	@RequestMapping({ "/selAllDepository" })
	ToJson<OfficeDepositoryWithBLOBs> selAllDepository() {
		return this.depositoryService.selAllDepository();
	}

	@RequestMapping({ "/goDepositoryindex" })
	public String goDepositoryList() {
		return "app/officeSupplies/depository/index";
	}

	@ResponseBody
	@RequestMapping({ "/getDepositoryNameById" })
	public ToJson<OfficeDepositoryWithBLOBs> getDepositoryNameById(Integer id) {
		return this.depositoryService.selDepositoryById(id);
	}

	@ResponseBody
	@RequestMapping({ "/getDeposttoryByDept" })
	public ToJson<OfficeDepositoryWithBLOBs> selDepositoryByDept(
			HttpServletRequest request) {
		return this.depositoryService.selDepositoryByDept(request);
	}

	@ResponseBody
	@RequestMapping({ "/getAllDeposttoryTree" })
	public ToJson<OfficeDepositoryWithBLOBs> getAllDeposttoryTree(
			HttpServletRequest request) {
		return this.depositoryService.getAllDeposttoryTree(request);
	}
}
