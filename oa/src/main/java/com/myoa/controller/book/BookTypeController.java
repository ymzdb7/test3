package com.myoa.controller.book;

import com.myoa.model.book.BookType;
import com.myoa.service.book.BookTypeService;
import com.myoa.util.ToJson;

import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({ "/bookType" })
public class BookTypeController {

	@Resource
	private BookTypeService bookTypeService;

	@ResponseBody
	@RequestMapping({ "/insertType" })
	public ToJson<BookType> insertType(BookType bookType) {
		return this.bookTypeService.insertType(bookType);
	}

	@ResponseBody
	@RequestMapping({ "/upTypeById" })
	public ToJson<BookType> upTypeById(BookType bookType) {
		return this.bookTypeService.upTypeById(bookType);
	}

	@ResponseBody
	@RequestMapping({ "/delTypeById" })
	public ToJson<BookType> delTypeById(Integer typeId) {
		return this.bookTypeService.delTypeById(typeId);
	}

	@ResponseBody
	@RequestMapping({ "/selTypeById" })
	public ToJson<BookType> selTypeById(Integer typeId) {
		return this.bookTypeService.selTypeById(typeId);
	}

	@ResponseBody
	@RequestMapping({ "/selAllType" })
	public ToJson<BookType> selAllType() {
		return this.bookTypeService.selAllType();
	}

	@ResponseBody
	@RequestMapping({ "/selCountByTypeName" })
	public ToJson<BookType> selCountByTypeName(String typeName) {
		return this.bookTypeService.selCountByTypeName(typeName.trim());
	}
}
