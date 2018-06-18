package com.myoa.controller.news;

import com.myoa.model.users.Users;
import com.myoa.model.worldnews.News;
import com.myoa.model.worldnews.NewsComment;
import com.myoa.service.sms.SmsService;
import com.myoa.service.worldnews.NewService;
import com.myoa.service.worldnews.NewsCommentService;
import com.myoa.util.Constant;
import com.myoa.util.DateFormat;
import com.myoa.util.ExcelUtil;
import com.myoa.util.ToJson;
import com.myoa.util.common.StringUtils;
import com.myoa.util.common.log.FileUtils;
import com.myoa.util.common.session.SessionUtils;
import com.myoa.util.common.wrapper.BaseWrapper;
import com.myoa.util.dataSource.ContextHolder;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Scope("prototype")
@RequestMapping({ "/news" })
public class NewsController {
	private Logger loger = Logger.getLogger(NewsController.class);

	@Resource
	private NewService newService;

	@Resource
	private NewsCommentService newsCommentService;

	@Resource
	private SmsService smsService;
	private String err = "err";
	private String ok = "ok";

	@RequestMapping({ "/index" })
	public String clickNews(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "/app/news/center";
	}

	@RequestMapping({ "/findDetail" })
	public String findDetail(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "/app/news/find_detail";
	}

