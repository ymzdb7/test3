package com.myoa.controller.serviceReminding;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({ "/serviceReminding" })
public class InformationController {
	@RequestMapping({ "/InformationReminding" })
	public String InformationReminding() {
		return "app/serviceReminding/InformationReminding";
	}
}
