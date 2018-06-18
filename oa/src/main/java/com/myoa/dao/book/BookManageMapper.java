package com.myoa.dao.book;

import com.myoa.model.book.BookManage;
import com.myoa.model.book.BookManageExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface BookManageMapper {
	public abstract int countByExample(BookManageExample paramBookManageExample);

	public abstract int deleteByExample(BookManageExample paramBookManageExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(BookManage paramBookManage);

	public abstract int insertSelective(BookManage paramBookManage);

	public abstract List<BookManage> selectByExampleWithBLOBs(
			BookManageExample paramBookManageExample);

	public abstract List<BookManage> selectByExample(
			BookManageExample paramBookManageExample);

	public abstract BookManage selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") BookManage paramBookManage,
			@Param("example") BookManageExample paramBookManageExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") BookManage paramBookManage,
			@Param("example") BookManageExample paramBookManageExample);

	public abstract int updateByExample(
			@Param("record") BookManage paramBookManage,
			@Param("example") BookManageExample paramBookManageExample);

	public abstract int updateByPrimaryKeySelective(BookManage paramBookManage);

	public abstract int updateByPrimaryKeyWithBLOBs(BookManage paramBookManage);

	public abstract int updateByPrimaryKey(BookManage paramBookManage);

	public abstract int insertManage(BookManage paramBookManage);

	public abstract int upManageById(BookManage paramBookManage);

	public abstract int delManageById(Integer paramInteger);

	public abstract BookManage selManageById(Integer paramInteger);

	public abstract List<BookManage> selManageByBookStatus(
			BookManage paramBookManage);

	public abstract List<BookManage> selByRegFlag();

	public abstract List<BookManage> selByRegFlagAndBookStatus();

	public abstract List<BookManage> selByStatusQuire();

	public abstract List<BookManage> selByStatusManage();

	public abstract List<BookManage> selDelFlag();

	public abstract int selCountManageByBookNo(String paramString);
}
