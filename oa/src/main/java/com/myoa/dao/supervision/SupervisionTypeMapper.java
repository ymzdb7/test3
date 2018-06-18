package com.myoa.dao.supervision;

import com.myoa.model.supervision.Supervision;
import com.myoa.model.supervision.SupervisionType;
import com.myoa.model.supervision.SupervisionTypeExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface SupervisionTypeMapper {
	public abstract int countByExample(
			SupervisionTypeExample paramSupervisionTypeExample);

	public abstract int deleteByExample(
			SupervisionTypeExample paramSupervisionTypeExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(SupervisionType paramSupervisionType);

	public abstract int insertSelective(SupervisionType paramSupervisionType);

	public abstract List<SupervisionType> selectByExample(
			SupervisionTypeExample paramSupervisionTypeExample);

	public abstract SupervisionType selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") SupervisionType paramSupervisionType,
			@Param("example") SupervisionTypeExample paramSupervisionTypeExample);

	public abstract int updateByExample(
			@Param("record") SupervisionType paramSupervisionType,
			@Param("example") SupervisionTypeExample paramSupervisionTypeExample);

	public abstract int updateByPrimaryKeySelective(
			SupervisionType paramSupervisionType);

	public abstract int updateByPrimaryKey(SupervisionType paramSupervisionType);

	public abstract SupervisionType getSupervisionTypeDetail(
			Integer paramInteger);

	public abstract int updateSupervisionType(
			SupervisionType paramSupervisionType);

	public abstract int addSupervisionType(SupervisionType paramSupervisionType);

	public abstract void deleteSupervisionTypeBySid(Integer paramInteger);

	public abstract List<SupervisionType> getSupervisionTypeList(
			SupervisionType paramSupervisionType);

	public abstract List<SupervisionType> getSupManageMenu(
			Supervision paramSupervision);

	public abstract List<SupervisionType> getSupNameSelect(
			SupervisionType paramSupervisionType);

	public abstract List<SupervisionType> selectAll();
}
