package com.myoa.controller.contactPerson;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myoa.model.users.Users;
import com.myoa.service.contactPerson.ContactPersonService;
import com.myoa.util.ToJson;

@Controller
@RequestMapping({ "/contactPerson" })
public class ContactPersonController {

	@Resource
	public ContactPersonService contactPersonService;

	@ResponseBody
	@RequestMapping({ "/serchContactPerson" })
	public ToJson<Users> serchContactPerson(HttpServletRequest request) {
		return this.contactPersonService.serchContactPerson(request);
	}
}
