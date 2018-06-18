package com.myoa.controller.address;

import com.myoa.model.address.Address;
import com.myoa.model.address.AddressWithBLOBs;
import com.myoa.model.users.Users;
import com.myoa.service.address.AddressService;
import com.myoa.util.Constant;
import com.myoa.util.ServletUtil;
import com.myoa.util.ToJson;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.dataSource.ContextHolder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping({ "/address" })
public class AddressConteoller {

	@Autowired
	AddressService addressService;

	@RequestMapping({ "/index" })
	public String myAttendance(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/address/index";
	}

	@RequestMapping({ "/showList" })
	public String showList(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/address/show_list";
	}

	@RequestMapping({ "/show_add" })
	public String getUserInfo(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/address/show_add";
	}

	@RequestMapping({ "/commonAdd" })
	public String commonAdd(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/address/commonAddress/commonAdd";
	}

	@RequestMapping({ "/new" })
	public String add(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/address/new";
	}

	@RequestMapping({ "/edit" })
	public String edit(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/address/edit";
	}

	@RequestMapping({ "/conQuery" })
	public String conQuery(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/address/conQuery";
	}

	@ResponseBody
	@RequestMapping({ "/getUsersById" })
	public BaseWrapper getUsersById(HttpServletRequest request, String groupId,
			String PUBLIC_FLAG, String SHARE_TYPE, String TYPE) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return this.addressService.getUsersById(request, groupId, PUBLIC_FLAG,
				SHARE_TYPE, TYPE);
	}

	@ResponseBody
	@RequestMapping({ "/getUserInfoById" })
	public BaseWrapper getUserInfoById(HttpServletRequest request, String addId) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return this.addressService.selectByPrimaryKey(addId);
	}

	@ResponseBody
	@RequestMapping({ "/addUser" })
	public BaseWrapper addUser(HttpServletRequest request, String birthday) {

		AddressWithBLOBs addressWithBLOBs = new AddressWithBLOBs();
		ServletUtil.requestParamsCopyToObject(request, addressWithBLOBs);
		return this.addressService.addUser(request, addressWithBLOBs, birthday);
	}

	@ResponseBody
	@RequestMapping({ "/updateUser" })
	public BaseWrapper updateAdd(HttpServletRequest request, String birthday) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		AddressWithBLOBs addressWithBLOBs = new AddressWithBLOBs();
		ServletUtil.requestParamsCopyToObject(request, addressWithBLOBs);
		return this.addressService.updateUser(request, addressWithBLOBs,
				birthday);
	}

	@ResponseBody
	@RequestMapping({ "/deleteUser" })
	public BaseWrapper deleteUser(HttpServletRequest request, String addId) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return this.addressService.deleteUser(request, Integer.valueOf(addId));
	}

	@ResponseBody
	@RequestMapping({ "/getNotUserById" })
	public BaseWrapper getNotUserById(HttpServletRequest request,
			String groupId, String PUBLIC_FLAG, String SHARE_TYPE, String TYPE) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return this.addressService.getNotUserById(request, groupId,
				PUBLIC_FLAG, SHARE_TYPE, TYPE);
	}

	@ResponseBody
	@RequestMapping({ "/query" })
	public BaseWrapper query(Integer groupId, String name) {
		return this.addressService.queryAddress(groupId, name);
	}

	@ResponseBody
	@RequestMapping({ "/getColleagues" })
	public BaseWrapper getColleagues(HttpServletRequest request) {
		return this.addressService.getColleagues(request);
	}

	@ResponseBody
	@RequestMapping({ "/exportAddress" })
	public BaseWrapper exportAddress(HttpServletRequest request,
			HttpServletResponse response, Integer groupId) {
		return this.addressService.exportAddress(request, response, groupId);
	}

	@ResponseBody
	@RequestMapping({ "/importAddress" })
	public ToJson<Address> importAddress(HttpServletRequest request,
			HttpServletResponse response, MultipartFile file) {
		return this.addressService.importAddress(request, response, file);
	}

	@ResponseBody
	@RequestMapping({ "/selectAddress" })
	public ToJson<Address> selectAddress(HttpServletRequest request,
			Integer page, Integer pageSize, boolean useFlag, Address address,
			String export, HttpServletResponse response) {
		return this.addressService.selectAddress(request, page, pageSize,
				useFlag, address, export, response);
	}

	@ResponseBody
	@RequestMapping({ "/selectUser" })
	public ToJson<Users> selectUser(HttpServletRequest request, Integer page,
			Integer pageSize, boolean useFlag, Users user) {
		return this.addressService.selectUser(request, page, pageSize, useFlag,
				user);
	}

	@ResponseBody
	@RequestMapping({ "/queryUserInfoById" })
	public ToJson<Users> getUserInfoById(Integer uid, HttpServletRequest request) {
		return this.addressService.getUserInfoById(uid, request);
	}

	@ResponseBody
	@RequestMapping({ "/importPublicAddressWithBLOBs" })
	public ToJson<AddressWithBLOBs> importPublicAddressWithBLOBs(
			Integer groupId, MultipartFile file, HttpServletRequest request,
			HttpServletResponse response) {
		return this.addressService.importPublicAddressWithBLOBs(groupId, file,
				request, response);
	}

	public BaseWrapper getAddressUser(HttpServletRequest request,
			String groupId, String PUBLIC_FLAG, String SHARE_TYPE, String TYPE) {
		return this.addressService.getAddressUser(request, groupId,
				PUBLIC_FLAG, SHARE_TYPE, TYPE);
	}
}
