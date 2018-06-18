package com.myoa.dao.portal;

import com.myoa.model.portal.CapacitySiteInfo;
import com.myoa.model.portal.CapacitySiteInfoExample;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface CapacitySiteInfoMapper {
	public abstract int countByExample(
			CapacitySiteInfoExample paramCapacitySiteInfoExample);

	public abstract int deleteByExample(
			CapacitySiteInfoExample paramCapacitySiteInfoExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(CapacitySiteInfo paramCapacitySiteInfo);

	public abstract int insertSelective(CapacitySiteInfo paramCapacitySiteInfo);

	public abstract List<CapacitySiteInfo> selectByExample(
			CapacitySiteInfoExample paramCapacitySiteInfoExample);

	public abstract CapacitySiteInfo selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") CapacitySiteInfo paramCapacitySiteInfo,
			@Param("example") CapacitySiteInfoExample paramCapacitySiteInfoExample);

	public abstract int updateByExample(
			@Param("record") CapacitySiteInfo paramCapacitySiteInfo,
			@Param("example") CapacitySiteInfoExample paramCapacitySiteInfoExample);

	public abstract int updateByPrimaryKeySelective(
			CapacitySiteInfo paramCapacitySiteInfo);

	public abstract int updateByPrimaryKey(
			CapacitySiteInfo paramCapacitySiteInfo);

	public abstract List<CapacitySiteInfo> selectList(
			Map<String, Object> paramMap);

	public abstract Integer selectCount(Map<String, Object> paramMap);
}
