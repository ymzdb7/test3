package com.myoa.controller.hr;

import com.myoa.model.hr.HrStaffContract;
import com.myoa.model.users.Users;
import com.myoa.service.hr.HrStaffContractService;
import com.myoa.util.ToJson;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrapper;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/hr/contract" })
public class HrStaffContractController {

	@Resource
	private HrStaffContractService hrStaffContractService;

	@RequestMapping({ "/getContractInfo" })
	@ResponseBody
	public ToJson<HrStaffContract> getContractInfo(HttpServletRequest request,
			String contractId) {
		return this.hrStaffContractService.getcontractinfo(request, contractId);
	}

	@RequestMapping({ "/updateContractInfo" })
	@ResponseBody
	public ToJson<Object> updateContractInfo(HrStaffContract hrStaffContract,
			String userPriv) {
		return this.hrStaffContractService.updateContractInfo(hrStaffContract,
				userPriv);
	}

	@RequestMapping({ "/deleteContractInfo" })
	@ResponseBody
	public ToJson<Object> deleteContractInfo(String contractId) {
		return this.hrStaffContractService.deleteContractInfo(contractId);
	}

	@RequestMapping({ "/getAllContract" })
	@ResponseBody
	public ToJson<HrStaffContract> getAllContract(Integer page,
			Integer pageSize, boolean useFlag) {
		return this.hrStaffContractService.getAllContract(page, pageSize,
				useFlag);
	}

	@RequestMapping({ "/addContract" })
	@ResponseBody
	public ToJson<Object> addContract(HttpServletRequest request,
			HrStaffContract hrStaffContract, String userPriv) {
		return this.hrStaffContractService.addContract(request,
				hrStaffContract, userPriv);
	}

	@RequestMapping({ "/getTrialContract" })
	@ResponseBody
	public ToJson<HrStaffContract> getTrialContract(String startTime,
			String endTime, String status) {
		if (status.equals("1")) {
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar calendar = Calendar.getInstance();
			Date theDate = calendar.getTime();
			GregorianCalendar gcLast = (GregorianCalendar) Calendar
					.getInstance();
			gcLast.setTime(theDate);
			gcLast.set(5, 1);

			startTime = sf.format(gcLast.getTime());

			Calendar calendar2 = Calendar.getInstance();
			calendar2.set(5, calendar.getActualMaximum(5));
			endTime = sf.format(calendar2.getTime());
			return this.hrStaffContractService.getTrialContract(startTime,
					endTime);
		}

		return this.hrStaffContractService.getTrialContract(startTime, endTime);
	}

	@RequestMapping({ "/getMaturityContract" })
	@ResponseBody
	public ToJson<HrStaffContract> getMaturityContract(
			HrStaffContract hrStaffContract, String startTime, String endTime,
			String status) {
		if (status.equals("1")) {
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar calendar = Calendar.getInstance();
			Date theDate = calendar.getTime();
			GregorianCalendar gcLast = (GregorianCalendar) Calendar
					.getInstance();
			gcLast.setTime(theDate);
			gcLast.set(5, 1);

			startTime = sf.format(gcLast.getTime());

			Calendar calendar2 = Calendar.getInstance();
			calendar2.set(5, calendar.getActualMaximum(5));
			endTime = sf.format(calendar2.getTime());
			return this.hrStaffContractService.getMaturityContract(
					hrStaffContract, startTime, endTime);
		}
		return this.hrStaffContractService.getMaturityContract(hrStaffContract,
				startTime, endTime);
	}

	@RequestMapping({ "/getContract" })
	@ResponseBody
	public ToJson<HrStaffContract> getContract(HrStaffContract hrStaffContract,
			String SignstartTime, String SignendTime, String TrialstartTime,
			String TrialendTime, String MaturitystartTime,
			String MaturityendTime, String RelievestartTime,
			String RelieveendTime, Integer page, Integer pageSize,
			boolean useFlag) {
		return this.hrStaffContractService.getContract(hrStaffContract,
				SignstartTime, SignendTime, TrialstartTime, TrialendTime,
				MaturitystartTime, MaturityendTime, RelievestartTime,
				RelieveendTime, page, pageSize, useFlag);
	}

	@ResponseBody
	@RequestMapping({ "/deleteByIds" })
	public ToJson<HrStaffContract> deleteByIds(String ids) {
		return this.hrStaffContractService.deleteByIds(ids);
	}

	@ResponseBody
	@RequestMapping({ "/getContractAnalysis" })
	public BaseWrapper getContractAnalysis() {
		return this.hrStaffContractService.getContractAnalysis();
	}

	@ResponseBody
	@RequestMapping({ "/getContractInfoByStaffName" })
	public ToJson<HrStaffContract> getContractInfoByStaffName(
			HttpServletRequest request) {
		Users user = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		return this.hrStaffContractService.getContractInfoByStaffName(user);
	}

	@ResponseBody
	@RequestMapping({ "/getHrCountByType" })
	public BaseWrapper getHrCountByType(HttpServletRequest request) {
		return this.hrStaffContractService.getHrCountByType();
	}
}
