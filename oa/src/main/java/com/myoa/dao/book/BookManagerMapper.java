package com.myoa.dao.book;

import com.myoa.model.book.BookManager;
import com.myoa.model.book.BookManagerExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface BookManagerMapper {
	public abstract int countByExample(
			BookManagerExample paramBookManagerExample);

	public abstract int deleteByExample(
			BookManagerExample paramBookManagerExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(BookManager paramBookManager);

	public abstract int insertSelective(BookManager paramBookManager);

	public abstract List<BookManager> selectByExampleWithBLOBs(
			BookManagerExample paramBookManagerExample);

	public abstract List<BookManager> selectByExample(
			BookManagerExample paramBookManagerExample);

	public abstract BookManager selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") BookManager paramBookManager,
			@Param("example") BookManagerExample paramBookManagerExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") BookManager paramBookManager,
			@Param("example") BookManagerExample paramBookManagerExample);

	public abstract int updateByExample(
			@Param("record") BookManager paramBookManager,
			@Param("example") BookManagerExample paramBookManagerExample);

	public abstract int updateByPrimaryKeySelective(BookManager paramBookManager);

	public abstract int updateByPrimaryKeyWithBLOBs(BookManager paramBookManager);

	public abstract int insertManager(BookManager paramBookManager);

	public abstract int upManagerById(BookManager paramBookManager);

	public abstract int delManagerById(Integer paramInteger);

	public abstract BookManager selManagerById(Integer paramInteger);

	public abstract List<BookManager> selAllManager();

	public abstract List<BookManager> selManagerByManager(String paramString);

	public abstract List<BookManager> selManagerByDept(int paramInt);
}