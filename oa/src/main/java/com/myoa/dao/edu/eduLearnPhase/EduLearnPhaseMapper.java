package com.myoa.dao.edu.eduLearnPhase;

import com.myoa.model.edu.eduLearnPhase.EduLearnPhase;
import com.myoa.model.edu.eduLearnPhase.EduLearnPhaseExample;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface EduLearnPhaseMapper {
	public abstract int countByExample(
			EduLearnPhaseExample paramEduLearnPhaseExample);

	public abstract int deleteByExample(
			EduLearnPhaseExample paramEduLearnPhaseExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(EduLearnPhase paramEduLearnPhase);

	public abstract int insertSelective(EduLearnPhase paramEduLearnPhase);

	public abstract List<EduLearnPhase> selectByExample(
			EduLearnPhaseExample paramEduLearnPhaseExample);

	public abstract EduLearnPhase selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") EduLearnPhase paramEduLearnPhase,
			@Param("example") EduLearnPhaseExample paramEduLearnPhaseExample);

	public abstract int updateByExample(
			@Param("record") EduLearnPhase paramEduLearnPhase,
			@Param("example") EduLearnPhaseExample paramEduLearnPhaseExample);

	public abstract int updateByPrimaryKeySelective(
			EduLearnPhase paramEduLearnPhase);

	public abstract int updateByPrimaryKey(EduLearnPhase paramEduLearnPhase);

	public abstract List<EduLearnPhase> selEduLearnPhase(
			Map<String, Object> paramMap);
}
