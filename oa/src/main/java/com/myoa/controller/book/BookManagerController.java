package com.myoa.controller.book;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.myoa.model.book.BookManager;
import com.myoa.service.book.BookManagerService;
import com.myoa.util.Constant;
import com.myoa.util.ToJson;
import com.myoa.util.dataSource.ContextHolder;

@Controller
@RequestMapping({ "/bookManager" })
public class BookManagerController {

	@Resource
	private BookManagerService bookManagerService;

	@ResponseBody
	@RequestMapping({ "/insertManager" })
	public ToJson<BookManager> insertManager(BookManager bookManager) {
		return this.bookManagerService.insertManager(bookManager);
	}

	@ResponseBody
	@RequestMapping({ "/upManagerById" })
	public ToJson<BookManager> upManagerById(BookManager bookManager) {
		return this.bookManagerService.upManagerById(bookManager);
	}

	@ResponseBody
	@RequestMapping({ "/delManagerById" })
	public ToJson<BookManager> delManagerById(Integer autoId) {
		return this.bookManagerService.delManagerById(autoId);
	}

	@ResponseBody
	@RequestMapping({ "/selManagerById" })
	public ToJson<BookManager> selManagerById(Integer autoId) {
		return this.bookManagerService.selManagerById(autoId);
	}

	@ResponseBody
	@RequestMapping({ "/selAllManager" })
	public ToJson<BookManager> selAllManager() {
		return this.bookManagerService.selAllManager();
	}

	@RequestMapping({ "/inputIndex" })
	public String inputIndex(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/book/bookInput/index";
	}

	@RequestMapping({ "/bookManage" })
	public String bookManage(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/book/bookInput/bookManage";
	}

	@RequestMapping({ "/editBook" })
	public String editBook(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/book/bookInput/editBook";
	}

	@RequestMapping({ "/addBook" })
	public String addBook(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/book/bookInput/addBook";
	}

	@RequestMapping({ "/inputBook" })
	public String inputBook(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/book/bookInput/inputBook";
	}

	@RequestMapping({ "/bookQuery" })
	public String bookQuery(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/book/bookInput/bookQuery";
	}

	@RequestMapping({ "/query" })
	public String query(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/book/bookQuery/query";
	}

	@RequestMapping({ "/queryIndex" })
	public String queryIndex(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/book/bookQuery/index";
	}

	@RequestMapping({ "/bookDetail" })
	public String bookDetail(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/book/bookQuery/bookDetail";
	}

	@RequestMapping({ "/Pending" })
	public String Pending(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/book/bookQuery/Pending";
	}

	@RequestMapping({ "/approval" })
	public String approval(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/book/bookQuery/approval";
	}

	@RequestMapping({ "/Noapproved" })
	public String Noapproved(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/book/bookQuery/Noapproved";
	}

	@RequestMapping({ "/selectBook" })
	public String selectBook(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/book/bookQuery/selectBook";
	}

	@RequestMapping({ "/setIndex" })
	public String setIndex(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/book/bookSetting/index";
	}

	@RequestMapping({ "/bookType" })
	public String bookType(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/book/bookSetting/bookType";
	}

	@RequestMapping({ "/managerSetting" })
	public String managerSetting(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/book/bookSetting/managerSetting";
	}

	@RequestMapping({ "/replayIndex" })
	public String replayIndex(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/book/bookReplay/index";
	}

	@RequestMapping({ "/borrowManage" })
	public String borrowManage(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/book/bookReplay/borrowManage";
	}

	@RequestMapping({ "/bookReturn" })
	public String bookReturn(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/book/bookReplay/bookReturn";
	}

	@RequestMapping({ "/bookRecord" })
	public String bookRecord(HttpServletRequest request) {
		ContextHolder.setConsumerType(Constant.MYOA
				+ (String) request.getSession().getAttribute("loginDateSouse"));

		return "app/book/bookReplay/bookRecord";
	}
}
