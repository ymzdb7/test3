package com.myoa.dao.customNumber;

import com.myoa.model.customNumber.CustomNumber;
import com.myoa.model.customNumber.CustomNumberExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface CustomNumberMapper {
	public abstract int countByExample(
			CustomNumberExample paramCustomNumberExample);

	public abstract int deleteByExample(
			CustomNumberExample paramCustomNumberExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(CustomNumber paramCustomNumber);

	public abstract int insertSelective(CustomNumber paramCustomNumber);

	public abstract List<CustomNumber> selectByExample(
			CustomNumberExample paramCustomNumberExample);

	public abstract CustomNumber selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") CustomNumber paramCustomNumber,
			@Param("example") CustomNumberExample paramCustomNumberExample);

	public abstract int updateByExample(
			@Param("record") CustomNumber paramCustomNumber,
			@Param("example") CustomNumberExample paramCustomNumberExample);

	public abstract int updateByPrimaryKeySelective(
			CustomNumber paramCustomNumber);

	public abstract int updateByPrimaryKey(CustomNumber paramCustomNumber);
}