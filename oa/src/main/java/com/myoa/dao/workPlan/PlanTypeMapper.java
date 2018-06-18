package com.myoa.dao.workPlan;

import com.myoa.model.workPlan.PlanType;
import com.myoa.model.workPlan.PlanTypeExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface PlanTypeMapper {
	public abstract int countByExample(PlanTypeExample paramPlanTypeExample);

	public abstract int deleteByExample(PlanTypeExample paramPlanTypeExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(PlanType paramPlanType);

	public abstract int insertSelective(PlanType paramPlanType);

	public abstract List<PlanType> selectByExample(
			PlanTypeExample paramPlanTypeExample);

	public abstract PlanType selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") PlanType paramPlanType,
			@Param("example") PlanTypeExample paramPlanTypeExample);

	public abstract int updateByExample(
			@Param("record") PlanType paramPlanType,
			@Param("example") PlanTypeExample paramPlanTypeExample);

	public abstract int updateByPrimaryKeySelective(PlanType paramPlanType);

	public abstract int updateByPrimaryKey(PlanType paramPlanType);

	public abstract int insertPlanType(PlanType paramPlanType);

	public abstract int updatePlanTypeById(PlanType paramPlanType);

	public abstract int deletePlanTypeById(int paramInt);

	public abstract PlanType selectPlanTypeById(int paramInt);

	public abstract List<PlanType> selAllPlanType();
}