	@RequestMapping({ "/detail" })
	public String News(HttpServletRequest request, String newsId) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		String visitUrl = request.getRequestURI();
		visitUrl = visitUrl + "?newsId=" + newsId;
		this.smsService.setRead(request, visitUrl);
		return "/app/news/newsDetail";
	}

	@RequestMapping({ "/manage" })
	public String sendNews(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "/app/news/newsManage";
	}

	@RequestMapping(value = { "/newsManage" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public ToJson<News> showManage(
			@RequestParam(value = "fromId", required = false) String fromId,
			@RequestParam(value = "typeId", required = false) String typeId,
			@RequestParam(value = "subject", required = false) String subject,
			@RequestParam(value = "newsTime", required = false) String newsTime,
			@RequestParam(value = "nTime", required = false) String nTime,
			@RequestParam(value = "lastEditTime", required = false) String lastEditTime,
			@RequestParam(value = "content", required = false) String content,
			@RequestParam(value = "read", required = false) String read,
			@RequestParam("page") Integer page,
			@RequestParam("pageSize") Integer pageSize,
			@RequestParam("useFlag") Boolean useFlag,
			HttpServletRequest request, HttpServletResponse response,
			String queryField) {
		String sqlType = Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse");

		ContextHolder.setConsumerType(sqlType);
		if ("0".equals(typeId)) {
			typeId = null;
		}
		Users users = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		String userId = null;
		String userPriv = null;
		String deptId = null;
		if ((users != null) && (users.getUserId() != null)) {
			userId = users.getUserId();
			userPriv = users.getUserPriv() + "";
			deptId = users.getDeptId() + "";
		}
		String provider = "";
		String name = ((Users) SessionUtils.getSessionInfo(
				request.getSession(), Users.class, new Users())).getUserId();
		if ((!"".equals(fromId)) && (fromId != null)) {
			provider = fromId.substring(0, fromId.length() - 1);
		}
		Map maps = new HashMap();

		maps.put("typeId", typeId);
		maps.put("subject", subject);
		maps.put("newsTime", newsTime);
		maps.put("nTime", nTime);
		maps.put("lastEditTime", lastEditTime);
		maps.put("content", content);
		maps.put("userId", userId);
		maps.put("userPriv", userPriv);
		maps.put("deptId", deptId);
		maps.put("name", name);
		maps.put("provider", provider);
		maps.put("user", users);
		maps.put("queryField", queryField);
		ToJson returnReslt = new ToJson(0, "");
		try {
			if ("0".equals(read)) {
				ToJson tojson = this.newService.unreadNews(maps, page,
						pageSize, useFlag.booleanValue(), name, sqlType);

				if (tojson.getObj().size() > 0) {
					tojson.setFlag(0);
					tojson.setMsg(this.ok);
					returnReslt = tojson;
				} else {
					returnReslt = tojson;
				}
			} else if ("1".equals(read)) {
				ToJson tojson1 = this.newService.readNews(maps, page, pageSize,
						useFlag.booleanValue(), name, sqlType);

				if (tojson1.getObj().size() > 0) {
					tojson1.setFlag(0);
					tojson1.setMsg(this.ok);
					returnReslt = tojson1;
				} else {
					returnReslt = tojson1;
				}
			} else {
				ToJson tojson2 = this.newService.selectNewsManage(maps, page,
						pageSize, useFlag.booleanValue(), name, sqlType);

				if (tojson2.getObj().size() > 0) {
					tojson2.setFlag(0);
					tojson2.setMsg(this.ok);
					returnReslt = tojson2;
				} else {
					returnReslt = tojson2;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return returnReslt;
	}

	@RequestMapping(value = { "/newsShow" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public ToJson showNews(
			@RequestParam(value = "format", required = false) String format,
			@RequestParam(value = "typeId", required = false) String typeId,
			@RequestParam(value = "top", required = false) String top,
			@RequestParam(value = "publish", required = false) String publish,
			@RequestParam(value = "clickCount", required = false) String clickCount,
			@RequestParam(value = "click", required = false) String click,
			@RequestParam(value = "subject", required = false) String subject,
			@RequestParam(value = "newsTime", required = false) String newsTime,
			@RequestParam(value = "nTime", required = false) String nTime,
			@RequestParam(value = "lastEditTime", required = false) String lastEditTime,
			@RequestParam(value = "content", required = false) String content,
			@RequestParam("page") Integer page,
			@RequestParam("pageSize") Integer pageSize,
			@RequestParam("useFlag") Boolean useFlag,
			HttpServletRequest request, HttpServletResponse response,
			String exportId, String changeId) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		if ("0".equals(typeId)) {
			typeId = null;
		}
		Users name = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());

		String userId = null;
		String userPriv = null;
		String deptId = null;
		if ((name != null) && (name.getUserId() != null)) {
			userId = name.getUid() + "";
			userPriv = name.getUserPriv() + "";
			deptId = name.getDeptId() + "";
		}

		Map maps = new HashMap();
		maps.put("format", format);
		maps.put("typeId", typeId);
		maps.put("subject", subject);
		maps.put("newsTime", newsTime);
		maps.put("nTime", nTime);
		maps.put("lastEditTime", lastEditTime);
		maps.put("content", content);
		maps.put("top", top);
		maps.put("publish", publish);
		maps.put("clickCount", clickCount);
		maps.put("click", click);
		maps.put("changeId", changeId);

		ToJson returnReslt = new ToJson(0, "");
		try {
			ToJson tojson = this.newService.selectNews(maps, page, pageSize,
					useFlag.booleanValue(), name.getUserId());

			if ("1".equals(exportId))
				returnReslt = tojson;
			else if ("2".equals(exportId)) {
				try {
					List notifyList = tojson.getObj();
					HSSFWorkbook workbook1 = ExcelUtil.makeExcelHead("新闻信息导出",
							9);
					String[] secondTitles = { "发布日期", "新闻类型", "新闻标题", "新闻内容",
							"评论" };
					HSSFWorkbook workbook2 = ExcelUtil.makeSecondHead(
							workbook1, secondTitles);

					String[] beanProperty = { "newsDateTime", "typeName",
							"subject", "content", "anonymityYn" };

					HSSFWorkbook workbook = ExcelUtil.exportExcelData(
							workbook2, notifyList, beanProperty);
					ServletOutputStream out = response.getOutputStream();

					String filename = "新闻信息导出.xls";
					filename = FileUtils.encodeDownloadFilename(filename,
							request.getHeader("user-agent"));

					response.setContentType("application/vnd.ms-excel");
					response.setHeader("content-disposition",
							"attachment;filename=" + filename);

					workbook.write(out);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			this.loger.debug("NewsMessage:" + e);
		}

		return returnReslt;
	}

	@RequestMapping({ "/sendNews" })
	@ResponseBody
	public ToJson<News> insertNews(
			News news,
			@RequestParam("newTime") String newTime,
			@RequestParam(value = "remind", required = false, defaultValue = "0") String remind,
			HttpServletRequest request) {
		String tuisong = request.getParameter("tuisong");
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		Users name = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());

		news.setNewsId(Integer.valueOf(0));
		news.setProvider(name.getUserId());
		news.setNewsTime(DateFormat.getDate(newTime));
		Date curDate = new Date(System.currentTimeMillis());
		news.setLastEditTime(curDate);
		byte[] srtbyte = news.getContent().getBytes();
		news.setCompressContent(srtbyte);
		ToJson newsToJson = new ToJson();
		if (StringUtils.checkNull(news.getFormat()).booleanValue()) {
			newsToJson.setFlag(1);
			newsToJson.setMsg("err");
			return newsToJson;
		}

		if (StringUtils.checkNull(news.getContent()).booleanValue()) {
			newsToJson.setFlag(1);
			newsToJson.setMsg("err");
			return newsToJson;
		}
		try {
			this.newService.sendNews(news, remind, tuisong, request);
			newsToJson.setFlag(0);
			newsToJson.setMsg("ok");
		} catch (Exception e) {
			this.loger.debug("sendNews:" + e);
		}

		return newsToJson;
	}

	@RequestMapping(value = { "/updateNews" }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public ToJson<News> updateNews(
			News news,
			HttpServletRequest request,
			@RequestParam("newsId") Integer newsId,
			@RequestParam(value = "remind", required = false, defaultValue = "0") String remind,
			String newTime,
			@RequestParam(name = "lastTime", required = false) String lastTime,
			@RequestParam(name = "editPublish", required = false, defaultValue = "0") String editPublish) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson newsToJson = new ToJson();
		news.setNewsId(newsId);
		String tuisong = request.getParameter("tuisong");

		if (!StringUtils.checkNull(newTime).booleanValue()) {
			news.setNewsTime(DateFormat.getDate(newTime));
		}

		news.setClickCount(Integer.valueOf(0));
		try {
			if (editPublish.equals("0"))
				this.newService.updateNews(news, remind, tuisong, request);
			else if (editPublish.equals("3"))
				this.newService
						.updateNewsReades(news, remind, tuisong, request);
			else {
				this.newService.updatePublish(news, remind, tuisong, request);
			}
			newsToJson.setFlag(0);
			newsToJson.setMsg("ok");
		} catch (Exception e) {
			this.loger.debug("sendNews:" + e);
		}

		return newsToJson;
	}

	@RequestMapping(value = { "/deleteNews" }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public ToJson<News> deleteNews(@RequestParam("newsId") Integer newsId,
			HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		ToJson toJson = new ToJson(0, "");
		try {
			toJson.setMsg(this.ok);
			this.newService.deleteByPrimaryKey(newsId);
			toJson.setFlag(0);
			toJson.setMsg("ok");
		} catch (Exception e) {
			toJson.setFlag(1);
			toJson.setMsg("err");
		}

		return toJson;
	}

	@RequestMapping(value = { "/getOneById" }, method = { org.springframework.web.bind.annotation.RequestMethod.GET }, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public ToJson<News> queryNews(@RequestParam("newsId") Integer newsId,
			@RequestParam(name = "changId", required = false) String changId,
			HttpServletRequest request) {
		String sqlType = Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse");

		ContextHolder.setConsumerType(sqlType);
		Users users = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		String userId = null;
		String userPriv = null;
		String deptId = null;
		if ((users != null) && (users.getUserId() != null)) {
			userId = users.getUserId();
			userPriv = users.getUserPriv() + "";
			deptId = users.getDeptId() + "";
		}
		Map maps = new HashMap();
		maps.put("newsId", newsId);
		maps.put("userId", userId);
		maps.put("userPriv", userPriv);
		maps.put("deptId", deptId);
		ToJson toJson = new ToJson(0, "");
		Users name = (Users) SessionUtils.getSessionInfo(request.getSession(),
				Users.class, new Users());
		try {
			News news = this.newService.queryById(maps, Integer.valueOf(1),
					Integer.valueOf(5), false, name.getUserId(), sqlType,
					changId);

			toJson.setMsg(this.ok);
			toJson.setObject(news);
			return toJson;
		} catch (Exception e) {
			toJson.setMsg(this.err);
			this.loger.debug("ERROR:" + e);
		}
		return toJson;
	}

	@RequestMapping({ "/deleteByIds" })
	@ResponseBody
	public ToJson<News> deleteByIds(@RequestParam("newsIds[]") String[] newsIds) {
		return this.newService.deleteByids(newsIds);
	}

	@RequestMapping({ "/updateByIds" })
	@ResponseBody
	public ToJson<News> updateByIds(
			@RequestParam("newsIds[]") String[] newsIds, String top,
			String publish) {
		return this.newService.updayeByids(newsIds, top, publish);
	}

	@RequestMapping({ "/querySituation" })
	@ResponseBody
	public ToJson<News> querySituation(String newsId) {
		return this.newService.ConsultTheSituationNew(newsId);
	}

	public static String returnValue(String value) {
		if (!StringUtils.checkNull(value).booleanValue()) {
			return value;
		}
		return "";
	}

	@RequestMapping({ "/AddNewsComment" })
	@ResponseBody
	public ToJson<NewsComment> AddNewsComment(HttpServletRequest request,
			NewsComment newsComment) {
		ToJson json = new ToJson();
		try {
			Date date = new Date();
			newsComment.setRe_time(date);
			this.newsCommentService.addNewsComment(request, newsComment);
			json.setFlag(0);
			json.setMsg("ok");
		} catch (Exception e) {
			json.setFlag(1);
			json.setMsg("err");
			e.printStackTrace();
		}
		return json;
	}

	@RequestMapping({ "/getNewsCommentInfo" })
	@ResponseBody
	public ToJson<NewsComment> getNewsCommentInfo(HttpServletRequest request,
			String news_id) {
		ToJson json = new ToJson();
		try {
			List newsCommentInfo = this.newsCommentService.getNewsCommentInfo(
					request, news_id);
			json.setFlag(0);
			json.setMsg("ok");
			json.setObj(newsCommentInfo);
		} catch (Exception e) {
			e.printStackTrace();
			json.setFlag(1);
			json.setMsg("err");
			json.setObj(null);
		}
		return json;
	}

	@RequestMapping({ "/comment" })
	public String NewsComment(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "/app/news/comment";
	}

	@RequestMapping({ "/replyComment" })
	public String replyComment(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "/app/news/replyComment";
	}

	@RequestMapping({ "/getUser" })
	@ResponseBody
	public ToJson<Users> getUser(HttpServletRequest request) {
		return this.newsCommentService.getUser(request);
	}

	@RequestMapping({ "/getCount" })
	@ResponseBody
	public ToJson<Object> getCount(String parent_id) {
		ToJson json = new ToJson();
		try {
			int count = this.newsCommentService.getCount(parent_id);
			json.setFlag(0);
			json.setMsg("ok");
			json.setObject(Integer.valueOf(count));
		} catch (Exception e) {
			json.setFlag(1);
			json.setMsg("err");
			json.setObject(Integer.valueOf(0));
			e.printStackTrace();
		}
		return json;
	}

	@RequestMapping({ "/deleteComment" })
	@ResponseBody
	public ToJson<NewsComment> deleteComment(String comment_id,
			HttpServletRequest request) {
		ToJson json = new ToJson();
		try {
			String string = this.newsCommentService.deleteComment(comment_id,
					request);
			json.setMsg(string);
			json.setFlag(0);
		} catch (Exception e) {
			e.printStackTrace();
			json.setMsg("err");
			json.setFlag(1);
		}
		return json;
	}

	@RequestMapping({ "/getNewsCount" })
	@ResponseBody
	public ToJson<Object> getNewsCount(String news_id) {
		ToJson json = new ToJson();
		try {
			int newsCount = this.newsCommentService.getNewsCount(news_id);
			json.setMsg("ok");
			json.setFlag(0);
			json.setObject(Integer.valueOf(newsCount));
		} catch (Exception e) {
			e.printStackTrace();
			json.setMsg("ok");
			json.setFlag(0);
			json.setObject(Integer.valueOf(0));
		}
		return json;
	}

	@ResponseBody
	@RequestMapping({ "/getNewCountByType" })
	public BaseWrapper getNewCountByType(String type) {
		return this.newService.getNewCountByType(type);
	}
}
