package com.myoa.controller.address;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myoa.model.addressGroup.AddressGroupWithBLOBs;
import com.myoa.service.address.AddressGroupService;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.dataSource.ContextHolder;

@Controller
@RequestMapping({ "addressGroup" })
public class AddressGroupControll {

	@Autowired
	AddressGroupService addressGroupService;

	@RequestMapping({ "/manager" })
	public String addressGroup(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/address/group/group_manage";
	}

	@RequestMapping({ "/showGroup" })
	public String showGroup(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/address/group/show_group";
	}

	@RequestMapping({ "/add" })
	public String groupAdd(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/address/group/group_new";
	}

	@ResponseBody
	@RequestMapping({ "/isExis" })
	public BaseWrapper isExis(HttpServletRequest request, String group_name) {
		return this.addressGroupService.isExis(request, group_name);
	}

	@ResponseBody
	@RequestMapping({ "/addGroup" })
	public BaseWrapper addGroup(HttpServletRequest request, String group_name,
			String ids) {
		return this.addressGroupService.addGroup(request, group_name, ids);
	}

	@ResponseBody
	@RequestMapping({ "/getGroups" })
	public BaseWrapper getGroups(HttpServletRequest request) {
		return this.addressGroupService.getGroups(request);
	}

	@ResponseBody
	@RequestMapping({ "/deleteGroups" })
	public BaseWrapper deleteGroups(HttpServletRequest request, String groupId) {
		return this.addressGroupService.deleteGroups(request, groupId);
	}

	@ResponseBody
	@RequestMapping({ "/getGroupInfo" })
	public BaseWrapper getGroupInfo(HttpServletRequest request, String groupId) {
		return this.addressGroupService.getGroupInfo(request, groupId);
	}

	@ResponseBody
	@RequestMapping({ "/putGroup" })
	public BaseWrapper putGroup(HttpServletRequest request, String groupId,
			String group_name, String FLD_STR) {
		return this.addressGroupService.putGroup(request, groupId, group_name,
				FLD_STR);
	}

	@ResponseBody
	@RequestMapping({ "/addPublicGroup" })
	public ToJson<AddressGroupWithBLOBs> addPublicGroup(
			HttpServletRequest request,
			AddressGroupWithBLOBs addressGroupWithBLOBs) {
		return this.addressGroupService.addPublicGroup(request,
				addressGroupWithBLOBs);
	}

	@ResponseBody
	@RequestMapping({ "/getPublicGroups" })
	public ToJson<AddressGroupWithBLOBs> getPublicGroups(
			HttpServletRequest request, Integer page, Integer pageSize,
			boolean useFlag) {
		return this.addressGroupService.getPublicGroups(request, page,
				pageSize, useFlag);
	}

	@ResponseBody
	@RequestMapping({ "/updatePublicGroup" })
	public ToJson<AddressGroupWithBLOBs> updatePublicGroup(
			HttpServletRequest request,
			AddressGroupWithBLOBs addressGroupWithBLOBs) {
		return this.addressGroupService.updatePublicGroup(request,
				addressGroupWithBLOBs);
	}

	@ResponseBody
	@RequestMapping({ "/selectPublicGroupInfo" })
	public ToJson<AddressGroupWithBLOBs> selectPublicGroupInfo(Integer groupId) {
		return this.addressGroupService.selectPublicGroupInfo(groupId);
	}

	@ResponseBody
	@RequestMapping({ "/selectAllAddressGroup" })
	public BaseWrapper selectAllAddressGroup(HttpServletRequest request) {
		return this.addressGroupService.selectAllAddressGroup(request);
	}
}
