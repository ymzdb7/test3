package com.myoa.dao.workPlan;

import com.myoa.model.workPlan.WorkDetail;
import com.myoa.model.workPlan.WorkDetailExample;
import com.myoa.model.workPlan.WorkDetailWithBLOBs;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface WorkDetailMapper {
	public abstract int countByExample(WorkDetailExample paramWorkDetailExample);

	public abstract int deleteByExample(WorkDetailExample paramWorkDetailExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(WorkDetailWithBLOBs paramWorkDetailWithBLOBs);

	public abstract int insertSelective(
			WorkDetailWithBLOBs paramWorkDetailWithBLOBs);

	public abstract List<WorkDetailWithBLOBs> selectByExampleWithBLOBs(
			WorkDetailExample paramWorkDetailExample);

	public abstract List<WorkDetail> selectByExample(
			WorkDetailExample paramWorkDetailExample);

	public abstract WorkDetailWithBLOBs selectByPrimaryKey(Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") WorkDetailWithBLOBs paramWorkDetailWithBLOBs,
			@Param("example") WorkDetailExample paramWorkDetailExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") WorkDetailWithBLOBs paramWorkDetailWithBLOBs,
			@Param("example") WorkDetailExample paramWorkDetailExample);

	public abstract int updateByExample(
			@Param("record") WorkDetail paramWorkDetail,
			@Param("example") WorkDetailExample paramWorkDetailExample);

	public abstract int updateByPrimaryKeySelective(
			WorkDetailWithBLOBs paramWorkDetailWithBLOBs);

	public abstract int updateByPrimaryKeyWithBLOBs(
			WorkDetailWithBLOBs paramWorkDetailWithBLOBs);

	public abstract int updateByPrimaryKey(WorkDetail paramWorkDetail);

	public abstract List<WorkDetailWithBLOBs> selWorkDetailByPlanId(
			WorkDetailWithBLOBs paramWorkDetailWithBLOBs);

	public abstract WorkDetailWithBLOBs selWorkDetailById(int paramInt);

	public abstract int updateWorkDetailById(
			WorkDetailWithBLOBs paramWorkDetailWithBLOBs);

	public abstract int insertWorkDetail(
			WorkDetailWithBLOBs paramWorkDetailWithBLOBs);

	public abstract int delWorkDetailById(int paramInt);
}
