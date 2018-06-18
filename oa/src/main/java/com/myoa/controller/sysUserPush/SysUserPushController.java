package com.myoa.controller.sysUserPush;

import com.myoa.service.sysUserPush.SysUserPushSerive;
import com.myoa.util.ToJson;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/SysUserPushController" })
public class SysUserPushController {
	private SysUserPushSerive sysUserPushSerive;

	@ResponseBody
	@RequestMapping({ "/pushTokenAndroid" })
	public JSONObject pushTokenAndroid(int accessId, String secretKey,
			String title, String content, String token) {
		return this.sysUserPushSerive.pushTokenAndroid(accessId, secretKey,
				title, content, token);
	}

	@ResponseBody
	@RequestMapping({ "/pushAccountAndroid" })
	public JSONObject pushAccountAndroid(int accessId, String secretKey,
			String title, String content, String account) {
		return this.sysUserPushSerive.pushAccountAndroid(accessId, secretKey,
				title, content, account);
	}

	@ResponseBody
	@RequestMapping({ "/pushAccountAndroidSum" })
	public ToJson pushAccountAndroidSum(Long accessId, String secretKey,
			String title, String content, String[] account) throws Exception {
		return this.sysUserPushSerive.pushAccountAndroidSum(accessId,
				secretKey, title, content, account);
	}

	@ResponseBody
	@RequestMapping({ "/pushAllAndroid" })
	public JSONObject pushAllAndroid(int accessId, String secretKey,
			String title, String content) {
		return this.sysUserPushSerive.pushAllAndroid(accessId, secretKey,
				title, content);
	}

	@ResponseBody
	@RequestMapping({ "/pushTagAndroid" })
	public JSONObject pushTagAndroid(int accessId, String secretKey,
			String title, String content, String tag) {
		return this.sysUserPushSerive.pushTagAndroid(accessId, secretKey,
				title, content, tag);
	}

	@ResponseBody
	@RequestMapping({ "/pushTokenIos" })
	public JSONObject pushTokenIos(int accessId, String secretKey,
			String content, String token, int environment) {
		return this.sysUserPushSerive.pushTokenIos(accessId, secretKey,
				content, token, environment);
	}

	@ResponseBody
	@RequestMapping({ "/pushAccountIos" })
	public JSONObject pushAccountIos(Long accessId, String secretKey,
			String content, String account, int environment) {
		return this.sysUserPushSerive.pushAccountIos(accessId.longValue(),
				secretKey, content, account, environment);
	}

	@ResponseBody
	@RequestMapping({ "/pushAllIos" })
	public JSONObject pushAllIos(int accessId, String secretKey,
			String content, int environment) {
		return this.sysUserPushSerive.pushAllIos(accessId, secretKey, content,
				environment);
	}

	@ResponseBody
	@RequestMapping({ "/pushTagIos" })
	public JSONObject pushTagIos(int accessId, String secretKey,
			String content, String tag, int environment) {
		return this.sysUserPushSerive.pushTagIos(accessId, secretKey, content,
				tag, environment);
	}
}
