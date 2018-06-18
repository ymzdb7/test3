package com.myoa.controller.url;

import com.myoa.model.url.Url;
import com.myoa.service.url.UrlService;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.dataSource.ContextHolder;

import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/controlpanel" })
public class UrlController {
	private Logger loger = Logger.getLogger(UrlController.class);

	@Resource
	private UrlService urlService;

	@RequestMapping({ "/index" })
	public String url() {
		return "/app/url/index";
	}

	@RequestMapping({ "/urlAdress" })
	public String urlAdress() {
		return "/app/url/urlAdress";
	}

	@RequestMapping({ "/safelog" })
	public String safelog() {
		return "/app/url/safelog";
	}

	@RequestMapping({ "/adressList" })
	public String list() {
		return "/app/url/adressList";
	}

	@RequestMapping({ "/desktop" })
	public String desktop() {
		return "/app/url/desktop";
	}

	@RequestMapping({ "/editAdress" })
	public String edit() {
		return "/app/url/editAdress";
	}

	@RequestMapping({ "/editUserExtPage" })
	public String editUserExtPage() {
		return "/app/url/editUserExt";
	}

	@RequestMapping({ "/form" })
	public String form() {
		return "/app/url/form";
	}

	@ResponseBody
	@RequestMapping(value = { "/addUrl" }, produces = { "application/json;charset=UTF-8" })
	public ToJson<Url> addUrl(HttpServletRequest request, Url url) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(1, "error");
		try {
			this.urlService.addUrl(url, request);

			json.setObject(url);
			json.setMsg("ok");
			json.setFlag(0);
		} catch (Exception e) {
			e.printStackTrace();
			json.setMsg("数据错误");
			json.setFlag(1);
		}
		return json;
	}

	@ResponseBody
	@RequestMapping({ "/selectUrl" })
	public ToJson<Url> selectUrl(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(1, "error");
		try {
			Url url = new Url();
			List list = this.urlService.selectData(url);
			if (list.size() > 0) {
				json.setObj(list);
				json.setMsg("ok");
				json.setFlag(0);
			} else {
				json.setMsg("数据为空");
				json.setFlag(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping({ "/getUrlById" })
	public Url selectUrlById(HttpServletRequest request, Integer urlId) {
		return this.urlService.selectByUrlId(request, urlId);
	}

	@ResponseBody
	@RequestMapping({ "/deleteUrl" })
	public ToJson<Url> deleteUrl(@RequestParam("urlId") Integer urlId,
			HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(1, "error");
		this.loger.debug("message" + urlId);
		try {
			this.urlService.deleteData(urlId);
			json.setMsg("ok");
			json.setFlag(0);
			return json;
		} catch (Exception e) {
			e.printStackTrace();
			json.setMsg(e.getMessage());
			json.setFlag(1);
		}
		return json;
	}

	@ResponseBody
	@RequestMapping({ "/deleteAll" })
	public ToJson<Url> deleteAll(HttpServletRequest request, Url url) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(1, "error");
		try {
			this.urlService.deleteAll();
			json.setMsg("ok");
			return json;
		} catch (Exception e) {
			e.printStackTrace();
			json.setMsg(e.getMessage());
		}
		return json;
	}

	@ResponseBody
	@RequestMapping({ "/updateUrl" })
	public ToJson<Url> updateUrl(Url url, HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson json = new ToJson(0, null);
		try {
			this.urlService.updateUrl(url);
			json.setObject(url);
			json.setMsg("ok");
			json.setFlag(0);
		} catch (Exception e) {
			e.printStackTrace();
			json.setMsg(e.getMessage());
			json.setFlag(1);
		}
		return json;
	}
}
