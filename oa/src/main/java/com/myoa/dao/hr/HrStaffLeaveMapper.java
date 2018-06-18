package com.myoa.dao.hr;

import com.myoa.model.hr.HrStaffLeave;
import com.myoa.model.hr.HrStaffLeaveExample;
import com.myoa.model.hr.HrStaffLeaveWithBLOBs;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface HrStaffLeaveMapper {
	public abstract int countByExample(
			HrStaffLeaveExample paramHrStaffLeaveExample);

	public abstract int deleteByExample(
			HrStaffLeaveExample paramHrStaffLeaveExample);

	public abstract int deleteByPrimaryKey(Integer paramInteger);

	public abstract int insert(HrStaffLeaveWithBLOBs paramHrStaffLeaveWithBLOBs);

	public abstract int insertSelective(
			HrStaffLeaveWithBLOBs paramHrStaffLeaveWithBLOBs);

	public abstract List<HrStaffLeaveWithBLOBs> selectByExampleWithBLOBs(
			HrStaffLeaveExample paramHrStaffLeaveExample);

	public abstract List<HrStaffLeave> selectByExample(
			HrStaffLeaveExample paramHrStaffLeaveExample);

	public abstract HrStaffLeaveWithBLOBs selectByPrimaryKey(
			Integer paramInteger);

	public abstract int updateByExampleSelective(
			@Param("record") HrStaffLeaveWithBLOBs paramHrStaffLeaveWithBLOBs,
			@Param("example") HrStaffLeaveExample paramHrStaffLeaveExample);

	public abstract int updateByExampleWithBLOBs(
			@Param("record") HrStaffLeaveWithBLOBs paramHrStaffLeaveWithBLOBs,
			@Param("example") HrStaffLeaveExample paramHrStaffLeaveExample);

	public abstract int updateByExample(
			@Param("record") HrStaffLeave paramHrStaffLeave,
			@Param("example") HrStaffLeaveExample paramHrStaffLeaveExample);

	public abstract int updateByPrimaryKeySelective(
			HrStaffLeaveWithBLOBs paramHrStaffLeaveWithBLOBs);

	public abstract int updateByPrimaryKeyWithBLOBs(
			HrStaffLeaveWithBLOBs paramHrStaffLeaveWithBLOBs);

	public abstract int updateByPrimaryKey(HrStaffLeave paramHrStaffLeave);

	public abstract List<HrStaffLeave> insertLeavePersonByDeptId(
			Integer paramInteger);

	public abstract List<HrStaffLeave> getLeaveUsersByDeptId(
			Integer paramInteger);

	public abstract int addLeaveInfor(HrStaffLeave paramHrStaffLeave);

	public abstract List<HrStaffLeave> getLeaveUserByDeptId(Integer paramInteger);

	public abstract HrStaffLeave queryStaffLeaveByLeavePerson(String paramString);

	public abstract int deleteByLeavePerson(String paramString);
}
