package com.myoa.dao.officesupplies;

import com.myoa.model.officesupplies.OfficeType;
import com.myoa.model.officesupplies.OfficeTypeExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface OfficeTypeMapper {
	public abstract int countByExample(OfficeTypeExample paramOfficeTypeExample);

	public abstract int deleteByExample(OfficeTypeExample paramOfficeTypeExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(OfficeType paramOfficeType);

	public abstract int insertSelective(OfficeType paramOfficeType);

	public abstract List<OfficeType> selectByExample(
			OfficeTypeExample paramOfficeTypeExample);

	public abstract OfficeType selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") OfficeType paramOfficeType,
			@Param("example") OfficeTypeExample paramOfficeTypeExample);

	public abstract int updateByExample(
			@Param("record") OfficeType paramOfficeType,
			@Param("example") OfficeTypeExample paramOfficeTypeExample);

	public abstract int updateByPrimaryKeySelective(OfficeType paramOfficeType);

	public abstract int updateByPrimaryKey(OfficeType paramOfficeType);

	public abstract OfficeType selectByName(String paramString);

	public abstract List<OfficeType> selectDownObject(String paramString);

	public abstract OfficeType selectOffTypeByProType(String paramString);
}
