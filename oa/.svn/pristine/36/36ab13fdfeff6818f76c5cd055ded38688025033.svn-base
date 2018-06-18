package com.myoa.controller.book;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.myoa.model.book.BookInfoWithBLOBs;
import com.myoa.service.book.BookInfoService;
import com.myoa.util.ToJson;

@Controller
@RequestMapping({ "/bookInfo" })
public class BookInfoController {

	@Resource
	private BookInfoService bookInfoService;

	@ResponseBody
	@RequestMapping({ "/insertBookInfo" })
	public ToJson<BookInfoWithBLOBs> insertBookInfo(
			BookInfoWithBLOBs bookInfoWithBLOBs, MultipartFile imageFile,
			HttpServletRequest request) {
		return this.bookInfoService.insertBookInfo(bookInfoWithBLOBs,
				imageFile, request);
	}

	@ResponseBody
	@RequestMapping({ "/upBookInfoById" })
	public ToJson<BookInfoWithBLOBs> upBookInfoById(
			BookInfoWithBLOBs bookInfoWithBLOBs, MultipartFile imageFile,
			HttpServletRequest request) {
		return this.bookInfoService.upBookInfoById(bookInfoWithBLOBs,
				imageFile, request);
	}

	@ResponseBody
	@RequestMapping({ "/delBookInfoById" })
	public ToJson<BookInfoWithBLOBs> delBookInfoById(Integer bookId) {
		return this.bookInfoService.delBookInfoById(bookId);
	}

	@ResponseBody
	@RequestMapping({ "/selBookInfoById" })
	public ToJson<BookInfoWithBLOBs> selBookInfoById(Integer bookId) {
		return this.bookInfoService.selBookInfoById(bookId);
	}

	@ResponseBody
	@RequestMapping({ "/selBookInfoByCond" })
	public ToJson<BookInfoWithBLOBs> selBookInfoByCond(
			BookInfoWithBLOBs bookInfoWithBLOBs, Integer page,
			Integer pageSize, boolean useFlag) {
		return this.bookInfoService.selBookInfoByCond(bookInfoWithBLOBs, page,
				pageSize, useFlag);
	}

	@ResponseBody
	@RequestMapping({ "/importBookInfo" })
	public ToJson<BookInfoWithBLOBs> importBookInfo(HttpServletRequest request,
			HttpServletResponse response, MultipartFile file,
			HttpSession session) {
		return this.bookInfoService.importBookInfo(request, response, file,
				session);
	}

	@ResponseBody
	@RequestMapping({ "/outputSelBookInfoByCond" })
	public ToJson<BookInfoWithBLOBs> outputSelBookInfoByCond(
			BookInfoWithBLOBs bookInfoWithBLOBs, HttpServletRequest request,
			HttpServletResponse response) {
		return this.bookInfoService.outputSelBookInfoByCond(bookInfoWithBLOBs,
				request, response);
	}

	@ResponseBody
	@RequestMapping({ "/delBookInfoByIds" })
	public ToJson<BookInfoWithBLOBs> delBookInfoByIds(String[] bookIds) {
		return this.bookInfoService.delBookInfoByIds(bookIds);
	}

	@ResponseBody
	@RequestMapping({ "/selInfoCountByBookNo" })
	public ToJson<BookInfoWithBLOBs> selInfoCountByBookNo(String bookNo) {
		return this.bookInfoService.selInfoCountByBookNo(bookNo.trim());
	}
}
