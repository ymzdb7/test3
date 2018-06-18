package com.myoa.dao.book;

import com.myoa.model.book.BookType;
import com.myoa.model.book.BookTypeExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface BookTypeMapper {
	public abstract int countByExample(BookTypeExample paramBookTypeExample);

	public abstract int deleteByExample(BookTypeExample paramBookTypeExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(BookType paramBookType);

	public abstract int insertSelective(BookType paramBookType);

	public abstract List<BookType> selectByExample(
			BookTypeExample paramBookTypeExample);

	public abstract BookType selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") BookType paramBookType,
			@Param("example") BookTypeExample paramBookTypeExample);

	public abstract int updateByExample(
			@Param("record") BookType paramBookType,
			@Param("example") BookTypeExample paramBookTypeExample);

	public abstract int updateByPrimaryKeySelective(BookType paramBookType);

	public abstract int updateByPrimaryKey(BookType paramBookType);

	public abstract int insertType(BookType paramBookType);

	public abstract int upTypeById(BookType paramBookType);

	public abstract int delTypeById(Integer paramInteger);

	public abstract BookType selTypeById(Integer paramInteger);

	public abstract List<BookType> selAllType();

	public abstract int selIdByName(String paramString);

	public abstract int selCountByTypeName(String paramString);
}