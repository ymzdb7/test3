package com.myoa.dao.edu.eduPrize;

import com.myoa.model.edu.eduPrize.EduPrizeInfo;
import com.myoa.model.edu.eduPrize.EduPrizeInfoExample;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface EduPrizeInfoMapper {
	public abstract int countByExample(
			EduPrizeInfoExample paramEduPrizeInfoExample);

	public abstract int deleteByExample(
			EduPrizeInfoExample paramEduPrizeInfoExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(EduPrizeInfo paramEduPrizeInfo);

	public abstract int insertSelective(EduPrizeInfo paramEduPrizeInfo);

	public abstract List<EduPrizeInfo> selectByExampleWithBLOBs(
			EduPrizeInfoExample paramEduPrizeInfoExample);

	public abstract List<EduPrizeInfo> selectByExample(
			EduPrizeInfoExample paramEduPrizeInfoExample);

	public abstract EduPrizeInfo selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") EduPrizeInfo paramEduPrizeInfo,
			@Param("example") EduPrizeInfoExample paramEduPrizeInfoExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") EduPrizeInfo paramEduPrizeInfo,
			@Param("example") EduPrizeInfoExample paramEduPrizeInfoExample);

	public abstract int updateByExample(
			@Param("record") EduPrizeInfo paramEduPrizeInfo,
			@Param("example") EduPrizeInfoExample paramEduPrizeInfoExample);

	public abstract int updateByPrimaryKeySelective(
			EduPrizeInfo paramEduPrizeInfo);

	public abstract int updateByPrimaryKeyWithBLOBs(
			EduPrizeInfo paramEduPrizeInfo);

	public abstract int updateByPrimaryKey(EduPrizeInfo paramEduPrizeInfo);

	public abstract List<EduPrizeInfo> getAllEduPrizeInfo(
			Map<String, Object> paramMap);

	public abstract void deleteEduPrizeInfo(Integer paramInteger);

	public abstract EduPrizeInfo getEduPrizeInfoById(Integer paramInteger);

	public abstract int getCount();
}